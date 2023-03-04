package exemploordenação;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {
    public static void main(String[] args){
        /*
         * Serie 1 = Nome: Got, Genero: terror, TempoEpisodio: 60
         * Serie 2 = Nome: meu nome é jhony, Genero: ação, TempoEpisodio: 60
         * Serie 3 = Nome: Charlinho canhoto, Genero: Drama, TempoEpisodio: 60         
         */
        Set<Serie> minhasSeries1 = new HashSet<>(){{
            add(new Serie("Got","terror",60));
            add(new Serie("Charlinho canhoto","comedia",60));
            add(new Serie("meu nome é jhony","Ação",60));
            add(new Serie("Breaking Bad","Drama",45));
            add(new Serie("Stranger Things","Ficção Científica",50));
            add(new Serie("Got","terror",60));
        }};
        // Imprimindo forma natural usando For
        for(Serie serie: minhasSeries1){
            System.out.println(serie.getGenero() + " |" + serie.GetNome() + " | "+ serie.getTempoEpisodio() + "\n\n\n");
        }
        
        System.out.println("ordem natural ( Tempo Episodio || Genero) MinhasSeries2  ");
        //System.out.println("nao vai repetir pos mesmo valor , pois ha uma\ncomparação no tempo de episodio");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        // Nao é possivel apenas imprimir, precisamos do Compareble em nossa classe Serie
        for(Serie serie : minhasSeries2){
            System.out.println(serie.GetNome() + "  "+ serie.getGenero()+ "  "+ serie.getTempoEpisodio() +"\n\n");
        }

        System.out.println("ordem natural ( Tempo Episodio || Genero) MinhasSeries2  ");
        //System.out.println("nao vai repetir pos mesmo valor , pois ha uma\ncomparação no tempo de episodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNameGeneroTempoEpisodio());
        for(Serie serie : minhasSeries2){
            System.out.println(serie.GetNome() + "  "+ serie.getGenero()+ "  "+ serie.getTempoEpisodio() +"\n\n");
        }

        System.out.println(minhasSeries3);

    }
}
                        // ao utilizar compareble, sobrescrever o compareTo
class Serie implements Comparable<Serie>{
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
        return "Serie\n" + "Nome: "+ Nome+"\n"+
               "Genero: " + Genero + "\n"+
               "Tempo Episodio: "+ TempoEpisodio+ "\n\n\n";
    }


    @Override
    public int compareTo(Serie serie){
        int TempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (TempoEpisodio != 0)return TempoEpisodio;// se for diferentes retorna comparação pelo tempo

        // se nao retorna comparação pelo genero ordem alfabetica
        return this.getGenero().compareTo(serie.getGenero());
    }
    @Override
    public int hashCode(){
        return Objects.hash(Nome,Genero,TempoEpisodio);
    }
    @Override 
    public boolean equals(Object o){
        if(this == o )return true;
        if(o == null || getClass() != getClass()) return false;
        Serie serie = (Serie)o;
        return Nome.equals(serie.Nome) && Genero.equals(serie.Genero) && TempoEpisodio.equals(serie.TempoEpisodio);
    }
}


// Exemplo de aplicação usando Comparetor 
   // public class ComparadorDeProdutosPorNome implements Comparator<Produto> {
  //      @Override
        
       
 //   public int compare(Produto p1, Produto p2) {
 //           return p1.getNome().compareTo(p2.getNome());
//        }
  //  }

// Exemplo de aplicação usando Compareble
//public class Produto implements Comparable<Produto> {
   // private double preco;
    
   
// outros atributos e métodos
    
   
//@Override
//public int compareTo(Produto outro) {
  //      return Double.compare(this.preco, outro.preco);
    //}
//}
class ComparatoNameGeneroTempoEpisodio implements Comparator<Serie>{
   @Override
    public int compare(Serie  s1, Serie s2){
        int nome = s1.GetNome().compareTo(s2.GetNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    // nome igual, compara genero, se for igual vai organizar pelo Tempo de episodio
  
       
    }
 
}
    

