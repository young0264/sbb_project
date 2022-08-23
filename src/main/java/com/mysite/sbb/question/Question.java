package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import com.mysite.sbb.answer.Answer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import static javax.persistence.CascadeType.*;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //질문 주제, 내용, 질문날
    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = REMOVE)
    private List<Answer> answerList;
}