package com.peachstateeruro.peachstateeuro.gallery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Image {
    @Id
    private Long Id;
    private String url;
    private String publicId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    @Override
    public String toString() {
        return "Image{" +
                "Id=" + Id +
                ", url='" + url + '\'' +
                ", publicId='" + publicId + '\'' +
                '}';
    }
}
