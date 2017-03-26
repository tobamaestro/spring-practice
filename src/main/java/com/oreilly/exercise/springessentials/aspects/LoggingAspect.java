package com.oreilly.exercise.springessentials.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * Created by toba on 25-Mar-17.
 */
@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Before("execution(void com.oreilly.exercise.springessentials..*.set*(*))")
    public void callSetter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String arg = joinPoint.getArgs()[0].toString();
        logger.info("Called setter on " + methodName + " with arg " + arg);
    }

    @Around("execution(String playGame())")
    public Object checkForRain(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        boolean rain = Math.random() > 0.5;
        Object result = null;

        if (rain) {
            logger.info(proceedingJoinPoint.getTarget() + " rained out.");
        } else {
            result = proceedingJoinPoint.proceed();
            logger.info(result.toString());
        }

        return result;
    }

}
