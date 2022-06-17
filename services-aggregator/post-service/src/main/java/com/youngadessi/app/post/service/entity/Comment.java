package com.youngadessi.app.post.service.entity;

import com.example.common.sql.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tbl_comment")
@Getter
@Setter
public class Comment extends BaseEntity {

    @Column(name = "comment_text")
    private String commentText;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

}