
package Entidades;

/**
 *
 * @author 823217536
 */
public class Maquina {
    private int estado;
    private int saldo;

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
    
    
    
    
}
