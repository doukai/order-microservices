package demo.gp.order.dto.annotation;

import demo.gp.user.dto.annotation.UserInput;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface OrderListMutationArguments {
  String id() default "";

  UserInput user() default @UserInput;

  OrderItemInput[] items() default {};

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Order";

  OrderUserRelationInput[] orderUserRelation() default {};

  OrderOrderItemRelationInput[] orderOrderItemRelation() default {};

  OrderInput[] list() default {};

  OrderExpression where() default @OrderExpression;

  String $id() default "";

  String $user() default "";

  String $items() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $orderUserRelation() default "";

  String $orderOrderItemRelation() default "";

  String $list() default "";

  String $where() default "";
}
