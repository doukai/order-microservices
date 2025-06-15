package demo.gp.review.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.inputObjectType.UserOrderBy;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for Relationship Object between 评论 and 用户
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for Relationship Object between 评论 and 用户")
public class ReviewUserRelationOrderBy {
  /**
   * ID
   */
  @Description("ID")
  private Sort id;

  /**
   * 评论 Reference
   */
  @Description("评论 Reference")
  private Sort reviewRef;

  /**
   * 评论
   */
  @Description("评论")
  private ReviewOrderBy review;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  private Sort userRef;

  /**
   * 用户
   */
  @Description("用户")
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
   * Count of Relationship Object between 评论 and 用户
   */
  @Description("Count of Relationship Object between 评论 and 用户")
  private Sort idCount;

  /**
   * Max of ID
   */
  @Description("Max of ID")
  private Sort idMax;

  /**
   * Min of ID
   */
  @Description("Min of ID")
  private Sort idMin;

  /**
   * Count of 评论 Reference
   */
  @Description("Count of 评论 Reference")
  private Sort reviewRefCount;

  /**
   * Max of 评论 Reference
   */
  @Description("Max of 评论 Reference")
  private Sort reviewRefMax;

  /**
   * Min of 评论 Reference
   */
  @Description("Min of 评论 Reference")
  private Sort reviewRefMin;

  /**
   * Count of 用户 Reference
   */
  @Description("Count of 用户 Reference")
  private Sort userRefCount;

  /**
   * Sum of 用户 Reference
   */
  @Description("Sum of 用户 Reference")
  private Sort userRefSum;

  /**
   * Avg of 用户 Reference
   */
  @Description("Avg of 用户 Reference")
  private Sort userRefAvg;

  /**
   * Max of 用户 Reference
   */
  @Description("Max of 用户 Reference")
  private Sort userRefMax;

  /**
   * Min of 用户 Reference
   */
  @Description("Min of 用户 Reference")
  private Sort userRefMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getReviewRef() {
    return this.reviewRef;
  }

  public void setReviewRef(Sort reviewRef) {
    this.reviewRef = reviewRef;
  }

  public ReviewOrderBy getReview() {
    return this.review;
  }

  public void setReview(ReviewOrderBy review) {
    this.review = review;
  }

  public Sort getUserRef() {
    return this.userRef;
  }

  public void setUserRef(Sort userRef) {
    this.userRef = userRef;
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

  public Sort getReviewRefCount() {
    return this.reviewRefCount;
  }

  public void setReviewRefCount(Sort reviewRefCount) {
    this.reviewRefCount = reviewRefCount;
  }

  public Sort getReviewRefMax() {
    return this.reviewRefMax;
  }

  public void setReviewRefMax(Sort reviewRefMax) {
    this.reviewRefMax = reviewRefMax;
  }

  public Sort getReviewRefMin() {
    return this.reviewRefMin;
  }

  public void setReviewRefMin(Sort reviewRefMin) {
    this.reviewRefMin = reviewRefMin;
  }

  public Sort getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Sort userRefCount) {
    this.userRefCount = userRefCount;
  }

  public Sort getUserRefSum() {
    return this.userRefSum;
  }

  public void setUserRefSum(Sort userRefSum) {
    this.userRefSum = userRefSum;
  }

  public Sort getUserRefAvg() {
    return this.userRefAvg;
  }

  public void setUserRefAvg(Sort userRefAvg) {
    this.userRefAvg = userRefAvg;
  }

  public Sort getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(Sort userRefMax) {
    this.userRefMax = userRefMax;
  }

  public Sort getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(Sort userRefMin) {
    this.userRefMin = userRefMin;
  }
}
