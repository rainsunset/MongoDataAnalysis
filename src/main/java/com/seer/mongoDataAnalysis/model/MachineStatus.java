package com.seer.mongoDataAnalysis.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.seer.mongoDataAnalysis.converter.Decimal128Deserializer;
import com.seer.mongoDataAnalysis.converter.Decimal128Serializer;
import java.math.BigDecimal;
import java.util.Date;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @autheor ligw
 * @date 2018/9/30 8:55
 */
@Document(collection = "machinestatus")
public class MachineStatus {

//	{
//		    "_id" : ObjectId("5ba3160fa1de180001868d22"),
//			"machineCode" : "000000037",
//			"spindleSpeed" : NumberInt(12999),
//			"knifeNum" : NumberInt(13),
//			"updateTime" : ISODate("2018-09-20T11:37:40.060+0000"),
//			"productNum" : NumberInt(2182),
//			"freedSpeed" : NumberDecimal("600.000000"),
//			"status" : NumberInt(1),
//			"spindleLoad" : NumberDecimal("4.487212")
//	}

	@Id
	public ObjectId _id;
	public String machineCode;
	public int spindleSpeed;
	public int knifeNum;
	public Date updateTime;
	public int productNum;
	@JsonDeserialize(using = Decimal128Deserializer.class)
	@JsonSerialize(using = Decimal128Serializer.class)
	public Decimal128 freedSpeed;
	public int status;
	@JsonDeserialize(using = Decimal128Deserializer.class)
	@JsonSerialize(using = Decimal128Serializer.class)
	public Decimal128 spindleLoad;

	//解决报错  mongoDB 类型转换错误  https://www.cnblogs.com/sweetchildomine/p/8313383.html

}
