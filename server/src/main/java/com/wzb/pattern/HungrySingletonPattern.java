package com.wzb.pattern;
/**
 * description  饿汉式 在jvm进行类加载时就初始化实例
 * created      2020/10/17 16:40
 * class_name   hungrySingletonPattern
 * @author      wzb
 * @version     1.0
 */
public class HungrySingletonPattern {
    private  static  HungrySingletonPattern instance= new HungrySingletonPattern();
    //静态代码块
   /* static {
        try {
            instance = new HungrySingletonPattern();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public static HungrySingletonPattern getInstance(){
        return instance;
    }
    /**
     * description  在构造函数中加判断抛异常的原因是，如果被恶意使用反射强行违反单例原则构造新对象，则在构造函数中抛出以下异常
     * date         2020/10/17 17:03
     * @author      wzb
     * @param
     * @return
     */
    private HungrySingletonPattern() {
        //一般不用写
      /*  if(instance!=null){
            throw new Exception("已存在单例实例对象");
        }*/
    };

}
