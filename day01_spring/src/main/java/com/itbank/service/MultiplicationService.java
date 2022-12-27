package com.itbank.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {

	private int answer;
	private int answer2;
	
	public void initialize() {
		Random ran = new Random();
		answer = ran.nextInt(9) + 2;
		answer2 = ran.nextInt(9) + 2;
	}
	
	public String getStatus(int user) {
		String status = null;
		
		if(answer*answer2 == (user)) {
			status = "Correct";
		}
		else {
			status = "틀렸습니다";
		}
		return status;
	}

	public int getAnswer() {
		return answer;
	}

	public int getAnswer2() {
		return answer2;
	}
}
