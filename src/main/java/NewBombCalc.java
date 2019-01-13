
import com.ycjr.poiltcalculation.constants.CommonConst;

import java.util.Locale;

/**
 * 轰炸计算
 * 输入： 1.弹型系数
 *       2.投弹速度  单位：公里/小时 ，
 *      3.初始高度 单位：米 ，
 *      4.目标高度  单位：米 ，
 *
 *  注：此算法无法运行，有问题
 *
 * 输出：1.退曳   单位： 米
 *      2.炸弹下落时间 单位：小时
 *      3.射程 单位： 米
 *      4.落地时的水平速度 单位： 公里/小时
 *      5.落地时的垂直速度 单位： 公里/小时
 *      6.炸弹落角 单位 度
 *
 */
public class NewBombCalc {


    public static void main(String[] args) {



        //弹型系数
        double var4 = 100;
        //投弹速度
        double var7 = 109;
        //初始高度
        double var10 = 50;
        //目标高度
        double var13 = 52;



        calculate(25.0D, 1500.0D, 2000.0D, 0.0D);

        Bombard.CalcResult var15 = Bombard.Calc.calculate(var4, var7, var10, var13);
        Locale var17 = Locale.CHINA;
        Object[] var18 = new Object[]{var15.delta};
        System.out.println("退曳："+(String.format(var17, "%.3f", var18)));
        Locale var20 = Locale.CHINA;
        Object[] var21 = new Object[]{var15.T};
        System.out.println("炸弹下落时间："+String.format(var20, "%.3f", var21));
        Locale var23 = Locale.CHINA;
        Object[] var24 = new Object[]{var15.shootDistance};
        System.out.println("射程："+String.format(var23, "%.3f", var24));
        Locale var26 = Locale.CHINA;
        Object[] var27 = new Object[]{var15.horizontalSpeed};
        System.out.println("落地时的水平速度："+String.format(var26, "%.3f", var27));
        Locale var29 = Locale.CHINA;
        Object[] var30 = new Object[]{var15.verticalSpeed};
        System.out.println("落地时的垂直速度："+String.format(var29, "%.3f", var30));

        Locale var32 = Locale.CHINA;
        Object[] var33 = new Object[]{var15.landingAngle};
        System.out.println("炸弹落角："+String.format(var32, "%.3f", var33));
    }

    private static  Bombard.CalcResult calculate(double var1, double var3, double var5, double var7) {
        Bombard.CalcResult var9 = Bombard.Calc.calculate(var1, var3, var5, var7);
        StringBuilder var10 = (new StringBuilder()).append("onClick: ");
        Object[] var11 = new Object[]{var9.delta, (int)var9.T, var9.shootDistance, var9.horizontalSpeed, var9.verticalSpeed, var9.landingAngle, var9.speed};

        System.out.println((var10.append(String.format("退拽:%f%n时间:%d%n射程:%f%n水平速度:%f%n垂直速度:%f%n落角:%f%nSpeed:%f%n", var11)).toString()));
        return var9;
    }

    private static boolean equals(double var1, double var3) {

        return Math.abs(var1 - var3) < CommonConst.minGap.d;
    }


}
