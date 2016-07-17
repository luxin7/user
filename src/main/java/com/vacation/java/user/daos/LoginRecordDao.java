package com.vacation.java.user.daos;

import com.vacation.java.user.models.LoginRecord;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by luxin on 2016/7/17.
 */
public interface LoginRecordDao extends CrudRepository <LoginRecord,Integer>{
}
