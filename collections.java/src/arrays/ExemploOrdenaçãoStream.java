package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExemploOrdenaçãoStream {
    public static void main(String[] args){

        List<String> numerosAleatorios = Arrays.asList("38","42","42","58","65","77","86","97");
        Class tipo = numerosAleatorios.getClass();



        System.out.println("Lista Pares Maiores Que 50 e pares");
        List<Integer> ListaMaiorQue50Par = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter( i -> (i %2 ==0 && i >50)).collect(Collectors.toList()); // Expressão em lambda
        
        System.out.println(ListaMaiorQue50Par);



        System.out.println("Lista Impares Maiores Que 50 e pares");
        List<Integer> ListaMaiorQue50Impares = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter( i -> (i %2 !=0 && i >50)).collect(Collectors.toList()); // Expressão em lambda
        
        System.out.println(ListaMaiorQue50Impares);



        System.out.println("Pegando a media da soma dos numeros contidos na lista");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt ) // MapToInt -> para fazer manipulações
                .average()// Calcula media dos valores -> retorna double
                .ifPresent(System.out::println); // Lambda
                
                // Segunda forma 


            //    .ifPresent(new DoubleConsumer() {
            //        @Override 
            //        public void accept(double v){
            //            System.out.println(v);
            //        }                    
            //    });
        System.out.println("Removendo valores impares");
        List<Integer> numerosAtuais = numerosAleatorios.stream()
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        numerosAtuais.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAtuais);
       // numerosAtuais.removeIf( new Predicate<Integer>() {
       //    @Override
       // public boolean test(Integer integer){
       //    if(integer % 2 != 0) return true; // se for par retorna 
       //     return false;  // se nao (Nao retorna)
       //    } 
       // });  // metodo list pois faz alteração
       System.out.println("Removendo valores pares");
       List<Integer> numerosAtuais2 = numerosAleatorios.stream()
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        numerosAtuais2.removeIf(i -> ((i % 2 == 0)));
        System.out.println(numerosAtuais2);



        //List<Integer> ListaElementosIguais = numerosAleatorios.stream()
        //        .map(Integer::parseInt)
        //        //.filter( i -> (i == 5))
        //        .collect(Collectors.toList());
        //System.out.println(ListaElementosIguais);


    }

    
}
