package com.marcellk.videoshare.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private LocalDateTime postTime;

    @ManyToOne
    private User user;

    @ManyToOne
    private Video video;

}
