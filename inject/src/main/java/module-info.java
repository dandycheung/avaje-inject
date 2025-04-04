module io.avaje.inject {

  exports io.avaje.inject;
  exports io.avaje.inject.spi;

  requires transitive io.avaje.applog;
  requires transitive jakarta.inject;
  requires static io.avaje.config;
  requires static org.mockito;
  requires static io.avaje.spi;

  requires static transitive org.jspecify;

  uses io.avaje.inject.spi.InjectExtension;
}
