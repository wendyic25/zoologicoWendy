package org.example;

public class Familia {

    Animal papa;
    Animal mama;
    Animal hijo;

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    public void imprimirFamilia() {
        String[]roles={"papá", "mamá", "hijo"};
        for (String rol : roles) {
            System.out.println("El " + rol + " es: " + obtenerNombre(rol));
        }
    }

    private String obtenerNombre(String rol) {
        switch (rol) {
            case "papá":
                return this.papa.nombre;
            case "mamá":
                return this.mama.nombre;
            case "hijo":
                return this.hijo.nombre;
            default:
                return "";
        }
    }

    public boolean tenerHijo(String nombre) {
        if (this.papa.pareja != null) {
            Animal hijo = new Animal(nombre, 1);
            double random = Math.random();
            if (random < 0.5) {
                hijo.genero = "F";
            } else {
                hijo.genero = "M";
            }
            this.hijo = hijo;
            return true;
        } else {
            System.out.println("vuelva a intentar tener el hijo");
            return false;
        }
    }
}