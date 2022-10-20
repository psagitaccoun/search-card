package com.marketing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.dto.Card;
import com.marketing.service.A;

@Controller
public class SearchCard {
	
	@Autowired
	private A a;

	@RequestMapping("/search")
	public String searchCard() {
	return "search_card";
		}
	
	@RequestMapping("/searchById")
	public String searchCardById(@RequestParam("id") long id,ModelMap model) {
	Card card = a.getById(id);
	model.addAttribute("card", card);
	return "card_info";
	}
      }
