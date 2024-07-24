package demo.gp.order.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Subscription {
  ProductSubscriptionArguments product() default @ProductSubscriptionArguments;

  ProductListSubscriptionArguments productList() default @ProductListSubscriptionArguments;

  ProductConnectionSubscriptionArguments productConnection(
      ) default @ProductConnectionSubscriptionArguments;

  OrderSubscriptionArguments order() default @OrderSubscriptionArguments;

  OrderListSubscriptionArguments orderList() default @OrderListSubscriptionArguments;

  OrderConnectionSubscriptionArguments orderConnection(
      ) default @OrderConnectionSubscriptionArguments;

  OrderItemSubscriptionArguments orderItem() default @OrderItemSubscriptionArguments;

  OrderItemListSubscriptionArguments orderItemList() default @OrderItemListSubscriptionArguments;

  OrderItemConnectionSubscriptionArguments orderItemConnection(
      ) default @OrderItemConnectionSubscriptionArguments;

  OrderOrderItemRelationSubscriptionArguments orderOrderItemRelation(
      ) default @OrderOrderItemRelationSubscriptionArguments;

  OrderOrderItemRelationListSubscriptionArguments orderOrderItemRelationList(
      ) default @OrderOrderItemRelationListSubscriptionArguments;

  OrderOrderItemRelationConnectionSubscriptionArguments orderOrderItemRelationConnection(
      ) default @OrderOrderItemRelationConnectionSubscriptionArguments;

  OrderItemProductRelationSubscriptionArguments orderItemProductRelation(
      ) default @OrderItemProductRelationSubscriptionArguments;

  OrderItemProductRelationListSubscriptionArguments orderItemProductRelationList(
      ) default @OrderItemProductRelationListSubscriptionArguments;

  OrderItemProductRelationConnectionSubscriptionArguments orderItemProductRelationConnection(
      ) default @OrderItemProductRelationConnectionSubscriptionArguments;

  ProductReviewRelationSubscriptionArguments productReviewRelation(
      ) default @ProductReviewRelationSubscriptionArguments;

  ProductReviewRelationListSubscriptionArguments productReviewRelationList(
      ) default @ProductReviewRelationListSubscriptionArguments;

  ProductReviewRelationConnectionSubscriptionArguments productReviewRelationConnection(
      ) default @ProductReviewRelationConnectionSubscriptionArguments;

  OrderUserRelationSubscriptionArguments orderUserRelation(
      ) default @OrderUserRelationSubscriptionArguments;

  OrderUserRelationListSubscriptionArguments orderUserRelationList(
      ) default @OrderUserRelationListSubscriptionArguments;

  OrderUserRelationConnectionSubscriptionArguments orderUserRelationConnection(
      ) default @OrderUserRelationConnectionSubscriptionArguments;
}
