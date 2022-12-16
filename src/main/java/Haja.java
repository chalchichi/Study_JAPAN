import java.util.HashMap;

public class Haja implements Japaness{


    public HashMap<String, String> getword()
    {
        HashMap<String, String> word = new HashMap<>();
        word.put("僕","보쿠");
        word.put("私","와타시");
        word.put("俺","오레");
        word.put("君","키미");
        word.put("誰","타레");

        return word;
    }
}
