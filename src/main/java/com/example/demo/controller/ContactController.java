package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@GetMapping("/contact")
	public String index() {
		// 画面遷移：遷移先はお問い合わせ画面
		return "contactForm";
	}
	
	@PostMapping("/contact")
	public String contact(
			@RequestParam(name = "name",  defaultValue = "") String name,
			@RequestParam(name = "email", defaultValue = "") String email,
			Model model) {
		// リクエストパラメータをスコープに登録
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		// 画面遷移：遷移先はお問い合わせ結果画面
		return "contactResult";
	}
}
