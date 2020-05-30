/**
 * 
 */
package in.abvss.relationengine.finder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.abvss.relationengine.model.Member;

/**
 * @author ameyjadiye
 *
 */
@Service
public class RelationFinderFactory {

    @Autowired
    private FatherRelationFinder<Member> fatherRelationFinder;

    @Autowired
    private MotherRelationFinder<Member> motherRelationFinder;

    @Autowired
    private BrotherRelationFinder<Member> brotherRelationFinder;

    @Autowired
    private SisterRelationFinder<Member> sisterRelationFinder;

    @Autowired
    private SpouseRelationFinder<Member> spouseRelationFinder;

    @Autowired
    private SonRelationFinder<Member> sonRelationFinder;

    @Autowired
    private DaughterRelationFinder<Member> daughterRelationFinder;

    public List<RelationFinder<Member>> getAllPrimaryRelationFinder() {

        List<RelationFinder<Member>> primaryRelations = Stream.of(fatherRelationFinder, motherRelationFinder, brotherRelationFinder,
                sisterRelationFinder, spouseRelationFinder, sonRelationFinder, daughterRelationFinder)
                .collect(Collectors.toList());

        
        return primaryRelations;
    }
}
