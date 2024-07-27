package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.review.dto.objectType.Review;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

/**
 * 产品
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("产品")
public class Product implements Meta {
  /**
   * 产品ID
   */
  @Id
  @Description("产品ID")
  private String id;

  /**
   * 产品名称
   */
  @NonNull
  @Description("产品名称")
  private String name;

  /**
   * 定价
   */
  @NonNull
  @Description("定价")
  private Float price;

  /**
   * 评论列表
   */
  @Description("评论列表")
  private Collection<Review> reviews;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "Product";

  private Collection<ProductReviewRelation> productReviewRelation;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  private Integer priceCount;

  private Float priceSum;

  private Float priceAvg;

  private Float priceMax;

  private Float priceMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Float getPrice() {
    return this.price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Collection<Review> getReviews() {
    return this.reviews;
  }

  public void setReviews(Collection<Review> reviews) {
    this.reviews = reviews;
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

  public Collection<ProductReviewRelation> getProductReviewRelation() {
    return this.productReviewRelation;
  }

  public void setProductReviewRelation(Collection<ProductReviewRelation> productReviewRelation) {
    this.productReviewRelation = productReviewRelation;
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

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public String getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(String nameMax) {
    this.nameMax = nameMax;
  }

  public String getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(String nameMin) {
    this.nameMin = nameMin;
  }

  public Integer getPriceCount() {
    return this.priceCount;
  }

  public void setPriceCount(Integer priceCount) {
    this.priceCount = priceCount;
  }

  public Float getPriceSum() {
    return this.priceSum;
  }

  public void setPriceSum(Float priceSum) {
    this.priceSum = priceSum;
  }

  public Float getPriceAvg() {
    return this.priceAvg;
  }

  public void setPriceAvg(Float priceAvg) {
    this.priceAvg = priceAvg;
  }

  public Float getPriceMax() {
    return this.priceMax;
  }

  public void setPriceMax(Float priceMax) {
    this.priceMax = priceMax;
  }

  public Float getPriceMin() {
    return this.priceMin;
  }

  public void setPriceMin(Float priceMin) {
    this.priceMin = priceMin;
  }
}
