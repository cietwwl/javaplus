package db.domain;import java.util.Arrays;import java.util.Date;public interface ActivityStatus extends Domain {	String getActivityName();	void setActivityName(String activityName);void addActivityName(String activityName);	String getStatus();	void setStatus(String status);void addStatus(String status);	Date getStartTime();	void setStartTime(Date startTime);}