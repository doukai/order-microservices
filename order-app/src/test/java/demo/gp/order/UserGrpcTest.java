package demo.gp.order;

import demo.gp.user.dto.enumType.grpc.UserType;
import demo.gp.user.dto.inputObjectType.grpc.UserTypeExpression;
import demo.gp.user.grpc.*;
import io.graphoenix.core.dto.enumType.grpc.Operator;
import io.graphoenix.core.dto.inputObjectType.grpc.StringExpression;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

public class UserGrpcTest {

    private static final String userGrpcAddress = "localhost:50053";
    private static final ManagedChannel userManagedChannel = ManagedChannelBuilder.forTarget(userGrpcAddress).usePlaintext().build();
    private static final QueryServiceGrpc.QueryServiceBlockingStub queryServiceStub = QueryServiceGrpc.newBlockingStub(userManagedChannel);
    private static final ReactorQueryServiceGrpc.ReactorQueryServiceStub reactorQueryServiceStub = ReactorQueryServiceGrpc.newReactorStub(userManagedChannel);
    private static final MutationServiceGrpc.MutationServiceBlockingStub mutationServiceBlockingStub = MutationServiceGrpc.newBlockingStub(userManagedChannel);

    @Test
    void queryUserTest() {
        QueryUserRequest queryUserRequest = QueryUserRequest.newBuilder()
                .setSelectionSet("{name userType}")
                .setName(
                        StringExpression.newBuilder()
                                .setOpr(Operator.EQ_OPERATOR)
                                .setVal("Alice")
                                .build()
                )
                .setUserType(
                        UserTypeExpression.newBuilder()
                                .setVal(UserType.VIP_USER_TYPE)
                                .build()
                )
                .build();
        QueryUserResponse response = queryServiceStub.user(queryUserRequest);

        assertAll(
                () -> assertEquals(response.getUser().getName(), "Alice"),
                () -> assertEquals(response.getUser().getUserType(), UserType.VIP_USER_TYPE)
//                () -> assertNull(response.getUser().getEmail())
        );
    }

    @Test
    void reactorQueryUserTest() {
        QueryUserRequest queryUserRequest = QueryUserRequest.newBuilder()
                .setName(
                        StringExpression.newBuilder()
                                .setOpr(Operator.EQ_OPERATOR)
                                .setVal("Bob")
                                .build()
                )
                .build();
        Mono<QueryUserResponse> responseMono = reactorQueryServiceStub.user(queryUserRequest);

        StepVerifier.create(responseMono)
                .assertNext(response ->
                        assertAll(
                                () -> assertEquals(response.getUser().getName(), "Bob"),
                                () -> assertEquals(response.getUser().getEmail(), "bob@example.com"),
                                () -> assertEquals(response.getUser().getUserType(), UserType.REGULAR_USER_TYPE)
                        )
                )
                .expectComplete()
                .verify();
    }

    @Test
    void MutationUserTest() {
        MutationUserRequest mutationUserRequest = MutationUserRequest.newBuilder()
                .setName("Uma")
                .setEmail("uma@example.com")
                .setUserType(UserType.VIP_USER_TYPE)
                .build();
        MutationUserResponse response = mutationServiceBlockingStub.user(mutationUserRequest);

        assertAll(
                () -> assertEquals(response.getUser().getName(), "Uma"),
                () -> assertEquals(response.getUser().getEmail(), "uma@example.com"),
                () -> assertEquals(response.getUser().getUserType(), UserType.VIP_USER_TYPE)
        );
    }
}
