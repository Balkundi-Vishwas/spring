package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumerservice {

	@KafkaListener(topics="codedecode_topic",groupId="codeDecode_group")
	public void listentotopic(String recievedmsg)
	{
		System.out.println("the msg recieved is"+recievedmsg);
	}
	
}
