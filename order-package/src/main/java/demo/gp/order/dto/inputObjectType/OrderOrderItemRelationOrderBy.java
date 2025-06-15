package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for Relationship Object between 订单 and 订单项
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for Relationship Object between 订单 and 订单项")
public class OrderOrderItemRelationOrderBy {
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
   * 订单项 Reference
   */
  @Description("订单项 Reference")
  private Sort orderItemRef;

  /**
   * 订单项
   */
  @Description("订单项")
  private OrderItemOrderBy orderItem;

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
   * Count of Relationship Object between 订单 and 订单项
   */
  @Description("Count of Relationship Object between 订单 and 订单项")
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
   * Count of 订单项 Reference
   */
  @Description("Count of 订单项 Reference")
  private Sort orderItemRefCount;

  /**
   * Max of 订单项 Reference
   */
  @Description("Max of 订单项 Reference")
  private Sort orderItemRefMax;

  /**
   * Min of 订单项 Reference
   */
  @Description("Min of 订单项 Reference")
  private Sort orderItemRefMin;

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

  public Sort getOrderItemRef() {
    return this.orderItemRef;
  }

  public void setOrderItemRef(Sort orderItemRef) {
    this.orderItemRef = orderItemRef;
  }

  public OrderItemOrderBy getOrderItem() {
    return this.orderItem;
  }

  public void setOrderItem(OrderItemOrderBy orderItem) {
    this.orderItem = orderItem;
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

  public Sort getOrderItemRefCount() {
    return this.orderItemRefCount;
  }

  public void setOrderItemRefCount(Sort orderItemRefCount) {
    this.orderItemRefCount = orderItemRefCount;
  }

  public Sort getOrderItemRefMax() {
    return this.orderItemRefMax;
  }

  public void setOrderItemRefMax(Sort orderItemRefMax) {
    this.orderItemRefMax = orderItemRefMax;
  }

  public Sort getOrderItemRefMin() {
    return this.orderItemRefMin;
  }

  public void setOrderItemRefMin(Sort orderItemRefMin) {
    this.orderItemRefMin = orderItemRefMin;
  }
}
