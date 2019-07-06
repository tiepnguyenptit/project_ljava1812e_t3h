package application.model.viewmodel.common;


import java.util.ArrayList;
import java.util.List;

public class LayoutHeaderVM {
    private String companyName;
    private List<HeaderMenuVM> headerMenuVMArrayList;

   public String getCompanyName() {
      return companyName;
   }

   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   public List<HeaderMenuVM> getHeaderMenuVMArrayList() {
      return headerMenuVMArrayList;
   }

   public void setHeaderMenuVMArrayList(List<HeaderMenuVM> headerMenuVMArrayList) {
      this.headerMenuVMArrayList = headerMenuVMArrayList;
   }
}
