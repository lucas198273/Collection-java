package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploArray {
    public static void main(String[] args){
        List<String> numerosAleatorios =  Arrays.asList("38","42","42","58","65","77","86","97");
        System.out.println("Imprimindo todos os elementos dessa lista de Strings:  ");
        Class tipo = numerosAleatorios.getClass();
        
        
        
        // Lambda
        numerosAleatorios.forEach(s -> System.out.println(s));

        System.out.println("mesma ação utilizando for ");
        for (String string : numerosAleatorios) {
            System.out.println(string);
            
        }

        System.out.println(tipo);

                // ABAIXO TEMOS A PRI MEIRA FORMA DE CONVERSAO DE STRING PARA INTEGER
                // PRIMEIRO EXEMPLO
        //System.out.println("transformando esta lista de String em numeros inteiros");
        
                // SEGUNDO EXEMPLO: EM  MINHA OPNIAO MAIS EFICAZ POIS NAO CRIAMOS OUTRA VARIAVEL
                // APENAS CONVERTEMOS A MESMA ALTERANDO APENAS O TIPO
                System.out.println( "Teste");
        numerosAleatorios.stream().map(s -> Integer.parseInt(s));// lambda
        numerosAleatorios.stream().map(Integer::parseInt); // reference method
            //.collect(Collectors.toList());

        numerosAleatorios.stream().forEach(s ->  System.out.println(numerosAleatorios));
        numerosAleatorios.forEach(System.out::println);    // Lambda

        //.map(new Function<String,Integer>(){
        //    @Override
      //      public Integer apply(String s){
       //         return Integer.parseInt(s);
        
     //   } });
        
        System.out.println(numerosAleatorios);
        


        System.out.println("trabalhando com set");
      //  Converte para Set de Strings 5

        Set<String> collect = numerosAleatorios.stream()
             .limit(2)
             .collect(Collectors.toSet());
            System.out.println("\n\n");
             


        numerosAleatorios.stream()// Stream<String>
        .map(Integer::parseInt) // Stream<Integer>
        .collect(Collectors.toList()) // guarda em List<Integer>
        .forEach(System.out::println); //  reference method

        System.out.println(tipo);

        


        

     //   System.out.println("Lista Maior Que 50");
      //  List<Double> ListaMaiorQue50 = numerosAleatorios.stream()
        //.map(Double::parseDouble)
       // .filter({
          
          
        //}).collect(Collectors.toCollection(null));
        
        
       // numerosAleatorios2.stream().forEach(s ->  System.out.println(numerosAleatorios2));
        numerosAleatorios.forEach(System.out::println); 

      //  List<Integer> ListaElementosIguais = numerosAleatorios.stream()
       //         .map(Integer::parseInt)
       //         .filter(new Predicate<Integer>(){
       //             @Override
       //             public boolean comparando (Integer s,Integer i){
        //                if(s.equals(i))return true;
       //                 return false;
       //             }
       //         }).collect(Collectors.toList());
//
      //  System.out.println(tipo2);



       




       





        
        //NumerosAleatoriosInt.stream()
        //.map(new Function<Integer,Double>(){
       //     @Override
       //     public Double aplly(Integer s){
      //          return Double.parseDouble(s);
      //      }
      //  });
        
    }
    
}
