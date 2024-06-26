package io.avaje.inject.test;

import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An avaje-inject test supporting {@code @Inject} along with Mockito annotations -
 * {@code @Mock, @Spy, @Captor}.
 *
 * <p>This is a JUnit 5 extension.
 */
@ExtendWith(InjectJunitExtension.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectTest {

  /** Wiring profiles to use */
  String[] profiles() default {};
}
