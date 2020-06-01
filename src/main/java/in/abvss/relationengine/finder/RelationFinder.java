/**
 * 
 */
package in.abvss.relationengine.finder;

import org.springframework.stereotype.Service;

import in.abvss.relationengine.model.Member;

/**
 * @author ameyjadiye
 *
 */
@Service
public abstract class RelationFinder<T> implements Findable<T>{

    public RelationFinder() {
    }
    
}
