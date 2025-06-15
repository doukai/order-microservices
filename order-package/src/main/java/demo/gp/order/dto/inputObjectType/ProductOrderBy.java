package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.review.dto.inputObjectType.ReviewOrderBy;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 产品
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for 产品")
public class ProductOrderBy {
  /**
   * 产品ID
   */
  @Description("产品ID")
  private Sort id;

  /**
   * 产品名称
   */
  @Description("产品名称")
  private Sort name;

  /**
   * 定价
   */
  @Description("定价")
  private Sort price;

  /**
   * 评论列表
   */
  @Description("评论列表")
  private ReviewOrderBy reviews;

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
   * Relationship Object between 产品 and 评论
   */
  @Description("Relationship Object between 产品 and 评论")
  private ProductReviewRelationOrderBy productReviewRelation;

  /**
   * Count of 产品
   */
  @Description("Count of 产品")
  private Sort idCount;

  /**
   * Max of 产品ID
   */
  @Description("Max of 产品ID")
  private Sort idMax;

  /**
   * Min of 产品ID
   */
  @Description("Min of 产品ID")
  private Sort idMin;

  /**
   * Count of 产品名称
   */
  @Description("Count of 产品名称")
  private Sort nameCount;

  /**
   * Max of 产品名称
   */
  @Description("Max of 产品名称")
  private Sort nameMax;

  /**
   * Min of 产品名称
   */
  @Description("Min of 产品名称")
  private Sort nameMin;

  /**
   * Count of 定价
   */
  @Description("Count of 定价")
  private Sort priceCount;

  /**
   * Sum of 定价
   */
  @Description("Sum of 定价")
  private Sort priceSum;

  /**
   * Avg of 定价
   */
  @Description("Avg of 定价")
  private Sort priceAvg;

  /**
   * Max of 定价
   */
  @Description("Max of 定价")
  private Sort priceMax;

  /**
   * Min of 定价
   */
  @Description("Min of 定价")
  private Sort priceMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getName() {
    return this.name;
  }

  public void setName(Sort name) {
    this.name = name;
  }

  public Sort getPrice() {
    return this.price;
  }

  public void setPrice(Sort price) {
    this.price = price;
  }

  public ReviewOrderBy getReviews() {
    return this.reviews;
  }

  public void setReviews(ReviewOrderBy reviews) {
    this.reviews = reviews;
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

  public ProductReviewRelationOrderBy getProductReviewRelation() {
    return this.productReviewRelation;
  }

  public void setProductReviewRelation(ProductReviewRelationOrderBy productReviewRelation) {
    this.productReviewRelation = productReviewRelation;
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

  public Sort getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Sort nameCount) {
    this.nameCount = nameCount;
  }

  public Sort getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(Sort nameMax) {
    this.nameMax = nameMax;
  }

  public Sort getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(Sort nameMin) {
    this.nameMin = nameMin;
  }

  public Sort getPriceCount() {
    return this.priceCount;
  }

  public void setPriceCount(Sort priceCount) {
    this.priceCount = priceCount;
  }

  public Sort getPriceSum() {
    return this.priceSum;
  }

  public void setPriceSum(Sort priceSum) {
    this.priceSum = priceSum;
  }

  public Sort getPriceAvg() {
    return this.priceAvg;
  }

  public void setPriceAvg(Sort priceAvg) {
    this.priceAvg = priceAvg;
  }

  public Sort getPriceMax() {
    return this.priceMax;
  }

  public void setPriceMax(Sort priceMax) {
    this.priceMax = priceMax;
  }

  public Sort getPriceMin() {
    return this.priceMin;
  }

  public void setPriceMin(Sort priceMin) {
    this.priceMin = priceMin;
  }
}
