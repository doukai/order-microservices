package demo.gp.review.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.inputObjectType.UserInput;
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
 * Mutation Input for 评论
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for 评论")
public class ReviewInput implements MetaInput, ReviewInputBase {
  /**
   * 评论ID
   */
  @Description("评论ID")
  private String id;

  /**
   * 评论内容
   */
  @Description("评论内容")
  private String content;

  /**
   * 评分
   */
  @Description("评分")
  private Float rating;

  /**
   * 评论人
   */
  @Description("评论人")
  private UserInput user;

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
  @DefaultValue("Review")
  @Description("Type Name")
  private String __typename = "Review";

  /**
   * Relationship Object between 评论 and 用户
   */
  @Description("Relationship Object between 评论 and 用户")
  private Collection<ReviewUserRelationInput> reviewUserRelation;

  /**
   * Where
   */
  @Description("Where")
  private ReviewExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public String getContent() {
    return this.content;
  }

  @Override
  public void setContent(String content) {
    this.content = (String)content;
  }

  @Override
  public Float getRating() {
    return this.rating;
  }

  @Override
  public void setRating(Float rating) {
    this.rating = (Float)rating;
  }

  @Override
  public UserInput getUser() {
    return this.user;
  }

  @Override
  public void setUser(UserInput user) {
    this.user = (UserInput)user;
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
  public Collection<ReviewUserRelationInput> getReviewUserRelation() {
    return this.reviewUserRelation;
  }

  @Override
  public void setReviewUserRelation(Collection<ReviewUserRelationInput> reviewUserRelation) {
    this.reviewUserRelation = (Collection<ReviewUserRelationInput>)reviewUserRelation;
  }

  @Override
  public ReviewExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(ReviewExpression where) {
    this.where = (ReviewExpression)where;
  }
}
