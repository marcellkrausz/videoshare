package com.marcellk.videoshare.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToMany(mappedBy = "playlists")
    private List<Video> videos = new ArrayList<>();
}
