package demo.gp.user.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.enumType.UserType;
import demo.gp.user.dto.inputObjectType.UserInput;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.stream.Collectors;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

/**
 * 用户
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户")
public class User implements Meta {
  /**
   * 用户ID
   */
  @Id
  @Description("用户ID")
  private String id;

  /**
   * 用户名
   */
  @NonNull
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
  @NonNull
  @Description("用户类型")
  private UserType userType;

  /**
   * Is Deprecated
   */
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
  @Description("Type Name")
  private String __typename = "User";

  /**
   * Relationship Object between 用户 and 联系方式
   */
  @Description("Relationship Object between 用户 and 联系方式")
  private Collection<UserPhoneNumbersRelation> userPhoneNumbersRelation;

  /**
   * Aggregate Field for Relationship Object between 用户 and 联系方式
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 联系方式")
  private UserPhoneNumbersRelation userPhoneNumbersRelationAggregate;

  /**
   * Connection Field for Relationship Object between 用户 and 联系方式
   */
  @Description("Connection Field for Relationship Object between 用户 and 联系方式")
  private UserPhoneNumbersRelationConnection userPhoneNumbersRelationConnection;

  /**
   * Count of 用户
   */
  @Description("Count of 用户")
  private Integer idCount;

  /**
   * Max of 用户ID
   */
  @Description("Max of 用户ID")
  private Integer idMax;

  /**
   * Min of 用户ID
   */
  @Description("Min of 用户ID")
  private Integer idMin;

  /**
   * Count of 用户名
   */
  @Description("Count of 用户名")
  private Integer nameCount;

  /**
   * Max of 用户名
   */
  @Description("Max of 用户名")
  private String nameMax;

  /**
   * Min of 用户名
   */
  @Description("Min of 用户名")
  private String nameMin;

  /**
   * Count of 电子邮箱
   */
  @Description("Count of 电子邮箱")
  private Integer emailCount;

  /**
   * Max of 电子邮箱
   */
  @Description("Max of 电子邮箱")
  private String emailMax;

  /**
   * Min of 电子邮箱
   */
  @Description("Min of 电子邮箱")
  private String emailMin;

  /**
   * Count of 用户类型
   */
  @Description("Count of 用户类型")
  private Integer userTypeCount;

  /**
   * Max of 用户类型
   */
  @Description("Max of 用户类型")
  private UserType userTypeMax;

  /**
   * Min of 用户类型
   */
  @Description("Min of 用户类型")
  private UserType userTypeMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Collection<String> getPhoneNumbers() {
    return this.phoneNumbers;
  }

  public void setPhoneNumbers(Collection<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public UserType getUserType() {
    return this.userType;
  }

  public void setUserType(UserType userType) {
    this.userType = userType;
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

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Collection<UserPhoneNumbersRelation> getUserPhoneNumbersRelation() {
    return this.userPhoneNumbersRelation;
  }

  public void setUserPhoneNumbersRelation(
      Collection<UserPhoneNumbersRelation> userPhoneNumbersRelation) {
    this.userPhoneNumbersRelation = userPhoneNumbersRelation;
  }

  public UserPhoneNumbersRelation getUserPhoneNumbersRelationAggregate() {
    return this.userPhoneNumbersRelationAggregate;
  }

  public void setUserPhoneNumbersRelationAggregate(
      UserPhoneNumbersRelation userPhoneNumbersRelationAggregate) {
    this.userPhoneNumbersRelationAggregate = userPhoneNumbersRelationAggregate;
  }

  public UserPhoneNumbersRelationConnection getUserPhoneNumbersRelationConnection() {
    return this.userPhoneNumbersRelationConnection;
  }

  public void setUserPhoneNumbersRelationConnection(
      UserPhoneNumbersRelationConnection userPhoneNumbersRelationConnection) {
    this.userPhoneNumbersRelationConnection = userPhoneNumbersRelationConnection;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public Integer getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Integer idMax) {
    this.idMax = idMax;
  }

  public Integer getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Integer idMin) {
    this.idMin = idMin;
  }

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public String getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(String nameMax) {
    this.nameMax = nameMax;
  }

  public String getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(String nameMin) {
    this.nameMin = nameMin;
  }

  public Integer getEmailCount() {
    return this.emailCount;
  }

  public void setEmailCount(Integer emailCount) {
    this.emailCount = emailCount;
  }

  public String getEmailMax() {
    return this.emailMax;
  }

  public void setEmailMax(String emailMax) {
    this.emailMax = emailMax;
  }

  public String getEmailMin() {
    return this.emailMin;
  }

  public void setEmailMin(String emailMin) {
    this.emailMin = emailMin;
  }

  public Integer getUserTypeCount() {
    return this.userTypeCount;
  }

  public void setUserTypeCount(Integer userTypeCount) {
    this.userTypeCount = userTypeCount;
  }

  public UserType getUserTypeMax() {
    return this.userTypeMax;
  }

  public void setUserTypeMax(UserType userTypeMax) {
    this.userTypeMax = userTypeMax;
  }

  public UserType getUserTypeMin() {
    return this.userTypeMin;
  }

  public void setUserTypeMin(UserType userTypeMin) {
    this.userTypeMin = userTypeMin;
  }

  public UserInput toInput() {
    UserInput input = new UserInput();
    input.setId(this.getId());
    input.setName(this.getName());
    input.setEmail(this.getEmail());
    input.setPhoneNumbers(this.getPhoneNumbers());
    input.setUserType(this.getUserType());
    input.setIsDeprecated(this.getIsDeprecated());
    input.setVersion(this.getVersion());
    input.setRealmId(this.getRealmId());
    input.setCreateUserId(this.getCreateUserId());
    input.setCreateTime(this.getCreateTime());
    input.setUpdateUserId(this.getUpdateUserId());
    input.setUpdateTime(this.getUpdateTime());
    input.setCreateGroupId(this.getCreateGroupId());
    input.set__typename(this.get__typename());
    if(getUserPhoneNumbersRelation() != null) {
      input.setUserPhoneNumbersRelation(this.getUserPhoneNumbersRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    return input;
  }
}
