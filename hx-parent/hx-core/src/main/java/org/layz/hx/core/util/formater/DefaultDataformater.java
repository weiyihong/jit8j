package org.layz.hx.core.util.formater;

import java.util.Map;

import org.layz.hx.core.pojo.info.FieldColumnInfo;

public class DefaultDataformater implements Dataformater{

	@Override
	public boolean support(String formatType) {
		return DEFAULT.equals(formatType);
	}

	@Override
	public Object format(Object object, FieldColumnInfo fieldInfo, Map<Object, Object> cache) {
		return object;
	}

}
