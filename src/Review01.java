
public class Review01 {

    public static void main(String[] args) {
     // 変数の宣言・初期化
        int NoTaxPrice = 1500; // 税抜き価格をint型で変数宣言し、商品価格を代入
        double Tax = 0.1; // 税率をdouble型で宣言し、税率を代入
        double result; //消費税率（小数）を乗じるため、途中までdoubleで計算）
        result = taxMethod(NoTaxPrice,Tax);
        int TaxInPrice = (int)result + (int)NoTaxPrice;//税込額算出時にintに戻す
        System.out.println(NoTaxPrice +"円の商品の税込価格は" + TaxInPrice + "円（消費税は" +(int)result+ "円）です。");}

    public static double taxMethod (int NoTaxPrice,double Tax ) {
        double result = NoTaxPrice * Tax ;
        return result;
    }
}