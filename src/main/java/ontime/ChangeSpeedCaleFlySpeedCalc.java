package ontime;

/**
 * 1.调整速度:计算应飞速度
 * 输入： 1.剩余距离  单位：公里，
 *       2.剩余时间  单位：分钟 ，
 *
 * 输出：应飞地速   单位： 公里/小时
 */
public class ChangeSpeedCaleFlySpeedCalc {

    public static void main(String[] args) {



        //剩余距离
        double var3 = 300;
        //剩余时间
        double var6 = 10;



        System.out.println((int)(60.0D * (var3 / var6)));
    }


}
