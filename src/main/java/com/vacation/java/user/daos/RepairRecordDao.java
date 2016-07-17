package com.vacation.java.user.daos;

import com.vacation.java.user.models.RepairRecord;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by luxin on 2016/7/17.
 */
public interface RepairRecordDao extends CrudRepository<RepairRecord,Integer> {
}
