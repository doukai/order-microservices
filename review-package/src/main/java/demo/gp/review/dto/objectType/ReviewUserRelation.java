package demo.gp.review.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.review.dto.inputObjectType.ReviewUserRelationInput;
import demo.gp.user.dto.objectType.User;
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
 * Relationship Object between 评论 and 用户
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Relationship Object between 评论 and 用户")
public class ReviewUserRelation implements Meta {
  /**
   * ID
   */
  @Id
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
  private Review review;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  private Integer userRef;

  /**
   * 用户
   */
  @Description("用户")
  private User user;

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
  private String __typename = "ReviewUserRelation";

  /**
   * Count of Relationship Object between 评论 and 用户
   */
  @Description("Count of Relationship Object between 评论 and 用户")
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
   * Count of 评论 Reference
   */
  @Description("Count of 评论 Reference")
  private Integer reviewRefCount;

  /**
   * Max of 评论 Reference
   */
  @Description("Max of 评论 Reference")
  private String reviewRefMax;

  /**
   * Min of 评论 Reference
   */
  @Description("Min of 评论 Reference")
  private String reviewRefMin;

  /**
   * Count of 用户 Reference
   */
  @Description("Count of 用户 Reference")
  private Integer userRefCount;

  /**
   * Sum of 用户 Reference
   */
  @Description("Sum of 用户 Reference")
  private Integer userRefSum;

  /**
   * Avg of 用户 Reference
   */
  @Description("Avg of 用户 Reference")
  private Integer userRefAvg;

  /**
   * Max of 用户 Reference
   */
  @Description("Max of 用户 Reference")
  private Integer userRefMax;

  /**
   * Min of 用户 Reference
   */
  @Description("Min of 用户 Reference")
  private Integer userRefMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getReviewRef() {
    return this.reviewRef;
  }

  public void setReviewRef(String reviewRef) {
    this.reviewRef = reviewRef;
  }

  public Review getReview() {
    return this.review;
  }

  public void setReview(Review review) {
    this.review = review;
  }

  public Integer getUserRef() {
    return this.userRef;
  }

  public void setUserRef(Integer userRef) {
    this.userRef = userRef;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
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

  public Integer getReviewRefCount() {
    return this.reviewRefCount;
  }

  public void setReviewRefCount(Integer reviewRefCount) {
    this.reviewRefCount = reviewRefCount;
  }

  public String getReviewRefMax() {
    return this.reviewRefMax;
  }

  public void setReviewRefMax(String reviewRefMax) {
    this.reviewRefMax = reviewRefMax;
  }

  public String getReviewRefMin() {
    return this.reviewRefMin;
  }

  public void setReviewRefMin(String reviewRefMin) {
    this.reviewRefMin = reviewRefMin;
  }

  public Integer getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Integer userRefCount) {
    this.userRefCount = userRefCount;
  }

  public Integer getUserRefSum() {
    return this.userRefSum;
  }

  public void setUserRefSum(Integer userRefSum) {
    this.userRefSum = userRefSum;
  }

  public Integer getUserRefAvg() {
    return this.userRefAvg;
  }

  public void setUserRefAvg(Integer userRefAvg) {
    this.userRefAvg = userRefAvg;
  }

  public Integer getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(Integer userRefMax) {
    this.userRefMax = userRefMax;
  }

  public Integer getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(Integer userRefMin) {
    this.userRefMin = userRefMin;
  }

  public ReviewUserRelationInput toInput() {
    ReviewUserRelationInput input = new ReviewUserRelationInput();
    input.setId(this.getId());
    input.setReviewRef(this.getReviewRef());
    if(getReview() != null) {
      input.setReview(this.getReview().toInput());
    }
    input.setUserRef(this.getUserRef());
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
