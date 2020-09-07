package qtc.project.banhangnhanh.admin.views.fragment.product.category.categoryproduct;

import b.laixuantam.myaarlibrary.base.BaseViewInterface;
import qtc.project.banhangnhanh.activity.HomeActivity;
import qtc.project.banhangnhanh.admin.model.ProductCategoryModel;

public interface FragmentCategoryProductViewInterface extends BaseViewInterface {
    void init(HomeActivity activity, FragmentCategoryProductViewCallback callback);
    void initGetListCategoryProduct(ProductCategoryModel[] list);

    void setNoMoreLoading();

    void clearnData();
}
