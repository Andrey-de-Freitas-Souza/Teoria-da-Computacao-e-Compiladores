
package Entidades;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Verify {
    
    public boolean verificaComent(String semEspaco){
        return semEspaco.indexOf("/*") > 0;
    }
    public List<String> variaveis(String apenasVar){
    String[] palavras =  (apenasVar.replaceAll("\\s+", " ").trim()).split(" ");
    List<String> ListaVar = new ArrayList<>();
    for(String palavra : palavras){
         if (!palavra.isEmpty()) {
                ListaVar.add(palavra);
            }
    }
    ListaVar.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
    return ListaVar;
      
    }
    public String iniciaCompilador(String codigo, KeyWords[] keywords){
        System.out.println(codigo);
    String tokensFinal = codigo;
    
    // Removendo comentários
    while (verificaComent(tokensFinal)) {
        int InicComent = tokensFinal.indexOf("/*");
        int FimComent = tokensFinal.indexOf("*/");
        if (InicComent >= 0 && FimComent > InicComent) {
            tokensFinal = tokensFinal.substring(0, InicComent) + tokensFinal.substring(FimComent + 2);
        } else {
            return "<font color='red'>ERROR: comentário não finalizado";    
             // Para evitar loop infinito se a sintaxe do comentário estiver incorreta
        }
    }

    // Copiando tokensFinal para apenasVar antes de qualquer modificação
    String apenasVar = tokensFinal;

    // Removendo palavras-chave da variável apenasVar
    for (KeyWords kw : keywords) {
        apenasVar = apenasVar.replaceAll(kw.getLexema(), " ");
    }

    // Substituindo palavras-chave na variável tokensFinal
    for (KeyWords kw : keywords) {
        tokensFinal = tokensFinal.replaceAll(kw.getLexema(), "\n" + kw.getNome());
    }
    List<String> ListaVar = variaveis(apenasVar);
    for(String variavel : ListaVar){
        if(!Character.isDigit(variavel.charAt(0))){
            tokensFinal = tokensFinal.replaceAll(variavel, "\n|VARIAVEL| ");
        }
        else{
            //JOptionPane.showMessageDialog(null, "Variável "+variavel+" começa com número");
            return "<font color='red'>ERROR: variável " + variavel + " começa com numérico.</font>" ;
        }
    }  
    tokensFinal = (tokensFinal.replaceAll("\\s+", "")).replace("||", "|\n|");
    return tokensFinal;
    }
    public String compilar(){
        return "";
    }
    
    
}
