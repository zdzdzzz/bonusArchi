package com.zd.archi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zd.archi.dao.TblMaraTransLogMapper;
import com.zd.archi.model.TblMaraTransLog;
import com.zd.archi.service.TblMaraTransLogService;

@Service
public class TblMaraTransLogServiceImpl implements TblMaraTransLogService{

	@Resource
	TblMaraTransLogMapper tblMaraTransLogMapper;
	
	@Override
	public void saveLog(TblMaraTransLog record) {
		// TODO Auto-generated method stub
		tblMaraTransLogMapper.insert(record);
	}

	@Override
	public void batchSaveLog(List<TblMaraTransLog> records) {
		// TODO Auto-generated method stub
		tblMaraTransLogMapper.batchInsert(records);
	}

}
