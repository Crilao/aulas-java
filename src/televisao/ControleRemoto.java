package televisao;

public class ControleRemoto {
    public static void main(String[] args) {
        Televisao tv = new Televisao(39, 20);
        System.out.println("Televisao inicializada com canal 39 e volume 20");
        System.out.println(tv.toString());

        tv.aumentaVolume();
        System.out.println("\nApertou o botao de aumentar o volume");
        System.out.println(tv.toString());

        tv.diminuiVolume();
        System.out.println("\nApertou o botao de diminuir o volume");
        System.out.println(tv.toString());

        tv.aumentaCanal();
        System.out.println("\nApertou o botao de aumentar o canal");
        System.out.println(tv.toString());

        tv.diminuiCanal();
        System.out.println("\nApertou o botao de diminuir o canal");
        System.out.println(tv.toString());

        tv.setCanal(70);
        System.out.println("\nTrocou para o canal 70");
        System.out.println(tv.toString());
    }
}
