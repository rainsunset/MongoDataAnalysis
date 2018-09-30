package com.seer.mongoDataAnalysis.converter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.math.BigDecimal;
import org.bson.types.Decimal128;

/**
 * @autheor ligw
 * @date 2018/9/30 11:35
 */
public class Decimal128Deserializer extends JsonDeserializer<Decimal128> {
	@Override
	public Decimal128 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
		return new Decimal128(new BigDecimal(jsonParser.getText()));
	}
}
