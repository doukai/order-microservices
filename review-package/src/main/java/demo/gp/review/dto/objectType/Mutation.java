package demo.gp.review.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Mutation {
  private Review review;

  private Collection<Review> reviewList;

  private ReviewUserRelation reviewUserRelation;

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
