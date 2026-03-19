
package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeFantasia;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
