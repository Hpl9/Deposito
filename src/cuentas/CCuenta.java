/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * Clase CCuenta la cual se ha creado para manejar objetos que sean tipo cuenta
 * Las variables que manejamos son : Nombre titular, nº cuenta, saldo ytipo interes
 * @author Javier
 */
public class CCuenta {

    /** 
     * Metodo para obtener nombre titular
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar datos de nombre titular
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el nºcuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo para modificar datos de nº de cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** 
     * Metodo para obtener el saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo para modificar datos de Saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** 
     * Metodo para obtener el tipo de interes
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Metodo para modificar datos de tipo de interes
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Atributos del objeto 
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * constructor de la clase CCuenta sin Parametros a introducir 
 */
    public CCuenta() {
    }

    /**
     * Constructores de la clase CCuenta
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
/**
 * Metodo para obtener getSaldo
 * @return 
 */
    public double estado() {
        return getSaldo();
    }

    /**
     * Metodo para ingresar dinero en la cuenta. Recoge el saldo actual y le suma la variable cantidad.
     * Si la cantidad es negativa salta a la excepcion.
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para retirar cantidad. Ajusta la cantidad / coge getSaldo y le resta la cantidad a retirar
     * Si la cantidad es negativa o superior, salta error excepcion
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

}
