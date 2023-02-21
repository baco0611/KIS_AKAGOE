package com.laptrinhjavaweb.api.DTO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FeedbackDTO {
	private String fullName;
	private String content;
	private int star;
	private String time;
	private String idName;

	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(Date date) {
		try {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date currentDate = new Date();
			String starDate=f.format(date);
			String endDate = f.format(currentDate);
			Date date1 = f.parse(starDate);
			Date date2 = f.parse(endDate);
			long getDiff = date2.getTime() - date1.getTime();
			Long getSecondDiff = TimeUnit.MILLISECONDS.toSeconds(getDiff);
			Long getMinuteDiff = TimeUnit.MILLISECONDS.toMinutes(getDiff);
			Long getHourDiff = TimeUnit.MILLISECONDS.toHours(getDiff);
			Long getDayDiff = TimeUnit.MILLISECONDS.toDays(getDiff);
			String times = "";
			if (getDayDiff >= 1) {
				if (getDayDiff==1) {
					times = getDayDiff.toString() + " day ago";
				}
				else {
					times = getDayDiff.toString() + " days ago";
				}
			}
			else if (getHourDiff >= 1) {
				if (getHourDiff==1) {
					times = getHourDiff.toString() + " hour ago";
				}
				else {
					times = getHourDiff.toString() + " hours ago";
				}
			}
			else if (getMinuteDiff >= 1) {
				if (getMinuteDiff==1) {
					times = getMinuteDiff.toString() + " minute ago";
				}
				else {
					times = getMinuteDiff.toString() + " minutes ago";
				}
			}
			else if (getSecondDiff >= 1) {
				if (getSecondDiff==1) {
					times = getSecondDiff.toString() + " second ago";
				}
				else {
					times = getSecondDiff.toString() + " seconds ago";
				}
			}
			this.time=times;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

}
