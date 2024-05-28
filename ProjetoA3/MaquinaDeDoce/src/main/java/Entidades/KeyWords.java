package Entidades;

public enum KeyWords {
    //KW DECLARAÇÃO
    INT("int","|KW_DECLARACAO_INT|","#8be9fd", " int ",true), 
    DOUBLE("double","|KW_DECLARACAO_DBL|","#8be9fd"," double ",true), 
    STRING("String","|KW_DECLARACAO_STR|","white"," String ",true),
    //KW CONDICIONAL
    IF("if","|KW_CONDICIONAL_IF|","ff79c6"," if ",true), 
    ELSE("else","|KW_CONDICIONAL_ELSE|","ff79c6"," else ",true), 
    SWITCH("switch","|KW_CONDICIONAL_SW|","ff79c6", " switch ",true), 
    CASE("case","|KW_CONDICIONAL_CS|","ff79c6", " case ",true),
    DEFAULT("default","|KW_CONDICIONAL_DF|","ff79c6", " default ",true),
    //KW REPETIÇÃO
    WHILE("while","|KW_REPETICAO_WHILE|","#3fca3c"," While ",true),
    FOR("for","|KW_REPETICAO_FOR|","#3fca3c"," for ",true),
    DO("Do","|KW_REPETICAO_DO|","#3fca3c"," do ",true),
    //KW CONTOLE REPETIÇÃO
    BREAK("break","|KW_CTRL_REP_BREAK|","#F75200"," break ",true),
    CONTINUE("continue","|KW_CTRL_REP_CONT|","#F75200"," continue ",true),
    //KW MODIFICADORES DE ACESSO
    PUBLIC("public","|KW_MOD_ACESSO_PUB|","#F75200"," public ",true),
    PRIVATE("private","|KW_MOD_ACESSO_PVT|","#F75200"," private ",true),
    PROTECTED("protected","|KW_IDENTIFICADOR_PRO|","#F75200"," protected ",true),
    //KW CONTROLE DE PACOTES
    PACKAGE("package","|KW_CTRL_PACK|","#F75200"," package ",true),
    IMPORT("import","|KW_CTRL_PACK|","#F75200"," import ",true),
    //KW Modificadores de classes, variáveis ou métodos
    STATIC("static","|KW_MOD_CVM_STAT|","#F75200"," static ",true),
    CLASS("class","|KW_MOD_CVM_CLASS|","#F75200"," class ",true),
    ABSTRACT("abstract","|KW_MOD_CVM_ABST|","#F75200"," abstract ",true),
    EXTENDS("extends","|KW_MOD_CVM_EXT|","#F75200"," extends ",true),
    FINAL("final","|KW_MOD_CVM_FIN|","#F75200"," final ",true),
    IMPLEMENT("implements","|KW_MOD_CVM_IMP|","#F75200"," implements: ",true),
    //KW METODOS
    VOID("void","|IDENTIFICADOR_VOID|","#8be9fd"," void ",true),
    RETURN("return","|IDENTIFICADOR_RET|","#F75200"," return ",true),
    MAIN("main","|IDENTIFICADOR_MAIN|","#3fca3c"," main ",true),
    
    
    MAIOR_IGUAL("&gt&#61","|OPERADOR_REL_MAIGUAL|","#ff79c6"," &gt&#61 ",false),
    MENOR_IGUAL("&lt&#61","|OPERADOR_REL_MEIGUAL|","#ff79c6"," &lt&#61 ",false),
    MAIOR("&gt","|OPERADOR_REL_MAIOR|","#ff79c6"," &gt ",false),
    MENOR("&lt","|OPERADOR_REL_MENOR|","#ff79c6"," &lt ",false),
       
    IGUAL("&#61&#61","|OPERADOR_REL_IGUAL|","#ff79c6"," &#61&#61 ",false),
    RECEBE("&#61","|OPERADOR_REL_RECE|","#ff79c6"," &#61 ",false), 
    DIFERENTE("&#33","|OPERADOR_REL_DIF|","#ff79c6"," &#33 ",false),
    E("&amp&amp","|OPERADOR_REL_E|","#ff79c6"," &amp&amp ",false),
    OU("&#124&#124","|OPERADOR_REL_OU|","#ff79c6"," &#124&#124 ",false),
    //DELIMITADORES:
    PONTO_VIRGULA("&#59","|DELIMITADOR_PONTOVIRGULA|","white"," &#59 ",false),
    VIRGULA("&#44","|DELIMITADOR_VIRGULA|","white"," &#44 ",false),
    //CARACTERES ESPECIAIS
    PARENTESEA("&#40","|CARACTER_ESP_APAR|","#ffd710"," &#40 ",false),
    PARENTESEB("&#41","|CARACTER_ESP_FPAR|","#ffd710"," &#41 ",false),
    COLCHETEA("&#91","|CARACTER_ESP_ACOL|","#ffd710"," &#91 ",false),
    COLCHETEB("&#93","|CARACTER_ESP_FCOL|","#ffd710"," &#93 ",false),
    CHAVEA("&#123","|CARACTER_ESP_ACHAVE|","#ffd710"," &#123 ",false),
    CHAVEB("&#125","|CARACTER_ESP_FCHAVE|","#ffd710"," &#125 ",false),    
    //OPERADORES ARITMÉTICOS
    MULTIPLICACAO("&#42","|OPERADOR_MAT_MULT|","ff79c6"," &#42 ",false),
    DIVISAO("&#47","|OPERADOR_MAT_DIV|","ff79c6"," &#47 ",false),
    ADICAO("&#43","|OPERADOR_MAT_ADC|","ff79c6"," &#43 ",false),
    SUBTRACAO("&#45","|OPERADOR_MAT_SUB|","ff79c6"," &#45 ",false)
    
    ;
    
    private final String lexema;
    private final String nome;
    private final String html;
    private final String espacado;
    private final boolean precisaEspaco;
    
    
    KeyWords(String lexema,String nome, String html,String espacado,boolean precisaEspaco) {
        this.lexema = lexema;
        this.nome = nome;
        this.html = html;
        this.espacado = espacado;
        this.precisaEspaco = precisaEspaco;
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

    public boolean isPrecisaEspaco() {
        return precisaEspaco;
    }
     
}