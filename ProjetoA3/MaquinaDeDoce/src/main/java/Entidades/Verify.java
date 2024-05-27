
package Entidades;

import java.util.ArrayList;
import java.util.List;



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
    public String iniciaCompilador(String codigo, KeyWords[] keywords){
    System.out.println(codigo);
    String tokensFinal = codigo;
    
    // Removendo comentários
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

    // Copiando tokensFinal para apenasVar antes de qualquer modificação
    String apenasVar = tokensFinal;

    // Removendo palavras-chave da variável apenasVar
    for (KeyWords kw : keywords) {
                boolean check1 = apenasVar.contains(kw.getLexema()+"&#40")||apenasVar.contains(kw.getLexema()+"&#91")||
                        apenasVar.contains(kw.getLexema()+"&#123")|| apenasVar.contains(kw.getLexema()+" ") ;
                boolean check2 = kw.getNome().contains("|KW_CONDICIONAL_")||kw.getNome().contains("|KW_REPETICAO_")||
                        kw.getNome().contains("|IDENTIFICADOR_")|| kw.getNome().contains("|KW_DECLARACAO_");
                boolean check3 = check1 && check2;
    
                if(check3){
                    apenasVar = apenasVar.replaceAll(kw.getLexema()+" "," ");
                    apenasVar = apenasVar.replaceAll(kw.getLexema()+"&#40"," ");
                    apenasVar = apenasVar.replaceAll(kw.getLexema()+"&#91"," ");
                    apenasVar = apenasVar.replaceAll(kw.getLexema()+"&#123"," ");
                }
                if(check2==false){
                   apenasVar = apenasVar.replaceAll(kw.getLexema(), " ");
                }
        
    }
        //System.out.println(apenasVar);
        System.out.println(tokensFinal);
    for (KeyWords kw : keywords) {
                boolean check1 = tokensFinal.contains(kw.getLexema()+"&#40")||tokensFinal.contains(kw.getLexema()+"&#91")||
                        tokensFinal.contains(kw.getLexema()+"&#123")|| tokensFinal.contains(kw.getLexema()+" ") ;
                boolean check2 = kw.getNome().contains("|KW_CONDICIONAL_")||kw.getNome().contains("|KW_REPETICAO_")||
                        kw.getNome().contains("|IDENTIFICADOR_")|| kw.getNome().contains("|KW_DECLARACAO_");
                boolean check3 = check1 && check2;
    
                if(check3){
                    tokensFinal = tokensFinal.replaceAll(kw.getLexema()+" ", "\n" + kw.getNome()+" ");
                    tokensFinal = tokensFinal.replaceAll(kw.getLexema()+"&#40", "\n" + kw.getNome()+"&#40");
                    tokensFinal = tokensFinal.replaceAll(kw.getLexema()+"&#91", "\n" + kw.getNome()+"&#91");
                    tokensFinal = tokensFinal.replaceAll(kw.getLexema()+"&#123", "\n" + kw.getNome()+"&#123");

                }
                if(check2==false){
                   tokensFinal = tokensFinal.replaceAll(kw.getLexema(), "\n" + kw.getNome());
                }
        
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
    
    
    
}
