package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.order.dto.inputObjectType.OrderOrderItemRelationInput;
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
 * Relationship Object between 订单 and 订单项
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Relationship Object between 订单 and 订单项")
public class OrderOrderItemRelation implements Meta {
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
   * 订单项 Reference
   */
  @Description("订单项 Reference")
  private String orderItemRef;

  /**
   * 订单项
   */
  @Description("订单项")
  private OrderItem orderItem;

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
  private String __typename = "OrderOrderItemRelation";

  /**
   * Count of Relationship Object between 订单 and 订单项
   */
  @Description("Count of Relationship Object between 订单 and 订单项")
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
   * Count of 订单项 Reference
   */
  @Description("Count of 订单项 Reference")
  private Integer orderItemRefCount;

  /**
   * Max of 订单项 Reference
   */
  @Description("Max of 订单项 Reference")
  private String orderItemRefMax;

  /**
   * Min of 订单项 Reference
   */
  @Description("Min of 订单项 Reference")
  private String orderItemRefMin;

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

  public String getOrderItemRef() {
    return this.orderItemRef;
  }

  public void setOrderItemRef(String orderItemRef) {
    this.orderItemRef = orderItemRef;
  }

  public OrderItem getOrderItem() {
    return this.orderItem;
  }

  public void setOrderItem(OrderItem orderItem) {
    this.orderItem = orderItem;
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

  public Integer getOrderItemRefCount() {
    return this.orderItemRefCount;
  }

  public void setOrderItemRefCount(Integer orderItemRefCount) {
    this.orderItemRefCount = orderItemRefCount;
  }

  public String getOrderItemRefMax() {
    return this.orderItemRefMax;
  }

  public void setOrderItemRefMax(String orderItemRefMax) {
    this.orderItemRefMax = orderItemRefMax;
  }

  public String getOrderItemRefMin() {
    return this.orderItemRefMin;
  }

  public void setOrderItemRefMin(String orderItemRefMin) {
    this.orderItemRefMin = orderItemRefMin;
  }

  public OrderOrderItemRelationInput toInput() {
    OrderOrderItemRelationInput input = new OrderOrderItemRelationInput();
    input.setId(this.getId());
    input.setOrderRef(this.getOrderRef());
    if(getOrder() != null) {
      input.setOrder(this.getOrder().toInput());
    }
    input.setOrderItemRef(this.getOrderItemRef());
    if(getOrderItem() != null) {
      input.setOrderItem(this.getOrderItem().toInput());
    }
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
