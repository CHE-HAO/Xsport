package lin.project.xsport.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lin.project.xsport.utils.StringUtils;

/**
 * springMVC透過annotation來劃分功能且省掉一些功
 * 像@Controller就是透過annotation來宣告這支java的功能
 */
@Controller
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * RequestMapping value相當於路徑，也可以在@Controller那裏宣告
	 * 例如我要進入這支method
	 * 我就可以呼叫
	 * http://localhost:8080/xsport/
	 * 或是
	 * http://localhost:8080/xsport/login
	 */
	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String login(Model model) {
		log.info("enter.");
		/*
		 * 這個return在一般沒有另外宣告ajax的情況下，都會用String回傳
		 * 他會根據你回傳的字串
		 * 在設定的目錄下(預設為src/main/webapp/WEB-INF/views)尋找相關的jsp
		 * 例如我回傳login，他就會去找views下的login.jsp
		 * 如果有子資料夾(例如user)
		 * 我就回傳"user/login"
		 * 他就會去找views/user/login.jsp
		 * 
		 * 這些參數在servlet-context.xml中設定(預設)
		 */
		return "login";
	}
	
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String doLogin(Model model, 
			@RequestParam(value = "userId", required = true) String userId, 
			@RequestParam(value = "userPswd", required = true) String userPswd 
			) {
		log.info("enter.");
		log.debug("userId="+userId);
		if(StringUtils.isNotBlank(userPswd)){
			userPswd = StringUtils.MD5encoder(userPswd);
		} else {
			log.error("Password is not correct.");
		}
		return "home";
	}
}
