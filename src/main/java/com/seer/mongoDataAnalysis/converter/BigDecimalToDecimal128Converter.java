package com.seer.mongoDataAnalysis.converter;

import java.math.BigDecimal;
import org.bson.types.Decimal128;import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;


/**
 * @autheor ligw
 * @date 2018/9/30 11:02
 */
@ReadingConverter
@WritingConverter
public class BigDecimalToDecimal128Converter implements Converter<BigDecimal, Decimal128> {

	@Override
	public Decimal128 convert(BigDecimal bigDecimal) {
		return new Decimal128(bigDecimal);
	}
}

