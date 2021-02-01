package dk.project.webservicecall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.widget.Toast;

import java.util.List;

import dk.project.webservicecall.retrofit.pojo.AddProduct;
import dk.project.webservicecall.retrofit.pojo.AddProductToCart;
import dk.project.webservicecall.retrofit.pojo.AddProductToWishlist;
import dk.project.webservicecall.retrofit.pojo.AddShippingDetails;
import dk.project.webservicecall.retrofit.pojo.GetAllProductList;
import dk.project.webservicecall.retrofit.pojo.GetAllSiteLabels;
import dk.project.webservicecall.retrofit.pojo.GetCartlistProducts;
import dk.project.webservicecall.retrofit.pojo.GetGradingScalesByGrader;
import dk.project.webservicecall.retrofit.pojo.GetNotificationByUser;
import dk.project.webservicecall.retrofit.pojo.GetOrderlistByStatus;
import dk.project.webservicecall.retrofit.pojo.GetProductListForFilter;
import dk.project.webservicecall.retrofit.pojo.GetProductListForSort;
import dk.project.webservicecall.retrofit.pojo.GetProductsListByCategory;
import dk.project.webservicecall.retrofit.pojo.GetProductsListByRecentAdded;
import dk.project.webservicecall.retrofit.pojo.GetPurchaseOrderList;
import dk.project.webservicecall.retrofit.pojo.GetSellerRatingByUser;
import dk.project.webservicecall.retrofit.pojo.GetShippingDetails;
import dk.project.webservicecall.retrofit.pojo.GetSliderImageDetails;
import dk.project.webservicecall.retrofit.pojo.GetWishlistProducts;
import dk.project.webservicecall.retrofit.pojo.OrderStatusUpdate;
import dk.project.webservicecall.retrofit.pojo.PlaceOrder;
import dk.project.webservicecall.retrofit.pojo.PlaceProductPurchase;
import dk.project.webservicecall.retrofit.pojo.PurchaseShippingStatusUpdate;
import dk.project.webservicecall.retrofit.pojo.UserAddressUpdate;
import dk.project.webservicecall.retrofit.pojo.UserDetailsUpdate;
import dk.project.webservicecall.retrofit.pojo.UserSignInRequest;
import dk.project.webservicecall.retrofit.pojo.UserSignInResponse;
import dk.project.webservicecall.retrofit.pojo.UserSignUpResponse;
import dk.project.webservicecall.retrofit.pojo.UserVacationStatusUpdate;
import dk.project.webservicecall.retrofit.util.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Call<GetNotificationByUser> call = RetrofitClient.getInstance().getMyApi().getNotificationByUser("OGAU1");
        call.enqueue(new Callback<GetNotificationByUser>() {
            @Override
            public void onResponse(Call<GetNotificationByUser> call, Response<GetNotificationByUser> response) {

                if(response.isSuccessful())
                {
                    List<GetNotificationByUser.Notification> getnotification = response.body().getNotifications();
                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getnotification.get(0).getNotificationTitle(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetNotificationByUser> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }
}