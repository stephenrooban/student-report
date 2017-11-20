package com.steaartz.student.dataaccess;

import javax.persistence.AttributeConverter;

public class BooleanToStringConverter implements AttributeConverter<Boolean, String> {

	@Override
	public String convertToDatabaseColumn(Boolean value) {
		if (value == null) {
            return null;
        }
        if (value.booleanValue()) {
            return "Y";
        }
        return "N";
	}

	@Override
	public Boolean convertToEntityAttribute(String value) {
		if (value == null) {
            return null;
        }
        if (value.equals("Y") || value.equals("y")) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
	}

}
