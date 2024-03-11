package com.chanwoong.springsecurywithjwt.data.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductResponseDto {
    private Long number;
    private String name;
    private int price;
    private int stock;
}
