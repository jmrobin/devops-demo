package jmr.nand.nanddevops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController
{
	@Value( "${spring.profiles.active}" )
	private String profile;

	@RequestMapping( "/" )
	public String welcome( Model model )
	{
		model.addAttribute("name", "Nand K.");
		model.addAttribute("profile", profile);
		return "index";
	}
}
