package cn.mxz.task.dailytask.tasks;import cn.mxz.base.task.TaskAccumulatedAll;import cn.mxz.task.dailytask.DailyTaskPlayer;import mongo.gen.MongoGen.DailyTaskDto;public class T11 extends TaskAccumulatedAll<DailyTaskDto> { @Override protected int getFinishTimesNow() {  DailyTaskPlayer player = user.getDailyTaskPlayer();  return player.getCorona(); }}