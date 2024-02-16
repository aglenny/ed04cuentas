package Cuentas;

public class CCuenta {

    /**
     * Atributs de la classe CCuenta.
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor buid de la classe CCuenta.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCuenta.
     * @param nom El nom del titular del compte.
     * @param cue El numero del compte.
     * @param sal Saldo inicial del compte.
     * @param tipo El tipus.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Mètode per obtenir l'estat/saldo del compte.
     * @return El saldo del compte.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Mètode per ingressar una quantitat al compte.
     * @param cantidad La quantitat a ingressar.
     * @throws Exception Si cantidad < 0.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Mètode per retirar una quantitat del compte.
     * @param cantidad La quantitat a retirar.
     * @throws Exception Si hi ha errors.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Mètode per obtenir el nom del titular del compte.
     * @return El nom del titular del compte.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Mètode per establir el nom del titular del compte.
     * @param nombre El nou nom del titular del compte.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Mètode per obtenir el número del compte.
     * @return El número del compte.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Mètode per establir el número del compte.
     * @param cuenta El nou número del compte.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Mètode per obtenir el saldo del compte.
     * @return El saldo del compte.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Mètode per establir el saldo del compte.
     * @param saldo El nou saldo del compte.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Mètode per obtenir el tipus d'interès del compte.
     * @return El tipus d'interès del compte.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Mètode per definir el tipus d'interès del compte.
     * @param tipoInterés nou tipus d'interès del compte.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
