package com.ch.test.infrastructure.anotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {

  /** which module */
  String module();

  /** what action eg:ADD/DELETE/UPDATE ... */
  String action();

  /** log message */
  String message();

  /** log level */
  String level();
}
