package demo.gp.review.dto.annotation;

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
 * Mutation Arguments for 评论
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Arguments for 评论")
public @interface ReviewMutationArguments {
  /**
   * 评论ID
   */
  @Description("评论ID")
  String id() default "";

  /**
   * 评论内容
   */
  @Description("评论内容")
  String content() default "";

  /**
   * 评分
   */
  @Description("评分")
  float rating() default 0;

  /**
   * 评论人
   */
  @Description("评论人")
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
  String __typename() default "Review";

  /**
   * Relationship Object between 评论 and 用户
   */
  @Description("Relationship Object between 评论 and 用户")
  ReviewUserRelationInput[] reviewUserRelation() default {};

  /**
   * Input
   */
  @Description("Input")
  ReviewInput input() default @ReviewInput;

  /**
   * Where
   */
  @Description("Where")
  ReviewExpression where() default @ReviewExpression;

  String $id() default "";

  String $content() default "";

  String $rating() default "";

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

  String $reviewUserRelation() default "";

  String $input() default "";

  String $where() default "";
}
