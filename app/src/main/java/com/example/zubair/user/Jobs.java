package com.example.zubair.user;

public class Jobs {

    private String jobname;
    private String money;
    private String man;

    public Jobs(String jobname, String money, String man) {
        this.jobname = jobname;
        this.money = money;
        this.man = man;
    }

    public Jobs() {

    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }
}
