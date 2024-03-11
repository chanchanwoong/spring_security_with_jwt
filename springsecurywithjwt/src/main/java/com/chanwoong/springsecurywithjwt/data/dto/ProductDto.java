package com.chanwoong.springsecurywithjwt.data.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class ProductDto {
    private String name;
    private int price;
    private int stock;
}
