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
public @interface Query {
  ProductQueryArguments product() default @ProductQueryArguments;

  ProductListQueryArguments productList() default @ProductListQueryArguments;

  ProductConnectionQueryArguments productConnection() default @ProductConnectionQueryArguments;

  OrderQueryArguments order() default @OrderQueryArguments;

  OrderListQueryArguments orderList() default @OrderListQueryArguments;

  OrderConnectionQueryArguments orderConnection() default @OrderConnectionQueryArguments;

  OrderItemQueryArguments orderItem() default @OrderItemQueryArguments;

  OrderItemListQueryArguments orderItemList() default @OrderItemListQueryArguments;

  OrderItemConnectionQueryArguments orderItemConnection(
      ) default @OrderItemConnectionQueryArguments;

  OrderOrderItemRelationQueryArguments orderOrderItemRelation(
      ) default @OrderOrderItemRelationQueryArguments;

  OrderOrderItemRelationListQueryArguments orderOrderItemRelationList(
      ) default @OrderOrderItemRelationListQueryArguments;

  OrderOrderItemRelationConnectionQueryArguments orderOrderItemRelationConnection(
      ) default @OrderOrderItemRelationConnectionQueryArguments;

  OrderItemProductRelationQueryArguments orderItemProductRelation(
      ) default @OrderItemProductRelationQueryArguments;

  OrderItemProductRelationListQueryArguments orderItemProductRelationList(
      ) default @OrderItemProductRelationListQueryArguments;

  OrderItemProductRelationConnectionQueryArguments orderItemProductRelationConnection(
      ) default @OrderItemProductRelationConnectionQueryArguments;

  ProductReviewRelationQueryArguments productReviewRelation(
      ) default @ProductReviewRelationQueryArguments;

  ProductReviewRelationListQueryArguments productReviewRelationList(
      ) default @ProductReviewRelationListQueryArguments;

  ProductReviewRelationConnectionQueryArguments productReviewRelationConnection(
      ) default @ProductReviewRelationConnectionQueryArguments;

  OrderUserRelationQueryArguments orderUserRelation() default @OrderUserRelationQueryArguments;

  OrderUserRelationListQueryArguments orderUserRelationList(
      ) default @OrderUserRelationListQueryArguments;

  OrderUserRelationConnectionQueryArguments orderUserRelationConnection(
      ) default @OrderUserRelationConnectionQueryArguments;
}
