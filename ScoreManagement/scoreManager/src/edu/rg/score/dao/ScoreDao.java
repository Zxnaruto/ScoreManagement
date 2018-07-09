package edu.rg.score.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.rg.score.entity.Score;

public class ScoreDao extends HibernateDaoSupport{
	
	@SuppressWarnings("unchecked")
	//查询学员列表
	public List<Score> getScoreList(){
		return this.getHibernateTemplate().find("from Score");
	}
	//添加学生信息
	public void addScore(Score score){
		this.getHibernateTemplate().save(score);
	}
	//删除学生信息
	public void delScore(Score score){
		this.getHibernateTemplate().delete(score);
	}
	//通过ID查询学生信息
	public Score getScore(String id){
		return this.getHibernateTemplate().get(Score.class, id);
	}
	//通过ID修改学生信息
	public void updateScore(Score score){
		this.getHibernateTemplate().bulkUpdate("update Score set stuName = ?,dailyScore = ?,"+"examScore = ?,clsNo=? where stuNo=?",
				score.getStuName(),score.getDailyScore(),score.getExamScore(),score.getClsNo(),score.getStuNo());
	}
}
