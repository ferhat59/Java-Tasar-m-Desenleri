package com.tasarım.Yapısal.Bridge;

public class Muzik {
    private String adı;

    private String ses;

    public Muzik(String adı, String ses) {
        this.adı = adı;
        this.ses = ses;
    }

    @Override
    public String toString() {
        return adı
                ;
    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }
}
