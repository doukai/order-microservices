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
 * Order Input for 产品
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for 产品")
public @interface ProductOrderBy2 {
  /**
   * 产品ID
   */
  @Description("产品ID")
  Sort id() default Sort.ASC;

  /**
   * 产品名称
   */
  @Description("产品名称")
  Sort name() default Sort.ASC;

  /**
   * 定价
   */
  @Description("定价")
  Sort price() default Sort.ASC;

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
   * Count of 产品
   */
  @Description("Count of 产品")
  Sort idCount() default Sort.ASC;

  /**
   * Max of 产品ID
   */
  @Description("Max of 产品ID")
  Sort idMax() default Sort.ASC;

  /**
   * Min of 产品ID
   */
  @Description("Min of 产品ID")
  Sort idMin() default Sort.ASC;

  /**
   * Count of 产品名称
   */
  @Description("Count of 产品名称")
  Sort nameCount() default Sort.ASC;

  /**
   * Max of 产品名称
   */
  @Description("Max of 产品名称")
  Sort nameMax() default Sort.ASC;

  /**
   * Min of 产品名称
   */
  @Description("Min of 产品名称")
  Sort nameMin() default Sort.ASC;

  /**
   * Count of 定价
   */
  @Description("Count of 定价")
  Sort priceCount() default Sort.ASC;

  /**
   * Sum of 定价
   */
  @Description("Sum of 定价")
  Sort priceSum() default Sort.ASC;

  /**
   * Avg of 定价
   */
  @Description("Avg of 定价")
  Sort priceAvg() default Sort.ASC;

  /**
   * Max of 定价
   */
  @Description("Max of 定价")
  Sort priceMax() default Sort.ASC;

  /**
   * Min of 定价
   */
  @Description("Min of 定价")
  Sort priceMin() default Sort.ASC;

  String $id() default "";

  String $name() default "";

  String $price() default "";

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

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $priceCount() default "";

  String $priceSum() default "";

  String $priceAvg() default "";

  String $priceMax() default "";

  String $priceMin() default "";
}
