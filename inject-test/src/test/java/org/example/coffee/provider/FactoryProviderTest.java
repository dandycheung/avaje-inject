package org.example.coffee.provider;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import io.avaje.inject.BeanScope;
import io.avaje.inject.spi.GenericType;

class FactoryProviderTest {

  @Test
  void test() {
    try (var scope = BeanScope.builder().build()) {
      Supplier<String> prov = scope.get(new GenericType<Supplier<String>>() {});
      assertThat(prov.get()).isEqualTo("Stand proud Provider, you were strong");
      assertThat(scope.get(String.class, "second")).isEqualTo("Nah, I'd win");
    }
  }

  @Test
  void testProtoType() {
    try (var scope = BeanScope.builder().build()) {
      var numberGetter = scope.get(ProtoTypeNumberGetter.class);
      assertThat(numberGetter.number()).isNotEqualTo(numberGetter.number());
    }
  }
}
