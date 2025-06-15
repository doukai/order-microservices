package demo.gp.review.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.inputObjectType.UserOrderBy;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 评论
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for 评论")
public class ReviewOrderBy {
  /**
   * 评论ID
   */
  @Description("评论ID")
  private Sort id;

  /**
   * 评论内容
   */
  @Description("评论内容")
  private Sort content;

  /**
   * 评分
   */
  @Description("评分")
  private Sort rating;

  /**
   * 评论人
   */
  @Description("评论人")
  private UserOrderBy user;

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
   * Relationship Object between 评论 and 用户
   */
  @Description("Relationship Object between 评论 and 用户")
  private ReviewUserRelationOrderBy reviewUserRelation;

  /**
   * Count of 评论
   */
  @Description("Count of 评论")
  private Sort idCount;

  /**
   * Max of 评论ID
   */
  @Description("Max of 评论ID")
  private Sort idMax;

  /**
   * Min of 评论ID
   */
  @Description("Min of 评论ID")
  private Sort idMin;

  /**
   * Count of 评论内容
   */
  @Description("Count of 评论内容")
  private Sort contentCount;

  /**
   * Max of 评论内容
   */
  @Description("Max of 评论内容")
  private Sort contentMax;

  /**
   * Min of 评论内容
   */
  @Description("Min of 评论内容")
  private Sort contentMin;

  /**
   * Count of 评分
   */
  @Description("Count of 评分")
  private Sort ratingCount;

  /**
   * Sum of 评分
   */
  @Description("Sum of 评分")
  private Sort ratingSum;

  /**
   * Avg of 评分
   */
  @Description("Avg of 评分")
  private Sort ratingAvg;

  /**
   * Max of 评分
   */
  @Description("Max of 评分")
  private Sort ratingMax;

  /**
   * Min of 评分
   */
  @Description("Min of 评分")
  private Sort ratingMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getContent() {
    return this.content;
  }

  public void setContent(Sort content) {
    this.content = content;
  }

  public Sort getRating() {
    return this.rating;
  }

  public void setRating(Sort rating) {
    this.rating = rating;
  }

  public UserOrderBy getUser() {
    return this.user;
  }

  public void setUser(UserOrderBy user) {
    this.user = user;
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

  public ReviewUserRelationOrderBy getReviewUserRelation() {
    return this.reviewUserRelation;
  }

  public void setReviewUserRelation(ReviewUserRelationOrderBy reviewUserRelation) {
    this.reviewUserRelation = reviewUserRelation;
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

  public Sort getContentCount() {
    return this.contentCount;
  }

  public void setContentCount(Sort contentCount) {
    this.contentCount = contentCount;
  }

  public Sort getContentMax() {
    return this.contentMax;
  }

  public void setContentMax(Sort contentMax) {
    this.contentMax = contentMax;
  }

  public Sort getContentMin() {
    return this.contentMin;
  }

  public void setContentMin(Sort contentMin) {
    this.contentMin = contentMin;
  }

  public Sort getRatingCount() {
    return this.ratingCount;
  }

  public void setRatingCount(Sort ratingCount) {
    this.ratingCount = ratingCount;
  }

  public Sort getRatingSum() {
    return this.ratingSum;
  }

  public void setRatingSum(Sort ratingSum) {
    this.ratingSum = ratingSum;
  }

  public Sort getRatingAvg() {
    return this.ratingAvg;
  }

  public void setRatingAvg(Sort ratingAvg) {
    this.ratingAvg = ratingAvg;
  }

  public Sort getRatingMax() {
    return this.ratingMax;
  }

  public void setRatingMax(Sort ratingMax) {
    this.ratingMax = ratingMax;
  }

  public Sort getRatingMin() {
    return this.ratingMin;
  }

  public void setRatingMin(Sort ratingMin) {
    this.ratingMin = ratingMin;
  }
}
