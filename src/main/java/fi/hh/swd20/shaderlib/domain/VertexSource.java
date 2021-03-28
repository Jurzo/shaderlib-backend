package fi.hh.swd20.shaderlib.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class VertexSource {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String source;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vSource")
    private List<Shader> shaders;


    public VertexSource() {
        this.source = "";
    }

    public VertexSource(String source) {
        this.source = source;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Shader> getShaders() {
        return shaders;
    }

    public void setShaders(List<Shader> shaders) {
        this.shaders = shaders;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return this.id + "\n" + this.source;
    }

}