package demo.gp.user.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.enumType.UserType;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Arguments for 用户
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Arguments for 用户")
public class UserMutationArguments implements MetaInput, UserInputBase {
  /**
   * 用户ID
   */
  @Description("用户ID")
  private String id;

  /**
   * 用户名
   */
  @Description("用户名")
  private String name;

  /**
   * 电子邮箱
   */
  @Description("电子邮箱")
  private String email;

  /**
   * 联系方式
   */
  @Description("联系方式")
  private Collection<String> phoneNumbers;

  /**
   * 用户类型
   */
  @Description("用户类型")
  private UserType userType;

  /**
   * Is Deprecated
   */
  @DefaultValue("false")
  @Description("Is Deprecated")
  private Boolean isDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  private Integer version;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  private Integer realmId;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  private String createUserId;

  /**
   * Create Time
   */
  @Description("Create Time")
  private LocalDateTime createTime;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  private String updateUserId;

  /**
   * Update Time
   */
  @Description("Update Time")
  private LocalDateTime updateTime;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  private String createGroupId;

  /**
   * Type Name
   */
  @DefaultValue("User")
  @Description("Type Name")
  private String __typename = "User";

  /**
   * Relationship Object between 用户 and 联系方式
   */
  @Description("Relationship Object between 用户 and 联系方式")
  private Collection<UserPhoneNumbersRelationInput> userPhoneNumbersRelation;

  /**
   * Input
   */
  @Description("Input")
  private UserInput input;

  /**
   * Where
   */
  @Description("Where")
  private UserExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = (String)name;
  }

  @Override
  public String getEmail() {
    return this.email;
  }

  @Override
  public void setEmail(String email) {
    this.email = (String)email;
  }

  @Override
  public Collection<String> getPhoneNumbers() {
    return this.phoneNumbers;
  }

  @Override
  public void setPhoneNumbers(Collection<String> phoneNumbers) {
    this.phoneNumbers = (Collection<String>)phoneNumbers;
  }

  @Override
  public UserType getUserType() {
    return this.userType;
  }

  @Override
  public void setUserType(UserType userType) {
    this.userType = (UserType)userType;
  }

  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = (Boolean)isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = (Integer)version;
  }

  @Override
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
    this.realmId = (Integer)realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = (String)createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = (LocalDateTime)createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = (String)updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = (LocalDateTime)updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = (String)createGroupId;
  }

  @Override
  public String get__typename() {
    return this.__typename;
  }

  @Override
  public void set__typename(String __typename) {
    this.__typename = (String)__typename;
  }

  @Override
  public Collection<UserPhoneNumbersRelationInput> getUserPhoneNumbersRelation() {
    return this.userPhoneNumbersRelation;
  }

  @Override
  public void setUserPhoneNumbersRelation(
      Collection<UserPhoneNumbersRelationInput> userPhoneNumbersRelation) {
    this.userPhoneNumbersRelation = (Collection<UserPhoneNumbersRelationInput>)userPhoneNumbersRelation;
  }

  public UserInput getInput() {
    return this.input;
  }

  public void setInput(UserInput input) {
    this.input = input;
  }

  @Override
  public UserExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(UserExpression where) {
    this.where = (UserExpression)where;
  }
}
