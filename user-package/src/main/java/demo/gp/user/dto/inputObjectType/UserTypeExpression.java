package demo.gp.user.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.enumType.UserType;
import io.graphoenix.core.dto.enumType.Operator;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Query Expression Input for 用户类型
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Query Expression Input for 用户类型")
public class UserTypeExpression {
  /**
   * Operators
   */
  @DefaultValue("EQ")
  @Description("Operators")
  private Operator opr = Operator.EQ;

  /**
   * Value
   */
  @Description("Value")
  private UserType val;

  /**
   * Array
   */
  @Description("Array")
  private Collection<UserType> arr;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public UserType getVal() {
    return this.val;
  }

  public void setVal(UserType val) {
    this.val = val;
  }

  public Collection<UserType> getArr() {
    return this.arr;
  }

  public void setArr(Collection<UserType> arr) {
    this.arr = arr;
  }
}
