package fis.ihrp.longlh.homework1.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListFuncionRequest {

    @SerializedName("AppVersion")
    @Expose
    private String appVersion;

    @SerializedName("DataHeader")
    @Expose
    private List<Param> dataHeader = null;
    @SerializedName("LangID")
    @Expose
    private String langID;
    @SerializedName("OS")
    @Expose
    private String os;
    @SerializedName("Stoken")
    @Expose
    private String stoken;

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public List<Param> getDataHeader() {
        return dataHeader;
    }

    public void setDataHeader(List<Param> dataHeader) {
        this.dataHeader = dataHeader;
    }

    public String getLangID() {
        return langID;
    }

    public void setLangID(String langID) {
        this.langID = langID;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getStoken() {
        return stoken;
    }

    public void setStoken(String stoken) {
        this.stoken = stoken;
    }

    public ListFuncionRequest(String appVersion, List<Param> dataHeader, String langID, String os, String stoken) {
        this.appVersion = appVersion;
        this.dataHeader = dataHeader;
        this.langID = langID;
        this.os = os;
        this.stoken = stoken;
    }

    public ListFuncionRequest() {

    }

    public static class Param {
        private String F;

        public String getF() {
            return F;
        }

        public void setF(String f) {
            F = f;
        }

        public Param(){

        }

        public Param(String f) {
            F = f;
        }
    }

}

