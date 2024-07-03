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
public final class InterServiceAuthorizationServiceGrpc {

  private InterServiceAuthorizationServiceGrpc() {}

  public static final String SERVICE_NAME = "authz.v2.InterServiceAuthorizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<authz.v2.Authz.ServiceEnforceRequest,
      authz.v2.Authz.ServiceEnforceResponse> getServiceEnforceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServiceEnforce",
      requestType = authz.v2.Authz.ServiceEnforceRequest.class,
      responseType = authz.v2.Authz.ServiceEnforceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<authz.v2.Authz.ServiceEnforceRequest,
      authz.v2.Authz.ServiceEnforceResponse> getServiceEnforceMethod() {
    io.grpc.MethodDescriptor<authz.v2.Authz.ServiceEnforceRequest, authz.v2.Authz.ServiceEnforceResponse> getServiceEnforceMethod;
    if ((getServiceEnforceMethod = InterServiceAuthorizationServiceGrpc.getServiceEnforceMethod) == null) {
      synchronized (InterServiceAuthorizationServiceGrpc.class) {
        if ((getServiceEnforceMethod = InterServiceAuthorizationServiceGrpc.getServiceEnforceMethod) == null) {
          InterServiceAuthorizationServiceGrpc.getServiceEnforceMethod = getServiceEnforceMethod = 
              io.grpc.MethodDescriptor.<authz.v2.Authz.ServiceEnforceRequest, authz.v2.Authz.ServiceEnforceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authz.v2.InterServiceAuthorizationService", "ServiceEnforce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.ServiceEnforceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  authz.v2.Authz.ServiceEnforceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InterServiceAuthorizationServiceMethodDescriptorSupplier("ServiceEnforce"))
                  .build();
          }
        }
     }
     return getServiceEnforceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InterServiceAuthorizationServiceStub newStub(io.grpc.Channel channel) {
    return new InterServiceAuthorizationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InterServiceAuthorizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InterServiceAuthorizationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InterServiceAuthorizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InterServiceAuthorizationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InterServiceAuthorizationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ServiceEnforce determines if specified service is in the allowed services list for an implicit permission
     * </pre>
     */
    public void serviceEnforce(authz.v2.Authz.ServiceEnforceRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.ServiceEnforceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServiceEnforceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getServiceEnforceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                authz.v2.Authz.ServiceEnforceRequest,
                authz.v2.Authz.ServiceEnforceResponse>(
                  this, METHODID_SERVICE_ENFORCE)))
          .build();
    }
  }

  /**
   */
  public static final class InterServiceAuthorizationServiceStub extends io.grpc.stub.AbstractStub<InterServiceAuthorizationServiceStub> {
    private InterServiceAuthorizationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InterServiceAuthorizationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterServiceAuthorizationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterServiceAuthorizationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ServiceEnforce determines if specified service is in the allowed services list for an implicit permission
     * </pre>
     */
    public void serviceEnforce(authz.v2.Authz.ServiceEnforceRequest request,
        io.grpc.stub.StreamObserver<authz.v2.Authz.ServiceEnforceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getServiceEnforceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InterServiceAuthorizationServiceBlockingStub extends io.grpc.stub.AbstractStub<InterServiceAuthorizationServiceBlockingStub> {
    private InterServiceAuthorizationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InterServiceAuthorizationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterServiceAuthorizationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterServiceAuthorizationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ServiceEnforce determines if specified service is in the allowed services list for an implicit permission
     * </pre>
     */
    public authz.v2.Authz.ServiceEnforceResponse serviceEnforce(authz.v2.Authz.ServiceEnforceRequest request) {
      return blockingUnaryCall(
          getChannel(), getServiceEnforceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InterServiceAuthorizationServiceFutureStub extends io.grpc.stub.AbstractStub<InterServiceAuthorizationServiceFutureStub> {
    private InterServiceAuthorizationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InterServiceAuthorizationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterServiceAuthorizationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterServiceAuthorizationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ServiceEnforce determines if specified service is in the allowed services list for an implicit permission
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<authz.v2.Authz.ServiceEnforceResponse> serviceEnforce(
        authz.v2.Authz.ServiceEnforceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getServiceEnforceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SERVICE_ENFORCE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InterServiceAuthorizationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InterServiceAuthorizationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVICE_ENFORCE:
          serviceImpl.serviceEnforce((authz.v2.Authz.ServiceEnforceRequest) request,
              (io.grpc.stub.StreamObserver<authz.v2.Authz.ServiceEnforceResponse>) responseObserver);
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

  private static abstract class InterServiceAuthorizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InterServiceAuthorizationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return authz.v2.Authz.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InterServiceAuthorizationService");
    }
  }

  private static final class InterServiceAuthorizationServiceFileDescriptorSupplier
      extends InterServiceAuthorizationServiceBaseDescriptorSupplier {
    InterServiceAuthorizationServiceFileDescriptorSupplier() {}
  }

  private static final class InterServiceAuthorizationServiceMethodDescriptorSupplier
      extends InterServiceAuthorizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InterServiceAuthorizationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InterServiceAuthorizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InterServiceAuthorizationServiceFileDescriptorSupplier())
              .addMethod(getServiceEnforceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
