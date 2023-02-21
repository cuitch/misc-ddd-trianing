package com.ch.test.infrastructure.aop;

import com.ch.test.infrastructure.anotation.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Objects;

@Component
@Aspect
@Slf4j
public class LogAspect {

//  @Autowired private LogServiceI logService;

  @Pointcut("@annotation(com.ch.test.infrastructure.anotation.Log)")
  public void logPointcut() {}

  /**
   * @param joinPoint
   */
  @Around("logPointcut()")
  public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
    Object result;
    result = joinPoint.proceed();
    HttpServletRequest request =
        ((ServletRequestAttributes)
                Objects.requireNonNull(RequestContextHolder.getRequestAttributes()))
            .getRequest();

    try {
      MethodSignature signature = (MethodSignature) joinPoint.getSignature();
      Method method = signature.getMethod();
      StringBuffer stringBuffer = new StringBuffer();
      // get Annotation Log
      Log log_ = method.getAnnotation(Log.class);
      // TODO business

    } catch (Exception e) {
      log.error("addLogError:{}", e);
    }

    return result;
  }

  /**
   * @param joinPoint
   * @param e exception
   */
  @AfterThrowing(pointcut = "logPointcut()", throwing = "e")
  public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
    HttpServletRequest request =
        ((ServletRequestAttributes)
                Objects.requireNonNull(RequestContextHolder.getRequestAttributes()))
            .getRequest();

    try {
      MethodSignature signature = (MethodSignature) joinPoint.getSignature();
      Method method = signature.getMethod();
      // get Annotation Log
      Log log_ = method.getAnnotation(Log.class);
     // TODO business
    } catch (Exception exception) {
      log.error("addLogError:{}", exception);
    }
  }
}
