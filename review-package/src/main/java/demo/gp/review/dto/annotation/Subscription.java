package demo.gp.review.dto.annotation;

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
  ReviewSubscriptionArguments review() default @ReviewSubscriptionArguments;

  ReviewListSubscriptionArguments reviewList() default @ReviewListSubscriptionArguments;

  ReviewConnectionSubscriptionArguments reviewConnection(
      ) default @ReviewConnectionSubscriptionArguments;

  ReviewUserRelationSubscriptionArguments reviewUserRelation(
      ) default @ReviewUserRelationSubscriptionArguments;

  ReviewUserRelationListSubscriptionArguments reviewUserRelationList(
      ) default @ReviewUserRelationListSubscriptionArguments;

  ReviewUserRelationConnectionSubscriptionArguments reviewUserRelationConnection(
      ) default @ReviewUserRelationConnectionSubscriptionArguments;
}
