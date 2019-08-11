package com.mooc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverters implements Converter<String, Date>{

	@Override
	public Date convert(String birthday) {
		// TODO Auto-generated method stub
		Date parse = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			parse = format.parse(birthday);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			format = new SimpleDateFormat("yyyy/MM/dd");
			try {
				parse = format.parse(birthday);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return parse;
	}

}
