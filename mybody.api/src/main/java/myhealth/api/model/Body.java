package myhealth.api.model;

import myhealth.api.BodyReference;
import users.api.model.UserReferenceDTO;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by timmygilissen on 4/12/15.
 */
@Entity
public class Body {
    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private UserReferenceDTO reference;

    @Embedded
    private BodyReference bodyReference;


    private Long weight;

    private Long fat;

    private Long wather;

    private Long internalFat;

    private Long boneMass;

    private Long muscle;

    private Long mentalAge;

    private Long chest;

    private Long waist;

    private Long hip;

    private Long rightButtock;

    private Long leftButtock;

    private Long leftArm;

    private Long rightArm;

    public Body(Long id, UserReferenceDTO reference, BodyReference bodyReference, Long weight, Long fat, Long wather, Long internalFat, Long boneMass, Long muscle, Long mentalAge, Long chest, Long waist, Long hip, Long rightButtock, Long leftButtock, Long leftArm, Long rightArm) {
        this.id = id;
        this.reference = reference;
        this.bodyReference = bodyReference;
        this.weight = weight;
        this.fat = fat;
        this.wather = wather;
        this.internalFat = internalFat;
        this.boneMass = boneMass;
        this.muscle = muscle;
        this.mentalAge = mentalAge;
        this.chest = chest;
        this.waist = waist;
        this.hip = hip;
        this.rightButtock = rightButtock;
        this.leftButtock = leftButtock;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
    }

    public Body(){}

    public UserReferenceDTO getReference() {
        return reference;
    }

    public Long getId() {
        return id;
    }

    public Long getWeight() {
        return weight;
    }

    public Long getFat() {
        return fat;
    }

    public Long getWather() {
        return wather;
    }

    public Long getInternalFat() {
        return internalFat;
    }

    public Long getBoneMass() {
        return boneMass;
    }

    public Long getMuscle() {
        return muscle;
    }

    public Long getMentalAge() {
        return mentalAge;
    }

    public Long getChest() {
        return chest;
    }

    public Long getWaist() {
        return waist;
    }

    public Long getHip() {
        return hip;
    }

    public Long getRightButtock() {
        return rightButtock;
    }

    public Long getLeftButtock() {
        return leftButtock;
    }

    public Long getLeftArm() {
        return leftArm;
    }

    public Long getRightArm() {
        return rightArm;
    }

    public BodyReference getBodyReference() {
        return bodyReference;
    }
}
