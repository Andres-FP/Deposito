package cuentas;

/**
* Esta clase representa unha conta corrente.
* 
* @version 1.0, 13/03/22
* @author Andrés Rey Villar 
*  
*/
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    

    /**
     * Constructór da clase CCuenta
     * Crea un obxecto CCuenta sen inicializar
     */
    public CCuenta()
    {
    }
    
     /**
     * Segundo constructór da clase CCuenta
     * Crea un obxecto CCuenta e inicializa as variables nombre,cuenta, saldo e tipoInterés.
     * @param nom, nome do titular da conta
     * @param cue, número de conta 
     * @param sal, saldo da conta
     * @param tipo, tipo de conta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Realiza unha chamada á función getSaldo() e devolve o resultado
     * @return resultado de getSaldo()
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Recibe unha cantidade e realiza o ingreso sumando dita cantidade o saldo actual
     * Revisa previamente se a caantidade a ingresar é válida e lanza unha excepción no caso de non selo
     * @param cantidad, cantidade a ingresar
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Recibe como parámetro a cantidade que desexamos sustraer do saldo actual
     * comproba se a cantidade válida e se o saldo actual é suficiente para realizar a operacion.
     * Lanza unha excepcion se algun dos requisitos non se cumple
     * @param cantidad, cantidade a retirar
     * @throws Exception 
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
     * Devolve o contido da variable privada nombre que contén o nome do titular da conta
     * @return nombre, o nome de titular da conta do actual obxeto CCuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar o contido da variable privada nombre 
     * @param nombre, O nome que queremos establecer como titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devolve o contido da variable privada cuenta
     * @return, o número de conta do actual obxeto CCuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para modificar o contido da variable privada cuenta 
     * @param cuenta, número de conta que queremos establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devolve o contido da variable privada saldo
     * @return, o saldo do actual obxeto CCuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para modificar o contido da variable privada saldo 
     * @param saldo, cantidade que queremos establecer como saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devolve o contido da variable privada tipoInterés
     * @return, o tipo de interese do actual obxeto CCuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para modificar o contido da variable privada tipoInterés 
     * @param tipoInterés, o cvalor do tipo de interes que queremos
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
