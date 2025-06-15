package demo.gp.review.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Mutation
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation")
public class Mutation {
  /**
   * Mutation Field for 评论
   */
  @Description("Mutation Field for 评论")
  private Review review;

  /**
   * Mutation Field for 评论 List
   */
  @Description("Mutation Field for 评论 List")
  private Collection<Review> reviewList;

  /**
   * Mutation Field for Relationship Object between 评论 and 用户
   */
  @Description("Mutation Field for Relationship Object between 评论 and 用户")
  private ReviewUserRelation reviewUserRelation;

  /**
   * Mutation Field for Relationship Object between 评论 and 用户 List
   */
  @Description("Mutation Field for Relationship Object between 评论 and 用户 List")
  private Collection<ReviewUserRelation> reviewUserRelationList;

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
}
