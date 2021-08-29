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
public class TicketComment {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue
    private int id;

    /**
     * Текст комментария
     */
    @Column(columnDefinition = "TEXT")
    private String comment;

    /**
     * Дата создания
     */
    @Column(nullable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreated;

    /**
     * Ссылка на заявку
     */
    @ManyToOne
    private Ticket ticket;
}
