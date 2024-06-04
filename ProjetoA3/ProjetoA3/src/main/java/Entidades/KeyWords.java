package Entidades;

public enum KeyWords {
    //KW DECLARAÇÃO
    INT("int","| KW_DECLARACAO |","#8be9fd", "int ",true), 
    DOUBLE("double","| KW_DECLARACAO |","#8be9fd","double ",true), 
    STRING("String","| KW_DECLARACAO |","white","String ",true),
    //KW CONDICIONAL
    IF("if","|KW_CONDICIONAL |","ff79c6","if ",true), 
    ELSE("else","|KW_CONDICIONAL |","ff79c6","else ",true), 
    SWITCH("switch","|KW_CONDICIONAL |","ff79c6", "switch ",true), 
    CASE("case","|KW_CONDICIONAL |","ff79c6", "case ",true),
    DEFAULT("default","|KW_CONDICIONAL |","ff79c6", "default ",true),
    //KW REPETIÇÃO
    WHILE("while","|  KW_REPETICAO |","#3fca3c","while ",true),
    FOR("for","|  KW_REPETICAO |","#3fca3c","for ",true),
    DO("Do","|  KW_REPETICAO |","#3fca3c","do ",true),
    //KW CONTOLE REPETIÇÃO
    BREAK("break","| KW_CTRL_REP   |","#F75200","break ",true),
    CONTINUE("continue","| KW_CTRL_REP   |","#F75200","continue ",true),
    //KW MODIFICADORES DE ACESSO
    PUBLIC("public","| KW_MOD_ACESSO |","#F75200","public ",true),
    PRINT("print","|METODO_ESCREVE |","#8be9fd","print ",true),
    PRIVATE("private","| KW_MOD_ACESSO |","#F75200","private ",true),
    PROTECTED("protected","| KW_MOD_ACESSO |","#F75200","protected ",true),
    //KW CONTROLE DE PACOTES
    PACKAGE("package","|  KW_CTRL_PACK |","#F75200","package ",true),
    IMPORT("import","|  KW_CTRL_PACK |","#F75200","import ",true),
    //KW Modificadores de classes, variáveis ou métodos
    STATIC("static","|   KW_MOD_CVM  |","#F75200","static ",true),
    CLASS("class","|   KW_MOD_CVM  |","#F75200","class ",true),
    ABSTRACT("abstract","|   KW_MOD_CVM  |","#F75200","abstract ",true),
    EXTENDS("extends","|   KW_MOD_CVM  |","#F75200","extends ",true),
    FINAL("final","|   KW_MOD_CVM  |","#F75200","final ",true),
    IMPLEMENT("implements","|   KW_MOD_CVM  |","#F75200","implements: ",true),
    //KW METODOS
    VOID("void","|   KW_MOD_CVM  |","#8be9fd","void ",true),
    RETURN("return","|   KW_RETORNO  |","#F75200","return ",true),
    MAIN("main","|METODO_ESP_MAIN|","#3fca3c","main ",true),        
    RECEBE("&#61","|   ATRIBUICAO  |","#ff79c6"," &#61 ",false),
    MAIOR("&gt","|  OPERADOR_REL |","#ff79c6"," &gt ",false),
    MENOR("&lt","|  OPERADOR_REL |","#ff79c6"," &lt ",false),
    MAIOR_IGUAL("&gt  &#61","|  OPERADOR_REL |","#ff79c6"," &gt&#61 ",false),
    MENOR_IGUAL("&lt  &#61","|  OPERADOR_REL |","#ff79c6"," &lt&#61 ",false),       
    IGUAL("&#61  &#61","|  OPERADOR_REL |","#ff79c6"," &#61&#61 ",false),  
    DIFERENTE("&#33","|  OPERADOR_REL |","#ff79c6"," &#33 ",false),
    E("&amp&amp","|  OPERADOR_LOG |","#ff79c6"," &amp&amp ",false),
    OU("&#124&#124","|  OPERADOR_LOG |","#ff79c6"," &#124&#124 ",false),
    //DELIMITADORES:
    PONTO_VIRGULA("&#59","|ENCERRA_COMANDO|","white"," &#59 ",false),
    VIRGULA("&#44","|   SEPARADOR   |","white"," &#44 ",false),
    //CARACTERES ESPECIAIS
    PARENTESEA("&#40","|   DELIMITADOR |","#ffd710"," &#40 ",false),
    PARENTESEB("&#41","|   DELIMITADOR |","#ffd710"," &#41 ",false),
    COLCHETEA("&#91","|   DELIMITADOR |","#ffd710"," &#91 ",false),
    COLCHETEB("&#93","|   DELIMITADOR |","#ffd710"," &#93 ",false),
    CHAVEA("&#123","|   DELIMITADOR |","#ffd710"," &#123 ",false),
    CHAVEB("&#125","|   DELIMITADOR |","#ffd710"," &#125 ",false),    
    //OPERADORES ARITMÉTICOS
    MULTIPLICACAO("&#42","|  OPERADOR_MAT |","ff79c6"," &#42 ",false),
    DIVISAO("&#47","|  OPERADOR_MAT |","ff79c6"," &#47 ",false),
    ADICAO("&#43","|  OPERADOR_MAT |","ff79c6"," &#43 ",false),
    SUBTRACAO("&#45","|  OPERADOR_MAT |","ff79c6"," &#45 ",false),
    ASPASD("&_AsD","|   DELIMITADOR  |","#3fca3c"," &_AsD ",false)
    
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