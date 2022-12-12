import java.util.HashMap;

public class Katakana implements Japaness{


    public HashMap<String, String> getword() {
        HashMap<String, String> word = new HashMap<>();
        word.put("ア", "아");
        word.put("イ", "이");
        word.put("ウ", "우");
        word.put("エ", "에");
        word.put("オ", "오");

        word.put("カ", "카");
        word.put("キ", "키");
        word.put("ク", "쿠");
        word.put("ケ", "케");
        word.put("コ", "코");

        word.put("サ", "사");
        word.put("シ", "시");
        word.put("ス", "스");
        word.put("セ", "세");
        word.put("ソ", "소");

        word.put("タ", "타");
        word.put("チ", "치");
        word.put("ツ", "츠");
        word.put("テ", "테");
        word.put("ト", "토");

        word.put("ナ", "나");
        word.put("二", "니");
        word.put("ヌ", "누");
        word.put("ネ", "네");
        word.put("ノ", "노");

        word.put("ハ", "하");
        word.put("ヒ", "히");
        word.put("フ", "후");
        word.put("ヘ", "헤");
        word.put("ホ", "호");

        word.put("マ", "마");
        word.put("ミ", "미");
        word.put("ム", "무");
        word.put("メ", "메");
        word.put("モ", "모");

        word.put("ヤ", "야");
        word.put("ユ", "유");
        word.put("ヨ", "요");

        word.put("ラ", "라");
        word.put("リ", "리");
        word.put("ル", "루");
        word.put("レ", "레");
        word.put("ロ ", "로");

        word.put("ワ", "와");
        word.put("ヲ", "오");
        word.put("ン ", "응");
        return word;
    }
}