package demo.gp.review.dto.annotation;

import demo.gp.user.dto.annotation.UserInput2;
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
public @interface ReviewInput1 {
  String id() default "";

  String content() default "";

  float rating() default 0;

  UserInput2 user() default @UserInput2;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Review";

  ReviewUserRelationInput2[] reviewUserRelation() default {};

  ReviewExpression2 where() default @ReviewExpression2;

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

  String $where() default "";
}
