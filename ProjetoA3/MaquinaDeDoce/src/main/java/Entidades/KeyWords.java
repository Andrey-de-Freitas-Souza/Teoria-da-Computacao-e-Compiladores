package Entidades;

public enum KeyWords {
    //OPERADORES RELACIONAIS
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
    RETURN("return","|IDENTIFICADOR_RET|","#F75200"," return "),
    MAIOR_IGUAL("&gt&#61","|OPERADOR_REL_MAIGUAL|","#ff79c6"," &gt&#61 "),
    MENOR_IGUAL("&lt&#61","|OPERADOR_REL_MEIGUAL|","#ff79c6"," &lt&#61 "),
    MAIOR("&gt","|OPERADOR_REL_MAIOR|","#ff79c6"," &gt "),
    MENOR("&lt","|OPERADOR_REL_MENOR|","#ff79c6"," &lt "),
       
    IGUAL("&#61&#61","|OPERADOR_REL_IGUAL|","#ff79c6"," &#61&#61 "),
    RECEBE("&#61","|OPERADOR_REL_RECE|","#ff79c6"," &#61 "), 
    DIFERENTE("&#33","|OPERADOR_REL_DIF|","#ff79c6"," &#33 "),
    
    //DELIMITADORES:
    PONTO_VIRGULA("&#59","|DELIMITADOR_PONTOVIRGULA|","white"," &#59 "),
    VIRGULA("&#44","|DELIMITADOR_VIRGULA|","white"," &#44 "),
    //CARACTERES ESPECIAIS
    PARENTESEA("&#40","|CARACTER_ESP_APAR|","#ffd710"," &#40 "),
    PARENTESEB("&#41","|CARACTER_ESP_FPAR|","#ffd710"," &#41 "),
    COLCHETEA("&#91","|CARACTER_ESP_ACOL|","#ffd710"," &#91 "),
    COLCHETEB("&#93","|CARACTER_ESP_FCOL|","#ffd710"," &#93 "),
    CHAVEA("&#123","|CARACTER_ESP_ACHAVE|","#ffd710"," &#123 "),
    CHAVEB("&#125","|CARACTER_ESP_FCHAVE|","#ffd710"," &#125 "),    
    //OPERADORES ARITMÉTICOS
    MULTIPLICACAO("&#42","|OPERADOR_MAT_MULT|","ff79c6"," &#42 "),
    DIVISAO("&#47","|OPERADOR_MAT_DIV|","ff79c6"," &#47 "),
    ADICAO("&#43","|OPERADOR_MAT_ADC|","ff79c6"," &#43 "),
    SUBTRACAO("&#45","|OPERADOR_MAT_SUB|","ff79c6"," &#45 ")
    //TIPOS:
    

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