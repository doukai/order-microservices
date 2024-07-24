package demo.gp.review.dto.annotation;

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
public @interface Query {
  ReviewQueryArguments review() default @ReviewQueryArguments;

  ReviewListQueryArguments reviewList() default @ReviewListQueryArguments;

  ReviewConnectionQueryArguments reviewConnection() default @ReviewConnectionQueryArguments;

  ReviewUserRelationQueryArguments reviewUserRelation() default @ReviewUserRelationQueryArguments;

  ReviewUserRelationListQueryArguments reviewUserRelationList(
      ) default @ReviewUserRelationListQueryArguments;

  ReviewUserRelationConnectionQueryArguments reviewUserRelationConnection(
      ) default @ReviewUserRelationConnectionQueryArguments;
}
