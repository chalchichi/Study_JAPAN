import java.util.HashMap;

public class Hiragana implements Japaness{


    public HashMap<String, String> getword() {
        HashMap<String, String> word = new HashMap<>();
        word.put("あ", "아");
        word.put("い", "이");
        word.put("う", "우");
        word.put("え", "에");
        word.put("お", "오");

        word.put("か", "카");
        word.put("き", "키");
        word.put("く", "쿠");
        word.put("け", "케");
        word.put("こ", "코");

        word.put("さ", "사");
        word.put("し", "시");
        word.put("す", "스");
        word.put("せ", "세");
        word.put("そ", "소");

        word.put("た", "타");
        word.put("ち", "치");
        word.put("つ", "츠");
        word.put("て", "테");
        word.put("と", "토");

        word.put("な", "나");
        word.put("に", "니");
        word.put("ぬ", "누");
        word.put("ね", "네");
        word.put("の", "노");

        word.put("は", "하");
        word.put("ひ", "히");
        word.put("ふ", "후");
        word.put("へ", "헤");
        word.put("ほ", "호");

        word.put("ま", "마");
        word.put("み", "미");
        word.put("む", "무");
        word.put("め", "메");
        word.put("も", "모");

        word.put("や", "야");
        word.put("ゆ", "유");
        word.put("よ", "요");

        word.put("ら", "라");
        word.put("り", "리");
        word.put("る", "루");
        word.put("れ", "레");
        word.put("ろ ", "로");

        word.put("わ", "와");
        word.put("を", "오");
        word.put("ん ", "응");
        return word;
    }
}

