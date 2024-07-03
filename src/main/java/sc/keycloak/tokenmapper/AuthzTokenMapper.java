package sc.keycloak.tokenmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.keycloak.models.ClientSessionContext;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.ProtocolMapperModel;
import org.keycloak.models.UserSessionModel;
import org.keycloak.protocol.oidc.mappers.AbstractOIDCProtocolMapper;
import org.keycloak.protocol.oidc.mappers.OIDCAccessTokenMapper;
import org.keycloak.protocol.oidc.mappers.OIDCAttributeMapperHelper;
import org.keycloak.protocol.oidc.mappers.OIDCIDTokenMapper;
import org.keycloak.protocol.oidc.mappers.UserInfoTokenMapper;
import org.keycloak.provider.ProviderConfigProperty;
import org.keycloak.representations.IDToken;
import sc.authz.grpc.AuthorizationClientV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class AuthzTokenMapper extends AbstractOIDCProtocolMapper
	implements OIDCAccessTokenMapper, OIDCIDTokenMapper, UserInfoTokenMapper {

	public static final String PROVIDER_ID = "oidc-authz-token-mapper";

	private static final List<ProviderConfigProperty> configProperties = new ArrayList<>();
	static {
		//OIDCAttributeMapperHelper.addTokenClaimNameConfig(configProperties);
		OIDCAttributeMapperHelper.addIncludeInTokensConfig(configProperties, AuthzTokenMapper.class);
	}

	AuthorizationClientV2 authorizationClientV2 = new AuthorizationClientV2();

	@Override
	public String getId() {
		return PROVIDER_ID;
	}

	@Override
	public String getDisplayCategory() {
		return TOKEN_MAPPER_CATEGORY;
	}

	@Override
	public String getDisplayType() {
		return "Authz Token";
	}

	@Override
	public String getHelpText() {
		return "Map a authz token to custom params from authz.";
	}

	@Override
	public List<ProviderConfigProperty> getConfigProperties() {
		return configProperties;
	}

	@Override
	protected void setClaim(IDToken token, ProtocolMapperModel mappingModel, UserSessionModel userSession,
		KeycloakSession keycloakSession, ClientSessionContext clientSessionCtx) {
		// Authz
		// Get the authorization from the Authz gRPC endpoint
		// Set to test authorization
		// Get the value and update the token
		try {
			System.out.printf("IDToken: %s\n", new ObjectMapper().writeValueAsString(token));
			//System.out.printf("ProtocolMapperModel: %s\n", new ObjectMapper().writeValueAsString(mappingModel));
			System.out.printf("UserSessionModel: %s\n", new ObjectMapper().writeValueAsString(userSession));
			//System.out.printf("KeycloakSession: %s\n", new ObjectMapper().writeValueAsString(keycloakSession));
			//System.out.printf("ClientSessionContext: %s\n", new ObjectMapper().writeValueAsString(clientSessionCtx));

		} catch (JsonProcessingException e) {
			System.out.println("Skipping...");
		}
		Map<String, Object> authzReturnedPermissions = authorizationClientV2.getAuthorizations();
		System.out.println("Checking the Authz Endpoint to get the authorization.. Returned := " + authzReturnedPermissions);

		for (Map.Entry<String,Object> entry : authzReturnedPermissions.entrySet()) {
				token.getOtherClaims().put(entry.getKey(), entry.getValue());
		}
	}
}
