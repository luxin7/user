package com.vacation.java.user.daos;

import com.vacation.java.user.models.RepairStatus;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by luxin on 2016/7/17.
 */
public interface RepairStatusDao extends CrudRepository<RepairStatus,Integer> {
}
