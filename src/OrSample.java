
public class OrSample {

    public static void main(String[] args) {
        int scoremath = 59; //数学の成績
        int scorejapanese = 20; //国語の成績

        if (scoremath >= 60 && scorejapanese >= 60) {
            System.out.println("合格！");
        } else if (scoremath >= 60 || scorejapanese >= 60) {
            System.out.println("国語か数学どちらかが補講です");
        } else {
            System.out.println("赤点です。補講決定。");
        }

    }

}
