package demo.gp.order.dto.inputObjectType;

import demo.gp.user.dto.inputObjectType.UserInput;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Input for 订单
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for 订单")
public interface OrderInputBase extends MetaInput {
  /**
   * 订单ID
   */
  @Description("订单ID")
  String id = null;

  /**
   * 购买用户
   */
  @Description("购买用户")
  UserInput user = null;

  /**
   * 产品列表
   */
  @Description("产品列表")
  Collection<OrderItemInput> items = null;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  Boolean isDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  Integer version = null;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  Integer realmId = null;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  String createUserId = null;

  /**
   * Create Time
   */
  @Description("Create Time")
  LocalDateTime createTime = null;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  String updateUserId = null;

  /**
   * Update Time
   */
  @Description("Update Time")
  LocalDateTime updateTime = null;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  String createGroupId = null;

  /**
   * Type Name
   */
  @Description("Type Name")
  String __typename = "Order";

  /**
   * Relationship Object between 订单 and 用户
   */
  @Description("Relationship Object between 订单 and 用户")
  Collection<OrderUserRelationInput> orderUserRelation = null;

  /**
   * Relationship Object between 订单 and 订单项
   */
  @Description("Relationship Object between 订单 and 订单项")
  Collection<OrderOrderItemRelationInput> orderOrderItemRelation = null;

  /**
   * Where
   */
  @Description("Where")
  OrderExpression where = null;

  default String getId() {
    return id;
  }

  void setId(String id);

  default UserInput getUser() {
    return user;
  }

  void setUser(UserInput user);

  default Collection<OrderItemInput> getItems() {
    return items;
  }

  void setItems(Collection<OrderItemInput> items);

  default Boolean getIsDeprecated() {
    return isDeprecated;
  }

  void setIsDeprecated(Boolean isDeprecated);

  default Integer getVersion() {
    return version;
  }

  void setVersion(Integer version);

  default Integer getRealmId() {
    return realmId;
  }

  void setRealmId(Integer realmId);

  default String getCreateUserId() {
    return createUserId;
  }

  void setCreateUserId(String createUserId);

  default LocalDateTime getCreateTime() {
    return createTime;
  }

  void setCreateTime(LocalDateTime createTime);

  default String getUpdateUserId() {
    return updateUserId;
  }

  void setUpdateUserId(String updateUserId);

  default LocalDateTime getUpdateTime() {
    return updateTime;
  }

  void setUpdateTime(LocalDateTime updateTime);

  default String getCreateGroupId() {
    return createGroupId;
  }

  void setCreateGroupId(String createGroupId);

  default String get__typename() {
    return __typename;
  }

  void set__typename(String __typename);

  default Collection<OrderUserRelationInput> getOrderUserRelation() {
    return orderUserRelation;
  }

  void setOrderUserRelation(Collection<OrderUserRelationInput> orderUserRelation);

  default Collection<OrderOrderItemRelationInput> getOrderOrderItemRelation() {
    return orderOrderItemRelation;
  }

  void setOrderOrderItemRelation(Collection<OrderOrderItemRelationInput> orderOrderItemRelation);

  default OrderExpression getWhere() {
    return where;
  }

  void setWhere(OrderExpression where);
}
