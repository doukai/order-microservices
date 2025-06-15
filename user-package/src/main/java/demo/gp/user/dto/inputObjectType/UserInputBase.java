package demo.gp.user.dto.inputObjectType;

import demo.gp.user.dto.enumType.UserType;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Input for 用户
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for 用户")
public interface UserInputBase extends MetaInput {
  /**
   * 用户ID
   */
  @Description("用户ID")
  String id = null;

  /**
   * 用户名
   */
  @Description("用户名")
  String name = null;

  /**
   * 电子邮箱
   */
  @Description("电子邮箱")
  String email = null;

  /**
   * 联系方式
   */
  @Description("联系方式")
  Collection<String> phoneNumbers = null;

  /**
   * 用户类型
   */
  @Description("用户类型")
  UserType userType = null;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  Boolean isDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  Integer version = null;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  Integer realmId = null;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  String createUserId = null;

  /**
   * Create Time
   */
  @Description("Create Time")
  LocalDateTime createTime = null;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  String updateUserId = null;

  /**
   * Update Time
   */
  @Description("Update Time")
  LocalDateTime updateTime = null;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  String createGroupId = null;

  /**
   * Type Name
   */
  @Description("Type Name")
  String __typename = "User";

  /**
   * Relationship Object between 用户 and 联系方式
   */
  @Description("Relationship Object between 用户 and 联系方式")
  Collection<UserPhoneNumbersRelationInput> userPhoneNumbersRelation = null;

  /**
   * Where
   */
  @Description("Where")
  UserExpression where = null;

  default String getId() {
    return id;
  }

  void setId(String id);

  default String getName() {
    return name;
  }

  void setName(String name);

  default String getEmail() {
    return email;
  }

  void setEmail(String email);

  default Collection<String> getPhoneNumbers() {
    return phoneNumbers;
  }

  void setPhoneNumbers(Collection<String> phoneNumbers);

  default UserType getUserType() {
    return userType;
  }

  void setUserType(UserType userType);

  default Boolean getIsDeprecated() {
    return isDeprecated;
  }

  void setIsDeprecated(Boolean isDeprecated);

  default Integer getVersion() {
    return version;
  }

  void setVersion(Integer version);

  default Integer getRealmId() {
    return realmId;
  }

  void setRealmId(Integer realmId);

  default String getCreateUserId() {
    return createUserId;
  }

  void setCreateUserId(String createUserId);

  default LocalDateTime getCreateTime() {
    return createTime;
  }

  void setCreateTime(LocalDateTime createTime);

  default String getUpdateUserId() {
    return updateUserId;
  }

  void setUpdateUserId(String updateUserId);

  default LocalDateTime getUpdateTime() {
    return updateTime;
  }

  void setUpdateTime(LocalDateTime updateTime);

  default String getCreateGroupId() {
    return createGroupId;
  }

  void setCreateGroupId(String createGroupId);

  default String get__typename() {
    return __typename;
  }

  void set__typename(String __typename);

  default Collection<UserPhoneNumbersRelationInput> getUserPhoneNumbersRelation() {
    return userPhoneNumbersRelation;
  }

  void setUserPhoneNumbersRelation(
      Collection<UserPhoneNumbersRelationInput> userPhoneNumbersRelation);

  default UserExpression getWhere() {
    return where;
  }

  void setWhere(UserExpression where);
}
