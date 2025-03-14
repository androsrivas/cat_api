package com.inserta.cat_api.entity;



public class Gato extends Animal {
    private Humano human;
    private int id;
    private String raza;
    private byte edad;
    private String origen;
    private String temperamento;
    
    

    // Constructor por defecto
    public Gato() {
        super();
    }

    // Constructor con todos los atributos menos Humano
    public Gato(int id, String especie, char alimentacion, String raza, byte edad, String origen, String temperamento) {
        super(especie, alimentacion );
        this.id = id;
        this.raza = raza;
        this.edad = edad;
        this.origen = origen;
        this.temperamento = temperamento;
    }

    // Constructor con todos los atributos  
    public Gato(Humano human, int id, String especie, char alimentacion, String raza, byte edad, String origen, String temperamento) {
        super(especie, alimentacion );
        this.human = human;
        this.id = id;
        this.raza = raza;
        this.edad = edad;
        this.origen = origen;
        this.temperamento = temperamento;
    }
    @Override
    public String comer(){
        return "Soy un Gato comiendo";
    }
    public String dormir(){
        return "Soy un Gato dormiendo";
    }
    public String pasear(){
        return "Soy un Gato paseando";
    }

    // Getters y setters
    public void setHumano(Humano human){
        this.human  = human;
    }
    public Humano getHumano(){
        return this.human;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        Humano h = (this.human != null)?this.human:new Humano(0,"Sin dueño", (byte)0," ");
        return "Gato{" +
                "Humano= '" +  h + '\'' +
                ",id= '" + id + '\'' +
                "especie='" + getEspecie() + '\'' +
                ", Alimentación='" + getAlimentacion() + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad + '\'' +
                ", origen='" + origen + '\'' +
                ", temperamento='" + temperamento + '\'' +
                
                '}';
    }

    // Metodo equals()
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

    // Metodo hashCode()
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