package com.seer.mongoDataAnalysis.converter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import org.bson.types.Decimal128;

/**
 * @autheor ligw
 * @date 2018/9/30 11:35
 */
public class Decimal128Serializer extends JsonSerializer<Decimal128> {

	@Override
	public void serialize(Decimal128 decimal128, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
		jsonGenerator.writeString(decimal128.toString());
	}

}
