
public class SampleEnum {
    //列挙型Genderの定義
    public static enum Gender{
        メンズ,
        ウィメンズ
    }

    public static void main(String[] args) {

        //Gender型の変数の宣言と初期化
        Gender gender0 = Gender.メンズ;
        Gender gender1 = Gender.ウィメンズ;


        //genderの利用
        System.out.println(gender0);
        System.out.println(gender1);


        //採番された数値を取得したい場合は、変数名ordinal()と書く
        System.out.println(gender0.ordinal());
        System.out.println(gender1.ordinal());

    }

}
