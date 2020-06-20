package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//  Adding Custom method - apart from CrudReposiory basic methods

/* Using the Query Annotation
* IN BELOW QUERY< USED THE MODEL NAME - USER &b MODEL PROPERTTY NAME WHICH IS lastName
*/
 
@Query("SELECT u FROM User u WHERE LOWER(u.lastName) = LOWER(:lastName)")
//@Query("FROM User WHERE lastName = ?1")
List<User> findByLastNameIgnoreCase(String lastName);

// Below using Create Query Method - Not Query Annotation - Generate query using key words
List<User> findByFirstNameAndLastNameIgnoreCase(String firstName,String lastName );

// Below using Create Query Method - Not Query Annotation - Generate query using key words
List<User> findByFirstNameIgnoreCase(String firstName);

}