package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.order.dto.inputObjectType.OrderUserRelationInput;
import demo.gp.user.dto.objectType.User;
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
 * Relationship Object between 订单 and 用户
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Relationship Object between 订单 and 用户")
public class OrderUserRelation implements Meta {
  /**
   * ID
   */
  @Id
  @Description("ID")
  private String id;

  /**
   * 订单 Reference
   */
  @Description("订单 Reference")
  private String orderRef;

  /**
   * 订单
   */
  @Description("订单")
  private Order order;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  private Integer userRef;

  /**
   * 用户
   */
  @Description("用户")
  private User user;

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
  private String __typename = "OrderUserRelation";

  /**
   * Count of Relationship Object between 订单 and 用户
   */
  @Description("Count of Relationship Object between 订单 and 用户")
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
   * Count of 订单 Reference
   */
  @Description("Count of 订单 Reference")
  private Integer orderRefCount;

  /**
   * Max of 订单 Reference
   */
  @Description("Max of 订单 Reference")
  private String orderRefMax;

  /**
   * Min of 订单 Reference
   */
  @Description("Min of 订单 Reference")
  private String orderRefMin;

  /**
   * Count of 用户 Reference
   */
  @Description("Count of 用户 Reference")
  private Integer userRefCount;

  /**
   * Sum of 用户 Reference
   */
  @Description("Sum of 用户 Reference")
  private Integer userRefSum;

  /**
   * Avg of 用户 Reference
   */
  @Description("Avg of 用户 Reference")
  private Integer userRefAvg;

  /**
   * Max of 用户 Reference
   */
  @Description("Max of 用户 Reference")
  private Integer userRefMax;

  /**
   * Min of 用户 Reference
   */
  @Description("Min of 用户 Reference")
  private Integer userRefMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOrderRef() {
    return this.orderRef;
  }

  public void setOrderRef(String orderRef) {
    this.orderRef = orderRef;
  }

  public Order getOrder() {
    return this.order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Integer getUserRef() {
    return this.userRef;
  }

  public void setUserRef(Integer userRef) {
    this.userRef = userRef;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
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

  public Integer getOrderRefCount() {
    return this.orderRefCount;
  }

  public void setOrderRefCount(Integer orderRefCount) {
    this.orderRefCount = orderRefCount;
  }

  public String getOrderRefMax() {
    return this.orderRefMax;
  }

  public void setOrderRefMax(String orderRefMax) {
    this.orderRefMax = orderRefMax;
  }

  public String getOrderRefMin() {
    return this.orderRefMin;
  }

  public void setOrderRefMin(String orderRefMin) {
    this.orderRefMin = orderRefMin;
  }

  public Integer getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Integer userRefCount) {
    this.userRefCount = userRefCount;
  }

  public Integer getUserRefSum() {
    return this.userRefSum;
  }

  public void setUserRefSum(Integer userRefSum) {
    this.userRefSum = userRefSum;
  }

  public Integer getUserRefAvg() {
    return this.userRefAvg;
  }

  public void setUserRefAvg(Integer userRefAvg) {
    this.userRefAvg = userRefAvg;
  }

  public Integer getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(Integer userRefMax) {
    this.userRefMax = userRefMax;
  }

  public Integer getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(Integer userRefMin) {
    this.userRefMin = userRefMin;
  }

  public OrderUserRelationInput toInput() {
    OrderUserRelationInput input = new OrderUserRelationInput();
    input.setId(this.getId());
    input.setOrderRef(this.getOrderRef());
    if(getOrder() != null) {
      input.setOrder(this.getOrder().toInput());
    }
    input.setUserRef(this.getUserRef());
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
