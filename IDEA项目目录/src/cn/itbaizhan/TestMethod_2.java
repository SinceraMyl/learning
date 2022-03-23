package cn.itbaizhan;

public class TestMethod_2 {
    //  定义一个方法
    public static int late(int lateMinute,double salary){

        int fakuan = 0;  //罚款


        if(lateMinute<=11){
            System.out.println("警告！！！");
        }else if(lateMinute<21){
            fakuan = 100;

        }else if(lateMinute<31){
            fakuan = 200;
        }else if(lateMinute<61){
            fakuan = (int)(salary/(21.75*2));      //21.75：月平均工作日
        }else {
            fakuan = (int)(salary*3/(21.75));
        }
        System.out.println("迟到时间："+lateMinute+",罚款："+fakuan);

        return fakuan;

    }

    public static void main(String[] args) {
        late(45,464646);

    }



}
