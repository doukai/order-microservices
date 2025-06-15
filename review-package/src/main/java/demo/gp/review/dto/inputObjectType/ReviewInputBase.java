package demo.gp.review.dto.inputObjectType;

import demo.gp.user.dto.inputObjectType.UserInput;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Input for 评论
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for 评论")
public interface ReviewInputBase extends MetaInput {
  /**
   * 评论ID
   */
  @Description("评论ID")
  String id = null;

  /**
   * 评论内容
   */
  @Description("评论内容")
  String content = null;

  /**
   * 评分
   */
  @Description("评分")
  Float rating = null;

  /**
   * 评论人
   */
  @Description("评论人")
  UserInput user = null;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  Boolean isDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  Integer version = null;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  Integer realmId = null;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  String createUserId = null;

  /**
   * Create Time
   */
  @Description("Create Time")
  LocalDateTime createTime = null;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  String updateUserId = null;

  /**
   * Update Time
   */
  @Description("Update Time")
  LocalDateTime updateTime = null;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  String createGroupId = null;

  /**
   * Type Name
   */
  @Description("Type Name")
  String __typename = "Review";

  /**
   * Relationship Object between 评论 and 用户
   */
  @Description("Relationship Object between 评论 and 用户")
  Collection<ReviewUserRelationInput> reviewUserRelation = null;

  /**
   * Where
   */
  @Description("Where")
  ReviewExpression where = null;

  default String getId() {
    return id;
  }

  void setId(String id);

  default String getContent() {
    return content;
  }

  void setContent(String content);

  default Float getRating() {
    return rating;
  }

  void setRating(Float rating);

  default UserInput getUser() {
    return user;
  }

  void setUser(UserInput user);

  default Boolean getIsDeprecated() {
    return isDeprecated;
  }

  void setIsDeprecated(Boolean isDeprecated);

  default Integer getVersion() {
    return version;
  }

  void setVersion(Integer version);

  default Integer getRealmId() {
    return realmId;
  }

  void setRealmId(Integer realmId);

  default String getCreateUserId() {
    return createUserId;
  }

  void setCreateUserId(String createUserId);

  default LocalDateTime getCreateTime() {
    return createTime;
  }

  void setCreateTime(LocalDateTime createTime);

  default String getUpdateUserId() {
    return updateUserId;
  }

  void setUpdateUserId(String updateUserId);

  default LocalDateTime getUpdateTime() {
    return updateTime;
  }

  void setUpdateTime(LocalDateTime updateTime);

  default String getCreateGroupId() {
    return createGroupId;
  }

  void setCreateGroupId(String createGroupId);

  default String get__typename() {
    return __typename;
  }

  void set__typename(String __typename);

  default Collection<ReviewUserRelationInput> getReviewUserRelation() {
    return reviewUserRelation;
  }

  void setReviewUserRelation(Collection<ReviewUserRelationInput> reviewUserRelation);

  default ReviewExpression getWhere() {
    return where;
  }

  void setWhere(ReviewExpression where);
}
