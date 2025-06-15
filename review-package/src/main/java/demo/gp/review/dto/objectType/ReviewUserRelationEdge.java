package demo.gp.review.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for Relationship Object between 评论 and 用户
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for Relationship Object between 评论 and 用户")
public class ReviewUserRelationEdge {
  /**
   * Node
   */
  @Description("Node")
  private ReviewUserRelation node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public ReviewUserRelation getNode() {
    return this.node;
  }

  public void setNode(ReviewUserRelation node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
