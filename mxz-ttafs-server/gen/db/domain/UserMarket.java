package db.domain;import java.util.Arrays;public interface UserMarket extends Domain {	int getTradId();	void setTradId(int tradId);void addTradId(int tradId);	String getUname();	void setUname(String uname);void addUname(String uname);	int getFighterId();	void setFighterId(int fighterId);void addFighterId(int fighterId);	int getTypeId();	void setTypeId(int typeId);void addTypeId(int typeId);	int getTradNub();	void setTradNub(int tradNub);void addTradNub(int tradNub);	int getTradType();	void setTradType(int tradType);void addTradType(int tradType);	int getTime();	void setTime(int time);void addTime(int time);}