package com.harshit1108.SimpleProducerConsumer.Basic;

class Producer extends Thread
{
	DataBlock dataBlock;
	public Producer(DataBlock dataBlock){
		this.dataBlock=dataBlock;
	}

	public void run(){

		int i=1;
		while(true)
		{
			this.dataBlock.produceMessage(i);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){}
			i++;

		}

	}
}