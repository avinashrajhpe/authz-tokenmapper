package authz.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: Authz.proto")
public final class AuthorizationServiceGrpc {

  private AuthorizationServiceGrpc() {}

  public static final String SERVICE_NAME = "authz.v2.AuthorizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<authz.v2.Authz.EnforceRequest,
      authz.v2.Authz.EnforceResponse> getEnforceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enforce",
      requestType = authz.v2.Authz.EnforceRequest.class,
      responseType = authz.v2.Authz.EnforceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<authz.v2.Authz.EnforceRequest,
      authz.v2.Authz.EnforceResponse> getEnforceMethod() {
    io.grpc.MethodDescriptor<authz.v2.Authz.EnforceRequest, authz.v2.Authz.EnforceResponse> getEnforceMethod;
    if ((getEnforceMethod = AuthorizationServiceGrpc.getEnforceMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getEnforceMethod = AuthorizationServiceGrpc.getEnforceMethod) == null) {
          AuthorizationServiceGrpc.getEnforceMethod = getEnforceMethod = 
              io.grpc.MethodDescriptor.<authz.v2.Authz.EnforceRequest, authz.v2.Authz.EnforceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authz.v2.AuthorizationService", "Enforce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.EnforceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.EnforceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizationServiceMethodDescriptorSupplier("Enforce"))
                  .build();
          }
        }
     }
     return getEnforceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<authz.v2.Authz.EnforceAllRequest,
      authz.v2.Authz.EnforceAllResponse> getEnforceAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnforceAll",
      requestType = authz.v2.Authz.EnforceAllRequest.class,
      responseType = authz.v2.Authz.EnforceAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<authz.v2.Authz.EnforceAllRequest,
      authz.v2.Authz.EnforceAllResponse> getEnforceAllMethod() {
    io.grpc.MethodDescriptor<authz.v2.Authz.EnforceAllRequest, authz.v2.Authz.EnforceAllResponse> getEnforceAllMethod;
    if ((getEnforceAllMethod = AuthorizationServiceGrpc.getEnforceAllMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getEnforceAllMethod = AuthorizationServiceGrpc.getEnforceAllMethod) == null) {
          AuthorizationServiceGrpc.getEnforceAllMethod = getEnforceAllMethod = 
              io.grpc.MethodDescriptor.<authz.v2.Authz.EnforceAllRequest, authz.v2.Authz.EnforceAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authz.v2.AuthorizationService", "EnforceAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.EnforceAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.EnforceAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizationServiceMethodDescriptorSupplier("EnforceAll"))
                  .build();
          }
        }
     }
     return getEnforceAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<authz.v2.Authz.UserAccessibleResourcesRequest,
      authz.v2.Authz.UserAccessibleResourcesResponse> getUserAccessibleResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserAccessibleResources",
      requestType = authz.v2.Authz.UserAccessibleResourcesRequest.class,
      responseType = authz.v2.Authz.UserAccessibleResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<authz.v2.Authz.UserAccessibleResourcesRequest,
      authz.v2.Authz.UserAccessibleResourcesResponse> getUserAccessibleResourcesMethod() {
    io.grpc.MethodDescriptor<authz.v2.Authz.UserAccessibleResourcesRequest, authz.v2.Authz.UserAccessibleResourcesResponse> getUserAccessibleResourcesMethod;
    if ((getUserAccessibleResourcesMethod = AuthorizationServiceGrpc.getUserAccessibleResourcesMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getUserAccessibleResourcesMethod = AuthorizationServiceGrpc.getUserAccessibleResourcesMethod) == null) {
          AuthorizationServiceGrpc.getUserAccessibleResourcesMethod = getUserAccessibleResourcesMethod = 
              io.grpc.MethodDescriptor.<authz.v2.Authz.UserAccessibleResourcesRequest, authz.v2.Authz.UserAccessibleResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authz.v2.AuthorizationService", "UserAccessibleResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.UserAccessibleResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.UserAccessibleResourcesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizationServiceMethodDescriptorSupplier("UserAccessibleResources"))
                  .build();
          }
        }
     }
     return getUserAccessibleResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<authz.v2.Authz.GetRBACDomainRequest,
      authz.v2.Authz.GetRBACDomainResponse> getGetRBACDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRBACDomain",
      requestType = authz.v2.Authz.GetRBACDomainRequest.class,
      responseType = authz.v2.Authz.GetRBACDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<authz.v2.Authz.GetRBACDomainRequest,
      authz.v2.Authz.GetRBACDomainResponse> getGetRBACDomainMethod() {
    io.grpc.MethodDescriptor<authz.v2.Authz.GetRBACDomainRequest, authz.v2.Authz.GetRBACDomainResponse> getGetRBACDomainMethod;
    if ((getGetRBACDomainMethod = AuthorizationServiceGrpc.getGetRBACDomainMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getGetRBACDomainMethod = AuthorizationServiceGrpc.getGetRBACDomainMethod) == null) {
          AuthorizationServiceGrpc.getGetRBACDomainMethod = getGetRBACDomainMethod = 
              io.grpc.MethodDescriptor.<authz.v2.Authz.GetRBACDomainRequest, authz.v2.Authz.GetRBACDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authz.v2.AuthorizationService", "GetRBACDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.GetRBACDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.GetRBACDomainResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizationServiceMethodDescriptorSupplier("GetRBACDomain"))
                  .build();
          }
        }
     }
     return getGetRBACDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<authz.v2.Authz.UserEnforceRequest,
      authz.v2.Authz.UserEnforceResponse> getUserEnforceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserEnforce",
      requestType = authz.v2.Authz.UserEnforceRequest.class,
      responseType = authz.v2.Authz.UserEnforceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<authz.v2.Authz.UserEnforceRequest,
      authz.v2.Authz.UserEnforceResponse> getUserEnforceMethod() {
    io.grpc.MethodDescriptor<authz.v2.Authz.UserEnforceRequest, authz.v2.Authz.UserEnforceResponse> getUserEnforceMethod;
    if ((getUserEnforceMethod = AuthorizationServiceGrpc.getUserEnforceMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getUserEnforceMethod = AuthorizationServiceGrpc.getUserEnforceMethod) == null) {
          AuthorizationServiceGrpc.getUserEnforceMethod = getUserEnforceMethod = 
              io.grpc.MethodDescriptor.<authz.v2.Authz.UserEnforceRequest, authz.v2.Authz.UserEnforceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authz.v2.AuthorizationService", "UserEnforce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.UserEnforceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.UserEnforceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizationServiceMethodDescriptorSupplier("UserEnforce"))
                  .build();
          }
        }
     }
     return getUserEnforceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<authz.v2.Authz.UserPermissionsRequest,
      authz.v2.Authz.UserPermissionsResponse> getUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserPermissions",
      requestType = authz.v2.Authz.UserPermissionsRequest.class,
      responseType = authz.v2.Authz.UserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<authz.v2.Authz.UserPermissionsRequest,
      authz.v2.Authz.UserPermissionsResponse> getUserPermissionsMethod() {
    io.grpc.MethodDescriptor<authz.v2.Authz.UserPermissionsRequest, authz.v2.Authz.UserPermissionsResponse> getUserPermissionsMethod;
    if ((getUserPermissionsMethod = AuthorizationServiceGrpc.getUserPermissionsMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getUserPermissionsMethod = AuthorizationServiceGrpc.getUserPermissionsMethod) == null) {
          AuthorizationServiceGrpc.getUserPermissionsMethod = getUserPermissionsMethod = 
              io.grpc.MethodDescriptor.<authz.v2.Authz.UserPermissionsRequest, authz.v2.Authz.UserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authz.v2.AuthorizationService", "UserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.UserPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.UserPermissionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizationServiceMethodDescriptorSupplier("UserPermissions"))
                  .build();
          }
        }
     }
     return getUserPermissionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorizationServiceStub newStub(io.grpc.Channel channel) {
    return new AuthorizationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthorizationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthorizationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthorizationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Enforce permissions on a resource based on any group association
     * </pre>
     */
    public void enforce(authz.v2.Authz.EnforceRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.EnforceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnforceMethod(), responseObserver);
    }

    /**
     */
    public void enforceAll(authz.v2.Authz.EnforceAllRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.EnforceAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnforceAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get list of Accessible Resources
     * </pre>
     */
    public void userAccessibleResources(authz.v2.Authz.UserAccessibleResourcesRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.UserAccessibleResourcesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserAccessibleResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Services that are deployed into multiple domains can use this function to retrieve the domain name
     * </pre>
     */
    public void getRBACDomain(authz.v2.Authz.GetRBACDomainRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.GetRBACDomainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRBACDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * A special enforce function to be used by services when a user's permissions need to be checked without access to the user's token.
     * The service must be explicitly authorized to call this function - see Authz API documentation for more details."
     * </pre>
     */
    public void userEnforce(authz.v2.Authz.UserEnforceRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.UserEnforceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserEnforceMethod(), responseObserver);
    }

    /**
     * <pre>
     * A special UAR function to be used by services to retrieve permissions for a specific user/customer without access to user's token.
     * The service must be explicitly authorized to call this function - see Authz API documentation for more details."
     * </pre>
     */
    public void userPermissions(authz.v2.Authz.UserPermissionsRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.UserPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserPermissionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnforceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                authz.v2.Authz.EnforceRequest,
                authz.v2.Authz.EnforceResponse>(
                  this, METHODID_ENFORCE)))
          .addMethod(
            getEnforceAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                authz.v2.Authz.EnforceAllRequest,
                authz.v2.Authz.EnforceAllResponse>(
                  this, METHODID_ENFORCE_ALL)))
          .addMethod(
            getUserAccessibleResourcesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                authz.v2.Authz.UserAccessibleResourcesRequest,
                authz.v2.Authz.UserAccessibleResourcesResponse>(
                  this, METHODID_USER_ACCESSIBLE_RESOURCES)))
          .addMethod(
            getGetRBACDomainMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                authz.v2.Authz.GetRBACDomainRequest,
                authz.v2.Authz.GetRBACDomainResponse>(
                  this, METHODID_GET_RBACDOMAIN)))
          .addMethod(
            getUserEnforceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                authz.v2.Authz.UserEnforceRequest,
                authz.v2.Authz.UserEnforceResponse>(
                  this, METHODID_USER_ENFORCE)))
          .addMethod(
            getUserPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                authz.v2.Authz.UserPermissionsRequest,
                authz.v2.Authz.UserPermissionsResponse>(
                  this, METHODID_USER_PERMISSIONS)))
          .build();
    }
  }

  /**
   */
  public static final class AuthorizationServiceStub extends io.grpc.stub.AbstractStub<AuthorizationServiceStub> {
    private AuthorizationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enforce permissions on a resource based on any group association
     * </pre>
     */
    public void enforce(authz.v2.Authz.EnforceRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.EnforceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnforceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enforceAll(authz.v2.Authz.EnforceAllRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.EnforceAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnforceAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get list of Accessible Resources
     * </pre>
     */
    public void userAccessibleResources(authz.v2.Authz.UserAccessibleResourcesRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.UserAccessibleResourcesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserAccessibleResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Services that are deployed into multiple domains can use this function to retrieve the domain name
     * </pre>
     */
    public void getRBACDomain(authz.v2.Authz.GetRBACDomainRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.GetRBACDomainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRBACDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A special enforce function to be used by services when a user's permissions need to be checked without access to the user's token.
     * The service must be explicitly authorized to call this function - see Authz API documentation for more details."
     * </pre>
     */
    public void userEnforce(authz.v2.Authz.UserEnforceRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.UserEnforceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserEnforceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A special UAR function to be used by services to retrieve permissions for a specific user/customer without access to user's token.
     * The service must be explicitly authorized to call this function - see Authz API documentation for more details."
     * </pre>
     */
    public void userPermissions(authz.v2.Authz.UserPermissionsRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.UserPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserPermissionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthorizationServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthorizationServiceBlockingStub> {
    private AuthorizationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enforce permissions on a resource based on any group association
     * </pre>
     */
    public authz.v2.Authz.EnforceResponse enforce(authz.v2.Authz.EnforceRequest request) {
      return blockingUnaryCall(
          getChannel(), getEnforceMethod(), getCallOptions(), request);
    }

    /**
     */
    public authz.v2.Authz.EnforceAllResponse enforceAll(authz.v2.Authz.EnforceAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getEnforceAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get list of Accessible Resources
     * </pre>
     */
    public authz.v2.Authz.UserAccessibleResourcesResponse userAccessibleResources(authz.v2.Authz.UserAccessibleResourcesRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserAccessibleResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Services that are deployed into multiple domains can use this function to retrieve the domain name
     * </pre>
     */
    public authz.v2.Authz.GetRBACDomainResponse getRBACDomain(authz.v2.Authz.GetRBACDomainRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRBACDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A special enforce function to be used by services when a user's permissions need to be checked without access to the user's token.
     * The service must be explicitly authorized to call this function - see Authz API documentation for more details."
     * </pre>
     */
    public authz.v2.Authz.UserEnforceResponse userEnforce(authz.v2.Authz.UserEnforceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserEnforceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A special UAR function to be used by services to retrieve permissions for a specific user/customer without access to user's token.
     * The service must be explicitly authorized to call this function - see Authz API documentation for more details."
     * </pre>
     */
    public authz.v2.Authz.UserPermissionsResponse userPermissions(authz.v2.Authz.UserPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthorizationServiceFutureStub extends io.grpc.stub.AbstractStub<AuthorizationServiceFutureStub> {
    private AuthorizationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enforce permissions on a resource based on any group association
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<authz.v2.Authz.EnforceResponse> enforce(
        authz.v2.Authz.EnforceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEnforceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<authz.v2.Authz.EnforceAllResponse> enforceAll(
        authz.v2.Authz.EnforceAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEnforceAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get list of Accessible Resources
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<authz.v2.Authz.UserAccessibleResourcesResponse> userAccessibleResources(
        authz.v2.Authz.UserAccessibleResourcesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserAccessibleResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Services that are deployed into multiple domains can use this function to retrieve the domain name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<authz.v2.Authz.GetRBACDomainResponse> getRBACDomain(
        authz.v2.Authz.GetRBACDomainRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRBACDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A special enforce function to be used by services when a user's permissions need to be checked without access to the user's token.
     * The service must be explicitly authorized to call this function - see Authz API documentation for more details."
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<authz.v2.Authz.UserEnforceResponse> userEnforce(
        authz.v2.Authz.UserEnforceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserEnforceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A special UAR function to be used by services to retrieve permissions for a specific user/customer without access to user's token.
     * The service must be explicitly authorized to call this function - see Authz API documentation for more details."
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<authz.v2.Authz.UserPermissionsResponse> userPermissions(
        authz.v2.Authz.UserPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENFORCE = 0;
  private static final int METHODID_ENFORCE_ALL = 1;
  private static final int METHODID_USER_ACCESSIBLE_RESOURCES = 2;
  private static final int METHODID_GET_RBACDOMAIN = 3;
  private static final int METHODID_USER_ENFORCE = 4;
  private static final int METHODID_USER_PERMISSIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthorizationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthorizationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENFORCE:
          serviceImpl.enforce((authz.v2.Authz.EnforceRequest) request,
              (io.grpc.stub.StreamObserver<authz.v2.Authz.EnforceResponse>) responseObserver);
          break;
        case METHODID_ENFORCE_ALL:
          serviceImpl.enforceAll((authz.v2.Authz.EnforceAllRequest) request,
              (io.grpc.stub.StreamObserver<authz.v2.Authz.EnforceAllResponse>) responseObserver);
          break;
        case METHODID_USER_ACCESSIBLE_RESOURCES:
          serviceImpl.userAccessibleResources((authz.v2.Authz.UserAccessibleResourcesRequest) request,
              (io.grpc.stub.StreamObserver<authz.v2.Authz.UserAccessibleResourcesResponse>) responseObserver);
          break;
        case METHODID_GET_RBACDOMAIN:
          serviceImpl.getRBACDomain((authz.v2.Authz.GetRBACDomainRequest) request,
              (io.grpc.stub.StreamObserver<authz.v2.Authz.GetRBACDomainResponse>) responseObserver);
          break;
        case METHODID_USER_ENFORCE:
          serviceImpl.userEnforce((authz.v2.Authz.UserEnforceRequest) request,
              (io.grpc.stub.StreamObserver<authz.v2.Authz.UserEnforceResponse>) responseObserver);
          break;
        case METHODID_USER_PERMISSIONS:
          serviceImpl.userPermissions((authz.v2.Authz.UserPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<authz.v2.Authz.UserPermissionsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AuthorizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthorizationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return authz.v2.Authz.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthorizationService");
    }
  }

  private static final class AuthorizationServiceFileDescriptorSupplier
      extends AuthorizationServiceBaseDescriptorSupplier {
    AuthorizationServiceFileDescriptorSupplier() {}
  }

  private static final class AuthorizationServiceMethodDescriptorSupplier
      extends AuthorizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthorizationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthorizationServiceFileDescriptorSupplier())
              .addMethod(getEnforceMethod())
              .addMethod(getEnforceAllMethod())
              .addMethod(getUserAccessibleResourcesMethod())
              .addMethod(getGetRBACDomainMethod())
              .addMethod(getUserEnforceMethod())
              .addMethod(getUserPermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
