package demo.gp.user.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Mutation {
  UserMutationArguments user() default @UserMutationArguments;

  UserListMutationArguments userList() default @UserListMutationArguments;

  UserPhoneNumbersRelationMutationArguments userPhoneNumbersRelation(
      ) default @UserPhoneNumbersRelationMutationArguments;

  UserPhoneNumbersRelationListMutationArguments userPhoneNumbersRelationList(
      ) default @UserPhoneNumbersRelationListMutationArguments;
}
