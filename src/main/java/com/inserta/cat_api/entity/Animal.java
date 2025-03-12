package com.inserta.cat_api.entity;

public abstract class Animal {
    private String especie;
    private char alimento;

    public Animal() {
    }

    public Animal(String especie, char alimento) {
        this.especie = especie;
        this.alimento = alimento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public char getAlimento() {
        return alimento;
    }

    public void setAlimento(char alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", alimento=" + alimento +
                '}';
    }
}
