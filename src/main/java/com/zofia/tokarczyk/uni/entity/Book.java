package com.zofia.tokarczyk.uni.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull(message = "is required")
    @Size(min = 3, message = "min 3 characters")
    @Column(name = "title")
    private String title;

    @Column(name = "cover")
    @NotNull(message = "is required")
    @Size(min = 3, message = "min 10 characters")
    private String cover;

    @Column(name = "description")
    @NotNull(message = "is required")
    @Size(min = 3, message = "min 10 characters")
    @Size(max = 100, message = "max 250 characters")
    private String description;

    @Column(name = "release_date")
    @NotNull(message = "is required")
    private String releaseDate;

    public Book() {
    }

    public Book(String title, String cover, String description, String releaseDate) {
        this.title = title;
        this.cover = cover;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cover='" + cover + '\'' +
                ", description='" + description + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
