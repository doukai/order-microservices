package demo.gp.user.dto.annotation;

import demo.gp.user.dto.enumType.UserType;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Mutation Input for 用户
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Input for 用户")
public @interface UserInputBase1 {
  /**
   * 用户ID
   */
  @Description("用户ID")
  String id() default "";

  /**
   * 用户名
   */
  @Description("用户名")
  String name() default "";

  /**
   * 电子邮箱
   */
  @Description("电子邮箱")
  String email() default "";

  /**
   * 联系方式
   */
  @Description("联系方式")
  String[] phoneNumbers() default {};

  /**
   * 用户类型
   */
  @Description("用户类型")
  UserType userType() default UserType.REGULAR;

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
  String __typename() default "User";

  /**
   * Relationship Object between 用户 and 联系方式
   */
  @Description("Relationship Object between 用户 and 联系方式")
  UserPhoneNumbersRelationInput2[] userPhoneNumbersRelation() default {};

  /**
   * Where
   */
  @Description("Where")
  UserExpression2 where() default @UserExpression2;

  String $id() default "";

  String $name() default "";

  String $email() default "";

  String $phoneNumbers() default "";

  String $userType() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $userPhoneNumbersRelation() default "";

  String $where() default "";
}
