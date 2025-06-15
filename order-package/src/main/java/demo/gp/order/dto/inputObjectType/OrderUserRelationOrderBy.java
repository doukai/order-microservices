package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.inputObjectType.UserOrderBy;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for Relationship Object between 订单 and 用户
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for Relationship Object between 订单 and 用户")
public class OrderUserRelationOrderBy {
  /**
   * ID
   */
  @Description("ID")
  private Sort id;

  /**
   * 订单 Reference
   */
  @Description("订单 Reference")
  private Sort orderRef;

  /**
   * 订单
   */
  @Description("订单")
  private OrderOrderBy order;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  private Sort userRef;

  /**
   * 用户
   */
  @Description("用户")
  private UserOrderBy user;

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
   * Count of Relationship Object between 订单 and 用户
   */
  @Description("Count of Relationship Object between 订单 and 用户")
  private Sort idCount;

  /**
   * Max of ID
   */
  @Description("Max of ID")
  private Sort idMax;

  /**
   * Min of ID
   */
  @Description("Min of ID")
  private Sort idMin;

  /**
   * Count of 订单 Reference
   */
  @Description("Count of 订单 Reference")
  private Sort orderRefCount;

  /**
   * Max of 订单 Reference
   */
  @Description("Max of 订单 Reference")
  private Sort orderRefMax;

  /**
   * Min of 订单 Reference
   */
  @Description("Min of 订单 Reference")
  private Sort orderRefMin;

  /**
   * Count of 用户 Reference
   */
  @Description("Count of 用户 Reference")
  private Sort userRefCount;

  /**
   * Sum of 用户 Reference
   */
  @Description("Sum of 用户 Reference")
  private Sort userRefSum;

  /**
   * Avg of 用户 Reference
   */
  @Description("Avg of 用户 Reference")
  private Sort userRefAvg;

  /**
   * Max of 用户 Reference
   */
  @Description("Max of 用户 Reference")
  private Sort userRefMax;

  /**
   * Min of 用户 Reference
   */
  @Description("Min of 用户 Reference")
  private Sort userRefMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getOrderRef() {
    return this.orderRef;
  }

  public void setOrderRef(Sort orderRef) {
    this.orderRef = orderRef;
  }

  public OrderOrderBy getOrder() {
    return this.order;
  }

  public void setOrder(OrderOrderBy order) {
    this.order = order;
  }

  public Sort getUserRef() {
    return this.userRef;
  }

  public void setUserRef(Sort userRef) {
    this.userRef = userRef;
  }

  public UserOrderBy getUser() {
    return this.user;
  }

  public void setUser(UserOrderBy user) {
    this.user = user;
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

  public Sort getOrderRefCount() {
    return this.orderRefCount;
  }

  public void setOrderRefCount(Sort orderRefCount) {
    this.orderRefCount = orderRefCount;
  }

  public Sort getOrderRefMax() {
    return this.orderRefMax;
  }

  public void setOrderRefMax(Sort orderRefMax) {
    this.orderRefMax = orderRefMax;
  }

  public Sort getOrderRefMin() {
    return this.orderRefMin;
  }

  public void setOrderRefMin(Sort orderRefMin) {
    this.orderRefMin = orderRefMin;
  }

  public Sort getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Sort userRefCount) {
    this.userRefCount = userRefCount;
  }

  public Sort getUserRefSum() {
    return this.userRefSum;
  }

  public void setUserRefSum(Sort userRefSum) {
    this.userRefSum = userRefSum;
  }

  public Sort getUserRefAvg() {
    return this.userRefAvg;
  }

  public void setUserRefAvg(Sort userRefAvg) {
    this.userRefAvg = userRefAvg;
  }

  public Sort getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(Sort userRefMax) {
    this.userRefMax = userRefMax;
  }

  public Sort getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(Sort userRefMin) {
    this.userRefMin = userRefMin;
  }
}
