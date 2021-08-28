package com.marcellk.videoshare.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String videoUrl;
    private String title;
    private String description;
    private LocalDateTime uploadTime;
    private Integer views;
    private Integer numberOfLike;
    private Integer numberOfDislikes;

    @ManyToMany
    @JoinTable(name = "video_playlist",
    joinColumns = @JoinColumn(name = "video_id"),
    inverseJoinColumns = @JoinColumn(name = "playlist_id"))
    private List<Playlist> playlists = new ArrayList<>();

    @OneToOne
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "video")
    private List<Comment> comments = new ArrayList<>();
}
