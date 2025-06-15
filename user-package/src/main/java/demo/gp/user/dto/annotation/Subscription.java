package demo.gp.user.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Subscription
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Subscription")
public @interface Subscription {
  UserSubscriptionArguments user() default @UserSubscriptionArguments;

  UserListSubscriptionArguments userList() default @UserListSubscriptionArguments;

  UserConnectionSubscriptionArguments userConnection() default @UserConnectionSubscriptionArguments;

  UserPhoneNumbersRelationSubscriptionArguments userPhoneNumbersRelation(
      ) default @UserPhoneNumbersRelationSubscriptionArguments;

  UserPhoneNumbersRelationListSubscriptionArguments userPhoneNumbersRelationList(
      ) default @UserPhoneNumbersRelationListSubscriptionArguments;

  UserPhoneNumbersRelationConnectionSubscriptionArguments userPhoneNumbersRelationConnection(
      ) default @UserPhoneNumbersRelationConnectionSubscriptionArguments;
}
