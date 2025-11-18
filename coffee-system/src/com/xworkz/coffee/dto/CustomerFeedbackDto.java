package com.xworkz.coffee.dto;

import java.io.Serializable;
import java.util.Objects;

public class CustomerFeedbackDto implements Serializable,Comparable<String> {
    private String name;
    private String email;
    private String comments;
    private Double rating;

    public CustomerFeedbackDto() {

    }

    public CustomerFeedbackDto(String name, String email, String comments, Double rating) {
        this.name = name;
        this.email = email;
        this.comments = comments;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerFeedbackDto that = (CustomerFeedbackDto) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(comments, that.comments) && Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, comments, rating);
    }

    @Override
    public String toString() {
        return "CustomerFeedbackDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", comments='" + comments + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
