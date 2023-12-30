package com.example.WebApi.dao.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "article", schema = "db")
public class ArticleEntity {
    @Id
    @JsonProperty("id")
    private Integer ID;
    @JsonProperty("title")
    private String TITLE;
    @JsonProperty("content")
    private String CONTENT;
    @JsonProperty("imgurl")
    private String IMGURL;
}
