package HHU.Echarts.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author LPD
 * @Date 2021/8/20 22:10
 * @Desc Echarts入门案例
 */
@RestController
public class EchartsController {
    @RequestMapping(value = "/echarts",method = RequestMethod.GET)
    public ModelAndView EchartsTest(){
        //test为在为你的html文件名字,SpringBoot会自动找到这个html文件
        return new ModelAndView("test");
    }

    @RequestMapping("/test")
    public ModelAndView myECharts(Model model){
        String skirt = "裙子";
        int nums = 30;
        model.addAttribute("skirt", skirt);
        model.addAttribute("nums", nums);
        return new ModelAndView("test2");
    }

}