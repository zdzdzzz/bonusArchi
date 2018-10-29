package com.zd.archi.service;

import java.util.List;

import com.zd.archi.model.TblMaraTransLog;

public interface TblMaraTransLogService {
	void saveLog(TblMaraTransLog record);
	void batchSaveLog(List<TblMaraTransLog> records);
}
