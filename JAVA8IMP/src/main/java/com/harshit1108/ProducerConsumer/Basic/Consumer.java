package com.harshit1108.ProducerConsumer.Basic;

class Consumer extends Thread{
	DataBlock dataBlock;

	public Consumer(DataBlock dataBlock){
		this.dataBlock=dataBlock;
	}

	public void run()
	{
		while(true){
			this.dataBlock.consumeMessage();
			try{
				Thread.sleep(2000);
			}
			catch(Exception e){}
		}
	}

}