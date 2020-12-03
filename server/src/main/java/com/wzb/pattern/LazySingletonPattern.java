package com.wzb.pattern;

/**
 * 懒汉式单例设计模式
 * 延迟加载，只有在首次被调用的时候在会实例化对象
 * description  懒汉式单例设计模式   延迟加载，只有在首次被调用的时候在会实例化对象
 *
 * date         2020/10/17 16:35
 * @author      wzb
 */
public class LazySingletonPattern {
    private static volatile LazySingletonPattern instance;
    private LazySingletonPattern(){};

    public  static LazySingletonPattern getInstance(){
        //在方法上加synchronized同步锁或是用同步代码块对类加同步锁，此种方式虽然解决了多个实例对象问题，
        // 但是该方式运行效率却很低下，下一个线程想要获取对象，就必须等待上一个线程释放锁之后，才可以继续运行。
        // 使用双重检查进一步做了优化，可以避免整个方法被锁，只对需要锁的代码部分加锁，可以提高执行效率。
        if(instance==null){
            synchronized (LazySingletonPattern.class){
               if(instance==null){
                   instance=new LazySingletonPattern();
               }
            }
        }
        return instance;
    }

}
