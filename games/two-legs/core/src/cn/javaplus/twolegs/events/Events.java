package cn.javaplus.twolegs.events;
		add(cn.javaplus.twolegs.game.GameOverEvent.class, new cn.javaplus.twolegs.ads.ShowPopAds());
		add(cn.javaplus.twolegs.game.GameOverEvent.class, new cn.javaplus.twolegs.game.PopScore());
		add(cn.javaplus.twolegs.game.GameOverEvent.class, new cn.javaplus.twolegs.game.SaveBestScore());
		add(cn.javaplus.twolegs.game.GameOverEvent.class, new cn.javaplus.twolegs.game.SaveLog());
		add(cn.javaplus.twolegs.game.GameOverEvent.class, new cn.javaplus.twolegs.game.SavePlayTimes());
		add(cn.javaplus.twolegs.game.GameStartEvent.class, new cn.javaplus.twolegs.game.GameStartLoadAssets());
		add(cn.javaplus.twolegs.game.GetBestScoreEvent.class, new cn.javaplus.twolegs.score.CommitScore());
