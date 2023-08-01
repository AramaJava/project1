package ru.maxima.project1.util;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import jakarta.validation.executable.ExecutableValidator;
import jakarta.validation.metadata.BeanDescriptor;
import org.springframework.stereotype.Component;


import java.util.Set;

/**
 * @author AramaJava 31.07.2023
 */

@Component
public class PersonValidator implements Validator {

/*
    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public void validate(Object o, Errors errors) {

        Person person = (Person) o;

        if (personDAO.getPersonByFullName(person.getFullName()).isPresent())
            errors.rejectValue("fullName, "", "Человек с таким ФИО уже существует")ж
    }
*/

    @Override
    public <T> Set<ConstraintViolation<T>> validate(T t, Class<?>... classes) {
        return null;
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validateProperty(T t, String s, Class<?>... classes) {
        return null;
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validateValue(Class<T> aClass, String s, Object o, Class<?>... classes) {
        return null;
    }

    @Override
    public BeanDescriptor getConstraintsForClass(Class<?> aClass) {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> aClass) {
        return null;
    }

    @Override
    public ExecutableValidator forExecutables() {
        return null;
    }
}
