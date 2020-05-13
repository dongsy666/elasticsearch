package com.dsy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

/**
 * @author trueway
 */
@Configuration
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Content {
    private  String title;
    private  String img;
    private  String price;
}
