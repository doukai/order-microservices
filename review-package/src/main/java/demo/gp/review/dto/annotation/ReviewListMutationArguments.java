package demo.gp.review.dto.annotation;

import demo.gp.user.dto.annotation.UserInput;
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
public @interface ReviewListMutationArguments {
  String id() default "";

  String content() default "";

  float rating() default 0;

  UserInput user() default @UserInput;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Review";

  ReviewUserRelationInput[] reviewUserRelation() default {};

  ReviewInput[] list() default {};

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

  String $list() default "";

  String $where() default "";
}
