package demo.gp.review.dto.annotation;

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
 * Order Input for 评论
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for 评论")
public @interface ReviewOrderBy2 {
  /**
   * 评论ID
   */
  @Description("评论ID")
  Sort id() default Sort.ASC;

  /**
   * 评论内容
   */
  @Description("评论内容")
  Sort content() default Sort.ASC;

  /**
   * 评分
   */
  @Description("评分")
  Sort rating() default Sort.ASC;

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
   * Count of 评论
   */
  @Description("Count of 评论")
  Sort idCount() default Sort.ASC;

  /**
   * Max of 评论ID
   */
  @Description("Max of 评论ID")
  Sort idMax() default Sort.ASC;

  /**
   * Min of 评论ID
   */
  @Description("Min of 评论ID")
  Sort idMin() default Sort.ASC;

  /**
   * Count of 评论内容
   */
  @Description("Count of 评论内容")
  Sort contentCount() default Sort.ASC;

  /**
   * Max of 评论内容
   */
  @Description("Max of 评论内容")
  Sort contentMax() default Sort.ASC;

  /**
   * Min of 评论内容
   */
  @Description("Min of 评论内容")
  Sort contentMin() default Sort.ASC;

  /**
   * Count of 评分
   */
  @Description("Count of 评分")
  Sort ratingCount() default Sort.ASC;

  /**
   * Sum of 评分
   */
  @Description("Sum of 评分")
  Sort ratingSum() default Sort.ASC;

  /**
   * Avg of 评分
   */
  @Description("Avg of 评分")
  Sort ratingAvg() default Sort.ASC;

  /**
   * Max of 评分
   */
  @Description("Max of 评分")
  Sort ratingMax() default Sort.ASC;

  /**
   * Min of 评分
   */
  @Description("Min of 评分")
  Sort ratingMin() default Sort.ASC;

  String $id() default "";

  String $content() default "";

  String $rating() default "";

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

  String $contentCount() default "";

  String $contentMax() default "";

  String $contentMin() default "";

  String $ratingCount() default "";

  String $ratingSum() default "";

  String $ratingAvg() default "";

  String $ratingMax() default "";

  String $ratingMin() default "";
}
