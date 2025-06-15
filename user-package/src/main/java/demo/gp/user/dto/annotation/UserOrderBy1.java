package demo.gp.user.dto.annotation;

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
 * Order Input for 用户
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for 用户")
public @interface UserOrderBy1 {
  /**
   * 用户ID
   */
  @Description("用户ID")
  Sort id() default Sort.ASC;

  /**
   * 用户名
   */
  @Description("用户名")
  Sort name() default Sort.ASC;

  /**
   * 电子邮箱
   */
  @Description("电子邮箱")
  Sort email() default Sort.ASC;

  /**
   * 联系方式
   */
  @Description("联系方式")
  Sort phoneNumbers() default Sort.ASC;

  /**
   * 用户类型
   */
  @Description("用户类型")
  Sort userType() default Sort.ASC;

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
   * Relationship Object between 用户 and 联系方式
   */
  @Description("Relationship Object between 用户 and 联系方式")
  UserPhoneNumbersRelationOrderBy2 userPhoneNumbersRelation(
      ) default @UserPhoneNumbersRelationOrderBy2;

  /**
   * Aggregate Field for Relationship Object between 用户 and 联系方式
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 联系方式")
  UserPhoneNumbersRelationOrderBy2 userPhoneNumbersRelationAggregate(
      ) default @UserPhoneNumbersRelationOrderBy2;

  /**
   * Count of 用户
   */
  @Description("Count of 用户")
  Sort idCount() default Sort.ASC;

  /**
   * Max of 用户ID
   */
  @Description("Max of 用户ID")
  Sort idMax() default Sort.ASC;

  /**
   * Min of 用户ID
   */
  @Description("Min of 用户ID")
  Sort idMin() default Sort.ASC;

  /**
   * Count of 用户名
   */
  @Description("Count of 用户名")
  Sort nameCount() default Sort.ASC;

  /**
   * Max of 用户名
   */
  @Description("Max of 用户名")
  Sort nameMax() default Sort.ASC;

  /**
   * Min of 用户名
   */
  @Description("Min of 用户名")
  Sort nameMin() default Sort.ASC;

  /**
   * Count of 电子邮箱
   */
  @Description("Count of 电子邮箱")
  Sort emailCount() default Sort.ASC;

  /**
   * Max of 电子邮箱
   */
  @Description("Max of 电子邮箱")
  Sort emailMax() default Sort.ASC;

  /**
   * Min of 电子邮箱
   */
  @Description("Min of 电子邮箱")
  Sort emailMin() default Sort.ASC;

  /**
   * Count of 用户类型
   */
  @Description("Count of 用户类型")
  Sort userTypeCount() default Sort.ASC;

  /**
   * Max of 用户类型
   */
  @Description("Max of 用户类型")
  Sort userTypeMax() default Sort.ASC;

  /**
   * Min of 用户类型
   */
  @Description("Min of 用户类型")
  Sort userTypeMin() default Sort.ASC;

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

  String $userPhoneNumbersRelationAggregate() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $emailCount() default "";

  String $emailMax() default "";

  String $emailMin() default "";

  String $userTypeCount() default "";

  String $userTypeMax() default "";

  String $userTypeMin() default "";
}
