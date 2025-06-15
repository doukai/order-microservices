package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
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
 * Mutation Arguments for 订单项 List
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Arguments for 订单项 List")
public class OrderItemListMutationArguments implements MetaInput, OrderItemInputBase {
  /**
   * 订单项ID
   */
  @Description("订单项ID")
  private String id;

  /**
   * 产品
   */
  @Description("产品")
  private ProductInput product;

  /**
   * 购买数量
   */
  @Description("购买数量")
  private Integer quantity;

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
  @DefaultValue("OrderItem")
  @Description("Type Name")
  private String __typename = "OrderItem";

  /**
   * Relationship Object between 订单项 and 产品
   */
  @Description("Relationship Object between 订单项 and 产品")
  private Collection<OrderItemProductRelationInput> orderItemProductRelation;

  /**
   * Input List
   */
  @Description("Input List")
  private Collection<OrderItemInput> list;

  /**
   * Where
   */
  @Description("Where")
  private OrderItemExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public ProductInput getProduct() {
    return this.product;
  }

  @Override
  public void setProduct(ProductInput product) {
    this.product = (ProductInput)product;
  }

  @Override
  public Integer getQuantity() {
    return this.quantity;
  }

  @Override
  public void setQuantity(Integer quantity) {
    this.quantity = (Integer)quantity;
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
  public Collection<OrderItemProductRelationInput> getOrderItemProductRelation() {
    return this.orderItemProductRelation;
  }

  @Override
  public void setOrderItemProductRelation(
      Collection<OrderItemProductRelationInput> orderItemProductRelation) {
    this.orderItemProductRelation = (Collection<OrderItemProductRelationInput>)orderItemProductRelation;
  }

  public Collection<OrderItemInput> getList() {
    return this.list;
  }

  public void setList(Collection<OrderItemInput> list) {
    this.list = list;
  }

  @Override
  public OrderItemExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(OrderItemExpression where) {
    this.where = (OrderItemExpression)where;
  }
}
