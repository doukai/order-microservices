package demo.gp.order.dto.directive;

import io.graphoenix.core.dto.annotation.With;
import io.graphoenix.core.dto.enumType.Protocol;
import io.graphoenix.spi.annotation.Directive;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Directive("fetch")
@Target({ElementType.FIELD})
public @interface Fetch {
  Protocol protocol() default Protocol.LOCAL;

  String from() default "";

  With with() default @With;

  String to() default "";

  boolean anchor() default false;
}
