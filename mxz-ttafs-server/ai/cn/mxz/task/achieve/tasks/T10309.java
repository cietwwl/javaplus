/** * 在鬥法中晉級仙位地仙3級 */package cn.mxz.task.achieve.tasks;import cn.mxz.base.task.NormalTask;import cn.mxz.task.achieve.AchieveTaskPlayer;import mongo.gen.MongoGen.AchieveTaskDto;public class T10309 extends NormalTask<AchieveTaskDto> { @Override protected boolean isAchievement() {  AchieveTaskPlayer player = user.getAchieveTaskPlayer();  return player.getPvpDanId() >=8; }}