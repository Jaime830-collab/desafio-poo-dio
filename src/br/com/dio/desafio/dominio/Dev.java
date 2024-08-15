package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> consteudosInscritos = new LinkedHashSet<Conteudo>();
    private Set<Conteudo> consteudosConcluidos = new LinkedHashSet<Conteudo>();

    public void inscreverBootcamo(Bootcamp bootcamp) {
        this.consteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo =  this.consteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.consteudosConcluidos.add(conteudo.get()); 
            this.consteudosInscritos.remove(conteudo.get());
        }else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        return this.consteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConsteudosInscritos() {
        return consteudosInscritos;
    }

    public void setConsteudosInscritos(Set<Conteudo> consteudosInscritos) {
        this.consteudosInscritos = consteudosInscritos;
    }

    public Set<Conteudo> getConsteudosConcluidos() {
        return consteudosConcluidos;
    }

    public void setConsteudosConcluidos(Set<Conteudo> consteudosConcluidos) {
        this.consteudosConcluidos = consteudosConcluidos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, consteudosInscritos, consteudosConcluidos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
            
        if (o == null || getClass() != o.getClass())  return false;
        
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(consteudosInscritos, dev.consteudosInscritos) && Objects.equals(consteudosConcluidos, dev.consteudosConcluidos);
    }
    
}
