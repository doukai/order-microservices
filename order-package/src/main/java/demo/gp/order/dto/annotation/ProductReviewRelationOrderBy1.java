package demo.gp.order.dto.annotation;

import demo.gp.review.dto.annotation.ReviewOrderBy2;
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
 * Order Input for Relationship Object between 产品 and 评论
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for Relationship Object between 产品 and 评论")
public @interface ProductReviewRelationOrderBy1 {
  /**
   * ID
   */
  @Description("ID")
  Sort id() default Sort.ASC;

  /**
   * 产品 Reference
   */
  @Description("产品 Reference")
  Sort productRef() default Sort.ASC;

  /**
   * 产品
   */
  @Description("产品")
  ProductOrderBy2 product() default @ProductOrderBy2;

  /**
   * 评论 Reference
   */
  @Description("评论 Reference")
  Sort reviewRef() default Sort.ASC;

  /**
   * 评论
   */
  @Description("评论")
  ReviewOrderBy2 review() default @ReviewOrderBy2;

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
   * Count of Relationship Object between 产品 and 评论
   */
  @Description("Count of Relationship Object between 产品 and 评论")
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
   * Count of 产品 Reference
   */
  @Description("Count of 产品 Reference")
  Sort productRefCount() default Sort.ASC;

  /**
   * Max of 产品 Reference
   */
  @Description("Max of 产品 Reference")
  Sort productRefMax() default Sort.ASC;

  /**
   * Min of 产品 Reference
   */
  @Description("Min of 产品 Reference")
  Sort productRefMin() default Sort.ASC;

  /**
   * Count of 评论 Reference
   */
  @Description("Count of 评论 Reference")
  Sort reviewRefCount() default Sort.ASC;

  /**
   * Sum of 评论 Reference
   */
  @Description("Sum of 评论 Reference")
  Sort reviewRefSum() default Sort.ASC;

  /**
   * Avg of 评论 Reference
   */
  @Description("Avg of 评论 Reference")
  Sort reviewRefAvg() default Sort.ASC;

  /**
   * Max of 评论 Reference
   */
  @Description("Max of 评论 Reference")
  Sort reviewRefMax() default Sort.ASC;

  /**
   * Min of 评论 Reference
   */
  @Description("Min of 评论 Reference")
  Sort reviewRefMin() default Sort.ASC;

  String $id() default "";

  String $productRef() default "";

  String $product() default "";

  String $reviewRef() default "";

  String $review() default "";

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

  String $productRefCount() default "";

  String $productRefMax() default "";

  String $productRefMin() default "";

  String $reviewRefCount() default "";

  String $reviewRefSum() default "";

  String $reviewRefAvg() default "";

  String $reviewRefMax() default "";

  String $reviewRefMin() default "";
}
