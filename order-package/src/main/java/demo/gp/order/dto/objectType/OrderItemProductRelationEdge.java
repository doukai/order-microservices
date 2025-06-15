package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for Relationship Object between 订单项 and 产品
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for Relationship Object between 订单项 and 产品")
public class OrderItemProductRelationEdge {
  /**
   * Node
   */
  @Description("Node")
  private OrderItemProductRelation node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public OrderItemProductRelation getNode() {
    return this.node;
  }

  public void setNode(OrderItemProductRelation node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
