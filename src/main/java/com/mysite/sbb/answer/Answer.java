package com.mysite.sbb.answer;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.mysite.sbb.question.Question;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //답변 내용, 날짜, 질문?
    @Column(columnDefinition = "TEXT")
    private String content;

    @CreatedDate
    private LocalDateTime createDate;

    @ManyToOne // 한개의 질문에 여러개의 답변이 달릴 수 있어
    private Question question;
}