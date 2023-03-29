package exercicios;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;

public class ExercicioAgenda {
    
    /**
     * @param args
     */
    public static void main(String[] args){
        // ordenando por chave
        // treMap e Hash map retornanram pelo Id  
        // Linked hash map retornou por ordem de inserção dos elementos

        // Para ordenar pelo valor dentro dos contatos usamos :
                                                           // Set treSet
     
                                                        
        System.out.println("Ordem aleatoria");
       Map<Integer, Contato> agendMap = new HashMap<>(){{
        put(1, new Contato("Lucas Dias ", 3333));
        put(5, new Contato("Douglas Dias ", 4444));
        put(6, new Contato("Fabio Roger ", 8888));
        put(2, new Contato("Douglas Fernandes ", 1111));
       }};
   
       

       for(Map.Entry<Integer,Contato> entrys : agendMap.entrySet()){
        System.out.println(entrys.getKey() + " - " + entrys.getValue().getNome()+" - "+ entrys.getValue().getNumero());
       }

       System.out.println(" Ordem de inserção :\n");
       Map<Integer, Contato> agendMap2 = new LinkedHashMap<>(){{
        put(5, new Contato("fernando Dias ", 92311012));
        put(7, new Contato("Joao Dias", 15428452));
        put(1, new Contato("Fabio Roger ", 941414012));
        put(2, new Contato("Douglas Fardini", 15455552));
       }};

       for(Map.Entry<Integer,Contato> entrys2 : agendMap2.entrySet()){
        System.out.println(entrys2.getKey() + " - " + entrys2.getValue().getNome()+" - "+ entrys2.getValue().getNumero());
       }


       System.out.println("Ordem Id : " );
       Map<Integer , Contato> agendMap3 = new TreeMap<>(agendMap);
       for(Map.Entry<Integer,Contato> entrys3 : agendMap3.entrySet()){
        System.out.println(entrys3.getKey() + " - "+ entrys3.getValue().getNome() + " - "+ entrys3.getValue().getNumero());
       }

       System.out.println("Ordenando pelo Valor dentro do objeto Contato: Numero ");
                                      
                                                                   // Exemplo de classe anonima
                                                                   // antes class ComparatorOrdemNumerica 
                                                        // Agora: 
     // Set<Map.Entry<Integer,Contato>> set1 = new TreeSet<>(new Comparator<Map.Entry<Integer,Contato>>(){
      //  @Override                                           
       // public int compare(Map.Entry<Integer,Contato> count1 , Map.Entry<Integer,Contato> count2 ){
       //     return Integer.compare(count1.getValue().getNumero(), count2.getValue().getNumero() );
       // }
    //  });
      Set<Map.Entry<Integer,Contato>> set1 = new TreeSet<>(Comparator.comparing(new Function<Integer,Contato,Integer>() {
        
      }));
  
      
    
      set1.addAll(agendMap.entrySet());
      for(Map.Entry<Integer,Contato> entry: set1){
        System.out.println(entry.getKey() +" - "+ entry.getValue().getNome() + entry.getValue().getNumero());
      }

      System.out.println("Ordenando pelo Valor dentro do objeto Contato: Nome ");

      Set<Map.Entry<Integer,Contato>> set2 = new TreeSet<>(new CompareOrdemAlphabetica());
      set2.addAll(agendMap.entrySet());
      for(Map.Entry<Integer,Contato> entrys2: set2){
        System.out.println(entrys2.getKey() + " - "+ entrys2.getValue().getNome());
      }


   
    }


    
    
}
class Contato{
    private String nome;
    private Integer numero;

    public Contato(String nome , Integer numero){
        this.nome = nome;
        this.numero = numero;

    }
    public String getNome(){return nome;}

    public Integer getNumero(){return numero;}

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if( o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }
    @Override
    public int hashCode(){ return Objects.hash(nome,numero);}

    @Override
    public String toString(){
        return"Contato{"+
                "Nome ="+ nome +
                "Numero"+ numero +" }";
    }


}
//class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer,Contato>>{
 //   @Override
   // public int compare(Map.Entry<Integer,Contato> cont1,Map.Entry<Integer,Contato> cont2){
     //   return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());     
   //}                           // Usamos o Comparador do proprio Integer

//}
class CompareOrdemAlphabetica implements Comparator<Map.Entry<Integer,Contato>>{
    @Override
    public int compare(Map.Entry<Integer,Contato> cont1, Map.Entry<Integer,Contato> cont2){
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
        // usamos o comparadorIgnoreCase
    }
}
