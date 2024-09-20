package com.api.receitas.model;

import java.util.List;

public class Receita {
  private Long id;
  private String nome;
  private List<String> ingredientes;
  private String instrucoes;

  // Getters and setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<String> getIngredientes() {
    return ingredientes;
  }

  public void setIngredientes(List<String> ingredientes) {
    this.ingredientes = ingredientes;
  }

  public String getInstrucoes() {
    return instrucoes;
  }
  
  public void setInstrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
  }
}
