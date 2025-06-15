package demo.gp.user.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Mutation
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation")
public class Mutation {
  /**
   * Mutation Field for 用户
   */
  @Description("Mutation Field for 用户")
  private User user;

  /**
   * Mutation Field for 用户 List
   */
  @Description("Mutation Field for 用户 List")
  private Collection<User> userList;

  /**
   * Mutation Field for Relationship Object between 用户 and 联系方式
   */
  @Description("Mutation Field for Relationship Object between 用户 and 联系方式")
  private UserPhoneNumbersRelation userPhoneNumbersRelation;

  /**
   * Mutation Field for Relationship Object between 用户 and 联系方式 List
   */
  @Description("Mutation Field for Relationship Object between 用户 and 联系方式 List")
  private Collection<UserPhoneNumbersRelation> userPhoneNumbersRelationList;

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
}
