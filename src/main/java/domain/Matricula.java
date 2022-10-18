package domain;

import converter.InstantConverter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "OGM_TB_MATRICULA")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;
    @Convert(converter = InstantConverter.class)
    @Column(name = "DATA_MATRICULA", nullable = false)
    private Instant dataMatricula;
    @Column(name = "VALOR", nullable = false)
    private Double valor;
    @Column(name = "STATUS", nullable = false)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Instant getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Instant dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
