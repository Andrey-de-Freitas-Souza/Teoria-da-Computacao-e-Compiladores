
package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Verify {
    
    public boolean verificaComent(String semEspaco){
        return semEspaco.indexOf("&#47&#42") > 0;
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

    public  boolean verificaCaracter(String str) {
        String regex = "[^a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
    public String iniciaCompilador(String codigo, KeyWords[] keywords){
    System.out.println(codigo);
    String tokensFinal = codigo;
    while (verificaComent(tokensFinal)) {
        int InicComent = tokensFinal.indexOf("&#47&#42");
        int FimComent = tokensFinal.indexOf("&#42&#47");
        if (InicComent >= 0 && FimComent > InicComent) {
            tokensFinal = tokensFinal.substring(0, InicComent) + tokensFinal.substring(FimComent + 2);
        } else {
            return "<font color='red'>ERROR: comentário não finalizado";    
             // Para evitar loop infinito se a sintaxe do comentário estiver incorreta
        }
    }
    return tokensFinal;
    }
    
    
    
}
