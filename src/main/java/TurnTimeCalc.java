/**
 * 计算转弯半径
 * 输入： 1.速度  单位:公里/小时  ，量程：1-1999
 *       2.坡度  单位：度 ，量程：1-89
 *       3.转角  单位：
 * 输出： 半径   单位： 米
 */
public class TurnTimeCalc {

    public static void main(String[] args) {

        double var3 =100.0;
        double var5 =30.0;

        double var6 = 3.141592653589793D * (double)var5 / 180.0D;
        double var8 = (double)var3 / 3.6D;
        double var10 = var8 * var8 / (9.81D * Math.tan(var6));
        float var12 = CutShort(var10);
        System.out.println(var12);
    }

    public static float CutShort(double var1) {
        double var3 = (double)((int)(var1 * 10.0D)) / 10.0D;
        if ((double)((float)(var1 - var3)) >= 0.05D) {
            var3 += 0.1D;
        }

        return (float)var3;
    }
}
