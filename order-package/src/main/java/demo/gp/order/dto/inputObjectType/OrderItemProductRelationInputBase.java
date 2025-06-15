package demo.gp.order.dto.inputObjectType;

import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Input for Relationship Object between 订单项 and 产品
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for Relationship Object between 订单项 and 产品")
public interface OrderItemProductRelationInputBase extends MetaInput {
  /**
   * ID
   */
  @Description("ID")
  String id = null;

  /**
   * 订单项 Reference
   */
  @Description("订单项 Reference")
  String orderItemRef = null;

  /**
   * 订单项
   */
  @Description("订单项")
  OrderItemInput orderItem = null;

  /**
   * 产品 Reference
   */
  @Description("产品 Reference")
  String productRef = null;

  /**
   * 产品
   */
  @Description("产品")
  ProductInput product = null;

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
  String __typename = "OrderItemProductRelation";

  /**
   * Where
   */
  @Description("Where")
  OrderItemProductRelationExpression where = null;

  default String getId() {
    return id;
  }

  void setId(String id);

  default String getOrderItemRef() {
    return orderItemRef;
  }

  void setOrderItemRef(String orderItemRef);

  default OrderItemInput getOrderItem() {
    return orderItem;
  }

  void setOrderItem(OrderItemInput orderItem);

  default String getProductRef() {
    return productRef;
  }

  void setProductRef(String productRef);

  default ProductInput getProduct() {
    return product;
  }

  void setProduct(ProductInput product);

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

  default OrderItemProductRelationExpression getWhere() {
    return where;
  }

  void setWhere(OrderItemProductRelationExpression where);
}
