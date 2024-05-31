
package Entidades;

/**
 *
 * @author 823217536
 */
public class Maquina {
    private int estado;
    private int saldo;
    private int doce;
    private int TipoDoce;

    public int getEstado() {
        return estado;
    }

    public Maquina(int estado, int saldo) {
        this.estado = estado;
        this.saldo = saldo;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void somar(int valor){
        this.saldo += valor;
        
    }
    public void MudaEstado(int valor){
        this.estado += valor;
        
    }
    public int troco(int saldo, int valor){        
        int troco = saldo - valor;        
        return troco;      
    }

    public int getDoce() {
        return doce;
    }

    public void setDoce(int doce) {
        this.doce = doce;
    }

    public int getTipoDoce() {
        return TipoDoce;
    }

    public void setTipoDoce(int TipoDoce) {
        this.TipoDoce = TipoDoce;
    }
    
    
    
}
