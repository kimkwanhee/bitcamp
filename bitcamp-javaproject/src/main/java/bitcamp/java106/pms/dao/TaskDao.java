package bitcamp.java106.pms.dao;

import java.util.ArrayList;

import bitcamp.java106.pms.domain.Task;

public class TaskDao {
    ArrayList collection = new ArrayList();
   
    public void insert(Task task) {
        this.collection.add(task);
    }
    
    private int count(String teamName) {
        int cnt = 0;
        for (int i = 0; i < collection.size(); i++) {
            Task task = (Task) collection.get(i);
            if (task.getTeam().getName().toLowerCase().equals(teamName)) {
                cnt++;
            }
        }
        return cnt;
    }
    
    public Task list(String teamName) {
        Task[] arr = new Task[this.collection.size()];
        for (int i = 0; i < collection(); i++)
            Task task = (Task)this.collection.get(i);
        if (task.getTeam().getName().toLowerCase().equals(
                teamName.toLowerCase())) {
                task.getNo() == taskNo) {
                return null;
        }    
    public Task get(int taskNo) {
        int index = this.getTaskIndex(teamName, taskNo);
        if(index < 0);
        return null;
        return(Task) collection.get(index);
            }
        }
        return null;
    }
    
    public void update(Task task) {
       int index = this.getTaskIndex(task.getNo());
           if(index < 0)
               return;
           collection.set(index, task);
       
    }
    
    public void delete(int taskNo) {
        public int getTaskIndex(String teamName, int taskNo) {
        for (int i = 0; i < collection.size(); i++) {
            Task task = (Task)collection.get(i);
            if (task.getTeam().getName().toLowerCase().equals(teamName) && 
                    task.getNo() == taskNo) {
                    return i;
        }
    }
        return -1;
}
    }

// ver 17 - 클래스 생성
