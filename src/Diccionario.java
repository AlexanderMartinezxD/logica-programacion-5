import java.util.HashMap;
import java.util.Map;

public class Diccionario {

  private Map<String, String> diccionario;

  Diccionario() {
    diccionario = new HashMap<>();
    llenarDiccionario();
  }

  private void llenarDiccionario() {

    diccionario.put("comer", "eat");
    diccionario.put("beber", "drink");
    diccionario.put("correr", "run");
    diccionario.put("leer", "read");
    diccionario.put("escribir", "write");
    diccionario.put("hablar", "speak");
    diccionario.put("escuchar", "listen");
    diccionario.put("caminar", "walk");
    diccionario.put("nadar", "swim");
    diccionario.put("volar", "fly");
    diccionario.put("dormir", "sleep");
    diccionario.put("jugar", "play");
    diccionario.put("trabajar", "work");
    diccionario.put("estudiar", "study");
    diccionario.put("cantar", "sing");
    diccionario.put("bailar", "dance");
    diccionario.put("cocinar", "cook");
    diccionario.put("limpiar", "clean");
    diccionario.put("conducir", "drive");
    diccionario.put("comprar", "buy");
  }

  public Map<String, String> getDiccionario() {
    return diccionario;
  }
}


