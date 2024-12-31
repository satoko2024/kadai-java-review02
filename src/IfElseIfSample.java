
public class IfElseIfSample {

    public static void main(String[] args) {
        int score = 80; //成績

        if (score == 100) {
            System.out.println("満点！やったね！");
        }else if(score >= 80) {
            System.out.println("よくできました！");
        }else if (score >= 60) {
            System.out.println("合格です！");
        }else {
            System.out.println("居残り決定！！");
        }
    }

}
