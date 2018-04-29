/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.ListaRectangulo;
import aplicacion.modelo.Rectangulo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class RectanguloFormBean implements Serializable {
    private Rectangulo unRectangulo;
    private ListaRectangulo listaRectangulo;
    private double A;
    private double B;
    
    /**
     * Creates a new instance of RectanguloFormBean
     */
    public RectanguloFormBean() {
        unRectangulo = new Rectangulo();
        
    }
    public void guardarRectangulo(){
        unRectangulo = new Rectangulo(getA(),getB(),2*getA()+2*getB(),getA()*getB());
        getListaRectangulo().getListadoRectangulo().add(getUnRectangulo());
    }

    /**
     * @return the unRectangulo
     */
    public Rectangulo getUnRectangulo() {
        return unRectangulo;
    }

    /**
     * @param unRectangulo the unRectangulo to set
     */
    public void setUnRectangulo(Rectangulo unRectangulo) {
        this.unRectangulo = unRectangulo;
    }

    /**
     * @return the listaRectangulo
     */
    public ListaRectangulo getListaRectangulo() {
        return listaRectangulo;
    }

    /**
     * @param listaRectangulo the listaRectangulo to set
     */
    public void setListaRectangulo(ListaRectangulo listaRectangulo) {
        this.listaRectangulo = listaRectangulo;
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
    
}
