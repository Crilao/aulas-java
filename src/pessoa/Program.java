package pessoa;

import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {
        Pessoa crilao = new Pessoa("Cristiano", LocalDateTime.of(2000, 9, 6, 0, 0), 1.81);
        System.out.println(crilao.toString());
    }

}
