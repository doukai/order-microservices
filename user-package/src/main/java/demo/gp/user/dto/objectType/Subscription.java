package demo.gp.user.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Subscription {
  private User user;

  private Collection<User> userList;

  private UserConnection userConnection;

  private UserPhoneNumbersRelation userPhoneNumbersRelation;

  private Collection<UserPhoneNumbersRelation> userPhoneNumbersRelationList;

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
