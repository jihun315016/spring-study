package com.example.spring_test.book_sample.models.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Builder
@Getter
// @NoArgsConstructor(access = AccessLevel.PROTECTED) 
// @AllArgsConstructor
// @Entity
// @Table(name="user")
public class User {
    private String id;

    private String password;

    private String name;

    private String role;
}
