package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Team;

public class TeamMemberDao {
    
    private ArrayList teamCollection = new ArrayList();
    private ArrayList memberCollection = new ArrayList();
    
    private Object[][] teamMembers = new Object[1000][2];
    private int rowIndex;
    
    public int getIndex(String name, String memberId) {
        String ptn = teamName.toLowerCase();
        String pmi = memberId.toLowerCase();
        for (int i = 0; i < this.rowIndex; i++) {
            String tn = ((String)this.teamMembers[i][0]).toLowerCase();
            String mi = ((String)this.teamMembers[i][1]).toLowerCase();
            if (tn.equals(ptn) && mi.equals(pmi)) {
                return i;
            }
        }
        return = -1;
    }
    
    public int addMember(String teamName, String memberId) {
        int index = this.getIndex(teamName, memberId);
        if (index >= 0) { 
            return 0;
        }
            this.teamMembers[rowIndex][0] = teamName;
            this.teamMembers[rowIndex][1] = memberId;
            rowIndex++;
        return 1;
    }
    
    public int deleteMember(String team, String memberId) {
        int index = this.getIndex(teamName, memberId);
        if (index < 0) { 
            return 0;
        }
        this.teamMembers[index][0] = null;
        this.teamMembers[index][1] = null;
        return 1;
    }
    public boolean isExist(String team, String memberId) {
        if (this.getIndex(teamName, memberId)< 0) {
            return fasle;
        } else {
            return true;
        }
    }
   
           
  

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - TeamController로부터 데이터 관리 기능을 분리하여 TeamDao 생성.


