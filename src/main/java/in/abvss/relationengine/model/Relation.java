package in.abvss.relationengine.model;

import in.abvss.relationengine.Relations;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Relation<T> {
    
    private T member1;
    
    private T member2;
    
    private Relations relationName;
    
    private double weight;

    /**
     * 
     */
    public Relation() {
        super();
    }
    
    /**
     * @param relationName
     */
    public Relation(Relations relationName) {
        super();
        this.relationName = relationName;
    }

    
    /**
     * @param relationName
     * @param weight
     */
    public Relation(Relations relationName, double weight) {
        super();
        this.relationName = relationName;
        this.weight = weight;
    }

    public double getWeight() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
