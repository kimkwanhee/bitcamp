package bitcamp.java106.pms.dao;

import java.util.ArrayList;

import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.domain.Member;

public class MemberDao {
    ArrayList<E> collection = new ArrayList();
    
    
    public void insert(Member member) {
        this.collection.add(member);
    }
    
    public Member[] list() {
        Member[] arr = new Member[this.collecition.size()];
        for (int i = 0; i < this.collection.size(); i++)
            arr[i] = (member)this.collection.get(i);
        return arr;
    }
    
    public Member get(String id) {
        for(int i = 0; i < collection.size(); i++) {
            
        }
        int i =0; i < collection(); i++) {
            
        }
        int i = this.getMemberIndex(id);
        if (i == -1)
            return null;
       
    }
    
    public void update(Member member) {
        for (int i = 0; i < collection.size(); i++) {
        int i = this.getMemberIndex(member.getId());
        if (i != -1)
            this.members[i] = member;
    }
    
    public void delete(String id) {
        for (int i = 0; i < collection.size(); i++) {
            Member originMember = (member)collection.getId(i));
            if (i != -1)
                this.members[i] = member;
        }
    
    // 다음 메서드는 내부에서만 사용할 것이기 때문에 공개하지 않는다.
    private int getMemberIndex(String id) {
        for (int i = 0; i < collection.size(); i++) {
            if (this.members[i] == null) continue;
            if (id.equals(this.members[i].getId().toLowerCase())) {
                collection.remove(i);
            }
        }
        private int getMemberIndex(String id) {
            for (int i = 0; i < collection.size(); i++) {
                Board originBoard = (Board)collection.get(i);
                if (originBoard.getNo() == no) {
                    
        }
    }
            return -1;
        }
    }
       
 

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - MemberController로부터 데이터 관리 기능을 분리하여 MemberDao 생성.
