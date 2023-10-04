
package com.example.project_wb.model.product;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Params {

    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("curr")
    @Expose
    private String curr;
    @SerializedName("spp")
    @Expose
    private Integer spp;
    @SerializedName("payloadVersion")
    @Expose
    private Integer payloadVersion;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public Integer getSpp() {
        return spp;
    }

    public void setSpp(Integer spp) {
        this.spp = spp;
    }

    public Integer getPayloadVersion() {
        return payloadVersion;
    }

    public void setPayloadVersion(Integer payloadVersion) {
        this.payloadVersion = payloadVersion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Params.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("curr");
        sb.append('=');
        sb.append(((this.curr == null)?"<null>":this.curr));
        sb.append(',');
        sb.append("spp");
        sb.append('=');
        sb.append(((this.spp == null)?"<null>":this.spp));
        sb.append(',');
        sb.append("payloadVersion");
        sb.append('=');
        sb.append(((this.payloadVersion == null)?"<null>":this.payloadVersion));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
