package ru.maxima.project1.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.maxima.project1.dao.PersonDAO;
import ru.maxima.project1.entity.Person;

/**
 * @author AramaJava 31.07.2023
 */

@Component
public class PersonValidator implements Validator {

    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object o, Errors errors) {

        Person person = (Person) o;

        if (personDAO.getPersonByFullName(person.getFullname()).isPresent())
            errors.rejectValue("fullName","" , "Человек с таким ФИО уже существует");
    }

}
