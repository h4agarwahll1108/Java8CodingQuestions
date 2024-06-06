package com.harshit1108.ProducerConsumer.Basic;

class DataBlock {
	
	int n;
	boolean NOT_EMPTY = false;
	synchronized public void produceMessage(int n)
	{
		if(NOT_EMPTY){
			try{
				wait();
			} catch(Exception e){}
		}

		this.n=n;
		System.out.println("Producer :" +this.n);
		NOT_EMPTY =true;
		notify();
	}
	synchronized public int consumeMessage()
	{
		if(!NOT_EMPTY){
			try{
				wait();
			}catch(Exception e){}
		}

		System.out.println("Consumer :"+this.n);
		NOT_EMPTY =false;
		notify();
		return this.n;
	}
}