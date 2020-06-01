package in.abvss.relationengine.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RelationshipHolder <T> {

    T member;
    
    Relation<T> relation;
    
    List<T> list;
    
    public RelationshipHolder() {
    }

}
