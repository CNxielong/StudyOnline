package cn.xdl.ovls.entity;

public class Direction {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column direction.id
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column direction.name
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column direction.id
     *
     * @return the value of direction.id
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column direction.id
     *
     * @param id the value for direction.id
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column direction.name
     *
     * @return the value of direction.name
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column direction.name
     *
     * @param name the value for direction.name
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}