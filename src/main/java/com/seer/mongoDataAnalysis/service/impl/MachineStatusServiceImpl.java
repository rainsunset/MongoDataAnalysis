package com.seer.mongoDataAnalysis.service.impl;

import com.seer.mongoDataAnalysis.common.BaseService;
import com.seer.mongoDataAnalysis.exception.GlobalErrorInfoEnum;
import com.seer.mongoDataAnalysis.exception.GlobalErrorInfoException;
import com.seer.mongoDataAnalysis.model.MachineStatus;
import com.seer.mongoDataAnalysis.repository.MachineStatusRepository;
import com.seer.mongoDataAnalysis.service.MachineStatusService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @autheor ligw
 * @date 2018/9/30 9:33
 */
@Service
public class MachineStatusServiceImpl extends BaseService implements MachineStatusService{

	@Autowired
	private MachineStatusRepository machineStatusRepository;

	@Override
	public MachineStatus findByMachineCode(String machineCode) throws Exception {
		try {
			return machineStatusRepository.findByMachineCode(machineCode);
		} catch (Exception e) {
			logger.error(String.format("设备状态信息查询 >>> 异常信息:%S", e.toString()));
			throw new GlobalErrorInfoException(GlobalErrorInfoEnum.SYSTEM_ERROR);
		}
	}
}
