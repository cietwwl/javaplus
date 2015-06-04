package db.domain;

public interface ChuangZhenTable {

	String getUname();

	void setUname(String uname);

	void addUname(String uname);

	int getStar();

	void setStar(int star);

	void addStar(int star);

	int getStarRemain();

	void setStarRemain(int starRemain);

	void addStarRemain(int starRemain);

	int getFloor();

	void setFloor(int floor);

	void addFloor(int floor);

	int getTimes();

	void setTimes(int times);

	void addTimes(int times);

	float getAttack();

	void setAttack(float attack);

	void addAttack(float attack);

	float getDefend();

	void setDefend(float defend);

	void addDefend(float defend);

	float getMAttack();

	void setMAttack(float mAttack);

	void addMAttack(float mAttack);

	float getMDefend();

	void setMDefend(float mDefend);

	void addMDefend(float mDefend);

	float getHp();

	void setHp(float hp);

	void addHp(float hp);

	float getSpeed();

	void setSpeed(float speed);

	void addSpeed(float speed);

	int getStarMaxToday();

	void setStarMaxToday(int starMaxToday);

	void addStarMaxToday(int starMaxToday);

	int getFloorMaxToday();

	void setFloorMaxToday(int floorMaxToday);

	void addFloorMaxToday(int floorMaxToday);

}
