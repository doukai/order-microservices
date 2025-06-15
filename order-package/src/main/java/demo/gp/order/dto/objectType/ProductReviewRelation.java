package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.order.dto.inputObjectType.ProductReviewRelationInput;
import demo.gp.review.dto.objectType.Review;
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
 * Relationship Object between 产品 and 评论
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Relationship Object between 产品 and 评论")
public class ProductReviewRelation implements Meta {
  /**
   * ID
   */
  @Id
  @Description("ID")
  private String id;

  /**
   * 产品 Reference
   */
  @Description("产品 Reference")
  private String productRef;

  /**
   * 产品
   */
  @Description("产品")
  private Product product;

  /**
   * 评论 Reference
   */
  @Description("评论 Reference")
  private Integer reviewRef;

  /**
   * 评论
   */
  @Description("评论")
  private Review review;

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
  private String __typename = "ProductReviewRelation";

  /**
   * Count of Relationship Object between 产品 and 评论
   */
  @Description("Count of Relationship Object between 产品 and 评论")
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
   * Count of 产品 Reference
   */
  @Description("Count of 产品 Reference")
  private Integer productRefCount;

  /**
   * Max of 产品 Reference
   */
  @Description("Max of 产品 Reference")
  private String productRefMax;

  /**
   * Min of 产品 Reference
   */
  @Description("Min of 产品 Reference")
  private String productRefMin;

  /**
   * Count of 评论 Reference
   */
  @Description("Count of 评论 Reference")
  private Integer reviewRefCount;

  /**
   * Sum of 评论 Reference
   */
  @Description("Sum of 评论 Reference")
  private Integer reviewRefSum;

  /**
   * Avg of 评论 Reference
   */
  @Description("Avg of 评论 Reference")
  private Integer reviewRefAvg;

  /**
   * Max of 评论 Reference
   */
  @Description("Max of 评论 Reference")
  private Integer reviewRefMax;

  /**
   * Min of 评论 Reference
   */
  @Description("Min of 评论 Reference")
  private Integer reviewRefMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProductRef() {
    return this.productRef;
  }

  public void setProductRef(String productRef) {
    this.productRef = productRef;
  }

  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Integer getReviewRef() {
    return this.reviewRef;
  }

  public void setReviewRef(Integer reviewRef) {
    this.reviewRef = reviewRef;
  }

  public Review getReview() {
    return this.review;
  }

  public void setReview(Review review) {
    this.review = review;
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

  public Integer getProductRefCount() {
    return this.productRefCount;
  }

  public void setProductRefCount(Integer productRefCount) {
    this.productRefCount = productRefCount;
  }

  public String getProductRefMax() {
    return this.productRefMax;
  }

  public void setProductRefMax(String productRefMax) {
    this.productRefMax = productRefMax;
  }

  public String getProductRefMin() {
    return this.productRefMin;
  }

  public void setProductRefMin(String productRefMin) {
    this.productRefMin = productRefMin;
  }

  public Integer getReviewRefCount() {
    return this.reviewRefCount;
  }

  public void setReviewRefCount(Integer reviewRefCount) {
    this.reviewRefCount = reviewRefCount;
  }

  public Integer getReviewRefSum() {
    return this.reviewRefSum;
  }

  public void setReviewRefSum(Integer reviewRefSum) {
    this.reviewRefSum = reviewRefSum;
  }

  public Integer getReviewRefAvg() {
    return this.reviewRefAvg;
  }

  public void setReviewRefAvg(Integer reviewRefAvg) {
    this.reviewRefAvg = reviewRefAvg;
  }

  public Integer getReviewRefMax() {
    return this.reviewRefMax;
  }

  public void setReviewRefMax(Integer reviewRefMax) {
    this.reviewRefMax = reviewRefMax;
  }

  public Integer getReviewRefMin() {
    return this.reviewRefMin;
  }

  public void setReviewRefMin(Integer reviewRefMin) {
    this.reviewRefMin = reviewRefMin;
  }

  public ProductReviewRelationInput toInput() {
    ProductReviewRelationInput input = new ProductReviewRelationInput();
    input.setId(this.getId());
    input.setProductRef(this.getProductRef());
    if(getProduct() != null) {
      input.setProduct(this.getProduct().toInput());
    }
    input.setReviewRef(this.getReviewRef());
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
