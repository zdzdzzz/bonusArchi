package com.zd.archi.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.zd.archi.model.TblMaraTransLog;

public class BonusUtil {
	public static String parseObjectToString(Object o) {
		return o == null ? "" : o.toString().trim();
	}

	public static Integer paseObjectToInt(Object o) {
		String s = parseObjectToString(o);
		if ("".equals(s)) {
			return 0;
		}
		return Integer.parseInt(s);
	}

	public static byte[] parseObjectToByteArray(Object val) {
		if (val == null) {
			return null;
		}
		byte[] bs = null;
		try {
			bs = (byte[]) val;
		} catch (RuntimeException e) {
			return null;
		}
		return bs;
	}

	/**
	 * Object转Long
	 * 
	 * @param o
	 *            Object
	 * @return Long
	 */
	public static Long parseObjToLong(Object o) {
		if (o == null) {
			return null;
		}
		try {
			String str = parseObjectToString(o);
			if (str == null || "".equals(str)) {
				return null;
			} else {
				str = str.trim();
			}
			return parseStringToLong(str);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	/**
	 * Object转Double
	 * 
	 * @param o
	 *            Object
	 * @return Double
	 */
	public static Double parseObjToDouble(Object o) {
		if (o == null) {
			return null;
		}
		try {
			String str = parseObjectToString(o);
			if (str == null || "".equals(str)) {
				return null;
			} else {
				str = str.trim();
			}
			return Double.parseDouble(str);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public static double parseObjTodouble(Object o) {
		if (o == null) {
			return 0;
		}
		try {
			String str = parseObjectToString(o);
			if (str == null || "".equals(str)) {
				return 0;
			} else {
				str = str.trim();
			}
			return Double.parseDouble(str);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	/**
	 * Object转Long
	 * 
	 * @param o
	 *            Object
	 * @return Long
	 */
	public static Long parseStringToLong(String str) {
		if (str == null || "".equals(str)) {
			return null;
		} else {
			str = str.trim();
		}
		try {
			return Long.parseLong(str);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	/**
	 * Object转BigDecimal
	 * 
	 * @param o
	 *            Object
	 * @return BigDecimal
	 */
	public static BigDecimal parseObjectToBigDecimal(Object o) {
		Double dbl = parseObjToDouble(o);
		if (dbl == null) {
			return null;
		}
		try {
			return BigDecimal.valueOf(dbl);
		} catch (RuntimeException e) {
			return null;
		}
	}
	
	public static Boolean parseObjectToBoolean(Object o){
		if(o == null){
			return false;
		}
		return Boolean.valueOf(parseObjectToString(o));
	}

	public static void parseMapToObject(Map<String, Object> map, Object o) throws Exception {
		Class c = o.getClass();
		Method[] methes = c.getMethods();

		for (Method m : methes) {
			String mName = m.getName();
			if (mName.indexOf("get") == 0) {
				String field = mName.substring(3).toUpperCase();
			
				if ("CLASS".equals(field)) {
					continue;
				}
				Class returnType = m.getReturnType();

				if (returnType == Set.class) {
					continue;
				}

				String sName = mName.replaceFirst("get", "set");
				Method sm = c.getMethod(sName, returnType);

//				if ("ID".equals(field)) {
//					mapToObjcet4Id(map, sm, o, returnType.newInstance());
//					continue;
//				}

				Object val = map.get(field);
				if (val == null || "".equals(val) || "null".equals(val)) {
					continue;
				}
				setField(o, sm, returnType, val);
			}
		}
	}
	
	public static Map<String, Object> parseStringToMap(String string) throws Exception {
		string = string.split("\\[")[1].split("\\]")[0];
		Map<String, Object> map = new HashMap<String, Object>();
		String[] strArray = string.split(",");
		for(String str: strArray){
			String[] s = str.split("=");
			if(s.length == 2){
				map.put(s[0].trim().toUpperCase(), (Object)(s[1].trim()));
			}else{
				map.put(s[0].trim().toUpperCase(), null);
			}
		}
		return map;
	}
	
	public static void main(String[] aa){
		String s = "TblMaraTransLog[id=null, userId=test0250604, orderId=4ffe5bbbd4bf48f1ac496153a0d3ed00, mchntCd=marathon_test, transAmt=63788, disAmt=460, rspCd=2, rspMsg=交易成功, recUpdTs=2018-10-24 12:30:12, recCrtTs=null]";
		String w = s.split("\\[")[1].split("\\]")[0];
		
		String wString = "userId=test0250604, orderId=4ffe5bbbd4bf48f1ac496153a0d3ed00, mchntCd=marathon_test, transAmt=63788, disAmt=460, rspCd=2, rspMsg=交易成功, recUpdTs=2018-10-24 12:30:12, recCrtTs=null";
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			map = BonusUtil.parseStringToMap(w);
			System.out.println(map);
			TblMaraTransLog log = new TblMaraTransLog();
			BonusUtil.parseMapToObject(map, log);
			System.out.println(log.getUserId());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void mapToObjcet4Id(Map<String, Object> map, Method sm, Object o, Object id) throws Exception {
		parseMapToObject(map, id);
		sm.invoke(o, id);
	}

	public static void setField(Object o, Method sm, Class returnType,
			Object val) throws IllegalArgumentException,
			IllegalAccessException, InvocationTargetException, ParseException {
		if (returnType == String.class) {
			sm.invoke(o, parseObjectToString(val));
		} else if (returnType == Integer.class || returnType == int.class) {
			sm.invoke(o, paseObjectToInt(val));
		} else if (returnType == long.class || returnType == Long.class) {
			sm.invoke(o, parseObjToLong(val));
		} else if (returnType == double.class || returnType == Double.class) {
			sm.invoke(o, parseObjToDouble(val));
		} else if (returnType == BigDecimal.class) {
			sm.invoke(o, parseObjectToBigDecimal(val));
		} else if (returnType == Date.class) {
			sm.invoke(o, parseObjectToDate(val));
		} else {
			sm.invoke(o, val); 
		}
	}
	
	public static Date parseObjectToDate(Object o) throws ParseException {
		if (o == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = parseObjectToString(o);
		if (str == null || "".equals(str) || "null".equals(str)) {
			return null;
		} else {
			return sdf.parse(str);
		}
		
	}
	
	
}
