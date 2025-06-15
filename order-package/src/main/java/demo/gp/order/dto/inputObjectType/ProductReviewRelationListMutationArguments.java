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
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Arguments for Relationship Object between 产品 and 评论 List
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Arguments for Relationship Object between 产品 and 评论 List")
public class ProductReviewRelationListMutationArguments implements MetaInput, ProductReviewRelationInputBase {
  /**
   * ID
   */
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
  private ProductInput product;

  /**
   * 评论 Reference
   */
  @Description("评论 Reference")
  private Integer reviewRef;

  /**
   * 评论
   */
  @Description("评论")
  private ReviewInput review;

  /**
   * Is Deprecated
   */
  @DefaultValue("false")
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
  @DefaultValue("ProductReviewRelation")
  @Description("Type Name")
  private String __typename = "ProductReviewRelation";

  /**
   * Input List
   */
  @Description("Input List")
  private Collection<ProductReviewRelationInput> list;

  /**
   * Where
   */
  @Description("Where")
  private ProductReviewRelationExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public String getProductRef() {
    return this.productRef;
  }

  @Override
  public void setProductRef(String productRef) {
    this.productRef = (String)productRef;
  }

  @Override
  public ProductInput getProduct() {
    return this.product;
  }

  @Override
  public void setProduct(ProductInput product) {
    this.product = (ProductInput)product;
  }

  @Override
  public Integer getReviewRef() {
    return this.reviewRef;
  }

  @Override
  public void setReviewRef(Integer reviewRef) {
    this.reviewRef = (Integer)reviewRef;
  }

  @Override
  public ReviewInput getReview() {
    return this.review;
  }

  @Override
  public void setReview(ReviewInput review) {
    this.review = (ReviewInput)review;
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

  @Override
  public String get__typename() {
    return this.__typename;
  }

  @Override
  public void set__typename(String __typename) {
    this.__typename = (String)__typename;
  }

  public Collection<ProductReviewRelationInput> getList() {
    return this.list;
  }

  public void setList(Collection<ProductReviewRelationInput> list) {
    this.list = list;
  }

  @Override
  public ProductReviewRelationExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(ProductReviewRelationExpression where) {
    this.where = (ProductReviewRelationExpression)where;
  }
}
