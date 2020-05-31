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
public class DaughterRelationFinder<T> extends RelationFinder<Member> {

    /**
     * 
     */
    public DaughterRelationFinder() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public RelationshipHolder<Member> find(Member member, List<Member> list) {
        RelationshipHolder<Member> holder = new RelationshipHolder<Member>();
        holder.setMember(member);
        
        
        holder.setRelation(new Relation(Relations.DAUGHTER));
        List<Member> foundList = new ArrayList<Member>();
        
        for (Member member2 : list) {
            
           if ( StringUtils.equals(member2.getGender(),"F") &&
            
            (( StringUtils.equals(member.getGender(),"M") &&
            StringUtils.equals(member.getFirstName(), member2.getFatherFirstName()) && 
            StringUtils.equals(member.getMiddleName(), member2.getFatherMiddleName()) && 
            StringUtils.equals(member.getLastName(), member2.getFatherLastName()))
            ||
            ( StringUtils.equals(member.getGender(),"F") &&      
            StringUtils.equals(member.getSpouseFirstName(), member2.getFatherFirstName()) && 
            StringUtils.equals(member.getSpouseMiddleName(), member2.getFatherMiddleName()) && 
            StringUtils.equals(member.getSpouseLastName(), member2.getFatherLastName())))
                    
              ) {
               
               foundList.add(member2);
           }
        }
        
        holder.setList(foundList);
        return holder;
    }



}
