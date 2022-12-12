import java.util.HashMap;

public class TotalWord implements Japaness{

    public HashMap<String, String> getword() {
        Hiragana hiragana = new Hiragana();
        Katakana katakana = new Katakana();
        HashMap<String, String> total = new HashMap<String, String>();
        hiragana.getword().keySet().forEach(x->total.put("히라가나 "+x,hiragana.getword().get(x)));
        katakana.getword().keySet().forEach(x->total.put("가타카나 "+x,katakana.getword().get(x)));
        return total;
    }
}
