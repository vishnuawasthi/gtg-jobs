package com.gtg.jobs.runner;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class GTGNotificationsJobRunner {

	@Scheduled(fixedDelay = 5000)
	public void run() {
		System.out.println("run() - start");

		System.out.println("run() - end");
	}
}
