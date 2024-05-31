
package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Verify {
    
    public boolean verificaComent(String semEspaco){
        return semEspaco.indexOf("&#47  &#42") > 0;
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
     public static boolean verificaNumeroLetra(String str) {
        String regex = "^\\d+[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    public  boolean verificaCaracter(String str) {
        String regex = "[^a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
    public static boolean verificaNumerico(String str) {
        String regex = "^\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    public String compilar(String codigo, KeyWords[] keywords, List<String> palavrasChaves){
    String tokensFinal = codigo;
    while (verificaComent(tokensFinal)) {
        int InicComent = tokensFinal.indexOf("&#47  &#42");
        int FimComent = tokensFinal.indexOf("&#42  &#47");
        if (InicComent >= 0 && FimComent > InicComent) {
            tokensFinal = tokensFinal.substring(0, InicComent) + tokensFinal.substring(FimComent +10);
        } else {
            return "<html><pre><font color='red'>ERROR: comentário não finalizado.</font></pre></html>";    
        }
    }
    StringBuilder tokensAux = new StringBuilder();
    System.out.println(tokensFinal);
           String[] palavras =  (tokensFinal.replaceAll("\\s+", " ").trim()).split(" ");            
            for(String palavra: palavras){               
                for(KeyWords kw : keywords){                                 
                    if(palavra.equals(kw.getLexema())){
                        tokensAux.append("<font color='");
                        tokensAux.append(kw.getHtml());
                        tokensAux.append("'>");                      
                        tokensAux.append(kw.getNome());
                        tokensAux.append("   &rarr   ");   
                        tokensAux.append(kw.getLexema());
                        tokensAux.append("</font>");                         
                        tokensAux.append("\n");
                    }
                    
                    else if(!Character.isDigit(palavra.charAt(0)) && !verificaCaracter(palavra)&& 
                        !palavrasChaves.contains(palavra)){
                        tokensAux.append("|    VARIAVEL   |");
                        tokensAux.append("   &rarr   "); 
                        tokensAux.append(palavra);
                        tokensAux.append("\n");
                        break;
                    }
                    else if(Character.isDigit(palavra.charAt(0)) && verificaNumeroLetra(palavra)&& 
                        !palavrasChaves.contains(palavra)){
                        return "<html><pre><font color='red'>ERROR: Variável "+ palavra + " começa com numérico.</font></pre></html>";

                    }
                    else if(verificaNumerico(palavra)&& 
                        !palavrasChaves.contains(palavra)){
                        tokensAux.append("|     VALOR     |");
                        tokensAux.append("   &rarr   "); 
                        tokensAux.append(palavra);
                        tokensAux.append("\n");
                        break;
                    }
                }                      
            }
    return "<html><pre>"+ tokensAux+"</pre></html>";
    }
    public String ColoreComentario(String codigo, KeyWords[] keywords){
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
