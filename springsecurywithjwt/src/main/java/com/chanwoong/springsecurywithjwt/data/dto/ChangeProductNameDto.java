package com.chanwoong.springsecurywithjwt.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChangeProductNameDto {
    private Long number;
    private String name;
}
