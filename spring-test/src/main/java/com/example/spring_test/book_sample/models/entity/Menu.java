package com.example.spring_test.book_sample.models.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Builder;

// @NoArgsConstructor(access = AccessLevel.PROTECTED) 
// @AllArgsConstructor
@Builder
@Getter
// @Entity
// @Table(name="menu")
public class Menu {
    private int id;

    private int level;

    private String menuName;

    private String path;

    private int parentMenuId;
}
