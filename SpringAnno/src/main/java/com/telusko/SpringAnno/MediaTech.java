package com.telusko.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTech implements MobileProcessor {

	public void process() {
		
		System.out.println("2nd Worls CPU");

	}

}
