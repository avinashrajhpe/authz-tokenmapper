package sc.authz.grpc;

import io.grpc.*;

import java.util.concurrent.Executor;

public class AuthenticationCallCredentials extends CallCredentials {

	private String token;

	public AuthenticationCallCredentials(String token) {
		this.token = token;
	}

	@Override
	public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
		executor.execute(() -> {
			try {
				Metadata headers = new Metadata();
				headers.put(Constants.AUTHORIZATION_METADATA_KEY, String.format("%s %s", Constants.BEARER_TYPE, this.token));
				metadataApplier.apply(headers);
			} catch (Throwable e) {
				metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
			}
		});
	}

	@Override
	public void thisUsesUnstableApi() {
		// yes this is unstable :(
	}
}
