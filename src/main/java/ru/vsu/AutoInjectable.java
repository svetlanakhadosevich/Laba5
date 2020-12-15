package ru.vsu;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SH
 * Создание аннотации
 * Применимо только к Полям
 * Исполбзуется только в RunTime
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoInjectable {

}
