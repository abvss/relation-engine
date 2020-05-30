package in.abvss.relationengine.model;

import org.apache.commons.graph.WeightedEdge;

import in.abvss.relationengine.Relations;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
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

    /**
     * @return the relationName
     */
    public Relations getRelationName() {
        return relationName;
    }

    /**
     * @param relationName the relationName to set
     */
    public void setRelationName(Relations relationName) {
        this.relationName = relationName;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

}
