package demo.gp.review.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.inputObjectType.UserInput;
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
 * Mutation Arguments for Relationship Object between 评论 and 用户 List
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Arguments for Relationship Object between 评论 and 用户 List")
public class ReviewUserRelationListMutationArguments implements MetaInput, ReviewUserRelationInputBase {
  /**
   * ID
   */
  @Description("ID")
  private String id;

  /**
   * 评论 Reference
   */
  @Description("评论 Reference")
  private String reviewRef;

  /**
   * 评论
   */
  @Description("评论")
  private ReviewInput review;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  private Integer userRef;

  /**
   * 用户
   */
  @Description("用户")
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
  @DefaultValue("ReviewUserRelation")
  @Description("Type Name")
  private String __typename = "ReviewUserRelation";

  /**
   * Input List
   */
  @Description("Input List")
  private Collection<ReviewUserRelationInput> list;

  /**
   * Where
   */
  @Description("Where")
  private ReviewUserRelationExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public String getReviewRef() {
    return this.reviewRef;
  }

  @Override
  public void setReviewRef(String reviewRef) {
    this.reviewRef = (String)reviewRef;
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
  public Integer getUserRef() {
    return this.userRef;
  }

  @Override
  public void setUserRef(Integer userRef) {
    this.userRef = (Integer)userRef;
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

  public Collection<ReviewUserRelationInput> getList() {
    return this.list;
  }

  public void setList(Collection<ReviewUserRelationInput> list) {
    this.list = list;
  }

  @Override
  public ReviewUserRelationExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(ReviewUserRelationExpression where) {
    this.where = (ReviewUserRelationExpression)where;
  }
}
