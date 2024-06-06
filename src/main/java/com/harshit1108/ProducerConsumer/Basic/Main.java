package com.harshit1108.ProducerConsumer.Basic;

class Main
{

	public static void main(String[] args) throws Exception
	{
		var dataBlock = new DataBlock();
		var p = new Producer(dataBlock);
		var c = new Consumer(dataBlock);
		p.start();
		c.start();
		
	}
}

/*
Producer :1
Consumer :1
Producer :2
Consumer :2
Producer :3
Consumer :3
Producer :4
Consumer :4
Producer :5
Consumer :5
Producer :6
*/