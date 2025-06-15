package demo.gp.user.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 用户
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for 用户")
public class UserOrderBy {
  /**
   * 用户ID
   */
  @Description("用户ID")
  private Sort id;

  /**
   * 用户名
   */
  @Description("用户名")
  private Sort name;

  /**
   * 电子邮箱
   */
  @Description("电子邮箱")
  private Sort email;

  /**
   * 联系方式
   */
  @Description("联系方式")
  private Sort phoneNumbers;

  /**
   * 用户类型
   */
  @Description("用户类型")
  private Sort userType;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  private Sort isDeprecated;

  /**
   * Version
   */
  @Description("Version")
  private Sort version;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  private Sort realmId;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  private Sort createUserId;

  /**
   * Create Time
   */
  @Description("Create Time")
  private Sort createTime;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  private Sort updateUserId;

  /**
   * Update Time
   */
  @Description("Update Time")
  private Sort updateTime;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  private Sort createGroupId;

  /**
   * Type Name
   */
  @Description("Type Name")
  private Sort __typename;

  /**
   * Relationship Object between 用户 and 联系方式
   */
  @Description("Relationship Object between 用户 and 联系方式")
  private UserPhoneNumbersRelationOrderBy userPhoneNumbersRelation;

  /**
   * Aggregate Field for Relationship Object between 用户 and 联系方式
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 联系方式")
  private UserPhoneNumbersRelationOrderBy userPhoneNumbersRelationAggregate;

  /**
   * Count of 用户
   */
  @Description("Count of 用户")
  private Sort idCount;

  /**
   * Max of 用户ID
   */
  @Description("Max of 用户ID")
  private Sort idMax;

  /**
   * Min of 用户ID
   */
  @Description("Min of 用户ID")
  private Sort idMin;

  /**
   * Count of 用户名
   */
  @Description("Count of 用户名")
  private Sort nameCount;

  /**
   * Max of 用户名
   */
  @Description("Max of 用户名")
  private Sort nameMax;

  /**
   * Min of 用户名
   */
  @Description("Min of 用户名")
  private Sort nameMin;

  /**
   * Count of 电子邮箱
   */
  @Description("Count of 电子邮箱")
  private Sort emailCount;

  /**
   * Max of 电子邮箱
   */
  @Description("Max of 电子邮箱")
  private Sort emailMax;

  /**
   * Min of 电子邮箱
   */
  @Description("Min of 电子邮箱")
  private Sort emailMin;

  /**
   * Count of 用户类型
   */
  @Description("Count of 用户类型")
  private Sort userTypeCount;

  /**
   * Max of 用户类型
   */
  @Description("Max of 用户类型")
  private Sort userTypeMax;

  /**
   * Min of 用户类型
   */
  @Description("Min of 用户类型")
  private Sort userTypeMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getName() {
    return this.name;
  }

  public void setName(Sort name) {
    this.name = name;
  }

  public Sort getEmail() {
    return this.email;
  }

  public void setEmail(Sort email) {
    this.email = email;
  }

  public Sort getPhoneNumbers() {
    return this.phoneNumbers;
  }

  public void setPhoneNumbers(Sort phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public Sort getUserType() {
    return this.userType;
  }

  public void setUserType(Sort userType) {
    this.userType = userType;
  }

  public Sort getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Sort isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Sort getVersion() {
    return this.version;
  }

  public void setVersion(Sort version) {
    this.version = version;
  }

  public Sort getRealmId() {
    return this.realmId;
  }

  public void setRealmId(Sort realmId) {
    this.realmId = realmId;
  }

  public Sort getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(Sort createUserId) {
    this.createUserId = createUserId;
  }

  public Sort getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Sort createTime) {
    this.createTime = createTime;
  }

  public Sort getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(Sort updateUserId) {
    this.updateUserId = updateUserId;
  }

  public Sort getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(Sort updateTime) {
    this.updateTime = updateTime;
  }

  public Sort getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(Sort createGroupId) {
    this.createGroupId = createGroupId;
  }

  public Sort get__typename() {
    return this.__typename;
  }

  public void set__typename(Sort __typename) {
    this.__typename = __typename;
  }

  public UserPhoneNumbersRelationOrderBy getUserPhoneNumbersRelation() {
    return this.userPhoneNumbersRelation;
  }

  public void setUserPhoneNumbersRelation(
      UserPhoneNumbersRelationOrderBy userPhoneNumbersRelation) {
    this.userPhoneNumbersRelation = userPhoneNumbersRelation;
  }

  public UserPhoneNumbersRelationOrderBy getUserPhoneNumbersRelationAggregate() {
    return this.userPhoneNumbersRelationAggregate;
  }

  public void setUserPhoneNumbersRelationAggregate(
      UserPhoneNumbersRelationOrderBy userPhoneNumbersRelationAggregate) {
    this.userPhoneNumbersRelationAggregate = userPhoneNumbersRelationAggregate;
  }

  public Sort getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Sort idCount) {
    this.idCount = idCount;
  }

  public Sort getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Sort idMax) {
    this.idMax = idMax;
  }

  public Sort getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Sort idMin) {
    this.idMin = idMin;
  }

  public Sort getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Sort nameCount) {
    this.nameCount = nameCount;
  }

  public Sort getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(Sort nameMax) {
    this.nameMax = nameMax;
  }

  public Sort getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(Sort nameMin) {
    this.nameMin = nameMin;
  }

  public Sort getEmailCount() {
    return this.emailCount;
  }

  public void setEmailCount(Sort emailCount) {
    this.emailCount = emailCount;
  }

  public Sort getEmailMax() {
    return this.emailMax;
  }

  public void setEmailMax(Sort emailMax) {
    this.emailMax = emailMax;
  }

  public Sort getEmailMin() {
    return this.emailMin;
  }

  public void setEmailMin(Sort emailMin) {
    this.emailMin = emailMin;
  }

  public Sort getUserTypeCount() {
    return this.userTypeCount;
  }

  public void setUserTypeCount(Sort userTypeCount) {
    this.userTypeCount = userTypeCount;
  }

  public Sort getUserTypeMax() {
    return this.userTypeMax;
  }

  public void setUserTypeMax(Sort userTypeMax) {
    this.userTypeMax = userTypeMax;
  }

  public Sort getUserTypeMin() {
    return this.userTypeMin;
  }

  public void setUserTypeMin(Sort userTypeMin) {
    this.userTypeMin = userTypeMin;
  }
}
