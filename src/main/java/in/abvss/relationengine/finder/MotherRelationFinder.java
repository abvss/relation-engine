/**
 * 
 */
package in.abvss.relationengine.finder;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import in.abvss.relationengine.Relations;
import in.abvss.relationengine.model.Member;
import in.abvss.relationengine.model.Relation;
import in.abvss.relationengine.model.RelationshipHolder;

/**
 * @author ameyjadiye
 *
 */

@Service
public class MotherRelationFinder<T> extends RelationFinder<Member> {

    /**
     * 
     */
    public MotherRelationFinder() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public RelationshipHolder<Member> find(Member member, List<Member> list) {
        RelationshipHolder<Member> holder = new RelationshipHolder<Member>();
        holder.setMember(member);
        
        
        holder.setRelation(new Relation(Relations.MOTHER));
        List<Member> foundList = new ArrayList<Member>();
        
        for (Member member2 : list) {
            
           if (StringUtils.equals(member2.getGender(),"F") &&
            StringUtils.equals(member.getMotherFirstName(), member2.getFirstName()) && 
            StringUtils.equals(member.getMotherMiddleName(), member2.getMiddleName()) && 
            StringUtils.equals(member.getMotherLastName(), member2.getLastName())
                   ) {
               foundList.add(member2);
           }
        }
        
        holder.setList(foundList);
        return holder;
    }

}
