package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 订单项
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for 订单项")
public class OrderItemOrderBy {
  /**
   * 订单项ID
   */
  @Description("订单项ID")
  private Sort id;

  /**
   * 产品
   */
  @Description("产品")
  private ProductOrderBy product;

  /**
   * 购买数量
   */
  @Description("购买数量")
  private Sort quantity;

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
   * Relationship Object between 订单项 and 产品
   */
  @Description("Relationship Object between 订单项 and 产品")
  private OrderItemProductRelationOrderBy orderItemProductRelation;

  /**
   * Aggregate Field for Relationship Object between 订单项 and 产品
   */
  @Description("Aggregate Field for Relationship Object between 订单项 and 产品")
  private OrderItemProductRelationOrderBy orderItemProductRelationAggregate;

  /**
   * Count of 订单项
   */
  @Description("Count of 订单项")
  private Sort idCount;

  /**
   * Max of 订单项ID
   */
  @Description("Max of 订单项ID")
  private Sort idMax;

  /**
   * Min of 订单项ID
   */
  @Description("Min of 订单项ID")
  private Sort idMin;

  /**
   * Count of 购买数量
   */
  @Description("Count of 购买数量")
  private Sort quantityCount;

  /**
   * Sum of 购买数量
   */
  @Description("Sum of 购买数量")
  private Sort quantitySum;

  /**
   * Avg of 购买数量
   */
  @Description("Avg of 购买数量")
  private Sort quantityAvg;

  /**
   * Max of 购买数量
   */
  @Description("Max of 购买数量")
  private Sort quantityMax;

  /**
   * Min of 购买数量
   */
  @Description("Min of 购买数量")
  private Sort quantityMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public ProductOrderBy getProduct() {
    return this.product;
  }

  public void setProduct(ProductOrderBy product) {
    this.product = product;
  }

  public Sort getQuantity() {
    return this.quantity;
  }

  public void setQuantity(Sort quantity) {
    this.quantity = quantity;
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

  public OrderItemProductRelationOrderBy getOrderItemProductRelation() {
    return this.orderItemProductRelation;
  }

  public void setOrderItemProductRelation(
      OrderItemProductRelationOrderBy orderItemProductRelation) {
    this.orderItemProductRelation = orderItemProductRelation;
  }

  public OrderItemProductRelationOrderBy getOrderItemProductRelationAggregate() {
    return this.orderItemProductRelationAggregate;
  }

  public void setOrderItemProductRelationAggregate(
      OrderItemProductRelationOrderBy orderItemProductRelationAggregate) {
    this.orderItemProductRelationAggregate = orderItemProductRelationAggregate;
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

  public Sort getQuantityCount() {
    return this.quantityCount;
  }

  public void setQuantityCount(Sort quantityCount) {
    this.quantityCount = quantityCount;
  }

  public Sort getQuantitySum() {
    return this.quantitySum;
  }

  public void setQuantitySum(Sort quantitySum) {
    this.quantitySum = quantitySum;
  }

  public Sort getQuantityAvg() {
    return this.quantityAvg;
  }

  public void setQuantityAvg(Sort quantityAvg) {
    this.quantityAvg = quantityAvg;
  }

  public Sort getQuantityMax() {
    return this.quantityMax;
  }

  public void setQuantityMax(Sort quantityMax) {
    this.quantityMax = quantityMax;
  }

  public Sort getQuantityMin() {
    return this.quantityMin;
  }

  public void setQuantityMin(Sort quantityMin) {
    this.quantityMin = quantityMin;
  }
}
