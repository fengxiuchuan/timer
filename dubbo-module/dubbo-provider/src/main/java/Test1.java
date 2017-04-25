import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/4/24.
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        context.start();

        System.out.println("provider run ...");

        System.in.read();
    }
}
