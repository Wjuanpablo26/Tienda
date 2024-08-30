package co.edu.uniquindio.poo.model;

public enum Tipo {
    REFRIGERADO(0.10),
    PERECEDERO(0.15),
    NOPERECEDERERO(0.5);

    private double incremento;
    

    /*
     * Constructor de la clase Tipo
     */
    private Tipo(double incremento){
        this.incremento = incremento;
    }

    /*
     * Metodo get
     */

    public double getIncremento(){
        return incremento;
    }
}
