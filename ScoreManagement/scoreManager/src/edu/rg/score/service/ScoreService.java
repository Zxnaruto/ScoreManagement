package edu.rg.score.service;

import java.util.List;

import edu.rg.score.dao.ScoreDao;
import edu.rg.score.entity.Score;

public class ScoreService {
	
	//ScoreDao dao = new ScoreDao();
	public ScoreDao scoreDao;//使用依赖注入
	

	public List<Score> getScoreList(){
		return scoreDao.getScoreList();
	}
	//列表
	public ScoreDao getScoreDao() {
		return scoreDao;
	}


   
	public void setScoreDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	//新增
	public boolean addScore(Score score){
		try {
			scoreDao.addScore(score);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	//删除
	public boolean delScore(Score score){
		try {
			scoreDao.delScore(score);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

    //根据ID查对象
	public Score getScore(String id){
		Score score=null;
		try {
			score = scoreDao.getScore(id);
			return score;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return score;
	}
	//修改学生考试成绩
	public boolean updateScore(Score score){
		try {
			scoreDao.updateScore(score);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
}
