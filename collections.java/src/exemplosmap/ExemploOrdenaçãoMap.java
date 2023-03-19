package exemplosmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenaçãoMap {

    // Ordem aleatoria HashMap == put

    // Ordem de inserção = LinkedHashMap == put

    // Ordem  alfabetica = TreeMap == put

    // Para trabalhar com valores = Set 
    // Set = precisamos usar o comparetor em nosso construtor  === add


    public static void main(String[] args){

        // Key = Autor
        // Valor = Nome

        System.out.println("Trabalhando com HashMap: Ordem aleatoria");
        Map<String, Livro> meuslivros1 = new HashMap<>(){{
            put("Niel ", new Livro("Mitologia nordica", 254));
            put("Niel Gaiman", new Livro("Sadman", 300));
            put("Gaiman", new Livro("Deuses Americanos ", 350));
        }};
        // entrySet para ecessar valor e chave
           // tipo    atributos     variavel : tipo de interação           
        for(Map.Entry<String , Livro> livro1 :meuslivros1.entrySet()){
           System.out.println("Autor: " +livro1.getKey() + " \n Nome: " + livro1.getValue().getNome() 
           + "\n Paginas: " + livro1.getValue().getPaginas() + "\n\n");
        }


        System.out.println("Trabalhando com LinkedHashMap : Ordem de incerção");
        Map<String, Livro> meuslivros2 = new LinkedHashMap<>(){{
            put("Albhert ", new Livro("Buraco de minhoca", 254));
            put("Bethoven", new Livro("O espaço", 300));
            put("Antoni", new Livro("Deuses Gregos ", 350));
        }};
        for(Map.Entry<String ,Livro> livro2: meuslivros2.entrySet()){
            System.out.println("Autor: " +livro2.getKey() + " \n Nome: " + livro2.getValue().getNome() 
            + "\n Paginas: " + livro2.getValue().getPaginas() + "\n\n");
        }

        System.out.println("Trabalhando com TreeMap : Ordem alfabetica ");
        Map<String, Livro> meuslivros3 = new TreeMap<>(){{
            put("Albhert ", new Livro("Buraco de minhoca", 254));
            put("Bethoven", new Livro("O espaço", 300));
            put("Antoni", new Livro("Deuses Gregos ", 350));
        }};
        for(Map.Entry<String ,Livro> livro3: meuslivros3.entrySet()){
            System.out.println("Autor: " +livro3.getKey() + " \n Nome: " + livro3.getValue().getNome() 
            + "\n Paginas: " + livro3.getValue().getPaginas() + "\n\n");
        }

        System.out.println("Comparando pelo nome : Set|Comparator de livros");
        Set<Map.Entry<String, Livro>> meuslivros4 = new TreeSet<>(new ComparatorNome());
        meuslivros4.addAll(meuslivros2.entrySet());
        for(Map.Entry<String ,Livro> livro4: meuslivros4){
            System.out.println("Autor: " +livro4.getKey() + " \n Nome: " + livro4.getValue().getNome() 
            + "\n Paginas: " + livro4.getValue().getPaginas() + "\n\n");
        }

        System.out.println("Comparando pelo numero de paginas  : ");
        Set<Map.Entry<String, Livro>> meuslivros5 = new TreeSet<>(new ComparatorPaginas());
        meuslivros4.addAll(meuslivros2.entrySet());
        for(Map.Entry<String ,Livro> livro5: meuslivros5){
            System.out.println("Autor: " +livro5.getKey() + " \n Nome: " + livro5.getValue().getNome() 
            + "\n Paginas: " + livro5.getValue().getPaginas() + "\n\n");
        }




     
        
        
    }
}
class Livro{
    private String nome;
    private Integer paginas;

    // construtor deve ter o mesmo nome da classe
    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;

    }
    // Get para ter retorno do valor
    public String getNome(){
        return nome;
    }
    public Integer getPaginas(){
        return paginas;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if( getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome)&& paginas.equals(livro.paginas);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nome,paginas);
    }

    // Sobrescrevendo toString para que nao apareça apenas o endereço de memoria
    @Override
    public String toString(){
        return 
                "Nome: "+ nome +
                "Paginas: "+ paginas;
    }


}                              // Comparação< Tipo a ser comparador> mesmo tipo dos elementos SET
class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String , Livro> l1, Map.Entry<String, Livro> l2){
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}   
class ComparatorPaginas implements Comparator<Livro>{
    @Override
    public int comparator( <Livro l1, Livro l2){
        return Integer.compare(l1.getPaginas(), l2.getPaginas());
    }
}
 


