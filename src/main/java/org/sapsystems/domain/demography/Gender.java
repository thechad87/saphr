package org.sapsystems.domain.demography;

/**
 * Created by ChadMarthinussen2 on 2019/08/07.
 */
public class Gender {

    private String genderId, genderDescription;


    public Gender() {
    }

    public Gender(Builder builder) {
        this.genderId = builder.genderId;
        this.genderDescription = builder.genderDescription;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getGenderDescription() {
        return genderDescription;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public void setGenderDescription(String genderDescription) {
        this.genderDescription = genderDescription;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", genderDescription='" + genderDescription + '\'' +
                '}';
    }

    public static class Builder{

        private String genderId, genderDescription;


        public Builder genderId(String genderId) {
            this.genderId = genderId;
            return this;
        }


        public Builder genderDescription(String genderDescription) {
            this.genderDescription = genderDescription;
            return this;
        }

        public Builder copy(Gender gender){
            this.genderId = genderId;
            this.genderDescription = genderDescription;
            return this;
        }
        
        public Gender build(){
            return new Gender(this);
        }
        
    }
}
