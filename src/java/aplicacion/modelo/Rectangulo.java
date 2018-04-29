/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Rectangulo implements Serializable {
    private double A;
    private double B;
    private double Per;
    private double Sup;
    //el objeto se hace bits con serializable
    //primefaces.org
    public Rectangulo() {
        
    }

    public Rectangulo(double A, double B, double Per, double Sup) {
        this.A = A;
        this.B = B;
        this.Per = Per;
        this.Sup = Sup;
        
    }
    
    public void calcularPerimetro(){
        setPer(2*getA() + 2*getB()); 
    }

    public void calcularSuperficie(){
        setSup(getA()*getB());
    }
    /**
     * @return the A
     */
    public double getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(double A) {
        this.A = A;
    }

    /**
     * @return the B
     */
    public double getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(double B) {
        this.B = B;
    }

    /**
     * @return the Per
     */
    public double getPer() {
        return Per;
    }

    /**
     * @param Per the Per to set
     */
    public void setPer(double Per) {
        this.Per = Per;
    }

    /**
     * @return the Sup
     */
    public double getSup() {
        return Sup;
    }

    /**
     * @param Sup the Sup to set
     */
    public void setSup(double Sup) {
        this.Sup = Sup;
    }
    
    
    
    
}
