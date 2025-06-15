package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for Relationship Object between 产品 and 评论
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for Relationship Object between 产品 and 评论")
public class ProductReviewRelationEdge {
  /**
   * Node
   */
  @Description("Node")
  private ProductReviewRelation node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public ProductReviewRelation getNode() {
    return this.node;
  }

  public void setNode(ProductReviewRelation node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
