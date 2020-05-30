/**
 * 
 */
package in.abvss.relationengine.finder;

import java.util.List;

import org.springframework.stereotype.Service;

import in.abvss.relationengine.model.Member;
import in.abvss.relationengine.model.RelationshipHolder;

/**
 * @author ameyjadiye
 *
 */

@Service
public class DaughterRelationFinder<T> extends RelationFinder<Member> {

    /**
     * 
     */
    public DaughterRelationFinder() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public RelationshipHolder<Member> find(Member member, List<Member> list) {
        // TODO Auto-generated method stub
        return null;
    }



}
