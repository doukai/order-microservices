package demo.gp.order.dto.inputObjectType;

import demo.gp.user.dto.inputObjectType.UserInput;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Input for Relationship Object between 订单 and 用户
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for Relationship Object between 订单 and 用户")
public interface OrderUserRelationInputBase extends MetaInput {
  /**
   * ID
   */
  @Description("ID")
  String id = null;

  /**
   * 订单 Reference
   */
  @Description("订单 Reference")
  String orderRef = null;

  /**
   * 订单
   */
  @Description("订单")
  OrderInput order = null;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  Integer userRef = null;

  /**
   * 用户
   */
  @Description("用户")
  UserInput user = null;

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
  String __typename = "OrderUserRelation";

  /**
   * Where
   */
  @Description("Where")
  OrderUserRelationExpression where = null;

  default String getId() {
    return id;
  }

  void setId(String id);

  default String getOrderRef() {
    return orderRef;
  }

  void setOrderRef(String orderRef);

  default OrderInput getOrder() {
    return order;
  }

  void setOrder(OrderInput order);

  default Integer getUserRef() {
    return userRef;
  }

  void setUserRef(Integer userRef);

  default UserInput getUser() {
    return user;
  }

  void setUser(UserInput user);

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

  default OrderUserRelationExpression getWhere() {
    return where;
  }

  void setWhere(OrderUserRelationExpression where);
}
