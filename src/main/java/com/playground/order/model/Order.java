package com.playground.order.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Data
@Table(schema = "order_management", name = "order")
@Entity
public class Order {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Type(type = "pg-uuid")
    private UUID id;

    /**
     * Postgresql enum what are the advantages and disadvantages?
     * <p>
     * https://stackoverflow.com/questions/2318123/postgresql-enum-what-are-the-advantages-and-disadvantages
     */
    @Type(type = "pgsql-enum")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    //// AUTO-GENERATED

    @CreatedDate
    @Column(name = "created_at")
    private Instant createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt;

    @CreatedBy
    @Column(name = "created_by")
    private UUID createdBy;

    @LastModifiedBy
    @Column(name = "updated_by")
    private UUID updatedBy;
}
