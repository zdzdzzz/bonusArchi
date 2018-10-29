package com.zd.archi.schedual;

import java.util.Date;
import java.util.TimerTask;
import java.util.Vector;

import com.zd.archi.model.TblMaraTransLog;

public class BatchInsert extends TimerTask{
	private Vector<TblMaraTransLog> vector;
	public BatchInsert(){
	}
	
	public BatchInsert(Vector<TblMaraTransLog> vector){
		this.vector = vector;
	}	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date date = new Date(this.scheduledExecutionTime());
        System.out.println("本次执行该线程的时间为：" + date);
        System.out.println("本次执行该线程的时间为：" + vector.size());
        vector.clear();
        
	}

}
