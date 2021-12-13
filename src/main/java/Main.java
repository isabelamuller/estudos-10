import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(2);
        t.add(4);
        t.add(21); // esse q mudou
        t.add(12);
        t.add(45);
        t.add(54);
        t.add(76);
        t.add(58);
        t.set(2, 43); // muda o elemento q ta no index x pro numero y, index primeiro elemento dps
        t.subList(2, 5); // basicamente vai te dar os resultados dos index q tu add ali dentro, nesse caso do index
                         // 2 ate o 4 (5 fica de fora). nao precisa colocar aqui


        System.out.println(t);
        System.out.println(t.subList(2, 5)); // pode apagar de la e deixar so esse aqui, vai funcionar msm assim

        for (Integer integer : t) {
            System.out.println(integer);
        }

    }
}
