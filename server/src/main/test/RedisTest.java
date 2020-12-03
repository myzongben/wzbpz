import com.abc.entity.SysUser;
import com.abc.util.RedisUtil;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * description  redis测试类
 * created      2020/10/26 20:58
 * class_name   RedisTest
 * @author      wzb
 * @version     1.0
 */
public class RedisTest extends CommonTest {
    @Autowired
    private RedisUtil redisUtil;

  /**
   * description  redis String类型的数据的增删改查等操作
   * date         2020/10/26 21:01
   * @author      wzb
   * @param
   * @return      void
   */
  @Test
    public void StringTest(){
        redisUtil.set("nimei","asdasd");
        //  redisUtil.incr("ceshi",10);  //累加操作，可以用作记录文章阅读数，微博粉丝数
        // redisUtil.incr("ceshi",12);
        // redisUtil.incr("ceshi",14);
       // redisUtil.decr("ceshi",22);  //减法运算
        Integer ceshi = (Integer) redisUtil.get("ceshi");

        System.out.println("ceshi:"+ceshi);
    }

    /**
     * description  redis Hash数据增删改查
     * date         2020/10/26 21:05
     * @author      wzb
     * @param
     * @return      void
     */
    @Test
    public void HashTest(){
        SysUser sysUser = new SysUser();
        sysUser.setPwd("12580");
        sysUser.setUid("1");
        sysUser.setUname("wangzongben1");
        //hset中key相当于MySQL数据库的表名，表示的是一个hash表；item可以理解为表征数据的真正key，在这个表中是唯一的，可以通过这个item在一张hash表中定位一个数据
        redisUtil.hset("sys_User","user:1",sysUser);
        sysUser.setPwd("6627123");
        sysUser.setUid("2");
        sysUser.setUname("wangzongben2");
        redisUtil.hset("sys_User","user:2",sysUser);
        SysUser sys_user = (SysUser) redisUtil.hget("sys_User", "user:2");
        System.out.println("sys_user"+sys_user);

        HashMap hashMap = new HashMap<>();
        hashMap.put(null,null);

        Hashtable table=new Hashtable();
        table.put(null,null);
       // AtomicInteger


    }
}
