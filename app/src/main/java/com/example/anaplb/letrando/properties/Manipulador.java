package com.example.anaplb.letrando.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Manipulador {
    String nome;
    String img;
    String caminho;

    public Manipulador(String caminnho) {
        this.caminho = caminho;
    }

    public void setNome(int code, Properties props) {
        String key = "nome"+code;
        this.nome = props.getProperty(key);
    }

    public void setImg(int code, Properties props) {
        String key = "img"+code;
        this.img = props.getProperty(key);
    }

    public String getNome() {
        return nome;
    }

    public String getImg() {
        return img;
    }

    public Properties getProp() throws IOException {
        Properties prop = new Properties();
        FileInputStream files = new FileInputStream(this.caminho);

        prop.load(files);

        return prop;
    }

    public void setandoAtributos(int code) throws IOException{
        Properties props = getProp();
        setNome(code, props);
        setImg(code, props);
    }
}
