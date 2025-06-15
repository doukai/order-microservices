package demo.gp.order.dto.inputObjectType;

import demo.gp.review.dto.inputObjectType.ReviewInput;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Input for 产品
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for 产品")
public interface ProductInputBase extends MetaInput {
  /**
   * 产品ID
   */
  @Description("产品ID")
  String id = null;

  /**
   * 产品名称
   */
  @Description("产品名称")
  String name = null;

  /**
   * 定价
   */
  @Description("定价")
  Float price = null;

  /**
   * 评论列表
   */
  @Description("评论列表")
  Collection<ReviewInput> reviews = null;

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
  String __typename = "Product";

  /**
   * Relationship Object between 产品 and 评论
   */
  @Description("Relationship Object between 产品 and 评论")
  Collection<ProductReviewRelationInput> productReviewRelation = null;

  /**
   * Where
   */
  @Description("Where")
  ProductExpression where = null;

  default String getId() {
    return id;
  }

  void setId(String id);

  default String getName() {
    return name;
  }

  void setName(String name);

  default Float getPrice() {
    return price;
  }

  void setPrice(Float price);

  default Collection<ReviewInput> getReviews() {
    return reviews;
  }

  void setReviews(Collection<ReviewInput> reviews);

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

  default Collection<ProductReviewRelationInput> getProductReviewRelation() {
    return productReviewRelation;
  }

  void setProductReviewRelation(Collection<ProductReviewRelationInput> productReviewRelation);

  default ProductExpression getWhere() {
    return where;
  }

  void setWhere(ProductExpression where);
}
