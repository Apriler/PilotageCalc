package groundspeed;

/**
 * 计算风角
 * 输入： 1.航行风向  单位：度，量程 0-360
 *       2.磁航迹角  单位：度 ，量程：0-360
 *
 *
 * 输出：风角   单位： 度
 */
public class WindAngleCalc {

    public static void main(String[] args) {



        //航行风向
        double var3 = 30.0;
        //磁航迹角
        double var5 = 100;


        System.out.println(var3 - var5);
    }


}
