package demo.gp.order.dto.inputObjectType;

import demo.gp.review.dto.inputObjectType.ReviewInput;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Input for Relationship Object between 产品 and 评论
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for Relationship Object between 产品 and 评论")
public interface ProductReviewRelationInputBase extends MetaInput {
  /**
   * ID
   */
  @Description("ID")
  String id = null;

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
   * 评论 Reference
   */
  @Description("评论 Reference")
  Integer reviewRef = null;

  /**
   * 评论
   */
  @Description("评论")
  ReviewInput review = null;

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
  String __typename = "ProductReviewRelation";

  /**
   * Where
   */
  @Description("Where")
  ProductReviewRelationExpression where = null;

  default String getId() {
    return id;
  }

  void setId(String id);

  default String getProductRef() {
    return productRef;
  }

  void setProductRef(String productRef);

  default ProductInput getProduct() {
    return product;
  }

  void setProduct(ProductInput product);

  default Integer getReviewRef() {
    return reviewRef;
  }

  void setReviewRef(Integer reviewRef);

  default ReviewInput getReview() {
    return review;
  }

  void setReview(ReviewInput review);

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

  default ProductReviewRelationExpression getWhere() {
    return where;
  }

  void setWhere(ProductReviewRelationExpression where);
}
