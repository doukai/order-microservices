package demo.gp.review.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Query
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Query")
public class Query {
  /**
   * Query Field for 评论
   */
  @Description("Query Field for 评论")
  private Review review;

  /**
   * Query Field for 评论 List
   */
  @Description("Query Field for 评论 List")
  private Collection<Review> reviewList;

  /**
   * Query Field for 评论 Connection
   */
  @Description("Query Field for 评论 Connection")
  private ReviewConnection reviewConnection;

  /**
   * Query Field for Relationship Object between 评论 and 用户
   */
  @Description("Query Field for Relationship Object between 评论 and 用户")
  private ReviewUserRelation reviewUserRelation;

  /**
   * Query Field for Relationship Object between 评论 and 用户 List
   */
  @Description("Query Field for Relationship Object between 评论 and 用户 List")
  private Collection<ReviewUserRelation> reviewUserRelationList;

  /**
   * Query Field for Relationship Object between 评论 and 用户 Connection
   */
  @Description("Query Field for Relationship Object between 评论 and 用户 Connection")
  private ReviewUserRelationConnection reviewUserRelationConnection;

  public Review getReview() {
    return this.review;
  }

  public void setReview(Review review) {
    this.review = review;
  }

  public Collection<Review> getReviewList() {
    return this.reviewList;
  }

  public void setReviewList(Collection<Review> reviewList) {
    this.reviewList = reviewList;
  }

  public ReviewConnection getReviewConnection() {
    return this.reviewConnection;
  }

  public void setReviewConnection(ReviewConnection reviewConnection) {
    this.reviewConnection = reviewConnection;
  }

  public ReviewUserRelation getReviewUserRelation() {
    return this.reviewUserRelation;
  }

  public void setReviewUserRelation(ReviewUserRelation reviewUserRelation) {
    this.reviewUserRelation = reviewUserRelation;
  }

  public Collection<ReviewUserRelation> getReviewUserRelationList() {
    return this.reviewUserRelationList;
  }

  public void setReviewUserRelationList(Collection<ReviewUserRelation> reviewUserRelationList) {
    this.reviewUserRelationList = reviewUserRelationList;
  }

  public ReviewUserRelationConnection getReviewUserRelationConnection() {
    return this.reviewUserRelationConnection;
  }

  public void setReviewUserRelationConnection(
      ReviewUserRelationConnection reviewUserRelationConnection) {
    this.reviewUserRelationConnection = reviewUserRelationConnection;
  }
}
