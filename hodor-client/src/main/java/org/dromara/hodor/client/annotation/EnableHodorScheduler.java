package org.dromara.hodor.client.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

/**
 * enable hodor scheduler
 *
 * @author tomgs
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(HodorSchedulerConfiguration.class)
@Documented
public @interface EnableHodorScheduler {

}
