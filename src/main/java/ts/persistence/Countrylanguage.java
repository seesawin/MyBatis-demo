package ts.persistence;

import java.io.Serializable;

public class Countrylanguage extends CountrylanguageKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.IsOfficial
     *
     * @mbggenerated Tue May 02 17:30:38 CST 2017
     */
    private String isofficial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.Percentage
     *
     * @mbggenerated Tue May 02 17:30:38 CST 2017
     */
    private Float percentage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table countrylanguage
     *
     * @mbggenerated Tue May 02 17:30:38 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.IsOfficial
     *
     * @return the value of countrylanguage.IsOfficial
     *
     * @mbggenerated Tue May 02 17:30:38 CST 2017
     */
    public String getIsofficial() {
        return isofficial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.IsOfficial
     *
     * @param isofficial the value for countrylanguage.IsOfficial
     *
     * @mbggenerated Tue May 02 17:30:38 CST 2017
     */
    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial == null ? null : isofficial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.Percentage
     *
     * @return the value of countrylanguage.Percentage
     *
     * @mbggenerated Tue May 02 17:30:38 CST 2017
     */
    public Float getPercentage() {
        return percentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.Percentage
     *
     * @param percentage the value for countrylanguage.Percentage
     *
     * @mbggenerated Tue May 02 17:30:38 CST 2017
     */
    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}