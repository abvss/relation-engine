/**
 * 
 */
package in.abvss.relationengine.finder;

import java.util.List;

import in.abvss.relationengine.model.RelationshipHolder;

/**
 * @author ameyjadiye
 *
 */
public interface Findable<T> {

    public RelationshipHolder<T> find(T member, List<T> list);

}
