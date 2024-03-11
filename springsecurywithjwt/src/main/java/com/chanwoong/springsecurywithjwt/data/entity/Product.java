package com.chanwoong.springsecurywithjwt.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity     // 엔티티 클래스임을 명시
@Table(name = "product")        // 테이블 명을 클래스 이름과 다르게 지정을 원하는 경우 사용
public class Product {
    @Id     // PK 명시
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // PK와 같이 사용되며 PK 값 생성을 명시한다. MySQL은 IDENTITY 방식사용
    private Long number;

    @Column(nullable = false)       // 필드 값이 자동으로 컬럼으로 매칭되지만 옵션을 주고 싶은 경우에 Column 어노테이션 사용
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    @Transient      // DB에 반영하지 않을 때, 사용하는 어노테이션
    private String notColumn;

    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
}
