package demo.gp.user.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for Relationship Object between 用户 and 联系方式
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for Relationship Object between 用户 and 联系方式")
public class UserPhoneNumbersRelationEdge {
  /**
   * Node
   */
  @Description("Node")
  private UserPhoneNumbersRelation node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public UserPhoneNumbersRelation getNode() {
    return this.node;
  }

  public void setNode(UserPhoneNumbersRelation node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
