package cn.mxz.task.dailytask.tasks;import cn.mxz.base.task.NormalTask;import cn.mxz.task.dailytask.DailyTaskPlayer;import mongo.gen.MongoGen.DailyTaskDto;import cn.mxz.handler.PacketDefine;public class T17 extends NormalTask<DailyTaskDto> { @Override protected boolean isAchievement() {  DailyTaskPlayer player = user.getDailyTaskPlayer();  return player.getBLTYTimes() >= 1; }}