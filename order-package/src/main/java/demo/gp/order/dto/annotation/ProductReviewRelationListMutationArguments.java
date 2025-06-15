package demo.gp.order.dto.annotation;

import demo.gp.review.dto.annotation.ReviewInput;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Mutation Arguments for Relationship Object between 产品 and 评论 List
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Arguments for Relationship Object between 产品 and 评论 List")
public @interface ProductReviewRelationListMutationArguments {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

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
   * 评论 Reference
   */
  @Description("评论 Reference")
  int reviewRef() default 0;

  /**
   * 评论
   */
  @Description("评论")
  ReviewInput review() default @ReviewInput;

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
  String __typename() default "ProductReviewRelation";

  /**
   * Input List
   */
  @Description("Input List")
  ProductReviewRelationInput[] list() default {};

  /**
   * Where
   */
  @Description("Where")
  ProductReviewRelationExpression where() default @ProductReviewRelationExpression;

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

  String $list() default "";

  String $where() default "";
}
