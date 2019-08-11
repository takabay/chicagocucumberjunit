package beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class RegionResponse {
    public List<Map<String, String>> getLinks() {
        return links;
    }

    public void setLinks(List<Map<String, String>> links) {
        this.links = links;
    }

    private List<Map<String,String>> links;
    @SerializedName("region_id")
    private Integer regionId;
    @SerializedName("region_name")
    private String regionName;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

}