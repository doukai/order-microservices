package demo.gp.order.dto.annotation;

import demo.gp.user.dto.annotation.UserInput;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Mutation Arguments for Relationship Object between 订单 and 用户 List
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Arguments for Relationship Object between 订单 and 用户 List")
public @interface OrderUserRelationListMutationArguments {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 订单 Reference
   */
  @Description("订单 Reference")
  String orderRef() default "";

  /**
   * 订单
   */
  @Description("订单")
  OrderInput order() default @OrderInput;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  int userRef() default 0;

  /**
   * 用户
   */
  @Description("用户")
  UserInput user() default @UserInput;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  boolean isDeprecated() default false;

  /**
   * Version
   */
  @Description("Version")
  int version() default 0;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  int realmId() default 0;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  String createUserId() default "";

  /**
   * Create Time
   */
  @Description("Create Time")
  String createTime() default "";

  /**
   * Update User ID
   */
  @Description("Update User ID")
  String updateUserId() default "";

  /**
   * Update Time
   */
  @Description("Update Time")
  String updateTime() default "";

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  String createGroupId() default "";

  /**
   * Type Name
   */
  @Description("Type Name")
  String __typename() default "OrderUserRelation";

  /**
   * Input List
   */
  @Description("Input List")
  OrderUserRelationInput[] list() default {};

  /**
   * Where
   */
  @Description("Where")
  OrderUserRelationExpression where() default @OrderUserRelationExpression;

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

  String $list() default "";

  String $where() default "";
}
