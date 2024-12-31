
public class SwitchSample {

    public static void main(String[] args) {
        int score = 79; //成績
        //rankingメソッドを呼び出し、点数をランキング（スコア10ごとのランク）に変更し取得
        int rank = ranking(score);

        switch(rank) {
        //scoreが0～59
        case 0 :
        case 1 :
        case 2 :
        case 3 :
        case 4 :
        case 5 :
            System.out.println("補講決定");
            break;
        //scoreが60～79
        case 6 :
        case 7 :
            System.out.println("合格です");
            break;
        //scoreが80～99
        case 8 :
        case 9 :
            System.out.println("よくできました");
            break;
          //scoreが100
        case 10 :
            System.out.println("満点ですスバラシイ");
            break;
        default:
            System.out.println("点数は0以上100以下で入力してください");
            break;

        }


    }
    public static int ranking(int score) {
        //引数scoreが0を下回る場合
        if (score < 0) {
            return -1;
        //引数scoreが100を上回る場合
        }else if (score > 100) {
            return 11;
        }else{
            return score / 10;

        }
    }

}
