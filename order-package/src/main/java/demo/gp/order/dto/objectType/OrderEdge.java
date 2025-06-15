package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for 订单
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for 订单")
public class OrderEdge {
  /**
   * Node
   */
  @Description("Node")
  private Order node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public Order getNode() {
    return this.node;
  }

  public void setNode(Order node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
