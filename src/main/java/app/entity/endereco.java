
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import cronapi.database.UUIDConverter;


/**
* Classe que representa a tabela ENDERECO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ENDERECO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.endereco")
@Converter(
  name="uuid",
  converterClass=UUIDConverter.class
)
public class endereco implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "Logradouro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String Logradouro;


    /**
    * @generated
    */
    @Column(name = "Bairro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String Bairro;


    /**
    * @generated
    */
    @Column(name = "UF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String UF;


    /**
    * @generated
    */
    @Convert("uuid")
    @Column(name = "ColaboradorId", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String ColaboradorId;


    /**
    * Construtor
    * @generated
    */
    public endereco(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public endereco setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém Logradouro
    * return Logradouro
    * @generated
    */
    public java.lang.String getLogradouro() {
        return this.Logradouro;
    }

    /**
    * Define Logradouro
    * @param Logradouro Logradouro
    * @generated
    */
    public endereco setLogradouro(java.lang.String Logradouro) {
        this.Logradouro = Logradouro;
        return this;
    }
    /**
    * Obtém Bairro
    * return Bairro
    * @generated
    */
    public java.lang.String getBairro() {
        return this.Bairro;
    }

    /**
    * Define Bairro
    * @param Bairro Bairro
    * @generated
    */
    public endereco setBairro(java.lang.String Bairro) {
        this.Bairro = Bairro;
        return this;
    }
    /**
    * Obtém UF
    * return UF
    * @generated
    */
    public java.lang.String getUF() {
        return this.UF;
    }

    /**
    * Define UF
    * @param UF UF
    * @generated
    */
    public endereco setUF(java.lang.String UF) {
        this.UF = UF;
        return this;
    }
    /**
    * Obtém ColaboradorId
    * return ColaboradorId
    * @generated
    */
    public java.lang.String getColaboradorId() {
        return this.ColaboradorId;
    }

    /**
    * Define ColaboradorId
    * @param ColaboradorId ColaboradorId
    * @generated
    */
    public endereco setColaboradorId(java.lang.String ColaboradorId) {
        this.ColaboradorId = ColaboradorId;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
endereco object = (endereco)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}