package demo.gp.user.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Query
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Query")
public class Query {
  /**
   * Query Field for 用户
   */
  @Description("Query Field for 用户")
  private User user;

  /**
   * Query Field for 用户 List
   */
  @Description("Query Field for 用户 List")
  private Collection<User> userList;

  /**
   * Query Field for 用户 Connection
   */
  @Description("Query Field for 用户 Connection")
  private UserConnection userConnection;

  /**
   * Query Field for Relationship Object between 用户 and 联系方式
   */
  @Description("Query Field for Relationship Object between 用户 and 联系方式")
  private UserPhoneNumbersRelation userPhoneNumbersRelation;

  /**
   * Query Field for Relationship Object between 用户 and 联系方式 List
   */
  @Description("Query Field for Relationship Object between 用户 and 联系方式 List")
  private Collection<UserPhoneNumbersRelation> userPhoneNumbersRelationList;

  /**
   * Query Field for Relationship Object between 用户 and 联系方式 Connection
   */
  @Description("Query Field for Relationship Object between 用户 and 联系方式 Connection")
  private UserPhoneNumbersRelationConnection userPhoneNumbersRelationConnection;

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Collection<User> getUserList() {
    return this.userList;
  }

  public void setUserList(Collection<User> userList) {
    this.userList = userList;
  }

  public UserConnection getUserConnection() {
    return this.userConnection;
  }

  public void setUserConnection(UserConnection userConnection) {
    this.userConnection = userConnection;
  }

  public UserPhoneNumbersRelation getUserPhoneNumbersRelation() {
    return this.userPhoneNumbersRelation;
  }

  public void setUserPhoneNumbersRelation(UserPhoneNumbersRelation userPhoneNumbersRelation) {
    this.userPhoneNumbersRelation = userPhoneNumbersRelation;
  }

  public Collection<UserPhoneNumbersRelation> getUserPhoneNumbersRelationList() {
    return this.userPhoneNumbersRelationList;
  }

  public void setUserPhoneNumbersRelationList(
      Collection<UserPhoneNumbersRelation> userPhoneNumbersRelationList) {
    this.userPhoneNumbersRelationList = userPhoneNumbersRelationList;
  }

  public UserPhoneNumbersRelationConnection getUserPhoneNumbersRelationConnection() {
    return this.userPhoneNumbersRelationConnection;
  }

  public void setUserPhoneNumbersRelationConnection(
      UserPhoneNumbersRelationConnection userPhoneNumbersRelationConnection) {
    this.userPhoneNumbersRelationConnection = userPhoneNumbersRelationConnection;
  }
}
