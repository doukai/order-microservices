package demo.gp.review.dto.annotation;

import demo.gp.user.dto.annotation.UserExpression1;
import io.graphoenix.core.dto.annotation.IntExpression;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.core.dto.enumType.Conditional;
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
public @interface ReviewUserRelationExpression {
  StringExpression id() default @StringExpression;

  StringExpression reviewRef() default @StringExpression;

  ReviewExpression1 review() default @ReviewExpression1;

  IntExpression userRef() default @IntExpression;

  UserExpression1 user() default @UserExpression1;

  boolean includeDeprecated() default false;

  IntExpression version() default @IntExpression;

  IntExpression realmId() default @IntExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  ReviewUserRelationExpression1[] exs() default {};

  String $id() default "";

  String $reviewRef() default "";

  String $review() default "";

  String $userRef() default "";

  String $user() default "";

  String $includeDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
