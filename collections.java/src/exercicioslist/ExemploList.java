package exercicioslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args){
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3;8 ] faca:
    // Exemplos de criação da lista
        //lista notas = new ArrayList<>(); // antes do java 5
       // List<Double> notas = new ArrayList<>();// Generico(jdk 5) - Diamond Opererator(jdk 7)
        //ArrayList<Double> notas = new ArrayList<>();
        //List<Double> notas = new ArrayList<> (Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3;8 ));
        //List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3;8); // Lista imutavel

        System.out.println("Crie uma lista com 7 notas: ");
        List<Double> notas = new ArrayList<>();// Generico(jdk 5) - Diamond Opererator(jdk 7)
        
        notas.add(1.0);
        notas.add(3.0);
        notas.add(4.0);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.0);

        notas.add(0, 5.0);
        notas.add(1, 4.0);
        notas.add(2, 3d);
        notas.add(3, 2d);
        notas.add(4,1d);

        System.out.println(notas);


        System.out.println("Exibindo a posição da nota 5 ");
        System.out.println(notas.indexOf(10.0));


        System.out.println("substituindo nota pela posicao");
        // Para substituir utilizamos SET (indice , elemento)
        notas.set(0, 49.0); 
        notas.set(1, 48.0);
        notas.set(2, 47.0);
        notas.set(3, 46.0);
        notas.set(4, 45.0);
        notas.set(5, 44.0);  
        
        System.out.println(notas);


        System.out.println("Conferindo se um determinado elemento esta na lista");
        // Para conferir se o elemento esta na lista utilizamos Contains( Elemento)
        System.out.println(notas.contains(50.0));
        System.out.println(notas.contains(48.0));
        System.out.println(notas.contains(55.0));
        System.out.println(notas.contains(47.0));
        System.out.println(notas.contains(40.0));
        System.out.println(notas.contains(5.0));

        System.out.println("\nImprimindop elementos pela ordem de que foram informadas");

        for (Double nota : notas) System.out.println(nota);
            // Tipo , Variavel, Variavels a  ser percorrida
        

        System.out.println("Acessando nota pelo indice");
        // utilizamos o comando GET(indice)
        System.out.println("Exibindo a terceira nota adicionada");
        System.out.println(notas.get(2));

        System.out.println("Exibindo a primeira nota adicionada");
        System.out.println(notas.get(0));

        System.out.println("Exibindo a oitava nota adicionada");
        System.out.println(notas.get(7));

        System.out.println("Exibindo a quinta nota adicionada");
        System.out.println(notas.get(4));

        System.out.println("Exiba a menor nota na Lista: "+ Collections.min(notas)); 
        System.out.println("Exiba a maior nota na Lista: "+ Collections.min(notas)); 
        
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();//   Iterator em Java O Iterador é um padrão de projeto 
        //comportamental que permite a passagem sequencial através de uma estrutura de dados complexa 
        //sem expor seus detalhes internos. Graças ao Iterator, os clientes 
        //podem examinar elementos de diferentes coleções de maneira semelhante usando uma única interface iterador.

        Double soma = 0D;
        while(iterator.hasNext()){// (Tem proximo) ?
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(notas.toString());// Representação em String do objeto

        System.out.println("Exibindo soma "+ soma);

        System.out.println("Exibindo a media das notas "+ (soma/notas.size()));
                                                                    // Size retorna inteiro == quantidade de elementos dentro do meu List

        System.out.println("Removendo a nota 49.0: ");
        // notas.remove(0); remove na posição 0
        notas.remove(49d);
        System.out.println(notas);

        System.out.println("Removendo nota na posição 0: ");
        notas.remove(0);

        System.out.println(notas);

    //    System.out.println("Removendo notas menores que 7");
   //     Iterator<Double> iterator1 = notas.iterator();
    // equanto iterator tiver proximo
        //while(iterator1.hasNext()){
        //    Double next = iterator.next();
       //     if(next < 7) iterator.remove();
     //   }
        System.out.println(notas);

        System.out.println("Apagando toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("conferindo se a lista esta vazia: "+ notas.isEmpty());// .isEmpty "Esta vazia"? tipo boolean
        
        

        notas.add(4.0);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(7.0);
        System.out.println("\n"+notas+"\n");
        System.out.println("Soma"+soma);
        

        
        System.out.println("Menor nota: "+Collections.min(notas));
        System.out.println("Maior nota: "+Collections.max(notas));
        System.out.println("Exibindo media : "+(soma/notas.size()));

    }   
}
