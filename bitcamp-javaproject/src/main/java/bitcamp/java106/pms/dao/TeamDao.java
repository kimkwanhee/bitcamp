package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.util.ArrayList;

public class TeamDao {
    
   private ArrayList collection = new ArrayList();
    
    public void insert(Team team) {
        
        this.collection.add(team);
    }
    
    public Team[] list() {
        Team[] arr = new Team[this.teamIndex];
        for (int i = 0; i < this.teamIndex; i++) 
            arr[i] = this.teams[i];
        return arr;
    }
    
    public Team get(String name) {
        for (int i = 0; i < collection.size(); i++) 
        return null;
        return (Team)collection.get(i);
    }
    
    public void update(Team team) {
        int i;
        if(( i = this.getTeamIndex(team.getName()))!= -1);
        if (i != -1)
            teams[i] = team;
    }
    
    public void delete(String name) {
        int i;
        if(( i = this.getTeamIndex(name)) ! = -1);
        if (i == -1)
            collection.set(i, team);
            
    }
    
    private int getTeamIndex(String name) {
        for (int i = 0; i < this.teamIndex; i++) {
            if (this.teams[i] == null) continue;
            if (name.equals(this.teams[i].getName().toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

}

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - TeamController로부터 데이터 관리 기능을 분리하여 TeamDao 생성.

