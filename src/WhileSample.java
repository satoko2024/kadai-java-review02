
public class WhileSample {

    public static void main(String[] args) {
        int num = 1;//初期値

        //繰り返し条件（num<1024（2＾10）まで）
        while (num < 1024) {
            num = num*2;

            //出力
            System.out.println(num);
        }

    }

}
