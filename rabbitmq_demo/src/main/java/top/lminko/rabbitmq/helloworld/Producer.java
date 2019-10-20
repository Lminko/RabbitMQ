package top.lminko.rabbitmq.helloworld;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName Producer
 * @Author Lihuiming
 * @Email armin1580916175@gmail.com
 * @Date 2019/10/16 20:13
 * @Description RabbitMq简单模式：消息生产者--用户产生消息
 **/

public class Producer {

    public String Producer() {

        System.out.println("22222222");

        return "";
    }

    //1.0分支

    public static void main(String[] args) throws Exception {
        /**
         *  创建消息服务器连接对象，设置连接属性：
         *      Host：服务器主机地址
         *      Port: RabbitMq服务器端口
         *      VirtualHost：虚拟主机地址
         *      Username：用户名
         *      Password：密码
         */
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.10.110");
        factory.setPort(5672);
        factory.setVirtualHost("/export");
        factory.setUsername("minko");
        factory.setPassword("armin");

        //使用连接工厂创建连接
        Connection connection = factory.newConnection();
        //获取频道
        Channel channel = connection.createChannel();
        //声明队列

    }
}
