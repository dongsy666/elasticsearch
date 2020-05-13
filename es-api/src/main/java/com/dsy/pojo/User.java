package com.dsy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

/**
 * @author trueway
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
public class User {
    private String name;
    private int age;
}
