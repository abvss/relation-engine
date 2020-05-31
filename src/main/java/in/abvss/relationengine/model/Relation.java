package in.abvss.relationengine.model;

import org.apache.commons.graph.WeightedEdge;

import in.abvss.relationengine.Relations;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Relation implements WeightedEdge {
    
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

    @Override
    public double getWeight() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
