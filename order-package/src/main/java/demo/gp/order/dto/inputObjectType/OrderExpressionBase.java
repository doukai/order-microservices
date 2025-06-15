package demo.gp.order.dto.inputObjectType;

import demo.gp.user.dto.inputObjectType.UserExpression;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Query Expression Input for 订单
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Query Expression Input for 订单")
public interface OrderExpressionBase extends MetaExpression {
  /**
   * 订单ID
   */
  @Description("订单ID")
  StringExpression id = null;

  /**
   * 购买用户
   */
  @Description("购买用户")
  UserExpression user = null;

  /**
   * 产品列表
   */
  @Description("产品列表")
  OrderItemExpression items = null;

  /**
   * Include Deprecated
   */
  @Description("Include Deprecated")
  Boolean includeDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  IntExpression version = null;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  IntExpression realmId = null;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  StringExpression createUserId = null;

  /**
   * Create Time
   */
  @Description("Create Time")
  StringExpression createTime = null;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  StringExpression updateUserId = null;

  /**
   * Update Time
   */
  @Description("Update Time")
  StringExpression updateTime = null;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  StringExpression createGroupId = null;

  /**
   * Type Name
   */
  @Description("Type Name")
  StringExpression __typename = null;

  /**
   * Relationship Object between 订单 and 用户
   */
  @Description("Relationship Object between 订单 and 用户")
  OrderUserRelationExpression orderUserRelation = null;

  /**
   * Relationship Object between 订单 and 订单项
   */
  @Description("Relationship Object between 订单 and 订单项")
  OrderOrderItemRelationExpression orderOrderItemRelation = null;

  /**
   * Not
   */
  @Description("Not")
  Boolean not = false;

  /**
   * Condition
   */
  @Description("Condition")
  Conditional cond = Conditional.AND;

  /**
   * Expressions
   */
  @Description("Expressions")
  Collection<OrderExpression> exs = null;

  default StringExpression getId() {
    return id;
  }

  void setId(StringExpression id);

  default UserExpression getUser() {
    return user;
  }

  void setUser(UserExpression user);

  default OrderItemExpression getItems() {
    return items;
  }

  void setItems(OrderItemExpression items);

  default Boolean getIncludeDeprecated() {
    return includeDeprecated;
  }

  void setIncludeDeprecated(Boolean includeDeprecated);

  default IntExpression getVersion() {
    return version;
  }

  void setVersion(IntExpression version);

  default IntExpression getRealmId() {
    return realmId;
  }

  void setRealmId(IntExpression realmId);

  default StringExpression getCreateUserId() {
    return createUserId;
  }

  void setCreateUserId(StringExpression createUserId);

  default StringExpression getCreateTime() {
    return createTime;
  }

  void setCreateTime(StringExpression createTime);

  default StringExpression getUpdateUserId() {
    return updateUserId;
  }

  void setUpdateUserId(StringExpression updateUserId);

  default StringExpression getUpdateTime() {
    return updateTime;
  }

  void setUpdateTime(StringExpression updateTime);

  default StringExpression getCreateGroupId() {
    return createGroupId;
  }

  void setCreateGroupId(StringExpression createGroupId);

  default StringExpression get__typename() {
    return __typename;
  }

  void set__typename(StringExpression __typename);

  default OrderUserRelationExpression getOrderUserRelation() {
    return orderUserRelation;
  }

  void setOrderUserRelation(OrderUserRelationExpression orderUserRelation);

  default OrderOrderItemRelationExpression getOrderOrderItemRelation() {
    return orderOrderItemRelation;
  }

  void setOrderOrderItemRelation(OrderOrderItemRelationExpression orderOrderItemRelation);

  default Boolean getNot() {
    return not;
  }

  void setNot(Boolean not);

  default Conditional getCond() {
    return cond;
  }

  void setCond(Conditional cond);

  default Collection<OrderExpression> getExs() {
    return exs;
  }

  void setExs(Collection<OrderExpression> exs);
}
