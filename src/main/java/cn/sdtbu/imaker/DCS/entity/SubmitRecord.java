package cn.sdtbu.imaker.DCS.entity;

import java.util.Date;

public class SubmitRecord {
    private Integer srId; //id
    private Integer hwId; //作业Id
    private Integer userName; //上传的教师用户
    private String dirName; //提交文件夹名称
    private Date submitTime;  //提交日期
    private Boolean checked;  //是否完成查重

    public SubmitRecord(Integer srId, Integer hwId, Integer userName, String dirName, Date submitTime, Boolean checked) {
        this.srId = srId;
        this.hwId = hwId;
        this.userName = userName;
        this.dirName = dirName;
        this.submitTime = submitTime;
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "SubmitRecord{" +
                "srId=" + srId +
                ", hwId=" + hwId +
                ", userName=" + userName +
                ", dirName='" + dirName + '\'' +
                ", submitTime=" + submitTime +
                ", checked=" + checked +
                '}';
    }

    public Integer getSrId() {
        return srId;
    }

    public void setSrId(Integer srId) {
        this.srId = srId;
    }

    public Integer getHwId() {
        return hwId;
    }

    public void setHwId(Integer hwId) {
        this.hwId = hwId;
    }

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}
