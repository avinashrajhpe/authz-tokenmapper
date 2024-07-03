package sc.authz.grpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import authz.v2.AuthorizationServiceGrpc;
import authz.v2.Authz;

import java.util.*;
import java.util.stream.Collectors;

public class AuthorizationClientV2 {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(AuthorizationClientV2.class);

  private AuthorizationServiceGrpc.AuthorizationServiceBlockingStub authzServiceBlockingStub;

  public AuthorizationClientV2() {
    ManagedChannel managedChannel = ManagedChannelBuilder
        .forAddress("cds-mountebank", 32002).usePlaintext().build();

    authzServiceBlockingStub =
        AuthorizationServiceGrpc.newBlockingStub(managedChannel);
  }

  public Map<String, Object> getAuthorizations() {
		Authz.UserAccessibleResourcesRequest request = Authz.UserAccessibleResourcesRequest.newBuilder()
			.addFilter(Authz.ResourceSpec.newBuilder()
				.addGroups("nre-test-group").build())
        .build();
    LOGGER.info("client sending {}", request);
		String value = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MzM5MjY3MDgsImlzcyI6Imh0dHBzOi8vZGV2LXNzby5jY3MuYXJ1" +
			"YmF0aGVuYS5jb20iLCJzdWIiOiJqb2UuYmxvZ2dzQGdvb2dsZS5jb20iLCJ1c2V" +
			"yX2N0eCI6IjU0MzE2Mzk2ZTNmMDExZWJhMjZhYmUwMzkwMzk2MWYwIn0.RKVMEHRuNwUwWdm3Qht24-xVqB-1F6qikJTGmIDXvXM";

    Authz.UserAccessibleResourcesResponse result =
        authzServiceBlockingStub
					.withCallCredentials(new AuthenticationCallCredentials(value))
					.userAccessibleResources(request);

    LOGGER.info("client received {}", result);
		Map<String, Object> claims = new HashMap<>();
		for (Authz.ResourceUserPermission permissions : result.getResourcePermissionsList()) {
			claims.put(permissions.getResource().getApplicationResource(), permissions.getResource().getPermissions(0));
		}
    return claims;
  }
}
