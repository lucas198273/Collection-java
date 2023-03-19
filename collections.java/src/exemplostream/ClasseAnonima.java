package exemplostream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClasseAnonima {
    public static void main(String[] args){

   @FunctionalInterface
   public  interface Comparator<T>{
   @Contract(pure = true) int compare(T var1, T var2);

  
  meusgatos.sort(Comparartor.comparing(Gato gato )-> gato.getNome());
             // vai comparar gato                   pelo Nome
  meusGatos.sort(Comparator.comparing(Gato::getNome)); // sem parenteses no final
   }
}
