package db.domain;import java.util.Arrays;public interface Tactical extends Domain , 
				UserItem
			, 
				TacticalDTO
			{	String getUname();	void setUname(String uname);void addUname(String uname);	int getIds();	void setIds(int ids);void addIds(int ids);	int getTempletId();	void setTempletId(int templetId);void addTempletId(int templetId);	int getLevel();	void setLevel(int level);void addLevel(int level);	boolean getIscurrent();	void setIscurrent(boolean iscurrent);	float getAccumulate();	void setAccumulate(float accumulate);void addAccumulate(float accumulate);}