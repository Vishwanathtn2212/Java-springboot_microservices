package com.vishy.rest.webservices.restfulwebservices.post;

public class Post {

    private Integer id;

    private Integer user_id;

    private String title;

    private String description;

    protected Post(){

    }

    public Post(Integer id, Integer user_id, String title, String description) {
        super();
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", title='" + title + '\'' +
                ", description=" + description +
                '}';
    }
}
