package cn.mxz.task.dailytask.tasks;  import cn.mxz.task.dailytask.VipTask; import cn.mxz.vipcard.VipCardPlayer;  public class T4 extends VipTask {   @Override  public boolean isVisible() {   // 0:什麼都沒有買 1:白銀月卡 2:黃金月卡 3:至尊月卡   VipCardPlayer player = user.getVipCardPlayer();   int t = player.getVipCardType();   return t == 1 || t == 0;  }   @Override  protected boolean isAchievement() {    VipCardPlayer player = user.getVipCardPlayer();   int t = player.getVipCardType();   return t == 1;  } }