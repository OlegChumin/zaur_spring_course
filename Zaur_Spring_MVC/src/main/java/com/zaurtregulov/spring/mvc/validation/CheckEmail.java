package com.zaurtregulov.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {
    public String value() default "xyz.com";

    public String message() default "email must ends with xyz.com!";

    /**
     * Конкретные значения для параметров groups и payload будут зависеть от конкретной аннотации валидации,
     * которую вы создаете.
     * Обычно groups используется для группировки связанных валидаторов. Например, если у вас есть два валидатора для
     * поля, один проверяет обязательность заполнения, а другой проверяет правильность формата, то вы можете объединить
     * их в одну группу.
     * payload используется для различных целей, например, для добавления дополнительной информации о валидации.
     * Например, вы можете использовать payload для указания уровня важности валидации, чтобы при необходимости можно
     * было изменить поведение валидации на основе этой информации.
     * Примеры значений для groups и payload:
     * */

    public Class<?>[] groups() default {};
    public Class<? extends Payload> [] payload() default {};

    /**
     * Эти две строки относятся к механизму валидации объектов в Spring и являются частью интерфейса аннотации
     * Constraint.
     * groups представляет собой массив классов групп валидации, к которым относится данная аннотация. Группы валидации
     * позволяют группировать несколько аннотаций и валидировать их совместно.
     * payload - это опциональное свойство, которое позволяет уточнить информацию о констрейнте и использовать
     * его для различных целей. Например, сообщение об ошибке может содержать полезную информацию для клиента,
     * которая может быть использована в UI.
     * Оба свойства возвращают массивы классов, поэтому можно передать несколько классов для каждого свойства, если
     * требуется.
     * */
}
