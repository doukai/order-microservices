package demo.gp.user.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.inputObjectType.UserPhoneNumbersRelationInput;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

/**
 * Relationship Object between 用户 and 联系方式
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Relationship Object between 用户 and 联系方式")
public class UserPhoneNumbersRelation implements Meta {
  /**
   * ID
   */
  @Id
  @Description("ID")
  private String id;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  private String userRef;

  /**
   * 用户
   */
  @Description("用户")
  private User user;

  /**
   * 联系方式 Reference
   */
  @Description("联系方式 Reference")
  private String phoneNumbersRef;

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
  private String __typename = "UserPhoneNumbersRelation";

  /**
   * Count of Relationship Object between 用户 and 联系方式
   */
  @Description("Count of Relationship Object between 用户 and 联系方式")
  private Integer idCount;

  /**
   * Max of ID
   */
  @Description("Max of ID")
  private Integer idMax;

  /**
   * Min of ID
   */
  @Description("Min of ID")
  private Integer idMin;

  /**
   * Count of 用户 Reference
   */
  @Description("Count of 用户 Reference")
  private Integer userRefCount;

  /**
   * Max of 用户 Reference
   */
  @Description("Max of 用户 Reference")
  private String userRefMax;

  /**
   * Min of 用户 Reference
   */
  @Description("Min of 用户 Reference")
  private String userRefMin;

  /**
   * Count of 联系方式 Reference
   */
  @Description("Count of 联系方式 Reference")
  private Integer phoneNumbersRefCount;

  /**
   * Max of 联系方式 Reference
   */
  @Description("Max of 联系方式 Reference")
  private String phoneNumbersRefMax;

  /**
   * Min of 联系方式 Reference
   */
  @Description("Min of 联系方式 Reference")
  private String phoneNumbersRefMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserRef() {
    return this.userRef;
  }

  public void setUserRef(String userRef) {
    this.userRef = userRef;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getPhoneNumbersRef() {
    return this.phoneNumbersRef;
  }

  public void setPhoneNumbersRef(String phoneNumbersRef) {
    this.phoneNumbersRef = phoneNumbersRef;
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

  public Integer getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Integer userRefCount) {
    this.userRefCount = userRefCount;
  }

  public String getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(String userRefMax) {
    this.userRefMax = userRefMax;
  }

  public String getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(String userRefMin) {
    this.userRefMin = userRefMin;
  }

  public Integer getPhoneNumbersRefCount() {
    return this.phoneNumbersRefCount;
  }

  public void setPhoneNumbersRefCount(Integer phoneNumbersRefCount) {
    this.phoneNumbersRefCount = phoneNumbersRefCount;
  }

  public String getPhoneNumbersRefMax() {
    return this.phoneNumbersRefMax;
  }

  public void setPhoneNumbersRefMax(String phoneNumbersRefMax) {
    this.phoneNumbersRefMax = phoneNumbersRefMax;
  }

  public String getPhoneNumbersRefMin() {
    return this.phoneNumbersRefMin;
  }

  public void setPhoneNumbersRefMin(String phoneNumbersRefMin) {
    this.phoneNumbersRefMin = phoneNumbersRefMin;
  }

  public UserPhoneNumbersRelationInput toInput() {
    UserPhoneNumbersRelationInput input = new UserPhoneNumbersRelationInput();
    input.setId(this.getId());
    input.setUserRef(this.getUserRef());
    if(getUser() != null) {
      input.setUser(this.getUser().toInput());
    }
    input.setPhoneNumbersRef(this.getPhoneNumbersRef());
    input.setIsDeprecated(this.getIsDeprecated());
    input.setVersion(this.getVersion());
    input.setRealmId(this.getRealmId());
    input.setCreateUserId(this.getCreateUserId());
    input.setCreateTime(this.getCreateTime());
    input.setUpdateUserId(this.getUpdateUserId());
    input.setUpdateTime(this.getUpdateTime());
    input.setCreateGroupId(this.getCreateGroupId());
    input.set__typename(this.get__typename());
    return input;
  }
}
