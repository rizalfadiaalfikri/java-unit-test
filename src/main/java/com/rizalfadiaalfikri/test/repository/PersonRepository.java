package com.rizalfadiaalfikri.test.repository;

import com.rizalfadiaalfikri.test.data.Person;

public interface PersonRepository {
    Person selectById(String id);
}
