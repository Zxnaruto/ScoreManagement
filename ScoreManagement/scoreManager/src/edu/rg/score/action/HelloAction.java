package edu.rg.score.action;

import java.util.List;

import edu.rg.score.entity.Score;
import edu.rg.score.service.ScoreService;

public class HelloAction {
	//public String word;
	public List<Score> list;
	public Score score;
	
    public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}



	//ScoreService service = new ScoreService();
	private ScoreService scoreService;//使用依赖注入
	private String message;
	

	public String execute(){
		list = scoreService.getScoreList();
		return "success";
	}
	
	public ScoreService getScoreService() {
		return scoreService;
	}



	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
    //新增学员信息
	public String add(){
		boolean flag=scoreService.addScore(score);
		if(flag){
			message="<script>alert('新增成功')</script>";
			return execute();//如果添加成功，则刷新列表
		}else{
			message="<script>alert('新增失败')</script>";
			return "false";
		}
	}
	//删除学员信息
	public String del(){
		boolean flag=scoreService.delScore(score);
		if(flag){
			message="<script>alert('删除成功')</script>";
			return execute();//如果添加成功，则刷新列表
		}else{
			message="<script>alert('删除失败')</script>";
			return "false";
		}
	}

	//根据ID查到这个学生成绩对象，把该对象转发到edit页面进行修改
	public String toUpdate(){
		score = scoreService.getScore(score.getStuNo());
		if(score!=null){
			return "edit";
		}else{
			return execute();
		}
	}
	//修改学生成绩
	public String doUpdate(){
		boolean flag=scoreService.updateScore(score);
		if(flag){
			message="<script>alert('修改成功')</script>";
			return execute();//如果添加成功，则刷新列表
		}else{
			message="<script>alert('修改失败')</script>";
			return "edit";
		}
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
