package dk.project.webservicecall.retrofit.util;

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
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitAPI {

    String BASE_URL = "http://demo.onlygraded.com/mobileAPI/";

    @FormUrlEncoded
    @POST("userSignIn.php")
    Call<UserSignInResponse> userSignIn(@Field("username") String username, @Field("password") String password);

    @FormUrlEncoded
    @POST("userSignUp.php")
    Call<UserSignUpResponse> userSignUp(@Field("firstname") String firstname, @Field("lastname") String lastname, @Field("dateofbirth") String dateofbirth,
                                                @Field("housenumber") String housenumber, @Field("street") String street, @Field("city") String city,
                                                @Field("country") String country, @Field("zipcode") String zipcode, @Field("emailid") String emailid,
                                                @Field("username") String username, @Field("password") String password, @Field("usertype") String usertype);

    @FormUrlEncoded
    @POST("userAddressUpdate.php")
    Call<UserAddressUpdate> userAddressUpdate(@Field("user_serial") String user_serial, @Field("housenumber") String housenumber,
                                              @Field("street") String street, @Field("city") String city,
                                              @Field("country") String country, @Field("zipcode") String zipcode);


    @FormUrlEncoded
    @POST("userVacationStatusUpdate.php")
    Call<UserVacationStatusUpdate> userVacationStatusUpdate(@Field("user_serial") String user_serial, @Field("userstatus") String userstatus);

    @FormUrlEncoded
    @POST("userDetailsUpdate.php")
    Call<UserDetailsUpdate> userDetailsUpdate(@Field("user_serial") String user_serial, @Field("emailid") String emailid,
                                              @Field("username") String username, @Field("password") String password,
                                              @Field("mobilenumber") String mobilenumber);


    @GET("getSliderImageDetails.php")
    Call<GetSliderImageDetails> getSliderImageDetails();

    @FormUrlEncoded
    @POST("addProduct.php")
    Call<AddProduct> addProduct(@Field("product_name") String product_name, @Field("product_category") String product_category,
                                @Field("product_short_desc") String product_short_desc, @Field("product_long_desc") String product_long_desc,
                                @Field("product_cardcode") String product_cardcode, @Field("product_grader") String product_grader,
                                @Field("product_condition") String product_condition, @Field("product_gradepoint") String product_gradepoint,
                                @Field("product_year") String product_year, @Field("product_saleprice") String product_saleprice,
                                @Field("product_immediateprice") String product_immediateprice, @Field("product_quantity") Integer product_quantity,
                                @Field("product_image1") String product_image1, @Field("product_image2") String product_image2,
                                @Field("product_region") String product_region, @Field("product_discount") String product_discount,
                                @Field("user_serial") String user_serial);

    @GET("getAllProductList.php")
    Call<GetAllProductList> getAllProductList();

    @FormUrlEncoded
    @POST("getProductsListByCategory.php")
    Call<GetProductsListByCategory> getProductsListByCategory(@Field("product_category") String product_category);


    @POST("getProductsListByRecentAdded.php")
    Call<GetProductsListByRecentAdded> getProductsListByRecentAdded();

    @FormUrlEncoded
    @POST("getProductListForSort.php")
    Call<GetProductListForSort> getProductListForSort(@Field("sortBy") String sortBy, @Field("order") String order,
                                                      @Field("product_category") String  product_category);

    @FormUrlEncoded
    @POST("getProductListForFilter.php")
    Call<GetProductListForFilter> getProductListForFilter(@Field("filterCategory") String filterCategory, @Field("filterValue") String filterValue);

    @FormUrlEncoded
    @POST("getGradingScalesByGrader.php")
    Call<GetGradingScalesByGrader> getGradingScalesByGrader(@Field("graderName") String graderName);

    @FormUrlEncoded
    @POST("getSellerRatingByUser.php")
    Call<GetSellerRatingByUser> getSellerRatingByUser(@Field("seller_user_serial") String seller_user_serial);


    @GET("getAllSiteLabels.php")
    Call<GetAllSiteLabels> getAllSiteLabels();

    @FormUrlEncoded
    @POST("addProductToWishlist.php")
    Call<AddProductToWishlist> addProductToWishlist(@Field("wishlist_productid") String wishlist_productid, @Field("wishlist_userserial") String  wishlist_userserial,
                                                    @Field("wishlist_productownerserial") String  wishlist_productownerserial);

    @FormUrlEncoded
    @POST("getWishlistProducts.php")
    Call<GetWishlistProducts> getWishlistProducts(@Field("user_serial") String user_serial);

    @FormUrlEncoded
    @POST("addProductToCart.php")
    Call<AddProductToCart> addProductToCart(@Field("cart_productid") String cart_productid, @Field("cart_userserial") String cart_userserial, @Field("cart_productowner") String cart_productowner);

    @FormUrlEncoded
    @POST("getCartlistProducts.php")
    Call<GetCartlistProducts> getcartlistProducts(@Field("user_serial") String user_serial);

    @FormUrlEncoded
    @POST("placeOrder.php")
    Call<PlaceOrder> placeOrder(@Field("order_status") String order_status, @Field("order_userserial") String order_userserial,
                                @Field("order_productcount") String order_productcount, @Field("order_totalrate") String order_totalrate,
                                @Field("order_iscouponapplied") String order_iscouponapplied, @Field("order_payment_transactionid") String order_payment_transactionid,
                                @Field("order_payment_transactionsstatus") String order_payment_transactionsstatus, @Field("order_payment_transactionresponse") String order_payment_transactionresponse,
                                @Field("order_payment_transactiondetails") String order_payment_transactiondetails, @Field("order_couponpercentage") String order_couponpercentage,
                                @Field("order_priceaftercoupon") String order_priceaftercoupon);

    @FormUrlEncoded
    @POST("getOrderlistByStatus.php")
    Call<GetOrderlistByStatus> getOrderlistByStatus(@Field("order_status") String order_status, @Field("order_userserial") String order_userserial);

    @FormUrlEncoded
    @POST("orderStatusUpdate.php")
    Call<OrderStatusUpdate> orderStatusUpdate(@Field("order_serial") String order_serial, @Field("order_status") String order_status);

    @FormUrlEncoded
    @POST("placeProductPurchase.php")
    Call<PlaceProductPurchase> placeProductPurchase(@Field("purchase_orderserial") String purchase_orderserial, @Field("purchase_productid") String purchase_productid,
                                                    @Field("purchase_rate") String purchase_rate, @Field("purchase_productowner") String purchase_productowner,
                                                    @Field("purchase_productbuyer") String purchase_productbuyer,@Field("purchase_shippingstatus") String purchase_shippingstatus);

    @FormUrlEncoded
    @POST("getPurchaseOrderList.php")
    Call<GetPurchaseOrderList> getPurchaseOrderList(@Field("order_serial") String order_serial);

    @FormUrlEncoded
    @POST("purchaseShippingStatusUpdate.php")
    Call<PurchaseShippingStatusUpdate> purchaseShippingStatusUpdate(@Field("purchase_serial") String purchase_serial, @Field("purchase_shippingstatus") String purchase_shippingstatus);

    @FormUrlEncoded
    @POST("addShippingDetails.php")
    Call<AddShippingDetails> addShippingDetails(@Field("shipping_personname") String shipping_personname, @Field("shipping_street") String shipping_street,
                                                @Field("shipping_housenumber") String shipping_housenumber, @Field("shipping_postalcode") String shipping_postalcode,
                                                @Field("shipping_city") String shipping_city, @Field("shipping_country") String shipping_country,
                                                @Field("shipping_phonenumber") String shipping_phonenumber, @Field("shipping_emailid") String shipping_emailid,
                                                @Field("shipping_orderserial") String shipping_orderserial);

    @FormUrlEncoded
    @POST("getShippingDetails.php")
    Call<GetShippingDetails> getShippingDettails(@Field("shipping_orderserial") String shipping_orderserial);

    @FormUrlEncoded
    @POST("getNotificationByUser.php")
    Call<GetNotificationByUser> getNotificationByUser(@Field("notification_userserial") String notification_userserial);




}
