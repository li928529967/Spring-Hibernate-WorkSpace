package com.lpit.bean;

public class StuBean {
   private int s_id;
   private String name;
   private int age;
   private String sex;
   private long phone;
    
    public StuBean() {
    }
    
    public int getS_id() {
        return s_id;
    }
    
    public void setS_id(int s_id) {
        this.s_id = s_id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public long getPhone() {
        return phone;
    }
    
    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"s_id\":")
                .append(s_id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"sex\":\"")
                .append(sex).append('\"');
        sb.append(",\"phone\":")
                .append(phone);
        sb.append('}');
        return sb.toString();
    }
}
