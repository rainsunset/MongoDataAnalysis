package com.seer.mongoDataAnalysis.service;

import com.seer.mongoDataAnalysis.model.MachineStatus;
import java.util.List;

/**
 * @autheor ligw
 * @date 2018/9/30 9:33
 */
public interface MachineStatusService {

	MachineStatus findByMachineCode(String machineCode) throws Exception;

}
