package mongo.gen;import com.mongodb.BasicDBObject;import com.mongodb.DBCollection;import com.mongodb.DBCursor;import com.mongodb.DBObject;import java.util.Iterator;import cn.javaplus.exception.UnImplMethodException;public class DailyTaskDao {	private DBCollection	collection;	public DailyTaskDao(DBCollection collection) {		this.collection = collection;	}	public void save(DailyTaskDto u) {		collection.save(u.toDBObject());	}	public void delete(DailyTaskDto u) {		collection.remove(u.toDBObject());	}	public void delete(int taskId, String uname) {		collection.remove(key(taskId, uname));	}	public DailyTaskDto get(int taskId, String uname) {		DBObject o = collection.findOne(key(taskId, uname));		if(o == null) {			return null;		}		DailyTaskDto x = new DailyTaskDto();		x.fromDBObject(o);		return x;	}	private BasicDBObject key(int taskId, String uname) {		BasicDBObject o = new BasicDBObject();		o.put("_id", taskId + ":" + uname);		return o;	}	public DailyTaskDtoCursor find() {		return new DailyTaskDtoCursor(collection.find());	}	public long getCount() {		return collection.count();	}	public DailyTaskDtoCursor findByTaskId(int taskId) {		collection.ensureIndex("taskId");		BasicDBObject o = new BasicDBObject("taskId", taskId);		return new DailyTaskDtoCursor(collection.find(o));	}
	public DailyTaskDtoCursor findByUname(String uname) {		collection.ensureIndex("uname");		BasicDBObject o = new BasicDBObject("uname", uname);		return new DailyTaskDtoCursor(collection.find(o));	}
	public DailyTaskDtoCursor findByFinishtimes(int finishtimes) {				BasicDBObject o = new BasicDBObject("finishtimes", finishtimes);		return new DailyTaskDtoCursor(collection.find(o));	}
	public DailyTaskDtoCursor findByIsDraw(boolean isDraw) {				BasicDBObject o = new BasicDBObject("isDraw", isDraw);		return new DailyTaskDtoCursor(collection.find(o));	}
	public void clear () {		collection.drop();	}	public DailyTaskDto createDTO() {		return new DailyTaskDto();	}	public static class DailyTaskDtoCursor implements Iterator<DailyTaskDto>, Iterable<DailyTaskDto>{		private DBCursor	cursor;		public DailyTaskDtoCursor(DBCursor cursor) {			this.cursor = cursor;		}		public boolean hasNext() {			return cursor.hasNext();		}		public DailyTaskDto next() {			DBObject next = cursor.next();			DailyTaskDto dto = new DailyTaskDto();			dto.fromDBObject(next);			return dto;		}		public int getCount() {			return cursor.count();		}		public void remove() {			throw new UnImplMethodException();		}		public Iterator<DailyTaskDto> iterator() {			return this;		}	}}