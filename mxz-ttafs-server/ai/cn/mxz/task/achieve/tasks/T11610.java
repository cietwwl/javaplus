/** * 甲級夥伴數量達到11個 */package cn.mxz.task.achieve.tasks;import cn.mxz.base.task.TaskAccumulatedAll;import cn.mxz.task.achieve.AchieveTaskPlayer;import mongo.gen.MongoGen.AchieveTaskDto;public class T11610 extends TaskAccumulatedAll<AchieveTaskDto> { @Override  protected int getFinishTimesNow() {  AchieveTaskPlayer player = user.getAchieveTaskPlayer();  return player.getJiaJiHuoBanCount(); }}