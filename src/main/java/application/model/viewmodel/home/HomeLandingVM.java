package application.model.viewmodel.home;


import application.model.viewmodel.common.LayoutHeaderVM;

import java.util.List;

public class HomeLandingVM {

    private LayoutHeaderVM layoutHeaderVM;

    private String keyWord;

    private List<BannerVM> bannerVMS;

    public LayoutHeaderVM getLayoutHeaderVM() {
        return layoutHeaderVM;
    }

    public void setLayoutHeaderVM(LayoutHeaderVM layoutHeaderVM) {
        this.layoutHeaderVM = layoutHeaderVM;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public List<BannerVM> getBannerVMS() {
        return bannerVMS;
    }

    public void setBannerVMS(List<BannerVM> bannerVMS) {
        this.bannerVMS = bannerVMS;
    }
}
