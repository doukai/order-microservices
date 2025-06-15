package demo.gp.review.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for 评论
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for 评论")
public class ReviewEdge {
  /**
   * Node
   */
  @Description("Node")
  private Review node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public Review getNode() {
    return this.node;
  }

  public void setNode(Review node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
