package demo.gp.review.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.review.dto.inputObjectType.ReviewInput;
import demo.gp.user.dto.objectType.User;
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
 * 评论
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("评论")
public class Review implements Meta {
  /**
   * 评论ID
   */
  @Id
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
  @NonNull
  @Description("评分")
  private Float rating;

  /**
   * 评论人
   */
  @NonNull
  @Description("评论人")
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
  private String __typename = "Review";

  /**
   * Relationship Object between 评论 and 用户
   */
  @Description("Relationship Object between 评论 and 用户")
  private Collection<ReviewUserRelation> reviewUserRelation;

  /**
   * Count of 评论
   */
  @Description("Count of 评论")
  private Integer idCount;

  /**
   * Max of 评论ID
   */
  @Description("Max of 评论ID")
  private Integer idMax;

  /**
   * Min of 评论ID
   */
  @Description("Min of 评论ID")
  private Integer idMin;

  /**
   * Count of 评论内容
   */
  @Description("Count of 评论内容")
  private Integer contentCount;

  /**
   * Max of 评论内容
   */
  @Description("Max of 评论内容")
  private String contentMax;

  /**
   * Min of 评论内容
   */
  @Description("Min of 评论内容")
  private String contentMin;

  /**
   * Count of 评分
   */
  @Description("Count of 评分")
  private Integer ratingCount;

  /**
   * Sum of 评分
   */
  @Description("Sum of 评分")
  private Float ratingSum;

  /**
   * Avg of 评分
   */
  @Description("Avg of 评分")
  private Float ratingAvg;

  /**
   * Max of 评分
   */
  @Description("Max of 评分")
  private Float ratingMax;

  /**
   * Min of 评分
   */
  @Description("Min of 评分")
  private Float ratingMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Float getRating() {
    return this.rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
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

  public Collection<ReviewUserRelation> getReviewUserRelation() {
    return this.reviewUserRelation;
  }

  public void setReviewUserRelation(Collection<ReviewUserRelation> reviewUserRelation) {
    this.reviewUserRelation = reviewUserRelation;
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

  public Integer getContentCount() {
    return this.contentCount;
  }

  public void setContentCount(Integer contentCount) {
    this.contentCount = contentCount;
  }

  public String getContentMax() {
    return this.contentMax;
  }

  public void setContentMax(String contentMax) {
    this.contentMax = contentMax;
  }

  public String getContentMin() {
    return this.contentMin;
  }

  public void setContentMin(String contentMin) {
    this.contentMin = contentMin;
  }

  public Integer getRatingCount() {
    return this.ratingCount;
  }

  public void setRatingCount(Integer ratingCount) {
    this.ratingCount = ratingCount;
  }

  public Float getRatingSum() {
    return this.ratingSum;
  }

  public void setRatingSum(Float ratingSum) {
    this.ratingSum = ratingSum;
  }

  public Float getRatingAvg() {
    return this.ratingAvg;
  }

  public void setRatingAvg(Float ratingAvg) {
    this.ratingAvg = ratingAvg;
  }

  public Float getRatingMax() {
    return this.ratingMax;
  }

  public void setRatingMax(Float ratingMax) {
    this.ratingMax = ratingMax;
  }

  public Float getRatingMin() {
    return this.ratingMin;
  }

  public void setRatingMin(Float ratingMin) {
    this.ratingMin = ratingMin;
  }

  public ReviewInput toInput() {
    ReviewInput input = new ReviewInput();
    input.setId(this.getId());
    input.setContent(this.getContent());
    input.setRating(this.getRating());
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
