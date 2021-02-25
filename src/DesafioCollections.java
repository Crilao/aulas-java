import java.util.*;


public class DesafioCollections {

    public static void main(String[] args) {

        Map<String, Float> medias = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();
        entradaListaInt(intList, sc);
        /*intList.add(13);
        intList.add(18);
        intList.add(28);
        intList.add(25);
        intList.add(21);
        intList.add(10);*/

        List<String> strList = new ArrayList<>();
        entradaListaStr(strList, sc);
        /*strList.add("12");
        strList.add("33");
        strList.add("7");
        strList.add("15");
        strList.add("24");
        strList.add("22");*/

        ordena(intList);

        List<Integer> strConvertida = stringListToIntList(strList);
        ordena(strConvertida);

        System.out.println("Primeira lista ordenada: " + intList);
        System.out.println("Segunda lista ordenada: " + strConvertida);

        List<Integer> paresL1 = separaPar(intList);
        float mediaParL1 = calcMedia(paresL1);

        List<Integer> imparesL1 = separaImpar(intList);
        float mediaImparL1 = calcMedia(imparesL1);

        List<Integer> paresL2 = separaPar(strConvertida);
        float mediaParL2 = calcMedia(paresL2);

        List<Integer> imparesL2 = separaImpar(strConvertida);
        float mediaImparL2 = calcMedia(imparesL2);

        medias.put("Media dos impares da lista 2: ", mediaImparL2);
        medias.put("Media dos pares da lista 2: ", mediaParL2);
        medias.put("Media dos impares da lista 1: ", mediaImparL1);
        medias.put("Media dos pares da lista 1: ", mediaParL1);

        System.out.println(medias);

        /*System.out.println("\nMedia dos pares da lista 1: " + mediaParL1);
        System.out.println("Media dos impares da lista 1: " + mediaImparL1);
        System.out.println("Media dos pares da lista 2: " + mediaParL2);
        System.out.println("Media dos impares da lista 2: " + mediaImparL2);*/

        System.out.println("\nMaior e menor valores da lista 1: " + maior(intList) + " e " + menor(intList));
        System.out.println("Maior e menor valores da lista 2: " + maior(strConvertida) + " e " + menor(strConvertida));
    }

    private static void ordena(List<Integer> list) {
        Collections.sort(list);
    }

    private static List<Integer> stringListToIntList(List<String> strList) {
        List<Integer> strConvertida = new ArrayList<>();
        for(String num: strList) {
            strConvertida.add(Integer.parseInt(strList.get(strList.indexOf(num))));
        }
        return strConvertida;
    }

    private static List<Integer> separaPar(List<Integer> list) {
        List<Integer> pares = new ArrayList<>();
        for(int num: list) {
            if (list.get(list.indexOf(num)) % 2 == 0) {
                pares.add(list.get(list.indexOf(num)));
            }
        }
        return pares;
    }

    private static List<Integer> separaImpar(List<Integer> list) {
        List<Integer> impares = new ArrayList<>();
        for(int num: list) {
            if (list.get(list.indexOf(num)) % 2 == 1) {
                impares.add(list.get(list.indexOf(num)));
            }
        }
        return impares;
    }

    private static float calcMedia(List<Integer> list){
        float media = 0;
        for(int num: list) {
            media = media + list.get(list.indexOf(num));
        }
        media /= list.size();
        if (Float.isNaN(media)){
            return 0;
        }
        return media;
    }

    private static int maior(List<Integer> list){
        int maior = 0;
        for (int num: list) {
            if(list.get(list.indexOf(num)) > maior) {
                maior = list.get(list.indexOf(num));
            }
        }
        return maior;
    }

    private static int menor(List<Integer> list){
        int menor = list.get(0);
        for (int num: list) {
            if(list.get(list.indexOf(num)) < menor) {
                menor = list.get(list.indexOf(num));
            }
        }
        return menor;
    }

    private static void entradaListaInt(List<Integer> list, Scanner sc) {
        char stop = 's';
        int cont = 1;
        while (stop != 'n') {
            System.out.print("Digite o " + cont + " valor da lista: ");
            if (sc.hasNextInt()) {
                list.add(sc.nextInt());
            } else {
                System.out.println("Somente numeros!");
            }
            System.out.print("Deseja adicionar mais um numero? (s/n)");
            stop = sc.next().charAt(0);
            System.out.println();
            cont++;
        }
    }

    private static void entradaListaStr(List<String> list, Scanner sc) {
        char stop = 's';
        int cont = 1;
        while (stop != 'n') {
            System.out.print("Digite o " + cont + " valor da lista: ");
            if(sc.hasNextInt()){
                list.add("" + sc.nextInt());
            }else{
                System.out.println("Somente numeros!");
            }
            System.out.print("Deseja adicionar mais um numero? (s/n)");
            stop = sc.next().charAt(0);
            System.out.println();
            cont++;
        }
    }
}
