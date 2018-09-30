package com.seer.mongoDataAnalysis.converter;

import org.bson.types.Decimal128;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;
import java.math.BigDecimal;

/**
 * @autheor ligw
 * @date 2018/9/30 11:05
 */

@ReadingConverter
@WritingConverter
public class Decimal128ToBigDecimalConverter implements Converter<Decimal128, BigDecimal> {

	@Override
	public BigDecimal convert(Decimal128 decimal128) {
		return decimal128.bigDecimalValue();
	}

}

