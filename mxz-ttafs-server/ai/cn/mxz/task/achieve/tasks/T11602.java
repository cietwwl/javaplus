/** * 甲級夥伴數量達到2個 */package cn.mxz.task.achieve.tasks;import cn.mxz.base.task.TaskAccumulatedAll;import cn.mxz.task.achieve.AchieveTaskPlayer;import mongo.gen.MongoGen.AchieveTaskDto;public class T11602 extends TaskAccumulatedAll<AchieveTaskDto> { @Override  protected int getFinishTimesNow() {  AchieveTaskPlayer player = user.getAchieveTaskPlayer();  return player.getJiaJiHuoBanCount(); }}