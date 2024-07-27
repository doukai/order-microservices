package demo.gp.review.dto.objectType;

import com.dslplatform.json.CompiledJson;
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

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "Review";

  private Collection<ReviewUserRelation> reviewUserRelation;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer contentCount;

  private String contentMax;

  private String contentMin;

  private Integer ratingCount;

  private Float ratingSum;

  private Float ratingAvg;

  private Float ratingMax;

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
}
