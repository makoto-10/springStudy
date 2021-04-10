package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class MainController {
@RequestMapping("/")
public ModelAndView index(ModelAndView mv) {
mv.setViewName("index");
return mv;
}


@RequestMapping("/test")
public ModelAndView test(ModelAndView mv) {
mv.setViewName("test");
return mv;
}


@RequestMapping("/index2")
public ModelAndView index2(ModelAndView mv) {
mv.addObject("name", "鈴木Java五郎");
mv.setViewName("index2");
return mv;
}

@RequestMapping(value="/index3", method=RequestMethod.GET)
public ModelAndView indexGet(ModelAndView mv) {
mv.addObject("name", "名前がここに入ります");
mv.addObject("age", "年齢がここに入ります");
mv.addObject("height", "身長がここに入ります");
mv.setViewName("index3");
return mv;
}

@RequestMapping(value="/index3", method=RequestMethod.POST)
public ModelAndView indexGet(ModelAndView mv, @RequestParam("nameval")String name,
		@RequestParam("ageval")String age, @RequestParam("heightval")String height){
mv.addObject("name", "name");
mv.addObject("age", "age");
mv.addObject("height", "height");
mv.setViewName("index3");
return mv;
}

}