package exemplosmap;

import java.nio.channels.WritableByteChannel;
import java.security.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.management.ValueExp;
import javax.sound.midi.SysexMessage;

public class ExemploHashMap {
    public static void main(String[] args){

        // observações:
                /* Quando estiver trabalhando com 
                 * Map<String, Double> carrosPopulares = new HashMap<>(){{
                 * put = adiciona, altera
                 * containsKey = verifica se a cheve é existente dentro do dicionario
                 * Get = Exibir o conteudo dentro de cada Chave
                */
                /*Quando Estiver trabalhando com   Set<String> modelos = carrosPopulares.keySet();
                 * 
                 * 
                 *  Abaixo foi crianda uma colleção com elementos do tipo double para armazenar todos  respectivos valores  dos carros dentro da coleção
                 * Collection<Double> consumos = carrosPopulares.values();
                */

        /*
         * Map<String,Double> carrosPopulares = new HashMap<>() Generics(jdk)
         *HashMao<String, Double> carrosPopulares = new HashMap<>();
         *
         */
        System.out.println("Crie um dicionario que relacione os modelos de carros e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            // put = Por 
            put("Gol", 14.4);
            put("BMW", 7.2);
            put("Jetta", 5.0);
            put("Cronnos", 14.5);
            put("voyage", 10.0);
        }};
        System.out.println(carrosPopulares);
        System.out.println("\nsubstitua o valor de consumo de todos os carros:\n");
        carrosPopulares.put("voyage", 13.5);
        carrosPopulares.put("BMW", 12.0);
        carrosPopulares.put("Gol", 15.2);
        carrosPopulares.put("Cronnos ", 12.5);
        carrosPopulares.put("Jetta", 8.0);

        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o veiculo tucson é existente dentro do dicionario: "+carrosPopulares.containsKey("Tucson"));
        System.out.println("confira se o veiculo Jetta é exuistente dentro do dicionario: "+carrosPopulares.containsKey("Jetta"));

        System.out.println("\n\n");// Variavel.Get
        System.out.println("Agora vamos trabalhar com o conteudo dentro de cada Key");
        System.out.println("Exibindo o consumo de cada veiculo: ");
        System.out.println("uno "+ carrosPopulares.get("uno"));
        System.out.println("Jetta "+ carrosPopulares.get("Jetta"));
        System.out.println("Gol "+ carrosPopulares.get("Gol"));
        System.out.println("BMW "+ carrosPopulares.get("BMW"));
        System.out.println("voyage "+ carrosPopulares.get("voyage"));
        System.out.println("Cronnos "+ carrosPopulares.get("Cronnos"));

        System.out.println("\n\n Set<String> modelos = carrosPopulares.keySet();");
        System.out.println("exiba os modelos  ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        carrosPopulares.put("BMW", 15.2);

        System.out.println("\n\n");

        System.out.println("Collection<Double> consumos = carrosPopulares.values();");
        System.out.println("Exiba o consumo dos carros ");
        

        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
            
        
            // collection.max(Carro.Valor) trabalhando somente com valor
        System.out.println("Mostre o modelo mais economico: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        System.out.println(consumoMaisEficiente);
            //Para trabalhar com chave e valor (entry)
            // Set = Conjunto
            // entrysSet = conjunto de entradas
        Set<Map.Entry<String, Double>> entrys = carrosPopulares.entrySet();
        System.out.println("Entry:");
        System.out.println(entrys);

        //Variavel de controle
        String  modeloMaisEficiente = "";
            // Parametros do conteudo a ser percorrido
        for( Map.Entry<String, Double> entry : entrys){
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente "+modeloMaisEficiente+ " - "+ consumoMaisEficiente);

            }
        }

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
       
        String ModeloMenosEficiente = " ";
        carrosPopulares.put( "Punto", 8.0 );
        // for quando queremos valores epecificos dentro da lista Key/Valuer
        for(Map.Entry<String, Double> entry: carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){
                ModeloMenosEficiente = entry.getKey();
                System.out.println(" Modelo Menos Eficiente "+ ModeloMenosEficiente+ " - "+consumoMenosEficiente);
            }
        }
        System.out.println("Trabalhando com a soma do consumo dos veiculos");
        // tipoComando <tipoDados> variavel = variavelAserPercorrida.valor().variavel
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        // while pois queremos percorrer toda a nlista ate o fim 
        // soamndfo os respectivos valores

        while(iterator.hasNext()){
                  // Proximo Valor 
            soma += iterator.next();
            System.out.println(soma);
            
        }
        System.out.println("Valor final");
        System.out.println(soma);

        System.out.println("numero de elementos dentro da lista: " +carrosPopulares.size());
                                                                                    // soma / NumElementos (size)     
        System.out.println("Exibindo a media de consumos de todos os carro juntos: "+ (soma/carrosPopulares.size()));
    
        System.out.println("Removendo carros com consumo igual a 15.2 ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.2)){
                iterator1.remove();
            }
            
           
        }
        
        System.out.println("\n\n");
        System.out.println("exibindo na ordem que foram informados");
//      LinkedHashMap para trabalhar com ordem de inserção
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            // put = Por 
            put("Gol", 14.4);
            put("BMW", 7.2);
            put("Jetta", 5.0);
            put("Cronnos", 14.5);
            put("voyage", 10.0);
           }};
        System.out.println(carrosPopulares2);   

        System.out.println("Exibindo o dicionario ordenado pelo modelo: ");
        Map<String,Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        carrosPopulares3.remove("BMW");
        carrosPopulares3.put("BMW", 15.9);
        
        System.out.println(carrosPopulares3);

        System.out.println("Apague todo o dicionario: ");
        carrosPopulares3.clear();
                                                                        // verificação se esta vazia 
                                                                        // inEmpty == esta vazio?
                                                                        // Retorna boolean
        System.out.println("Confira se alista esta vazia: " +carrosPopulares3.isEmpty());
    }
        
}

