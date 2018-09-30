package com.seer.mongoDataAnalysis.repository;

import com.seer.mongoDataAnalysis.model.MachineStatus;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @autheor ligw
 * @date 2018/9/30 9:25
 */
@Repository
public interface MachineStatusRepository extends MongoRepository<MachineStatus, ObjectId> {

	MachineStatus findByMachineCode(String machineCode) throws Exception;

	// java 查询mongo
	// https://www.jianshu.com/p/7ab5b497427e
	// https://leokongwq.github.io/2017/05/17/springboot-mongo.html

}
