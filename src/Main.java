//Copia il seguente programma Java e sostutuisci il costrutto if-else con l'operatore ternario
public class Main {
    public static void main(String[] args) {
        System.out.println(checkString("Questa è una stringa"));
    }

    private static String checkString(String value) {
        final String result = value.length() >= 10 ? "Lunghezza maggiore o uguale a 10" : "Lunghezza minore di 10";
        return result;
    }
}


//Programma iniziale con costrutto if-else
//        String result;
//        if (value.length() >= 10) {
//            result = "Lunghezza maggiore o uguale di 10";
//        } else {
//            result = "Lunghezza minore di 10";
//        }
//        return result;
//    }