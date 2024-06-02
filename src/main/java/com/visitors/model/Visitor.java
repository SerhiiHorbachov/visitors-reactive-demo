package com.visitors.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Visitor {
    private Integer id;
    private String firstName;
    private String lastName;
}
