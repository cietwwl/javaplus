package db.domain;public interface UserFishes extends Domain , 
				UserItem
			, 
				DBGrid
			{	String getUname();	void setUname(String uname);void addUname(String uname);	int getGridId();	void setGridId(int gridId);void addGridId(int gridId);	int getTypeid();	void setTypeid(int typeid);void addTypeid(int typeid);	int getCount();	void setCount(int count);void addCount(int count);}