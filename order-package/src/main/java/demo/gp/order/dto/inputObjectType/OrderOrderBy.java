package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.inputObjectType.UserOrderBy;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 订单
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for 订单")
public class OrderOrderBy {
  /**
   * 订单ID
   */
  @Description("订单ID")
  private Sort id;

  /**
   * 购买用户
   */
  @Description("购买用户")
  private UserOrderBy user;

  /**
   * 产品列表
   */
  @Description("产品列表")
  private OrderItemOrderBy items;

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
   * Relationship Object between 订单 and 用户
   */
  @Description("Relationship Object between 订单 and 用户")
  private OrderUserRelationOrderBy orderUserRelation;

  /**
   * Relationship Object between 订单 and 订单项
   */
  @Description("Relationship Object between 订单 and 订单项")
  private OrderOrderItemRelationOrderBy orderOrderItemRelation;

  /**
   * Aggregate Field for 产品列表
   */
  @Description("Aggregate Field for 产品列表")
  private OrderItemOrderBy itemsAggregate;

  /**
   * Aggregate Field for Relationship Object between 订单 and 订单项
   */
  @Description("Aggregate Field for Relationship Object between 订单 and 订单项")
  private OrderOrderItemRelationOrderBy orderOrderItemRelationAggregate;

  /**
   * Count of 订单
   */
  @Description("Count of 订单")
  private Sort idCount;

  /**
   * Max of 订单ID
   */
  @Description("Max of 订单ID")
  private Sort idMax;

  /**
   * Min of 订单ID
   */
  @Description("Min of 订单ID")
  private Sort idMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public UserOrderBy getUser() {
    return this.user;
  }

  public void setUser(UserOrderBy user) {
    this.user = user;
  }

  public OrderItemOrderBy getItems() {
    return this.items;
  }

  public void setItems(OrderItemOrderBy items) {
    this.items = items;
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

  public OrderUserRelationOrderBy getOrderUserRelation() {
    return this.orderUserRelation;
  }

  public void setOrderUserRelation(OrderUserRelationOrderBy orderUserRelation) {
    this.orderUserRelation = orderUserRelation;
  }

  public OrderOrderItemRelationOrderBy getOrderOrderItemRelation() {
    return this.orderOrderItemRelation;
  }

  public void setOrderOrderItemRelation(OrderOrderItemRelationOrderBy orderOrderItemRelation) {
    this.orderOrderItemRelation = orderOrderItemRelation;
  }

  public OrderItemOrderBy getItemsAggregate() {
    return this.itemsAggregate;
  }

  public void setItemsAggregate(OrderItemOrderBy itemsAggregate) {
    this.itemsAggregate = itemsAggregate;
  }

  public OrderOrderItemRelationOrderBy getOrderOrderItemRelationAggregate() {
    return this.orderOrderItemRelationAggregate;
  }

  public void setOrderOrderItemRelationAggregate(
      OrderOrderItemRelationOrderBy orderOrderItemRelationAggregate) {
    this.orderOrderItemRelationAggregate = orderOrderItemRelationAggregate;
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
}
