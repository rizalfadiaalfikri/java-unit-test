package com.rizalfadiaalfikri.test.service;

import com.rizalfadiaalfikri.test.data.Person;
import com.rizalfadiaalfikri.test.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;
    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           personService.get("Not Found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        // menambah behavior ke mock object
        Mockito.when(personRepository.selectById("Rizal"))
                .thenReturn(new Person("rizal","Rizal"));

        var person = personService.get("Rizal");

        Assertions.assertNotNull(person);
    }
}
