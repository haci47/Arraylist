import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> singer = new ArrayList<String>();
        singer.add("AYNUR DOĞAN");
        singer.add("ŞİVAN PERVER");
        singer.add("CİWAN HACO");
        singer.add("BRADER");
        singer.add("MEM ARARAT");
        for (int i = 0; i <singer.size() ; i++) {
            System.out.println("SİNGER\t"+ singer.get(i));

        }
    }
}
