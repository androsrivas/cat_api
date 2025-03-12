package com.inserta.cat_api.entity;

public class Gato extends Animal {
    private String raza;
    private byte edad;
    private String origen;
    private String temperamento;

    // Constructor por defecto
    public Gato() {
        super();
    }

    // Constructor con todos los atributos
    public Gato(String especie, char tipoAlimentacion, String raza, byte edad, String origen, String temperamento) {
        super(especie, tipoAlimentacion);
        this.raza = raza;
        this.edad = edad;
        this.origen = origen;
        this.temperamento = temperamento;
    }

    // Getters y setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Gato{" +
                "especie='" + getEspecie() + '\'' +
                ", tipoAlimentacion=" + getTipoAlimentacion() +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", origen='" + origen + '\'' +
                ", temperamento='" + temperamento + '\'' +
                '}';
    }

    // Método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gato gato = (Gato) o;
        return edad == gato.edad &&
                raza.equals(gato.raza) &&
                origen.equals(gato.origen) &&
                temperamento.equals(gato.temperamento);
    }

    // Método hashCode()
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + raza.hashCode();
        result = 31 * result + (int) edad;
        result = 31 * result + origen.hashCode();
        result = 31 * result + temperamento.hashCode();
        return result;
    }
}