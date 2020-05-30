package in.abvss.relationengine.model;

import java.util.Date;

import org.apache.commons.graph.Vertex;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Member implements Vertex {

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
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }
    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * @return the fatherFirstName
     */
    public String getFatherFirstName() {
        return fatherFirstName;
    }
    /**
     * @param fatherFirstName the fatherFirstName to set
     */
    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }
    /**
     * @return the fatherMiddleName
     */
    public String getFatherMiddleName() {
        return fatherMiddleName;
    }
    /**
     * @param fatherMiddleName the fatherMiddleName to set
     */
    public void setFatherMiddleName(String fatherMiddleName) {
        this.fatherMiddleName = fatherMiddleName;
    }
    /**
     * @return the fatherLastName
     */
    public String getFatherLastName() {
        return fatherLastName;
    }
    /**
     * @param fatherLastName the fatherLastName to set
     */
    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }
    /**
     * @return the motherFirstName
     */
    public String getMotherFirstName() {
        return motherFirstName;
    }
    /**
     * @param motherFirstName the motherFirstName to set
     */
    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }
    /**
     * @return the motherMiddleName
     */
    public String getMotherMiddleName() {
        return motherMiddleName;
    }
    /**
     * @param motherMiddleName the motherMiddleName to set
     */
    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }
    /**
     * @return the motherLastName
     */
    public String getMotherLastName() {
        return motherLastName;
    }
    /**
     * @param motherLastName the motherLastName to set
     */
    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }
    /**
     * @return the spouseFirstName
     */
    public String getSpouseFirstName() {
        return spouseFirstName;
    }
    /**
     * @param spouseFirstName the spouseFirstName to set
     */
    public void setSpouseFirstName(String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }
    /**
     * @return the spouseMiddleName
     */
    public String getSpouseMiddleName() {
        return spouseMiddleName;
    }
    /**
     * @param spouseMiddleName the spouseMiddleName to set
     */
    public void setSpouseMiddleName(String spouseMiddleName) {
        this.spouseMiddleName = spouseMiddleName;
    }
    /**
     * @return the spouseLastName
     */
    public String getSpouseLastName() {
        return spouseLastName;
    }
    /**
     * @param spouseLastName the spouseLastName to set
     */
    public void setSpouseLastName(String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
}
