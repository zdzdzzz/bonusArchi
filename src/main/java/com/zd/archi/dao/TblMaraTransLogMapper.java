package com.zd.archi.dao;

import com.zd.archi.model.TblMaraTransLog;
import com.zd.archi.model.TblMaraTransLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblMaraTransLogMapper {
    int countByExample(TblMaraTransLogExample example);

    int deleteByExample(TblMaraTransLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblMaraTransLog record);

    int insertSelective(TblMaraTransLog record);

    List<TblMaraTransLog> selectByExample(TblMaraTransLogExample example);

    TblMaraTransLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblMaraTransLog record, @Param("example") TblMaraTransLogExample example);

    int updateByExample(@Param("record") TblMaraTransLog record, @Param("example") TblMaraTransLogExample example);

    int updateByPrimaryKeySelective(TblMaraTransLog record);

    int updateByPrimaryKey(TblMaraTransLog record);

	void batchInsert(List<TblMaraTransLog> records);
}