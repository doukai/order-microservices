package demo.gp.review.dto.annotation;

import demo.gp.user.dto.annotation.UserOrderBy1;
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
 * Order Input for Relationship Object between 评论 and 用户
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for Relationship Object between 评论 and 用户")
public @interface ReviewUserRelationOrderBy {
  /**
   * ID
   */
  @Description("ID")
  Sort id() default Sort.ASC;

  /**
   * 评论 Reference
   */
  @Description("评论 Reference")
  Sort reviewRef() default Sort.ASC;

  /**
   * 评论
   */
  @Description("评论")
  ReviewOrderBy1 review() default @ReviewOrderBy1;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  Sort userRef() default Sort.ASC;

  /**
   * 用户
   */
  @Description("用户")
  UserOrderBy1 user() default @UserOrderBy1;

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
   * Count of Relationship Object between 评论 and 用户
   */
  @Description("Count of Relationship Object between 评论 and 用户")
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
   * Count of 评论 Reference
   */
  @Description("Count of 评论 Reference")
  Sort reviewRefCount() default Sort.ASC;

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

  /**
   * Count of 用户 Reference
   */
  @Description("Count of 用户 Reference")
  Sort userRefCount() default Sort.ASC;

  /**
   * Sum of 用户 Reference
   */
  @Description("Sum of 用户 Reference")
  Sort userRefSum() default Sort.ASC;

  /**
   * Avg of 用户 Reference
   */
  @Description("Avg of 用户 Reference")
  Sort userRefAvg() default Sort.ASC;

  /**
   * Max of 用户 Reference
   */
  @Description("Max of 用户 Reference")
  Sort userRefMax() default Sort.ASC;

  /**
   * Min of 用户 Reference
   */
  @Description("Min of 用户 Reference")
  Sort userRefMin() default Sort.ASC;

  String $id() default "";

  String $reviewRef() default "";

  String $review() default "";

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

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

  String $reviewRefCount() default "";

  String $reviewRefMax() default "";

  String $reviewRefMin() default "";

  String $userRefCount() default "";

  String $userRefSum() default "";

  String $userRefAvg() default "";

  String $userRefMax() default "";

  String $userRefMin() default "";
}
