
package Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verify {
    
     public static boolean verificaVariavel(String str) {
        String regex = "^[a-zA-Z][a-zA-Z0-9]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    public  static boolean verificaCaracter(String str) {
        String regex = "[^a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
    public static boolean verificaNumerico(String str) {
        String regex = "^\\d+(\\.\\d+)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    
    public String compilar(String codigo, KeyWords[] keywords, List<String> palavrasChaves){  
    String[] arrayDePalavras =  (codigo.replaceAll("\\s+", " ").trim()).split(" ");  
    List<String> palavras = new ArrayList<>(Arrays.asList(arrayDePalavras));
    StringBuilder tokensAux = new StringBuilder();
    int aspas = 0;
    int incComent = 0;
    int FimComent = 0;
    int contadorIComent = 1;
     for(int i = 0; i <= palavras.size()-1;i++){
         
        if(i==palavras.size()-1){
            contadorIComent=0;
        }   
        System.out.println(palavras.get(i)+palavras.get(i+contadorIComent));
        if((palavras.get(i)+palavras.get(i+contadorIComent)).equals("&#47&#42")){
            incComent++;
        }
        if((palavras.get(i)+palavras.get(i+contadorIComent)).equals("&#42&#47")){
            FimComent++;
        }
        
     }
     if(incComent!= FimComent){
            System.out.println(incComent);
            System.out.println(FimComent);
            return "<html><pre><font color='red'>ERROR: Comentário não finalizado.</font></pre></html>";
        }
     
    for(String p: palavras){
        if(p.equals("&_AsD")){
            aspas++;
        }
    }
    if(aspas%2 != 0){
        return "<html><pre><font color='red'>ERROR: String não finalizada.</font></pre></html>";
    }
    int contador = 1;
    for(int i = 0; i <= palavras.size()-1;i++){   
        if(i==palavras.size()-1){
            contador=0;
        }
        if(!(palavras.get(i)+palavras.get(i+contador)).equals("&#47&#42") 
                && !palavras.get(i).equals("&_AsD")){
            for(KeyWords kw: keywords){
                if(palavras.get(i).equals(kw.getLexema())){
                    tokensAux.append("<font color='");
                    tokensAux.append(kw.getHtml());
                    tokensAux.append("'>");                      
                    tokensAux.append(kw.getNome());
                    tokensAux.append("   &rarr   ");   
                    tokensAux.append(kw.getLexema());
                    tokensAux.append("</font>");                         
                    tokensAux.append("\n");
                }
                else if(verificaVariavel(palavras.get(i))&& 
                    !palavrasChaves.contains(palavras.get(i))){
                    tokensAux.append("|    VARIAVEL   |");
                    tokensAux.append("   &rarr   "); 
                    tokensAux.append(palavras.get(i));
                    tokensAux.append("\n");
                    break;
                }
                else if(verificaVariavel(palavras.get(i)) == false && 
                        !palavrasChaves.contains(palavras.get(i))&&
                        verificaNumerico(palavras.get(i))==false){
                    return "<html><pre><font color='red'>ERROR: Variável "+ palavras.get(i) + 
                            " contém número ou caractere especial.</font></pre></html>";

                }
                else if(verificaNumerico(palavras.get(i))&& 
                    !palavrasChaves.contains(palavras.get(i))){
                    tokensAux.append("|     VALOR     |");
                    tokensAux.append("   &rarr   "); 
                    tokensAux.append(palavras.get(i));
                    tokensAux.append("\n");
                    break;
                }             
            }
        }else if((palavras.get(i)+palavras.get(i+contador)).equals("&#47&#42")){
            while(!(palavras.get(i)+palavras.get(i+contador)).equals("&#42&#47")){
                palavras.remove(i);
            }
            palavras.remove(i+1);
        }
        else if(palavras.get(i).equals("&_AsD")){
            palavras.set(i, " ");
            String textoStr = "";
            while(!(palavras.get(i).equals("&_AsD"))){
               palavras.remove(i);
               textoStr += palavras.get(i)+" ";              
           }

           textoStr = textoStr.replaceAll("&_AsD", "");
           textoStr="<font color='green'>|     STRING    |   &rarr   "+ textoStr+"</font>\n";
           tokensAux.append("<font color='#3fca3c'>|   DELIMITADOR |   &rarr   \"</font>\n");
           tokensAux.append(textoStr);
           tokensAux.append("<font color='#3fca3c'>|   DELIMITADOR |   &rarr   \"</font>\n");
        }     
    }        
    return "<html><pre>"+tokensAux+"</pre></html>";
    }
}
    
