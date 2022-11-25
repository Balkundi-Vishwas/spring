package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producerservice {

	@Autowired
	KafkaTemplate<String,String> kafkatemplate;
	
	public void sendmsgtotopic(String msg)
	{
		kafkatemplate.send("codedecode_topic", msg);	
	}
}
