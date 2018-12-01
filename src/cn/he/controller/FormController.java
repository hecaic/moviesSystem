package cn.he.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
@RequestMapping(value="/{formName}")
public String login(@PathVariable String formName){
	return formName;
}
}
