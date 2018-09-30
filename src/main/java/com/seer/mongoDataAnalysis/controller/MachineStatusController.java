package com.seer.mongoDataAnalysis.controller;

import com.seer.mongoDataAnalysis.common.BaseController;
import com.seer.mongoDataAnalysis.exception.GlobalErrorInfoEnum;
import com.seer.mongoDataAnalysis.exception.GlobalErrorInfoException;
import com.seer.mongoDataAnalysis.model.MachineStatus;
import com.seer.mongoDataAnalysis.service.MachineStatusService;
import com.seer.mongoDataAnalysis.view.ResponseResult;
import com.seer.mongoDataAnalysis.view.RestResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autheor ligw
 * @date 2018/9/30 9:36
 */
@Api(tags = "设备状态")
@RestController
@RequestMapping("/equipment")
public class MachineStatusController extends BaseController {

	@Autowired
	private MachineStatusService machineStatusService;

	@ApiOperation("Test")
	@GetMapping("/machineStatus/{machineCode}")
	public ResponseResult<MachineStatus> getMachineStatus( @ApiParam(value = " (设备编码)") @PathVariable String machineCode) throws GlobalErrorInfoException {
		try {
			MachineStatus machineStatusList = machineStatusService.findByMachineCode(machineCode);
			return RestResultGenerator.genResult(machineStatusList);
		} catch (GlobalErrorInfoException e) {
			throw e;
		} catch (Exception e) {
			logger.error(String.format("Controller >>> 断刀频率统计 接口异常 >>> msg:%S",e.toString()));
			throw new GlobalErrorInfoException(GlobalErrorInfoEnum.SYSTEM_ERROR);
		}
	}
}
