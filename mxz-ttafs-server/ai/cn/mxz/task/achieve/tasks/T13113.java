/** * 累積進行250次元神逆轉 */package cn.mxz.task.achieve.tasks;import cn.mxz.base.task.TaskAccumulatedAll;import cn.mxz.task.achieve.AchieveTaskPlayer;import mongo.gen.MongoGen.AchieveTaskDto;public class T13113 extends TaskAccumulatedAll<AchieveTaskDto> { @Override  protected int getFinishTimesNow() {  AchieveTaskPlayer player = user.getAchieveTaskPlayer();  return player.getYuanShenResetTimes() ; }}