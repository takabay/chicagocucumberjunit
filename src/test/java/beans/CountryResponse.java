package beans;

import java.util.List;
import java.util.Map;

public class CountryResponse {
    private List<Map<String,String>> links;

    public List<Map<String, String>> getLinks() {
        return links;
    }

    public void setLinks(List<Map<String, String>> links) {
        this.links = links;
    }

    private Integer Country_id;

    public String getRegion_id() {
        return Region_id;
    }

    public String getCountry_name() {
        return Country_name;
    }

    public void setCountry_name(String country_name) {
        Country_name = country_name;
    }

    public void setRegion_id(String region_id) {
        Region_id = region_id;
    }

    public Integer getCountry_id() {
        return Country_id;
    }

    public void setCountry_id(Integer country_id) {
        Country_id = country_id;
    }

    private String Country_name;
    private String Region_id;
}
