package net.mycompany.pojo;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Emp {
	@Digits(integer = 7,fraction = 0,message = "Id should be 7 digits")
    private Integer id;
	
	@NotBlank(message = "Please input your name." )
	@Pattern(regexp="^[\\u4e00-\\u9fa5]+$|^[a-zA-Z\\s]+$", message = "Name should all be Chinese or all be English")
	@Size(max = 50, message = "Name should be shorter than 50 words")
    private String fullname;
	
	@Email(message = "wrong email address type")
    private String email;

	@NotBlank(message = "Please select your birthday." )
    private String birthday;

	@NotBlank(message = "Please select your profession." )
    private String profession;

    private String finishedMilitary;

    @NotBlank(message = "Please select your gender." )
    private String gender;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getFinishedMilitary() {
        return finishedMilitary;
    }

    public void setFinishedMilitary(String finishedMilitary) {
        this.finishedMilitary = finishedMilitary == null ? null : finishedMilitary.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	@Override
	public String toString() {
		return "Emp [id=" + id + ", fullname=" + fullname + ", email=" + email + ", birthday=" + birthday
				+ ", profession=" + profession + ", finishedMilitary=" + finishedMilitary + ", gender=" + gender
				+ ", note=" + note + "]";
	}    
    
}