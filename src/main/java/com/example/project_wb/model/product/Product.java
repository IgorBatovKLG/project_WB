
package com.example.project_wb.model.product;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Product {

    @SerializedName("time1")
    @Expose
    private Integer time1;
    @SerializedName("time2")
    @Expose
    private Integer time2;
    @SerializedName("dist")
    @Expose
    private Integer dist;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("root")
    @Expose
    private Integer root;
    @SerializedName("kindId")
    @Expose
    private Integer kindId;
    @SerializedName("subjectId")
    @Expose
    private Integer subjectId;
    @SerializedName("subjectParentId")
    @Expose
    private Integer subjectParentId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("brandId")
    @Expose
    private Integer brandId;
    @SerializedName("siteBrandId")
    @Expose
    private Integer siteBrandId;
    @SerializedName("supplierId")
    @Expose
    private Integer supplierId;
    @SerializedName("sale")
    @Expose
    private Integer sale;
    @SerializedName("priceU")
    @Expose
    private Integer priceU;
    @SerializedName("salePriceU")
    @Expose
    private Integer salePriceU;
    @SerializedName("logisticsCost")
    @Expose
    private Integer logisticsCost;
    @SerializedName("saleConditions")
    @Expose
    private Integer saleConditions;
    @SerializedName("returnCost")
    @Expose
    private Integer returnCost;
    @SerializedName("pics")
    @Expose
    private Integer pics;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("reviewRating")
    @Expose
    private Double reviewRating;
    @SerializedName("feedbacks")
    @Expose
    private Integer feedbacks;
    @SerializedName("panelPromoId")
    @Expose
    private Integer panelPromoId;
    @SerializedName("promoTextCard")
    @Expose
    private String promoTextCard;
    @SerializedName("promoTextCat")
    @Expose
    private String promoTextCat;
    @SerializedName("volume")
    @Expose
    private Integer volume;
    @SerializedName("colors")
    @Expose
    private List<Color> colors;
    @SerializedName("sizes")
    @Expose
    private List<Size> sizes;
    @SerializedName("diffPrice")
    @Expose
    private Boolean diffPrice;
    @SerializedName("log")
    @Expose
    private Log log;

    public Integer getTime1() {
        return time1;
    }

    public void setTime1(Integer time1) {
        this.time1 = time1;
    }

    public Integer getTime2() {
        return time2;
    }

    public void setTime2(Integer time2) {
        this.time2 = time2;
    }

    public Integer getDist() {
        return dist;
    }

    public void setDist(Integer dist) {
        this.dist = dist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getSubjectParentId() {
        return subjectParentId;
    }

    public void setSubjectParentId(Integer subjectParentId) {
        this.subjectParentId = subjectParentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getSiteBrandId() {
        return siteBrandId;
    }

    public void setSiteBrandId(Integer siteBrandId) {
        this.siteBrandId = siteBrandId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getPriceU() {
        return priceU;
    }

    public void setPriceU(Integer priceU) {
        this.priceU = priceU;
    }

    public Integer getSalePriceU() {
        return salePriceU;
    }

    public void setSalePriceU(Integer salePriceU) {
        this.salePriceU = salePriceU;
    }

    public Integer getLogisticsCost() {
        return logisticsCost;
    }

    public void setLogisticsCost(Integer logisticsCost) {
        this.logisticsCost = logisticsCost;
    }

    public Integer getSaleConditions() {
        return saleConditions;
    }

    public void setSaleConditions(Integer saleConditions) {
        this.saleConditions = saleConditions;
    }

    public Integer getReturnCost() {
        return returnCost;
    }

    public void setReturnCost(Integer returnCost) {
        this.returnCost = returnCost;
    }

    public Integer getPics() {
        return pics;
    }

    public void setPics(Integer pics) {
        this.pics = pics;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Double getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(Double reviewRating) {
        this.reviewRating = reviewRating;
    }

    public Integer getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(Integer feedbacks) {
        this.feedbacks = feedbacks;
    }

    public Integer getPanelPromoId() {
        return panelPromoId;
    }

    public void setPanelPromoId(Integer panelPromoId) {
        this.panelPromoId = panelPromoId;
    }

    public String getPromoTextCard() {
        return promoTextCard;
    }

    public void setPromoTextCard(String promoTextCard) {
        this.promoTextCard = promoTextCard;
    }

    public String getPromoTextCat() {
        return promoTextCat;
    }

    public void setPromoTextCat(String promoTextCat) {
        this.promoTextCat = promoTextCat;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    public Boolean getDiffPrice() {
        return diffPrice;
    }

    public void setDiffPrice(Boolean diffPrice) {
        this.diffPrice = diffPrice;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("time1");
        sb.append('=');
        sb.append(((this.time1 == null)?"<null>":this.time1));
        sb.append(',');
        sb.append("time2");
        sb.append('=');
        sb.append(((this.time2 == null)?"<null>":this.time2));
        sb.append(',');
        sb.append("dist");
        sb.append('=');
        sb.append(((this.dist == null)?"<null>":this.dist));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("root");
        sb.append('=');
        sb.append(((this.root == null)?"<null>":this.root));
        sb.append(',');
        sb.append("kindId");
        sb.append('=');
        sb.append(((this.kindId == null)?"<null>":this.kindId));
        sb.append(',');
        sb.append("subjectId");
        sb.append('=');
        sb.append(((this.subjectId == null)?"<null>":this.subjectId));
        sb.append(',');
        sb.append("subjectParentId");
        sb.append('=');
        sb.append(((this.subjectParentId == null)?"<null>":this.subjectParentId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        sb.append("brandId");
        sb.append('=');
        sb.append(((this.brandId == null)?"<null>":this.brandId));
        sb.append(',');
        sb.append("siteBrandId");
        sb.append('=');
        sb.append(((this.siteBrandId == null)?"<null>":this.siteBrandId));
        sb.append(',');
        sb.append("supplierId");
        sb.append('=');
        sb.append(((this.supplierId == null)?"<null>":this.supplierId));
        sb.append(',');
        sb.append("sale");
        sb.append('=');
        sb.append(((this.sale == null)?"<null>":this.sale));
        sb.append(',');
        sb.append("priceU");
        sb.append('=');
        sb.append(((this.priceU == null)?"<null>":this.priceU));
        sb.append(',');
        sb.append("salePriceU");
        sb.append('=');
        sb.append(((this.salePriceU == null)?"<null>":this.salePriceU));
        sb.append(',');
        sb.append("logisticsCost");
        sb.append('=');
        sb.append(((this.logisticsCost == null)?"<null>":this.logisticsCost));
        sb.append(',');
        sb.append("saleConditions");
        sb.append('=');
        sb.append(((this.saleConditions == null)?"<null>":this.saleConditions));
        sb.append(',');
        sb.append("returnCost");
        sb.append('=');
        sb.append(((this.returnCost == null)?"<null>":this.returnCost));
        sb.append(',');
        sb.append("pics");
        sb.append('=');
        sb.append(((this.pics == null)?"<null>":this.pics));
        sb.append(',');
        sb.append("rating");
        sb.append('=');
        sb.append(((this.rating == null)?"<null>":this.rating));
        sb.append(',');
        sb.append("reviewRating");
        sb.append('=');
        sb.append(((this.reviewRating == null)?"<null>":this.reviewRating));
        sb.append(',');
        sb.append("feedbacks");
        sb.append('=');
        sb.append(((this.feedbacks == null)?"<null>":this.feedbacks));
        sb.append(',');
        sb.append("panelPromoId");
        sb.append('=');
        sb.append(((this.panelPromoId == null)?"<null>":this.panelPromoId));
        sb.append(',');
        sb.append("promoTextCard");
        sb.append('=');
        sb.append(((this.promoTextCard == null)?"<null>":this.promoTextCard));
        sb.append(',');
        sb.append("promoTextCat");
        sb.append('=');
        sb.append(((this.promoTextCat == null)?"<null>":this.promoTextCat));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("colors");
        sb.append('=');
        sb.append(((this.colors == null)?"<null>":this.colors));
        sb.append(',');
        sb.append("sizes");
        sb.append('=');
        sb.append(((this.sizes == null)?"<null>":this.sizes));
        sb.append(',');
        sb.append("diffPrice");
        sb.append('=');
        sb.append(((this.diffPrice == null)?"<null>":this.diffPrice));
        sb.append(',');
        sb.append("log");
        sb.append('=');
        sb.append(((this.log == null)?"<null>":this.log));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
