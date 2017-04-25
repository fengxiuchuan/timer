import com.fengxc.dubbo.RegiestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by lenovo on 2017/4/24.
 */
@Controller
@RequestMapping("consumerCtr")
public class ConsumerCtr {

    @Autowired
    private RegiestService regiestService;

    @RequestMapping("/hello")
    public  void dubboHello(HttpServletResponse response)throws Exception
    {
        String result = regiestService.sayHello("fengxc,this is my first dubbo demo.....");
        response.setContentType("UTF-8");
        response.getWriter().print(result);
        response.getWriter().flush();
        response.getWriter().close();
    }
}
