import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RunStudy {
    public void run()
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        Japaness japaness = null;

        String ans= null;
        boolean re = true;
        while (re) {
            System.out.print("어떤 언어로 할까요? 1.히라가나  2.가타카나  3.섞어서  4.숫자 : ");
            ans = sc.nextLine();
            switch (ans) {
                case "1":
                    japaness = new Hiragana();
                    re = false;
                    break;
                case "2":
                    japaness = new Katakana();
                    re = false;
                    break;
                case "3":
                    japaness = new TotalWord();
                    re = false;
                    break;
                case "4":
                    japaness = new Number();
                    re = false;
                    break;
                default:
                    System.out.println("1,2,3 중에 선택해주세요");
            }
        }
        HashMap<String,String> incorrect = new HashMap<>();
        List<String> wordjapan = japaness.getword().keySet().stream().collect(Collectors.toList());
        int num = 1;
        while(true)
        {
            int iValue = rand.nextInt(wordjapan.size());
            String correct = japaness.getword().get(wordjapan.get(iValue));
            System.out.print(String.format("%d번 : %s = ",num,wordjapan.get(iValue)));
            ans = sc.nextLine();
            if(correct.equals(ans)) System.out.println("정답입니다.");
            else
            {
                incorrect.put(wordjapan.get(iValue),correct);
                System.out.println(String.format("틀렸습니다 정답은 %s 입니다.",correct));
            }
            num+=1;
            if(num==100) break;
        }
        System.out.println("틀린것 복습합니다.");
        incorrect.keySet().forEach(x->{
            System.out.println(String.format("%s : %s",x,incorrect.get(x)));
        });
        List<String> uncolwordjapan = incorrect.keySet().stream().collect(Collectors.toList());
        num = 1;
        while(true)
        {
            if(uncolwordjapan.size()==0) break;
            int iValue = rand.nextInt(uncolwordjapan.size());
            String correct = incorrect.get(uncolwordjapan.get(iValue));
            System.out.print(String.format("%d번 : %s = ",num,uncolwordjapan.get(iValue)));
            ans = sc.nextLine();
            if(correct.equals(ans)) System.out.println("정답입니다.");
            else
            {
                System.out.println(String.format("틀렸습니다 정답은 %s 입니다.",correct));
            }
            num+=1;
            if(num==50) break;
        }
    }
}
