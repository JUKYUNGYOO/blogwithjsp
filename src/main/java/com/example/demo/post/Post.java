package com.example.demo.post;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue
    int id;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false) // 위에 스샷찍고 보니 DB에 널 가능하기에. 이침에 수정하였다!
     String title;

    @Size(max = 255)
    String subtitle;

    @NotNull
    @Size(min = 1, max = 100000000)
    @Column(length = 100000000, nullable = false) // 여기도 nullable = false 추가!
    String content;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    LocalDateTime regDate;

}
