package com.java.features;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class UploadResult1 implements Callable<Boolean> {
	private String taskName;

	public UploadResult1(String name) {
		taskName = name;
	}

	@Override
	public Boolean call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " (Start) " + taskName);
		// Code for uploading result: Dummy implementation
		Boolean retValue = null;
		try {
			Thread.sleep(2000);
			// code to Upload result
			// Set retValue to true
			retValue = Boolean.TRUE;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// Set retValue to false
			retValue = Boolean.FALSE;
		}
		System.out.println(Thread.currentThread().getName() + " (End) " + taskName);
		return retValue;
	}
}

public class CallableFuture {
	public static void main(String[] args) {
		ExecutorService exService = Executors.newSingleThreadExecutor();
		UploadResult1 uploadCallable = new UploadResult1("Batch 1");
		Future<Boolean> future = exService.submit(uploadCallable);
		try {
			System.out.println("Upload completed: " + future.get());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		exService.shutdown();
	}

}
