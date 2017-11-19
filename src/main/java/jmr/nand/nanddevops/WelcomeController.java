package jmr.nand.nanddevops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value( "${spring.profiles.active}" )
	private String profile;

	@RequestMapping( "/" )
	public String welcome( Model model )
	{
		logger.info("processing index request in welcome controller - enjoy");
		model.addAttribute("name", "Nand K.");
		model.addAttribute("profile", profile);
		return "index";
	}
}
