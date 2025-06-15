package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for Relationship Object between 订单 and 用户
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for Relationship Object between 订单 and 用户")
public class OrderUserRelationEdge {
  /**
   * Node
   */
  @Description("Node")
  private OrderUserRelation node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public OrderUserRelation getNode() {
    return this.node;
  }

  public void setNode(OrderUserRelation node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
