package demo.gp.order.dto.annotation;

import demo.gp.review.dto.annotation.ReviewInput;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface ProductReviewRelationMutationArguments {
  String id() default "";

  String productRef() default "";

  ProductInput product() default @ProductInput;

  int reviewRef() default 0;

  ReviewInput review() default @ReviewInput;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "ProductReviewRelation";

  ProductReviewRelationInput input() default @ProductReviewRelationInput;

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

  String $input() default "";

  String $where() default "";
}
