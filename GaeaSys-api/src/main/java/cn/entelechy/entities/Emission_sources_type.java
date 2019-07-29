package cn.entelechy.entities;

public class Emission_sources_type {
    /**
     * 排放污染源头类型编号
     */
    private Integer emission_sources_typeid;
    /**
     * 排放污染源头类型名称
     */
    private String emission_sources_typename;

    public Integer getEmission_sources_typeid() {
        return emission_sources_typeid;
    }

    public void setEmission_sources_typeid(Integer emission_sources_typeid) {
        this.emission_sources_typeid = emission_sources_typeid;
    }

    public String getEmission_sources_typename() {
        return emission_sources_typename;
    }

    public void setEmission_sources_typename(String emission_sources_typename) {
        this.emission_sources_typename = emission_sources_typename;
    }
}
