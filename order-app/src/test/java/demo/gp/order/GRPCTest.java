package demo.gp.order;

import demo.gp.user.dto.enumType.grpc.UserType;
import demo.gp.user.grpc.*;
import io.graphoenix.core.dto.enumType.grpc.Operator;
import io.graphoenix.core.dto.inputObjectType.grpc.StringExpression;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GRPCTest {

    @Test
    void userTest() {
        QueryServiceGrpc.QueryServiceBlockingStub queryServiceStub = QueryServiceGrpc.newBlockingStub(ManagedChannelBuilder.forTarget("localhost:50053").usePlaintext().build());
        QueryUserResponse response = queryServiceStub.user(QueryUserRequest.newBuilder().setName(StringExpression.newBuilder().setOpr(Operator.EQ_OPERATOR).setVal("Bob").build()).build());

        assertAll(
                () -> assertEquals(response.getUser().getName(), "Bob"),
                () -> assertEquals(response.getUser().getEmail(), "bob@example.com"),
                () -> assertEquals(response.getUser().getUserType(), UserType.REGULAR_USER_TYPE)
        );
    }
}
