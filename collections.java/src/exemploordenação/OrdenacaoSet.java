package exemploordenação;

import java.io.Serial;

public class OrdenacaoSet {
    public void main(String[] args){
        /*
         * Serie 1 = Nome: Got, Genero: terror, TempoEpisodio: 60
         *Serie 2 = Nome: meu nome é jhony, Genero: ação, TempoEpisodio: 60
         Serie 3 = Nome: Charlinho canhoto, Genero: Drama, TempoEpisodio: 60         
         */
        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

class Serie{
    private String Nome;
    private String Genero;
    private Integer TempoEpisodio;

    // Apos Declararmos nossas variaveis iremos fazer o construtor
    public Serie(String Nome, String Genero, Integer TempoEpisodio){
        // construtor foi feito ( 3 parametros existentes)
        // vamos assimiliar parametros 
        this.Nome = Nome;
        this.Genero = Genero;
        this.TempoEpisodio = TempoEpisodio;
    }

    // OBJETOS GET SERAM CRIADOS PARA QUE POSSAMOS OBTER APENAS O RETORNO DO CONTEUDO SOLICITADO

//  Visibilidade Tipo NomeObjeto
    public String GetNome(){
        return Nome;
    }
//  Visibilidade Tipo NomeObjeto
    public String getGenero(){
        return Genero;
    }
//  Visibilidade Tipo NomeObjeto
    public Integer getTempoEpisodio(){
        return TempoEpisodio;
    }
    @Override
    public String toString(){
        return "Serie{"+
                "Nome: "+Nome +"\n"+
                "Genero: "+Genero + "\n"+
                "Tempo de Episodio" + TempoEpisodio+
                "\n";

                
    }
    // HashCode é reponsavel por fazer a comparação ou leitura ????
    @Override
    public boolean  equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Serie serie = (Serie)obj;
        return Nome.equals(Serie.Nome)


    }
}
    }
    
}
