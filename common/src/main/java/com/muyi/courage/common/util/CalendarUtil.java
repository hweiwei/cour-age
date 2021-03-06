package com.muyi.courage.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class CalendarUtil {

	private static Log log = LogFactory.getLog(CalendarUtil.class);
	/**
	 * 获取系统时间
	 * @return 返回系统当前时间字符串，字符串格式为：yyyy-mm-dd hh:mm:ss
	 */
	
	public static String getSysTimeYMDHMS(){
//		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//设置中国北京时区
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		return simpleDateFormat.format(new Date(System.currentTimeMillis()));
	}
	/**
	 * 获取系统时间
	 * @return 返回系统当前时间字符串，字符串格式为：MM-dd HH:mm:ss SSS
	 * case_trace使用
	 */
	public static String getSysTimeYMDHMS11(){
//		return new SimpleDateFormat("MM-dd HH:mm:ss SSS").format(new Date(System.currentTimeMillis()));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss SSS");
		//设置中国北京时区
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		return simpleDateFormat.format(new Date(System.currentTimeMillis()));
	}
	
	/**
	 * 获取系统时间
	 * @return 返回系统当前时间字符串，字符串格式为：MM-dd HH:mm:ss SSS
	 * case_trace使用
	 */
	public static String getSysTimeYMDHMS111(){
//		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		//设置中国北京时区
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		return simpleDateFormat.format(new Date(System.currentTimeMillis()));
	}
	
	/**
	 * 获取系统时间
	 * @return 返回系统当前时间字符串，字符串格式为：yyyyMMddHHmmss
	 */
	
	public static String getSysTimeYMDHMS1(){
//		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(System.currentTimeMillis()));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		//设置中国北京时区
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		return simpleDateFormat.format(new Date(System.currentTimeMillis()));
	}
		
	/**
	 * 获取系统时间<br>
	 * @return 返回系统当前时间字符串，字符串格式为：yyyyMMddHHmmssSS
	 */
	
	public static String getSysTimeYMDHMS2(){
//		return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(System.currentTimeMillis()));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		//设置中国北京时区
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		return simpleDateFormat.format(new Date(System.currentTimeMillis()));
	}	
	/**
	 * 获取系统时间
	 * @return 返回系统当前时间字符串，字符串格式为：yyyy-mm-dd hh:mm
	 */
	
	public static String getSysTimeYMDHM(){
//		return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(System.currentTimeMillis()));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		//设置中国北京时区
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		return simpleDateFormat.format(new Date(System.currentTimeMillis()));
	}

	
	/**
	 * 获取系统时间
	 * @return 返回系统当前时间字符串，字符串格式为：yyyy-mm-dd
	 */
	
	public static String getSysTimeYMD(){
//		return new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//设置中国北京时区
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		return simpleDateFormat.format(new Date(System.currentTimeMillis()));
	}  
	
	/**
	 * 获取系统时间
	 * @return 返回系统当前时间字符串，字符串格式为：yyyy-mm
	 */
	
	public static String getSysTimeYM(){
//		return new SimpleDateFormat("yyyy-MM").format(new Date(System.currentTimeMillis()));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
		//设置中国北京时区
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		return simpleDateFormat.format(new Date(System.currentTimeMillis()));
	} 
	
	/**
	 * 获取系统时间
	 * @return 返回系统当前时间字符串，字符串格式为：hh:mm:ss
	 */
	
	public static String getSysTimeHMS(){
		return new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis()));
	} 
       
	/**取系统时间hhmmss
	 * @return String--hhmmss格式的时间字符串
	 */
	
	public static String getTime(){
		return new SimpleDateFormat("HHmmss").format(System.currentTimeMillis());
	}
	
	/**取系统日期yyyymmdd
	 * @return String--yyyymmdd格式的日期字符串
	 */
	
	public static String getDate(){
		return new SimpleDateFormat("yyyyMMdd").format(System.currentTimeMillis());
	}
	
	/**
	 * 根据传入的时间转为YYYYMMDDHHMMSS格式的字符串
	 * @param time 代表时间的长整数
	 * @return 代表时间的字符串
	 */
	
	public static String getDateTime(long time){		
		return new SimpleDateFormat("yyyyMMddHHmmss").format(time);
	}
	
	/**
	 * 根据传入的时间转为YYYY-MM-DD HH:MM:SS格式的字符串
	 * @param time 代表时间的长整数
	 * @return 代表时间的字符串
	 */
	public static String getYMDHMS(long time)
	{
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(time);
		int yearFile=cal.get(Calendar.YEAR);
		int monthFile=cal.get(Calendar.MONTH)+1;
		int dayFile=cal.get(Calendar.DATE);
		int hourFile=cal.get(Calendar.HOUR_OF_DAY);
		int minuteFile=cal.get(Calendar.MINUTE);
		int secondFile=cal.get(Calendar.SECOND);
		String ss=String.format("%04d",yearFile)+"-"
					+String.format("%02d",monthFile)+"-"+
					String.format("%02d",dayFile)+" "+
					String.format("%02d",hourFile)+":"+
					String.format("%02d",minuteFile)+":"+
					String.format("%02d",secondFile);
		return ss;
	}
	
	/**将字符型yyyy-MM-DD转成Date类型日期
	 * @since 2006.01.19
	 * @param stringdate 以yyyyMMdd表示的日期字符串
	 * @return date类型日期
	 */
	public static Date str2Date(String stringdate) {	
		if(stringdate==null) {
			return null;
		}
		SimpleDateFormat format=null;
		if(stringdate!=null&&stringdate.length()<8) {
			return null;
		}
		
		if(stringdate!=null&&stringdate.length()==8) {
			format = new SimpleDateFormat("yyyyMMdd");
		}
		if(stringdate!=null&&stringdate.length()==10) {
			format = new SimpleDateFormat("yyyy-MM-dd");
		}
		if(stringdate!=null&&stringdate.length()==13) {
			format = new SimpleDateFormat("yyyy-MM-dd HH");
		}
		if(stringdate!=null&&stringdate.length()==14) {
			format = new SimpleDateFormat("yyyyMMddHHmmss");
		}
		if(stringdate!=null&&stringdate.length()==16) {
			format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		}
		if(stringdate!=null&&stringdate.length()==19) {
			format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
		Date date = new Date();
		try{
			date = format.parse(stringdate);
			return date;
		} catch (Exception e) {
			log.info("日期格式错。");
			return null;		
		}
	}
	
	public static String toupdateTime(String datetime){
		String date=datetime.substring(0,datetime.lastIndexOf("-")+3);
		String[] dates1=date.split("-");
		String datetime1="";
		for(int i=0;i<dates1.length;i++){
			if(i==0){
				datetime1+=dates1[i]+"-";
			}else if(i==1){
				if(dates1[i].trim().length()==1){
					datetime1+="0"+dates1[i].trim()+"-";
				}else{
					datetime1+=dates1[i].trim()+"-";
				}
			}else{
				if(dates1[i].trim().length()==1){
					datetime1+="0"+dates1[i].trim()+" ";
				}else{
					datetime1+=dates1[i].trim()+" ";
				}
			}
		}
		String time=datetime.substring(datetime.lastIndexOf("-")+3);
		String[] dates2=time.split(":");
		for(int j=0;j<dates2.length;j++){
			if(j!=dates2.length-1){
				if(dates2[j].trim().length()==1){
					datetime1+="0"+dates2[j].trim()+":";
				}else{
					datetime1+=dates2[j].trim()+":";
				}
			}else{
				if(dates2[j].trim().length()==1){
					datetime1+="0"+dates2[j].trim();
				}else{
					datetime1+=dates2[j].trim();
				}
			}
		}
		return datetime1;
	}
	
	/**转换 date型数据为简要格式
	 * @since 2007.09.19
	 * @param dateTime date类型日期
	 * @return "MM-dd HH:mm"字符型日期
	 */

	public static String  fmtMDHM(Date dateTime)
	{	
		
		String fmtTime="";
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
			if (dateTime!=null) {
				fmtTime=sdf.format(dateTime);
			}
			return fmtTime;
		}
		catch(Exception e){
			log.info("转换日期错。");
			return null;		
		}
	}
	/**转换 date型数据为简要格式
	 * @since 2007.09.19
	 * @param dateTime date类型日期
	 * @return "yyyy-MM-dd HH:mm"字符型日期
	 */
	public static String  fmtYMDHM(Date dateTime)
	{	
		String fmtTime="";
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			if (dateTime!=null) {
				fmtTime=sdf.format(dateTime);
			}
			return fmtTime;
		}
		catch(Exception e){
			log.info("转换日期错。");
			return null;		
		}
	}
	/**转换 yyyyMMddHHmmss型数据为简要格式
	 * @since 2010.04.21
	 * @param dateTime String类型日期
	 * @return "yyyy-MM-dd HH:mm:ss"字符型日期
	 */
	public static String  fmtYMDHMS(String dateTime)
	{	
		StringBuffer fmtTime = new StringBuffer();
		
		try
		{
			fmtTime.append(dateTime.substring(0,4));
			fmtTime.append('-');
			
			fmtTime.append(dateTime.substring(4,6));
			fmtTime.append('-');
			
			fmtTime.append(dateTime.substring(6,8));
			fmtTime.append(' ');
			
			fmtTime.append(dateTime.substring(8,10));
			fmtTime.append(':');
			
			fmtTime.append(dateTime.substring(10,12));
			fmtTime.append(':');
			
			fmtTime.append(dateTime.substring(12,14));			
			
		}
		catch(Exception e){
			log.info("转换日期错。");
			return null;		
		}

		return fmtTime.toString();
	}
	
	/**转换 date型数据为简要格式
	 * @since 2007.09.19
	 * @param dateTime date类型日期
	 * @return "yyyy-MM-dd HH:mm:ss"字符型日期
	 */
	public static String  fmtYMDHMS(Date dateTime)
	{	
		String fmtTime="";
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			if (dateTime!=null) {
				fmtTime=sdf.format(dateTime);
			}
			return fmtTime;
		}
		catch(Exception e){
			log.info("转换日期错。");
			return null;		
		}
	}
	
	/**转换 date型数据为简要格式
	 * @since 2013.06.14
	 * @author cqluo
	 * @param dateTime date类型日期
	 * @return "yyyy-MM-dd"字符型日期
	 */
	public static String  fmtYMD(Date dateTime){	
		String fmtTime="";
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if (dateTime!=null) {
				fmtTime=sdf.format(dateTime);
			}
			return fmtTime;
		} catch(Exception e){
			log.info("转换日期错:",e);
			return null;		
		}
	}
	
	/**获取指定时间的小时
	 * @since 2013.06.14
	 * @author cqluo
	 * @param dateTime date类型日期
	 * @return 小时(0-23)
	 */
	public static Integer getHours(Date dateTime){	
		try{
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dateTime);
			return calendar.get(Calendar.HOUR_OF_DAY);
		} catch(Exception e){
			log.info("转换日期错:",e);
			return null;		
		}
	}
	
	/**
	 * 计算预期响应时间
	 * @param openTime  开始时间点
	 * @param interval 时间间隔
	 * @param respondGrade  响应级别(1-工作时间相应,2-7x24小时响应)
	 * @return 预期响应时间
	 */
	public static Date getPreWorkTime(Date openTime,int interval,int respondGrade)
	{	
		
		
		try{
			Date preExpireTime=new Date(openTime.getTime()+interval*60000);
			return preExpireTime;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;		
		}
	}
	/**
	 * 计算预期响应时间
	 * @param interval 时间间隔
	 * @param respondGrade  响应级别(1-工作时间相应,2-7x24小时响应)
	 * @return 预期响应时间
	 */
	public static Date getPreWorkTime2(int interval,int respondGrade)
	{	
		try{
			Calendar temp=Calendar.getInstance();
			temp.add(Calendar.MINUTE, interval);
			return temp.getTime();
		}
		catch(Exception e){
			e.printStackTrace();
			return null;		
		}
	}
	/**
	 * 获取当前日期前一天的日期，日期格式yyyy-mm-dd
	 * @return 当前日期前一天的日期，日期格式yyyy-MM-dd
	 */
	public static String getPreviousDate()
	{
		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH,-1);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sysDate = formatter.format(date.getTime()).toString();
		return sysDate;
	}

	/**
	 * 获取当前日期后一天的日期，日期格式yyyy-mm-dd
	 * @return 当前日期后一天的日期，日期格式yyyy-MM-dd
	 */
	public static String getLaterDate()
	{
		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH,+1);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sysDate = formatter.format(date.getTime()).toString();
		return sysDate;
	}
	
	/**
	 * 获取与指定的日期相差i月的日期,日期格式为"yyyy-MM-dd"
	 * @param fixDate 指定的日期（格式为"yyyy-MM-dd"）
	 * @param i 相隔月数（i为整数）
	 * @return 计算后的日期
	 */
	public static String getFixedMonth(String fixDate,int i)
	{		
		int year=Integer.parseInt(fixDate.substring(0, 4));
		int month=Integer.parseInt(fixDate.substring(5, 7));
		int day=Integer.parseInt(fixDate.substring(8, 10));
		
		Calendar date = Calendar.getInstance();	
		date.set(year,month-1,day);
		date.add(Calendar.MONTH,i);						
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sysDate = formatter.format(date.getTime()).toString();		
		return sysDate;
	}
	
	/**
	 * 获取与指定的日期相差i天的日期,日期格式为"yyyy-MM-dd"
	 * @param fixDate 指定的日期（格式为"yyyy-MM-dd"）
	 * @param i 相隔天数（i为整数）
	 * @return 计算后的日期
	 */
	public static String getFixedDate(String fixDate,int i)
	{		
		int year=Integer.parseInt(fixDate.substring(0, 4));
		int month=Integer.parseInt(fixDate.substring(5, 7));
		int day=Integer.parseInt(fixDate.substring(8, 10));
		
		Calendar date = Calendar.getInstance();	
		date.set(year,month-1,day);
		date.add(Calendar.DAY_OF_MONTH,i);						
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sysDate = formatter.format(date.getTime()).toString();		
		return sysDate;
	}

	/**
	 * 获取与系统日期相差i天的日期,日期格式为"yyyy-MM-dd"
	 *
	 * @param i
	 *            相隔天数（i为整数）
	 * @return 计算后的日期
	 */
	public static String getFixedDateByOld(int i) {
		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, i);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sysDate = formatter.format(date.getTime()).toString();
		return sysDate;
	}

	/**
	 * 获取与指定的日期相差i天的日期,日期格式为"yyyy-MM-dd"
	 * @param fixDate 指定的日期（格式为"yyyy-MM-dd"）
	 * @param i 相隔天数（i为整数）
	 * @return 计算后的日期
	 */
	public static String getFixedDateYYYYMMDD(String fixDate,int i)
	{		
		int year=Integer.parseInt(fixDate.substring(0, 4));
		int month=Integer.parseInt(fixDate.substring(5, 7));
		int day=Integer.parseInt(fixDate.substring(8, 10));
		
		Calendar date = Calendar.getInstance();	
		date.set(year,month-1,day);
		date.add(Calendar.DAY_OF_MONTH,i);						
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String sysDate = formatter.format(date.getTime()).toString();		
		return sysDate;
	}
	
	/**
	 * 获取与指定的日期相差i天的日期,日期格式为"yyyy-MM-dd"
	 * @param fixDate 指定的日期（格式为"yyyy-MM-dd"）
	 * @param i 相隔天数（i为整数）
	 * @return 计算后的日期
	 */
	public static String getFixedDateYYYY_MM_DD(String fixDate,int i)
	{		
		int year=Integer.parseInt(fixDate.substring(0, 4));
		int month=Integer.parseInt(fixDate.substring(5, 7));
		int day=Integer.parseInt(fixDate.substring(8, 10));
		
		Calendar date = Calendar.getInstance();	
		date.set(year,month-1,day);
		date.add(Calendar.DAY_OF_MONTH,i);						
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String sysDate = formatter.format(date.getTime()).toString();		
		return sysDate;
	}

	/**
	 * 获取下一个月的日期，日期格式yyyy-mm
	 * @return 下一个月的日期，日期格式yyyy-MM
	 */
	public static String getNextMonth() {
		Calendar date = Calendar.getInstance();
		date.add(Calendar.MONTH,1);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
		String sysDate = formatter.format(date.getTime()).toString();
		return sysDate;
	}
	
	/**
	 * 获取前一个月的日期，日期格式yyyy-mm
	 * @return 前一个月的日期，日期格式yyyy-MM
	 */
	public static String getPreviousMonth() {
		Calendar date = Calendar.getInstance();	
		date.add(Calendar.MONTH,-1);						
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
		String sysDate = formatter.format(date.getTime()).toString();		
		return sysDate;
	}
	
	/**
	 * 获取当前日期与参数间隔（分钟）的历史日期
	 * @param minute 分钟
	 * @return 历史日期，日期格式yyyyMMddHHmmss
	 */
	public static String getPreMinuteDateTime(String minute)
	{		
		try
		{			
			int min = Integer.parseInt(minute);
			Calendar date = Calendar.getInstance();				
			date.add(Calendar.MINUTE, -min);			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
			String sysDate = formatter.format(date.getTime()).toString();			
			return sysDate;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	/**
	 * 获取当前日为周几
	 * @return 当前为周几
	 * */
	public static String getDayOfWeek()
	{		
		
		Calendar cal = Calendar.getInstance();
		switch(cal.get(Calendar.DAY_OF_WEEK))
		{
			case 2:return "Monday";
			case 3:return "Tuesday";
			case 4:return "Wednesday";
			case 5:return "Thursday";
			case 6:return "Friday";
			case 7:return "Staturday";
			case 1:return "Sunday";
			default:
		}
		return null;
	}

	/**
	 * 获取指定日期为周几
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Integer getfixDayOfWeek(String date) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = format.parse(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(parse);
		switch(cal.get(Calendar.DAY_OF_WEEK))
		{
			case 2:return 1;
			case 3:return 2;
			case 4:return 3;
			case 5:return 4;
			case 6:return 5;
			case 7:return 6;
			case 1:return 7;
			default:
		}
		return null;
	}

	
	/**
	 * 获取时间差
	 * @return 时间差
	 * */
	public static String getDifOfTime(String time)
	{				
		long diftime = System.currentTimeMillis() - str2Date(time).getTime();
		String mark="";
		if(diftime<0)
		{
			mark="-";
			diftime = Math.abs(diftime);
		}
		long days = (long)Math.floor(diftime/(1000*3600*24));
		long hours = (long)Math.floor((diftime - days*1000*3600*24)/(1000*3600));
		long minitues = (long)Math.floor((diftime - days*1000*3600*24 - hours*1000*3600)/(1000*60));
		
		String difofTime =mark + days + "天" + hours + "小时" + minitues +"分";
		return difofTime;
	}
	
	/**
	 * 获取两个日期之间的天数
	 * 
	 * @param startDate
	 *            endDate 日期格式：yyyy-mm-dd
	 * @return int 单位：天
	 */
	public static int getSubDate(String endDate, String startDate) {
		String endTime = endDate + " 10:00:00";
		String startTime = startDate + " 10:00:00";
		return getSubTime(endTime, startTime).intValue();
	}
	/**
	 * 获取两者的时间差
	 * @param time1,time2 时间格式：yyyy-mm-dd HH:mm:ss
	 * @return double 单位：天 
	 */
	public static Double getSubTime(String time1,String time2){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date1 = df.parse(time1);
			Date date2 = df.parse(time2);
			return  (date1.getTime() - date2.getTime()) * 1.00 /(1000 * 60 * 60 * 24) ;
		} catch (ParseException e) {
			log.error("时间格式不正确");
			e.printStackTrace();
		}
		return 0.00;
	}
	
	/**
	 * 获取两者的时间差
	 * @param time1,time2 时间格式：yyyy-mm-dd
	 * @return Long 单位：毫秒
	 */
	public static Long getSubLongTime(String time1,String time2){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date1 = df.parse(time1);
			Date date2 = df.parse(time2);
			return  date1.getTime() - date2.getTime();
		} catch (ParseException e) {
			log.error("时间格式不正确");
			e.printStackTrace();
		}
		return 0L;
	}
	
	/**
	 * 获取两者的时间差
	 * @param time1,time2 时间格式：yyyy-mm-dd HH:mm:ss
	 * @return double 单位：天 时 分 秒
	 */
	public static String getSubTimeFully(String time1,String time2){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			Date date1 = df.parse(time1);
			Date date2 = df.parse(time2);
			long time = date1.getTime()-date2.getTime() ;
			long day = time/(24*60*60*1000) ;
			long hour = (time/(60*60*1000)-day*24) ;
			long min = ((time/(60*1000))-day*24*60-hour*60) ;
			return day+"天"+hour+"时"+min+"分";
		} catch (ParseException e) {
			log.error("时间格式不正确");
			e.printStackTrace();
		}
		return "0天0时0分";
	}
	
	
	/**
	 * 获取两者的时间差
	 * @param time1,time2 时间格式：yyyy-mm-dd HH:mm:ss
	 * @return double 单位：天 时 分 秒
	 */
	public static String getSubTimeFully1(String time1,String time2){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date1 = df.parse(time1);
			Date date2 = df.parse(time2);
			long time = date1.getTime()-date2.getTime() ;
		 
			long hour = (time/(60*60*1000) ) ;
			long min = ((time/(60*1000)) -hour*60) ;
			long second = ((time/1000)-hour*60*60-min*60);
			return   hour+"小时"+min+"分钟"+second+"秒";
		} catch (ParseException e) {
			log.error("时间格式不正确");
			e.printStackTrace();
		}
		return " 0小时0分钟0秒";
	}
	
	/**
	 * 获取字符串日期中的day(一个月中的第几天)
	 * @param dateTime 日期（YYYY-MM-DD）
	 * @return 一个月中的第几天
	 */
	public static String getDayOfStrDateTime(String dateTime) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = df.parse(dateTime);
			Calendar cal=Calendar.getInstance();
			cal.setTime(date);
			return cal.get(Calendar.DAY_OF_MONTH) + "";
		} catch (ParseException e) {
			log.error("时间格式不正确dateTime=["+dateTime+"]");
			return null;
		}
	}
	
	public static String getMonthOfStrDateTime(String time) {
		DateFormat df = new SimpleDateFormat("yyyy-MM");
		try {
			Date date = df.parse(time);
			Calendar cal=Calendar.getInstance();
			cal.setTime(date);
			return cal.get(Calendar.MONTH) + 1 + "";
		} catch (ParseException e) {
			log.error("时间格式不正确dateTime=["+time+"]");
			return null;
		}
	}	
	
	/**
	 * 比较两个参数日期字符串的顺序
	 * 
	 * @param strDate1
	 * @param strDate2
	 * @return strDate1==strDate2:返回0; strDate1<strDate2:返回负数; strDate1>strDate2:返回正数
	 * 
	 * @author hongwei
	 */
	public static int compare2Dates(String strDate1, String strDate2) {
		Date date1 = str2Date(strDate1);
		Date date2 = str2Date(strDate2);
		return date1.compareTo(date2);
	}

	/**
	 * 比较两个参数时间字符串的顺序
	 *
	 * @param strTime1
	 * @param strTime2
	 * @return strTime1==strTime2:返回0; strTime1<strTime2:返回-1; strTime1>strTime2:返回1;格式异常返回-2
	 *
	 * @author hongwei
	 */
	public static int compare2Times(String strTime1, String strTime2) {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		try {
			Date time1 = formatter.parse(strTime1);
			Date time2 = formatter.parse(strTime2);
			return time1.compareTo(time2);
		}catch (Exception e){
			log.error("时间格式不正确", e);
			return -2;
		}
	}

	/**
	 * 获取与根据指定时间相差h小时m分钟s秒的时间
	 *
	 * @param hms
	 *            HH:mm:ss
	 * @param h
	 * @param m
	 * @param s
	 * @return HH:mm:ss
	 */
	public static String getFixedTimeHMS(String hms, int h, int m, int s) {
		int hour = Integer.parseInt(hms.substring(0, 2));
		int minute = Integer.parseInt(hms.substring(3, 5));
		int second = Integer.parseInt(hms.substring(6, 8));
		Calendar date = Calendar.getInstance();
		date.set(Calendar.HOUR_OF_DAY, hour);
		date.set(Calendar.MINUTE, minute);
		date.set(Calendar.SECOND, second);
		if (h != 0) {
			date.add(Calendar.HOUR_OF_DAY, h);
		}
		if (m != 0) {
			date.add(Calendar.MINUTE, m);
		}
		if (s != 0) {
			date.add(Calendar.SECOND, s);
		}
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		String fixedTime = formatter.format(date.getTime()).toString();
		return fixedTime;
	}

	/**
	 * 获取两者的时间差
	 * @param time1,time2 时间格式：yyyy-mm-dd
	 * @return double 单位：天
	 */
	public static Double getymdSubTime(String time1, String time2) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date1 = df.parse(time1);
			Date date2 = df.parse(time2);
			return (date1.getTime() - date2.getTime()) * 1.00 / (1000 * 60 * 60 * 24);
		} catch (ParseException e) {
			log.error("时间格式不正确", e);
		}
		return 0.00;
	}

	public static void main(String[] args)
	{	
		
		//CalendarUtil.getPreMinuteDateTime("0");

		System.out.println(CalendarUtil.compare2Times("14:10:00","14:00:00"));
		//String previousDate = getPreviousMonth();
		//System.out.println("previousDate = "+previousDate);
	}


	/**
	 * @Author: 徐鑫
	 * @Date: 2020/7/7
	 * @Description: 将YYYYMMDD格式转换为YYYY-MM-DD格式
	 * @Param: [date]
	 * @return: java.lang.String
	 */
	public static String fmtYMD(String date){
		StringBuffer fmtDate = new StringBuffer();
		try{
			fmtDate.append(date.substring(0,4));
			fmtDate.append("-");

			fmtDate.append(date.substring(4,6));
			fmtDate.append("-");

			fmtDate.append(date.substring(6,8));
			return fmtDate.toString();
		}catch(Exception e){
			log.error("[日期格式转换异常]：",e);
			return null;
		}
	}

	/**
	 * @Author: 徐鑫
	 * @Date: 2020/7/7
	 * @Description: 将HHMMSS格式转换为HH:MM:SS格式
	 * @Param: [time]
	 * @return: java.lang.String
	 */
	public static String fmtHMS(String time){
		StringBuffer fmtTime = new StringBuffer();
		try {
			fmtTime.append(time.substring(0,2));
			fmtTime.append(":");

			fmtTime.append(time.substring(2,4));
			fmtTime.append(":");

			fmtTime.append(time.substring(4,6));
			return fmtTime.toString();
		} catch (Exception e) {
			log.error("[时间格式转换异常]：",e);
			return null;
		}
	}
	

}
