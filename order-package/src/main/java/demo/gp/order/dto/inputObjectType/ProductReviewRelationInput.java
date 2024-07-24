package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.review.dto.inputObjectType.ReviewInput;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class ProductReviewRelationInput implements MetaInput {
  private String id;

  private String productRef;

  private ProductInput product;

  private Integer reviewRef;

  private ReviewInput review;

  @DefaultValue("false")
  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"ProductReviewRelation\"")
  private String __typename = "ProductReviewRelation";

  private ProductReviewRelationExpression where;

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

  public ProductInput getProduct() {
    return this.product;
  }

  public void setProduct(ProductInput product) {
    this.product = product;
  }

  public Integer getReviewRef() {
    return this.reviewRef;
  }

  public void setReviewRef(Integer reviewRef) {
    this.reviewRef = reviewRef;
  }

  public ReviewInput getReview() {
    return this.review;
  }

  public void setReview(ReviewInput review) {
    this.review = review;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
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

  public ProductReviewRelationExpression getWhere() {
    return this.where;
  }

  public void setWhere(ProductReviewRelationExpression where) {
    this.where = where;
  }
}
