package demo.gp.order.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Mutation Arguments for Relationship Object between 订单项 and 产品 List
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Arguments for Relationship Object between 订单项 and 产品 List")
public @interface OrderItemProductRelationListMutationArguments {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 订单项 Reference
   */
  @Description("订单项 Reference")
  String orderItemRef() default "";

  /**
   * 订单项
   */
  @Description("订单项")
  OrderItemInput orderItem() default @OrderItemInput;

  /**
   * 产品 Reference
   */
  @Description("产品 Reference")
  String productRef() default "";

  /**
   * 产品
   */
  @Description("产品")
  ProductInput product() default @ProductInput;

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
  String __typename() default "OrderItemProductRelation";

  /**
   * Input List
   */
  @Description("Input List")
  OrderItemProductRelationInput[] list() default {};

  /**
   * Where
   */
  @Description("Where")
  OrderItemProductRelationExpression where() default @OrderItemProductRelationExpression;

  String $id() default "";

  String $orderItemRef() default "";

  String $orderItem() default "";

  String $productRef() default "";

  String $product() default "";

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
