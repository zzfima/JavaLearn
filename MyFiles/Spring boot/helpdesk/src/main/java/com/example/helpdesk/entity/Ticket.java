package com.example.helpdesk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue
    private int id;

    /**
     * Краткое описание проблемы
     */
    @Column(nullable = false)
    private String issue;

    /**
     * Подробное описание проблемы
     */
    @Column(columnDefinition = "TEXT")
    private String issueDetails;

    /**
     * Дата создания
     */
    @Column(nullable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreated;
}