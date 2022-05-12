package com.chainsys.thread;

public class TestWorkerThread {
	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		try
		{
			System.out.println("Th ID: " +t1.getId() );
			Workerthread t2=new Workerthread();
			Workerthread t3=new Workerthread();
			t2.start(); 
			t3.start();			
			System.out.println("End of Main Th ID: " +t1.getId() );
		}catch(Exception err){
			System.out.println(err.getMessage());
		}		
	}
}
