package com.zd.archi.service;

import javax.jms.Destination;

import com.zd.archi.model.TblMaraTransLog;

public interface ProduceService {
	void sendMessage(Destination destination, final TblMaraTransLog message);
}
