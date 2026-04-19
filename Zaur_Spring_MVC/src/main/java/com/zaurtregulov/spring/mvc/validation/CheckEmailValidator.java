package com.zaurtregulov.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String endOfEmail;

    //Метод initialize используется для получения параметров аннотации, переданных с использованием элемента value.
    // В этом конкретном случае переменной endOfEmail присваивается значение элемента value аннотации.
    @Override
    public void initialize(CheckEmail constraintAnnotation) {
//        ConstraintValidator.super.initialize(constraintAnnotation);
        endOfEmail = constraintAnnotation.value();
    }

    //Метод isValid выполняет основную проверку данных. В этом примере мы проверяем, заканчивается ли введенный
    // пользователем электронный адрес строкой, указанной в переменной endOfEmail. Если электронный адрес заканчивается
    // этой строкой, то метод isValid возвращает true, иначе - false. Это определяет, будет ли значение прошедшим
    // валидацию или нет. В случае false система валидации выдаст ошибку.
    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfEmail); //endsWith -> Class String
    } //CheckEmail аннотация применяемая к полям типа String
}
