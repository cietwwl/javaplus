/** * 在仙市中累積尋仙600次 */package cn.mxz.task.achieve.tasks;import cn.mxz.base.task.TaskAccumulatedAll;import cn.mxz.task.achieve.AchieveTaskPlayer;import mongo.gen.MongoGen.AchieveTaskDto;public class T12915 extends TaskAccumulatedAll<AchieveTaskDto> { @Override  protected int getFinishTimesNow() {  AchieveTaskPlayer player = user.getAchieveTaskPlayer();  return player.getFindFighterTimes(); }}