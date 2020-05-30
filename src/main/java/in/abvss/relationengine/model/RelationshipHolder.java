package in.abvss.relationengine.model;

import java.util.List;

public class RelationshipHolder <T> {

    T member;
    
    Relation relation;
    
    List<T> list;
    
    public RelationshipHolder() {
    }

    /**
     * @return the member
     */
    public T getMember() {
        return member;
    }

    /**
     * @param member the member to set
     */
    public void setMember(T member) {
        this.member = member;
    }

    /**
     * @return the relation
     */
    public Relation getRelation() {
        return relation;
    }

    /**
     * @param relation the relation to set
     */
    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    /**
     * @return the list
     */
    public List<T> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<T> list) {
        this.list = list;
    }
    
    

}
