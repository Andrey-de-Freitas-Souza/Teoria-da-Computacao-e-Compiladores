package Entidades;

public enum KeyWords {
    //OPERADORES RELACIONAIS
    MAIOR("\\>","|OPERADOR_REL_MAIOR|","#ff79c6"," \\> "),
    MENOR("\\<","|OPERADOR_REL_MENOR|","#ff79c6"," \\< "),
    MAIOR_IGUAL("\\>=","|OPERADOR_REL_MAIGUAL|","#ff79c6"," \\>= "),
    MENOR_IGUAL("\\<=","|OPERADOR_REL_MEIGUAL|","#ff79c6"," \\<= "),
    
    
    
    RECEBE("\\=","|OPERADOR_REL_RECE|","#ff79c6"," \\= "),
    IGUAL("\\==","|OPERADOR_REL_IGUAL|","#ff79c6"," \\== "),
    DIFERENTE("\\!","|OPERADOR_REL_DIF|","#ff79c6"," \\!= "),
    
    //DELIMITADORES:
    PONTO_VIRGULA(";","|DELIMITADOR_PONTOVIRGULA|","white"," ; "),
    VIRGULA(",","|DELIMITADOR_VIRGULA|","white"," , "),
    //CARACTERES ESPECIAIS
    PARENTESEA("\\(","|CARACTER_ESP_APAR|","#ffd710"," \\( "),
    PARENTESEB("\\)","|CARACTER_ESP_FPAR|","#ffd710"," \\) "),
    COLCHETEA("\\[","|CARACTER_ESP_ACOL|","#ffd710"," \\[ "),
    COLCHETEB("\\]","|CARACTER_ESP_FCOL|","#ffd710"," \\] "),
    CHAVEA("\\{","|CARACTER_ESP_ACHAVE|","#ffd710","\\{"),
    CHAVEB("\\}","|CARACTER_ESP_FCHAVE|","#ffd710","\\}"),    
    //OPERADORES ARITMÉTICOS
    MULTIPLICACAO("\\*","|OPERADOR_MAT_MULT|","ff79c6"," \\* "),
    DIVISAO("\\/","|OPERADOR_MAT_DIV|","ff79c6"," \\/ "),
    ADICAO("\\+","|OPERADOR_MAT_ADC|","ff79c6"," \\+ "),
    SUBTRACAO("\\-","|OPERADOR_MAT_SUB|","ff79c6"," \\- "),
    //TIPOS:
    INT("int","|KW_DECLARACAO_INT|","#8be9fd", " int "), 
    DOUBLE("double","|KW_DECLARACAO_DBL|","#8be9fd"," double "), 
    STRING("String","|KW_DECLARACAO_STR|","white"," String "),
    
    IF("if","|KW_CONDICIONAL_IF|","ff79c6"," if "), 
    ELSE("else","|KW_CONDICIONAL_ELSE|","ff79c6"," else "), 
    SWITCH("switch","|KW_CONDICIONAL_SW|","ff79c6", " switch "), 
    WHILE("while","|KW_REPETICAO_WHILE|","#3fca3c"," While "),
    FOR("for","|KW_REPETICAO_FOR|","#3fca3c"," for "),    
    PUBLIC("public","|IDENTIFICADOR_PUB|","#F75200"," public "),
    STATIC("static","|IDENTIFICADOR_STAT|","#F75200"," static "),
    VOID("void","|IDENTIFICADOR_VOID|","#8be9fd"," void "),
    MAIN("main","|IDENTIFICADOR_MAIN|","#3fca3c"," main "),
    PACKAGE("package","|IDENTIFICADOR_PACK|","#F75200"," package "),
    RETURN("return","|IDENTIFICADOR_RET|","#F75200"," return ")

    ;
    
    private final String lexema;
    private final String nome;
    private final String html;
    private final String espacado;
    
    
    KeyWords(String lexema,String nome, String html,String espacado) {
        this.lexema = lexema;
        this.nome = nome;
        this.html = html;
        this.espacado = espacado;
    }
    public String getNome() {
        return nome;
    }

    public String getHtml() {
        return html;
    }

    public String getLexema() {
        return lexema;
    }

    public String getEspacado() {
        return espacado;
    }
     
}