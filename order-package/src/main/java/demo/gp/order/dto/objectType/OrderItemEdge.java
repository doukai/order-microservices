package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for 订单项
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for 订单项")
public class OrderItemEdge {
  /**
   * Node
   */
  @Description("Node")
  private OrderItem node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public OrderItem getNode() {
    return this.node;
  }

  public void setNode(OrderItem node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
