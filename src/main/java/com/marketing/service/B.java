package com.marketing.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.marketing.dto.Card;

@Service
public class B implements A {

	@Override
	public Card getById(long id) {
		RestTemplate rt=new RestTemplate();
		Card card = rt.getForObject("http://localhost:80/api/cards/card/"+id, Card.class);
		return card;
	}

}
