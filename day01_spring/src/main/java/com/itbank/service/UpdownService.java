package com.itbank.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class UpdownService {

	private int answer;
	private int count;
	
	public void initialize() {
		Random ran = new Random();
		answer = ran.nextInt(100) + 1;
		count = 0;
	}
	public String getStatus(int user) {
		String status = null;
		count++;
		if(answer == user) {
			status = "Correct";
		}
		else if(answer > user) {
			status = "Up";
		}
		else {
			status = "Down";
		}
		return status;
	}
	
	public int getCount() {
		return count;
	}
	public int getAnswer() {
		return answer;
	}
}
