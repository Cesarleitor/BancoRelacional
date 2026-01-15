package modelo.heranca;


import javax.persistence.*;

@Entity
// TABLE_PER_CLASS: Cada classe concreta gera sua própria tabela contendo todos os campos herdados.
// Vantagem: consultas diretas sem JOINs em subclasses.
// Desvantagem: duplicação de dados e consultas polimórficas exigem UNION.

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS )


// SINGLE_TABLE: Armazena toda a hierarquia em uma única tabela, com colunas nullable para atributos das subclasses.
// Vantagem: melhor performance em consultas e modelo simples.
// Desvantagem: baixa normalização e muitos campos nulos.

/*@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")*/


// JOINED: Cada classe da hierarquia gera sua própria tabela, relacionadas por chave primária (JOIN na superclasse).
// Vantagem: modelo mais normalizado, sem campos nulos.
// Desvantagem: consultas mais lentas devido aos JOINs.

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")


public class Aluno {
     @Id
    private Long matricula;

     private String nome;

     public Aluno() {

     }

    public Aluno(Long matricula, String nome) {
         super();
         this.matricula = matricula;
         this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
