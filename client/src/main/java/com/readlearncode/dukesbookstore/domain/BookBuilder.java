package com.readlearncode.dukesbookstore.domain;

import java.util.ArrayList;
import java.util.List;

public class BookBuilder {
    private String id;
    private String title;
    private String description;
    private Float price;
    private String published;
    private List<String> authors = new ArrayList<>();
    private String imageFileName;
    private String link;

    public BookBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public BookBuilder setPrice(Float price) {
        this.price = price;
        return this;
    }

    public BookBuilder setPublished(String published) {
        this.published = published;
        return this;
    }

    public BookBuilder setAuthors(List<String> authors) {
        this.authors.addAll(authors);
        return this;
    }

    public BookBuilder addAuthor(String author) {
        this.authors.add(author);
        return this;
    }

    public BookBuilder setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
        return this;
    }

    public BookBuilder setLink(String link) {
        this.link = link;
        return this;
    }

    public Book createBook() {
        return new Book(id, title, description, price, published, authors, imageFileName, link);
    }
}