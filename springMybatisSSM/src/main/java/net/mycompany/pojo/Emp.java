package net.mycompany.pojo;

import java.util.Date;

public class Emp {
    private Integer id;

    private String fullname;

    private String email;

    private String birthday;

    private String profession;

    private String finishedMilitary;

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