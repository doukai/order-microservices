package demo.gp.user.dto.annotation;

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
public @interface UserExpression {
  StringExpression id() default @StringExpression;

  StringExpression name() default @StringExpression;

  StringExpression email() default @StringExpression;

  StringExpression phoneNumbers() default @StringExpression;

  UserTypeExpression userType() default @UserTypeExpression;

  boolean includeDeprecated() default false;

  IntExpression version() default @IntExpression;

  IntExpression realmId() default @IntExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  UserPhoneNumbersRelationExpression1 userPhoneNumbersRelation(
      ) default @UserPhoneNumbersRelationExpression1;

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  UserExpression1[] exs() default {};

  String $id() default "";

  String $name() default "";

  String $email() default "";

  String $phoneNumbers() default "";

  String $userType() default "";

  String $includeDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $userPhoneNumbersRelation() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
