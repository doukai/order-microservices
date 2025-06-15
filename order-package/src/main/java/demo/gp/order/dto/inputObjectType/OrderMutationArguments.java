package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.inputObjectType.UserInput;
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
 * Mutation Arguments for 订单
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Arguments for 订单")
public class OrderMutationArguments implements MetaInput, OrderInputBase {
  /**
   * 订单ID
   */
  @Description("订单ID")
  private String id;

  /**
   * 购买用户
   */
  @Description("购买用户")
  private UserInput user;

  /**
   * 产品列表
   */
  @Description("产品列表")
  private Collection<OrderItemInput> items;

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
  @DefaultValue("Order")
  @Description("Type Name")
  private String __typename = "Order";

  /**
   * Relationship Object between 订单 and 用户
   */
  @Description("Relationship Object between 订单 and 用户")
  private Collection<OrderUserRelationInput> orderUserRelation;

  /**
   * Relationship Object between 订单 and 订单项
   */
  @Description("Relationship Object between 订单 and 订单项")
  private Collection<OrderOrderItemRelationInput> orderOrderItemRelation;

  /**
   * Input
   */
  @Description("Input")
  private OrderInput input;

  /**
   * Where
   */
  @Description("Where")
  private OrderExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public UserInput getUser() {
    return this.user;
  }

  @Override
  public void setUser(UserInput user) {
    this.user = (UserInput)user;
  }

  @Override
  public Collection<OrderItemInput> getItems() {
    return this.items;
  }

  @Override
  public void setItems(Collection<OrderItemInput> items) {
    this.items = (Collection<OrderItemInput>)items;
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
  public Collection<OrderUserRelationInput> getOrderUserRelation() {
    return this.orderUserRelation;
  }

  @Override
  public void setOrderUserRelation(Collection<OrderUserRelationInput> orderUserRelation) {
    this.orderUserRelation = (Collection<OrderUserRelationInput>)orderUserRelation;
  }

  @Override
  public Collection<OrderOrderItemRelationInput> getOrderOrderItemRelation() {
    return this.orderOrderItemRelation;
  }

  @Override
  public void setOrderOrderItemRelation(
      Collection<OrderOrderItemRelationInput> orderOrderItemRelation) {
    this.orderOrderItemRelation = (Collection<OrderOrderItemRelationInput>)orderOrderItemRelation;
  }

  public OrderInput getInput() {
    return this.input;
  }

  public void setInput(OrderInput input) {
    this.input = input;
  }

  @Override
  public OrderExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(OrderExpression where) {
    this.where = (OrderExpression)where;
  }
}
