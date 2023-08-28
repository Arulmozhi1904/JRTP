package com.skillssearch.demo.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection ="jobpost")
    public class Post {
        private String profile;
        private String desc;
        private int exp;
        private String techs[];
    }
