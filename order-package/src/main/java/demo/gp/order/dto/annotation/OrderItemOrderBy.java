package demo.gp.order.dto.annotation;

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
 * Order Input for 订单项
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for 订单项")
public @interface OrderItemOrderBy {
  /**
   * 订单项ID
   */
  @Description("订单项ID")
  Sort id() default Sort.ASC;

  /**
   * 产品
   */
  @Description("产品")
  ProductOrderBy1 product() default @ProductOrderBy1;

  /**
   * 购买数量
   */
  @Description("购买数量")
  Sort quantity() default Sort.ASC;

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
   * Relationship Object between 订单项 and 产品
   */
  @Description("Relationship Object between 订单项 and 产品")
  OrderItemProductRelationOrderBy1 orderItemProductRelation(
      ) default @OrderItemProductRelationOrderBy1;

  /**
   * Aggregate Field for Relationship Object between 订单项 and 产品
   */
  @Description("Aggregate Field for Relationship Object between 订单项 and 产品")
  OrderItemProductRelationOrderBy1 orderItemProductRelationAggregate(
      ) default @OrderItemProductRelationOrderBy1;

  /**
   * Count of 订单项
   */
  @Description("Count of 订单项")
  Sort idCount() default Sort.ASC;

  /**
   * Max of 订单项ID
   */
  @Description("Max of 订单项ID")
  Sort idMax() default Sort.ASC;

  /**
   * Min of 订单项ID
   */
  @Description("Min of 订单项ID")
  Sort idMin() default Sort.ASC;

  /**
   * Count of 购买数量
   */
  @Description("Count of 购买数量")
  Sort quantityCount() default Sort.ASC;

  /**
   * Sum of 购买数量
   */
  @Description("Sum of 购买数量")
  Sort quantitySum() default Sort.ASC;

  /**
   * Avg of 购买数量
   */
  @Description("Avg of 购买数量")
  Sort quantityAvg() default Sort.ASC;

  /**
   * Max of 购买数量
   */
  @Description("Max of 购买数量")
  Sort quantityMax() default Sort.ASC;

  /**
   * Min of 购买数量
   */
  @Description("Min of 购买数量")
  Sort quantityMin() default Sort.ASC;

  String $id() default "";

  String $product() default "";

  String $quantity() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $orderItemProductRelation() default "";

  String $orderItemProductRelationAggregate() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

  String $quantityCount() default "";

  String $quantitySum() default "";

  String $quantityAvg() default "";

  String $quantityMax() default "";

  String $quantityMin() default "";
}
