import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animais> lista= new ArrayList<>();

        lista.add(new Animais("Pangolin", "Manidae", 1345, 30));
        lista.add(new Animais("Zebra", "Equidae", 145000, 300));
        lista.add(new Animais("Canguru", "Macropodidae", 50000000, 70));

        gravarListaComoJson(lista);

        List<Animais> listaLida = lerListaJson();
        if (listaLida != null) {
            System.out.println("Lista lida do arquivo JSON:");
            for (Animais animal : listaLida) {
                System.out.println(animal.getNome());
            }
        }
    }

    public static void gravarListaComoJson(List<Animais> lista) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("lista.json")) {
            gson.toJson(lista, writer);
            System.out.println("Lista gravada como JSON com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Animais> lerListaJson() {
        List<Animais> lista = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("lista.json"))) {

            Gson gson = new GsonBuilder().create();

            Type tipoLista = new TypeToken<ArrayList<Animais>>() {}.getType();
            lista = gson.fromJson(reader, tipoLista);

            System.out.println("Lista lida do arquivo JSON com sucesso!");
        } catch (IOException e){
            e.printStackTrace();
        }

        return lista;
    }
}