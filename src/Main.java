import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Diccionario instanciaDiccionario = new Diccionario();
    Map<String, String> diccionario = instanciaDiccionario.getDiccionario();
    Scanner scanner = new Scanner(System.in);

    boolean continuarJuego = true;
    while (continuarJuego) {
      seleccionarPalabrasDelDiccionario(diccionario, scanner);
      continuarJuego = reiniciarJuego(scanner);
    }
    System.out.println("Gracias por jugar!");
  }

  private static void seleccionarPalabrasDelDiccionario(Map<String, String> diccionario, Scanner scanner) {
    Random numeroRandom = new Random();

    String[] palabrasEnEspanol = diccionario.keySet().toArray(new String[0]);
    List<String> respuestasCorrectas = new ArrayList<>();
    List<String> respuestasIncorrectas = new ArrayList<>();
    Set<Integer> indicesSeleccionados = new HashSet<>();

    while (indicesSeleccionados.size() < 5) {
      int busquedaAleatoria = numeroRandom.nextInt(palabrasEnEspanol.length);
      if (!indicesSeleccionados.contains(busquedaAleatoria)) {
        indicesSeleccionados.add(busquedaAleatoria);
        String palabraEsp = palabrasEnEspanol[busquedaAleatoria];
        System.out.println("¡Hola!...");
        System.out.println("Vamos a jugar escribe la traduccion de las siguientes 5 palabras");
        System.out.println("¿Cuál es la traducción de la siguiente palabra '" + palabraEsp + "'?:");
        String respuesta = scanner.nextLine();

        if (diccionario.get(palabraEsp).equalsIgnoreCase(respuesta)) {
          respuestasCorrectas.add(palabraEsp);
        } else {
          respuestasIncorrectas.add(palabraEsp);
        }
      }
    }


    System.out.println("Respuestas correctas:");
    for (String palabra : respuestasCorrectas) {
      System.out.println(palabra + " -> " + diccionario.get(palabra));
    }

    System.out.println("Respuestas incorrectas:");
    for (String palabra : respuestasIncorrectas) {
      System.out.println(palabra + " -> " + diccionario.get(palabra));
    }

    System.out.println("Total de respuestas correctas: " + respuestasCorrectas.size());
    System.out.println("Total de respuestas incorrectas: " + respuestasIncorrectas.size());
  }

  private static boolean reiniciarJuego(Scanner scanner) {
    System.out.println("¿Quieres jugar de nuevo? (sí/no):");
    String respuesta = scanner.nextLine();
    return respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("si");
  }
}