package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.review.dto.inputObjectType.ReviewInput;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Arguments for 产品 List
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Arguments for 产品 List")
public class ProductListMutationArguments implements MetaInput, ProductInputBase {
  /**
   * 产品ID
   */
  @Description("产品ID")
  private String id;

  /**
   * 产品名称
   */
  @Description("产品名称")
  private String name;

  /**
   * 定价
   */
  @Description("定价")
  private Float price;

  /**
   * 评论列表
   */
  @Description("评论列表")
  private Collection<ReviewInput> reviews;

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
  @DefaultValue("Product")
  @Description("Type Name")
  private String __typename = "Product";

  /**
   * Relationship Object between 产品 and 评论
   */
  @Description("Relationship Object between 产品 and 评论")
  private Collection<ProductReviewRelationInput> productReviewRelation;

  /**
   * Input List
   */
  @Description("Input List")
  private Collection<ProductInput> list;

  /**
   * Where
   */
  @Description("Where")
  private ProductExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = (String)name;
  }

  @Override
  public Float getPrice() {
    return this.price;
  }

  @Override
  public void setPrice(Float price) {
    this.price = (Float)price;
  }

  @Override
  public Collection<ReviewInput> getReviews() {
    return this.reviews;
  }

  @Override
  public void setReviews(Collection<ReviewInput> reviews) {
    this.reviews = (Collection<ReviewInput>)reviews;
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

  @Override
  public Collection<ProductReviewRelationInput> getProductReviewRelation() {
    return this.productReviewRelation;
  }

  @Override
  public void setProductReviewRelation(
      Collection<ProductReviewRelationInput> productReviewRelation) {
    this.productReviewRelation = (Collection<ProductReviewRelationInput>)productReviewRelation;
  }

  public Collection<ProductInput> getList() {
    return this.list;
  }

  public void setList(Collection<ProductInput> list) {
    this.list = list;
  }

  @Override
  public ProductExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(ProductExpression where) {
    this.where = (ProductExpression)where;
  }
}
