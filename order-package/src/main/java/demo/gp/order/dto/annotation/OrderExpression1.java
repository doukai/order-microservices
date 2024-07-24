package demo.gp.order.dto.annotation;

import demo.gp.user.dto.annotation.UserExpression2;
import io.graphoenix.core.dto.annotation.IntExpression;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.core.dto.enumType.Conditional;
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
public @interface OrderExpression1 {
  StringExpression id() default @StringExpression;

  UserExpression2 user() default @UserExpression2;

  OrderItemExpression2 items() default @OrderItemExpression2;

  boolean includeDeprecated() default false;

  IntExpression version() default @IntExpression;

  IntExpression realmId() default @IntExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  OrderUserRelationExpression2 orderUserRelation() default @OrderUserRelationExpression2;

  OrderOrderItemRelationExpression2 orderOrderItemRelation(
      ) default @OrderOrderItemRelationExpression2;

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  OrderExpression2[] exs() default {};

  String $id() default "";

  String $user() default "";

  String $items() default "";

  String $includeDeprecated() default "";

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

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
