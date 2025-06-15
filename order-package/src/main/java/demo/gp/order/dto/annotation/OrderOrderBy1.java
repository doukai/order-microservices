package demo.gp.order.dto.annotation;

import demo.gp.user.dto.annotation.UserOrderBy2;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Order Input for 订单
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for 订单")
public @interface OrderOrderBy1 {
  /**
   * 订单ID
   */
  @Description("订单ID")
  Sort id() default Sort.ASC;

  /**
   * 购买用户
   */
  @Description("购买用户")
  UserOrderBy2 user() default @UserOrderBy2;

  /**
   * 产品列表
   */
  @Description("产品列表")
  OrderItemOrderBy2 items() default @OrderItemOrderBy2;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  Sort isDeprecated() default Sort.ASC;

  /**
   * Version
   */
  @Description("Version")
  Sort version() default Sort.ASC;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  Sort realmId() default Sort.ASC;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  Sort createUserId() default Sort.ASC;

  /**
   * Create Time
   */
  @Description("Create Time")
  Sort createTime() default Sort.ASC;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  Sort updateUserId() default Sort.ASC;

  /**
   * Update Time
   */
  @Description("Update Time")
  Sort updateTime() default Sort.ASC;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  Sort createGroupId() default Sort.ASC;

  /**
   * Type Name
   */
  @Description("Type Name")
  Sort __typename() default Sort.ASC;

  /**
   * Relationship Object between 订单 and 用户
   */
  @Description("Relationship Object between 订单 and 用户")
  OrderUserRelationOrderBy2 orderUserRelation() default @OrderUserRelationOrderBy2;

  /**
   * Relationship Object between 订单 and 订单项
   */
  @Description("Relationship Object between 订单 and 订单项")
  OrderOrderItemRelationOrderBy2 orderOrderItemRelation() default @OrderOrderItemRelationOrderBy2;

  /**
   * Aggregate Field for 产品列表
   */
  @Description("Aggregate Field for 产品列表")
  OrderItemOrderBy2 itemsAggregate() default @OrderItemOrderBy2;

  /**
   * Aggregate Field for Relationship Object between 订单 and 订单项
   */
  @Description("Aggregate Field for Relationship Object between 订单 and 订单项")
  OrderOrderItemRelationOrderBy2 orderOrderItemRelationAggregate(
      ) default @OrderOrderItemRelationOrderBy2;

  /**
   * Count of 订单
   */
  @Description("Count of 订单")
  Sort idCount() default Sort.ASC;

  /**
   * Max of 订单ID
   */
  @Description("Max of 订单ID")
  Sort idMax() default Sort.ASC;

  /**
   * Min of 订单ID
   */
  @Description("Min of 订单ID")
  Sort idMin() default Sort.ASC;

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

  String $itemsAggregate() default "";

  String $orderOrderItemRelationAggregate() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";
}
