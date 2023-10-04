
package com.example.project_wb.model.product;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Size {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("origName")
    @Expose
    private String origName;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("optionId")
    @Expose
    private Integer optionId;
    @SerializedName("returnCost")
    @Expose
    private Integer returnCost;
    @SerializedName("wh")
    @Expose
    private Integer wh;
    @SerializedName("sign")
    @Expose
    private String sign;
    @SerializedName("payload")
    @Expose
    private String payload;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigName() {
        return origName;
    }

    public void setOrigName(String origName) {
        this.origName = origName;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getReturnCost() {
        return returnCost;
    }

    public void setReturnCost(Integer returnCost) {
        this.returnCost = returnCost;
    }

    public Integer getWh() {
        return wh;
    }

    public void setWh(Integer wh) {
        this.wh = wh;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Size.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("origName");
        sb.append('=');
        sb.append(((this.origName == null)?"<null>":this.origName));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("optionId");
        sb.append('=');
        sb.append(((this.optionId == null)?"<null>":this.optionId));
        sb.append(',');
        sb.append("returnCost");
        sb.append('=');
        sb.append(((this.returnCost == null)?"<null>":this.returnCost));
        sb.append(',');
        sb.append("wh");
        sb.append('=');
        sb.append(((this.wh == null)?"<null>":this.wh));
        sb.append(',');
        sb.append("sign");
        sb.append('=');
        sb.append(((this.sign == null)?"<null>":this.sign));
        sb.append(',');
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
