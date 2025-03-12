package com.inserta.cat_api.entity;

public abstract class Animal {
    private String especie;
    private char alimentacion;

    public Animal() {
    }

    public Animal(String especie, char alimentacion) {
        this.especie = especie;
        this.alimentacion = alimentacion;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public char getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(char alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", alimentación=" + alimentacion +
                '}';
    }
}
