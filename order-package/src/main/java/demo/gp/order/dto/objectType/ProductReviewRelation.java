package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.review.dto.objectType.Review;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class ProductReviewRelation implements Meta {
  @Id
  private String id;

  private String productRef;

  private Product product;

  private Integer reviewRef;

  private Review review;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "ProductReviewRelation";

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer productRefCount;

  private String productRefMax;

  private String productRefMin;

  private Integer reviewRefCount;

  private Integer reviewRefSum;

  private Integer reviewRefAvg;

  private Integer reviewRefMax;

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
}
