package demo.gp.order.dto.annotation;

import demo.gp.user.dto.annotation.UserInput2;
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
public @interface OrderUserRelationInput1 {
  String id() default "";

  String orderRef() default "";

  OrderInput2 order() default @OrderInput2;

  int userRef() default 0;

  UserInput2 user() default @UserInput2;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "OrderUserRelation";

  OrderUserRelationExpression2 where() default @OrderUserRelationExpression2;

  String $id() default "";

  String $orderRef() default "";

  String $order() default "";

  String $userRef() default "";

  String $user() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $where() default "";
}
