/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.workQueue;

/**
 *
 * @author Shriya
 */
public class DoctorLabRequest extends WorkRequest{
    
    //patient's data
    //general information 
    private String name;
    private Integer age;
    private String gender;
    private String final_result;
    
    //medical trauma history
    private boolean drug_history;
    private boolean alcohol_history;
    private boolean depression_history;
    private boolean anxiety_history;
    private boolean disrupt_history;
    
    //physical symptoms
    private boolean hr_risk;
    private boolean bp_risk;
    private boolean temp_risk;
    private boolean resp_risk;
    
    //medical consumption check
    private boolean oxycodone_taken;
    private boolean fantanyl_taken;
    private boolean bupre_taken;
    private boolean methadone_taken;
    private boolean oxymorphone_taken;
    
    //medical consumption risk
    private boolean oxycodone_risk;
    private boolean fantanyl_risk;
    private boolean bupre_risk;
    private boolean methadone_risk;
    private boolean oxymorphone_risk;
    
    
    //additonal information
    private boolean injection_checked;
    private boolean intoxication_checked;
    private boolean withdrawal_checked;
    private boolean disease_checked;

    private String injection_type;
    private String intoxication_type;
    private String withdrawal_type;
    private String disease_type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFinal_result() {
        return final_result;
    }

    public void setFinal_result(String final_result) {
        this.final_result = final_result;
    }

    public boolean isDrug_history() {
        return drug_history;
    }

    public void setDrug_history(boolean drug_history) {
        this.drug_history = drug_history;
    }

    public boolean isAlcohol_history() {
        return alcohol_history;
    }

    public void setAlcohol_history(boolean alcohol_history) {
        this.alcohol_history = alcohol_history;
    }

    public boolean isDepression_history() {
        return depression_history;
    }

    public void setDepression_history(boolean depression_history) {
        this.depression_history = depression_history;
    }

    public boolean isAnxiety_history() {
        return anxiety_history;
    }

    public void setAnxiety_history(boolean anxiety_history) {
        this.anxiety_history = anxiety_history;
    }

    public boolean isDisrupt_history() {
        return disrupt_history;
    }

    public void setDisrupt_history(boolean disrupt_history) {
        this.disrupt_history = disrupt_history;
    }

    public boolean isHr_risk() {
        return hr_risk;
    }

    public void setHr_risk(boolean hr_risk) {
        this.hr_risk = hr_risk;
    }

    public boolean isBp_risk() {
        return bp_risk;
    }

    public void setBp_risk(boolean bp_risk) {
        this.bp_risk = bp_risk;
    }

    public boolean isTemp_risk() {
        return temp_risk;
    }

    public void setTemp_risk(boolean temp_risk) {
        this.temp_risk = temp_risk;
    }

    public boolean isResp_risk() {
        return resp_risk;
    }

    public void setResp_risk(boolean resp_risk) {
        this.resp_risk = resp_risk;
    }

    public boolean isOxycodone_taken() {
        return oxycodone_taken;
    }

    public void setOxycodone_taken(boolean oxycodone_taken) {
        this.oxycodone_taken = oxycodone_taken;
    }

    public boolean isFantanyl_taken() {
        return fantanyl_taken;
    }

    public void setFantanyl_taken(boolean fantanyl_taken) {
        this.fantanyl_taken = fantanyl_taken;
    }

    public boolean isBupre_taken() {
        return bupre_taken;
    }

    public void setBupre_taken(boolean bupre_taken) {
        this.bupre_taken = bupre_taken;
    }

    public boolean isMethadone_taken() {
        return methadone_taken;
    }

    public void setMethadone_taken(boolean methadone_taken) {
        this.methadone_taken = methadone_taken;
    }

    public boolean isOxymorphone_taken() {
        return oxymorphone_taken;
    }

    public void setOxymorphone_taken(boolean oxymorphone_taken) {
        this.oxymorphone_taken = oxymorphone_taken;
    }

    public boolean isOxycodone_risk() {
        return oxycodone_risk;
    }

    public void setOxycodone_risk(boolean oxycodone_risk) {
        this.oxycodone_risk = oxycodone_risk;
    }

    public boolean isFantanyl_risk() {
        return fantanyl_risk;
    }

    public void setFantanyl_risk(boolean fantanyl_risk) {
        this.fantanyl_risk = fantanyl_risk;
    }

    public boolean isBupre_risk() {
        return bupre_risk;
    }

    public void setBupre_risk(boolean bupre_risk) {
        this.bupre_risk = bupre_risk;
    }

    public boolean isMethadone_risk() {
        return methadone_risk;
    }

    public void setMethadone_risk(boolean methadone_risk) {
        this.methadone_risk = methadone_risk;
    }

    public boolean isOxymorphone_risk() {
        return oxymorphone_risk;
    }

    public void setOxymorphone_risk(boolean oxymorphone_risk) {
        this.oxymorphone_risk = oxymorphone_risk;
    }

    public boolean isInjection_checked() {
        return injection_checked;
    }

    public void setInjection_checked(boolean injection_checked) {
        this.injection_checked = injection_checked;
    }

    public boolean isIntoxication_checked() {
        return intoxication_checked;
    }

    public void setIntoxication_checked(boolean intoxication_checked) {
        this.intoxication_checked = intoxication_checked;
    }

    public boolean isWithdrawal_checked() {
        return withdrawal_checked;
    }

    public void setWithdrawal_checked(boolean withdrawal_checked) {
        this.withdrawal_checked = withdrawal_checked;
    }

    public boolean isDisease_checked() {
        return disease_checked;
    }

    public void setDisease_checked(boolean disease_checked) {
        this.disease_checked = disease_checked;
    }

    public String getInjection_type() {
        return injection_type;
    }

    public void setInjection_type(String injection_type) {
        this.injection_type = injection_type;
    }

    public String getIntoxication_type() {
        return intoxication_type;
    }

    public void setIntoxication_type(String intoxication_type) {
        this.intoxication_type = intoxication_type;
    }

    public String getWithdrawal_type() {
        return withdrawal_type;
    }

    public void setWithdrawal_type(String withdrawal_type) {
        this.withdrawal_type = withdrawal_type;
    }

    public String getDisease_type() {
        return disease_type;
    }

    public void setDisease_type(String disease_type) {
        this.disease_type = disease_type;
    }
    
    
}
