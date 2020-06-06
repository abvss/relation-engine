package in.abvss.relationengine.model;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Member {

    private Long id;
    
    private String firstName;
    private String middleName;
    private String lastName;

    private String fatherFirstName;
    private String fatherMiddleName;
    private String fatherLastName;

    private String motherFirstName;
    private String motherMiddleName;
    private String motherLastName;

    private String spouseFirstName;
    private String spouseMiddleName;
    private String spouseLastName;

    private String gender;
    private Date dateOfBirth;
    
    
    /**
     * 
     */
    public Member() {
        super();
    }
    /**
     * @param id
     * @param firstName
     * @param middleName
     * @param lastName
     * @param fatherFirstName
     * @param fatherMiddleName
     * @param fatherLastName
     * @param motherFirstName
     * @param motherMiddleName
     * @param motherLastName
     * @param spouseFirstName
     * @param spouseMiddleName
     * @param spouseLastName
     * @param gender
     * @param dateOfBirth
     */
    public Member(Long id, String firstName, String middleName, String lastName, String fatherFirstName,
            String fatherMiddleName, String fatherLastName, String motherFirstName, String motherMiddleName,
            String motherLastName, String spouseFirstName, String spouseMiddleName, String spouseLastName,
            String gender, Date dateOfBirth) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fatherFirstName = fatherFirstName;
        this.fatherMiddleName = fatherMiddleName;
        this.fatherLastName = fatherLastName;
        this.motherFirstName = motherFirstName;
        this.motherMiddleName = motherMiddleName;
        this.motherLastName = motherLastName;
        this.spouseFirstName = spouseFirstName;
        this.spouseMiddleName = spouseMiddleName;
        this.spouseLastName = spouseLastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }    
    
}
