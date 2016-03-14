package com.ssm.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.ssm.pojo.UserT;
import com.ssm.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
 @Resource
 private IUserService userService;


 @RequestMapping("/showUser")
 public String toIndex(HttpServletRequest request,Model model){
  int userId = Integer.parseInt(request.getParameter("id"));
  UserT user = this.userService.getUserById(userId);
  model.addAttribute("user", user);
  return "showUser";
 }
}