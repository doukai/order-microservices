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
public @interface ProductMutationArguments {
  String id() default "";

  String name() default "";

  float price() default 0;

  ReviewInput[] reviews() default {};

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Product";

  ProductReviewRelationInput[] productReviewRelation() default {};

  ProductInput input() default @ProductInput;

  ProductExpression where() default @ProductExpression;

  String $id() default "";

  String $name() default "";

  String $price() default "";

  String $reviews() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $productReviewRelation() default "";

  String $input() default "";

  String $where() default "";
}
