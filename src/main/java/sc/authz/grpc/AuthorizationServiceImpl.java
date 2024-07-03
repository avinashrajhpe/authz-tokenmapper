package sc.authz.grpc;

import authz.v2.AuthorizationServiceGrpc;
import authz.v2.Authz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AuthorizationServiceImpl
    extends AuthorizationServiceGrpc.AuthorizationServiceImplBase {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(AuthorizationServiceImpl.class);

  @Override
	public void enforce(authz.v2.Authz.EnforceRequest request,
											io.grpc.stub.StreamObserver<authz.v2.Authz.EnforceResponse> responseObserver) {
		LOGGER.info("server received {}", request);

    String message = "Authorizing enforce " + request.toString();
    Authz.EnforceResponse greeting =
        Authz.EnforceResponse.newBuilder().setResultValue(1).build();
    LOGGER.info("server responded {}", greeting);

    responseObserver.onNext(greeting);
    responseObserver.onCompleted();
  }

	@Override
	public void userAccessibleResources(authz.v2.Authz.UserAccessibleResourcesRequest request,
																			io.grpc.stub.StreamObserver<authz.v2.Authz.UserAccessibleResourcesResponse> responseObserver) {
		LOGGER.info("server received {}", request);

		String message = "Authorizing enforce " + request.toString();
		Authz.UserAccessibleResourcesResponse response =
			Authz.UserAccessibleResourcesResponse.newBuilder()
				.build();
		LOGGER.info("server responded {}", response);

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	}
