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
 * Order Input for Relationship Object between 订单 and 订单项
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for Relationship Object between 订单 and 订单项")
public @interface OrderOrderItemRelationOrderBy {
  /**
   * ID
   */
  @Description("ID")
  Sort id() default Sort.ASC;

  /**
   * 订单 Reference
   */
  @Description("订单 Reference")
  Sort orderRef() default Sort.ASC;

  /**
   * 订单
   */
  @Description("订单")
  OrderOrderBy1 order() default @OrderOrderBy1;

  /**
   * 订单项 Reference
   */
  @Description("订单项 Reference")
  Sort orderItemRef() default Sort.ASC;

  /**
   * 订单项
   */
  @Description("订单项")
  OrderItemOrderBy1 orderItem() default @OrderItemOrderBy1;

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
   * Count of Relationship Object between 订单 and 订单项
   */
  @Description("Count of Relationship Object between 订单 and 订单项")
  Sort idCount() default Sort.ASC;

  /**
   * Max of ID
   */
  @Description("Max of ID")
  Sort idMax() default Sort.ASC;

  /**
   * Min of ID
   */
  @Description("Min of ID")
  Sort idMin() default Sort.ASC;

  /**
   * Count of 订单 Reference
   */
  @Description("Count of 订单 Reference")
  Sort orderRefCount() default Sort.ASC;

  /**
   * Max of 订单 Reference
   */
  @Description("Max of 订单 Reference")
  Sort orderRefMax() default Sort.ASC;

  /**
   * Min of 订单 Reference
   */
  @Description("Min of 订单 Reference")
  Sort orderRefMin() default Sort.ASC;

  /**
   * Count of 订单项 Reference
   */
  @Description("Count of 订单项 Reference")
  Sort orderItemRefCount() default Sort.ASC;

  /**
   * Max of 订单项 Reference
   */
  @Description("Max of 订单项 Reference")
  Sort orderItemRefMax() default Sort.ASC;

  /**
   * Min of 订单项 Reference
   */
  @Description("Min of 订单项 Reference")
  Sort orderItemRefMin() default Sort.ASC;

  String $id() default "";

  String $orderRef() default "";

  String $order() default "";

  String $orderItemRef() default "";

  String $orderItem() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

  String $orderRefCount() default "";

  String $orderRefMax() default "";

  String $orderRefMin() default "";

  String $orderItemRefCount() default "";

  String $orderItemRefMax() default "";

  String $orderItemRefMin() default "";
}
