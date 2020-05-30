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
public class SpouseRelationFinder<T> extends RelationFinder<Member> {

    /**
     * 
     */
    public SpouseRelationFinder() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public RelationshipHolder<Member> find(Member member, List<Member> list) {
        RelationshipHolder<Member> holder = new RelationshipHolder<Member>();
        holder.setMember(member);
        
        List<Member> foundList = new ArrayList<Member>();
        
        for (Member member2 : list) {
            
           if (
            StringUtils.equals(member.getSpouseFirstName(), member2.getFirstName()) && 
            StringUtils.equals(member.getSpouseMiddleName(), member2.getMiddleName()) && 
            StringUtils.equals(member.getSpouseLastName(), member2.getLastName())
                   ) {
               
               if (StringUtils.equals(member.getGender(),"F") && StringUtils.equals(member2.getGender(),"M"))
               {
                   holder.setRelation(new Relation(Relations.HUSBAND));
                   foundList.add(member2);
               }
               else if (StringUtils.equals(member.getGender(),"M") && StringUtils.equals(member2.getGender(),"F"))
               {
                   holder.setRelation(new Relation(Relations.WIFE));
                   foundList.add(member2);
               }
           }
        }
        
        holder.setList(foundList);
        return holder;
    }

}
