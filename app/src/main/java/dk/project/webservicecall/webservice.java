




// userSignIn-------------------------------------------------------------------------------------------------------------------

        UserSignInRequest userSignInRequest = new UserSignInRequest();
        userSignInRequest.setUsername("dk3393");
        userSignInRequest.setPassword("3393");


        Call<UserSignInResponse> call = RetrofitClient.getInstance().getMyApi().userSignIn("dk3393","3393");
        call.enqueue(new Callback<UserSignInResponse>() {
            @Override
            public void onResponse(Call<UserSignInResponse> call, Response<UserSignInResponse> response) {
                if(response.isSuccessful())
                {
                    List<UserSignInResponse.Userresult> getUserResults = response.body().getUserresults();

                    if(response.body().getSuccess()==true)
                    {
                        Toast.makeText(MainActivity.this,getUserResults.get(0).getFirstname()+getUserResults.get(1).getLastname(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"No User Found",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<UserSignInResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });






// userSignUp----------------------------------------------------------------------------------------------------------------------------

        Call<UserSignUpResponse> call = RetrofitClient.getInstance().getMyApi().userSignUp("thanveer","thahsheen","1998-07-31","5466","Main Street","Nagai","India","609801","thanveer@gmail.com","siva3393One","3393","bas");
        call.enqueue(new Callback<UserSignUpResponse>() {
            @Override
            public void onResponse(Call<UserSignUpResponse> call, Response<UserSignUpResponse> response) {
                if(response.isSuccessful())
                {
                    UserSignUpResponse Results = response.body();
                    if(response.body().getSuccess()==true)
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<UserSignUpResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });





// userAddressUpdate----------------------------------------------------------------------------------------------------------------------
        
        Call<UserAddressUpdate> call = RetrofitClient.getInstance().getMyApi().userAddressUpdate("OGAU2", "44 A","Main Street", "Coimbatore","India", "641029");
        call.enqueue(new Callback<UserAddressUpdate>() {
            @Override
            public void onResponse(Call<UserAddressUpdate> call, Response<UserAddressUpdate> response) {

                if(response.isSuccessful())
                {
                    UserAddressUpdate Results = response.body();
                    if(response.body().getSuccess()==true)
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<UserAddressUpdate> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });




// userVacationStatusUpdate--------------------------------------------------------------------------------------------------------------

        Call<UserVacationStatusUpdate> call = RetrofitClient.getInstance().getMyApi().userVacationStatusUpdate("OGAU2", "Active");
        call.enqueue(new Callback<UserVacationStatusUpdate>() {
            @Override
            public void onResponse(Call<UserVacationStatusUpdate> call, Response<UserVacationStatusUpdate> response) {

                if(response.isSuccessful())
                {
                    UserVacationStatusUpdate Results = response.body();
                    if(response.body().getSuccess()==true)
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                } 
            }

            @Override
            public void onFailure(Call<UserVacationStatusUpdate> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });




// userDetailsUpdate---------------------------------------------------------------------------------------------------------------------

        Call<UserDetailsUpdate> call = RetrofitClient.getInstance().getMyApi().userDetailsUpdate("OGAU2","dineshkumar.enf@gmail.com","dk3393@gmail.com","234812","8072258874");
        call.enqueue(new Callback<UserDetailsUpdate>() {
            @Override
            public void onResponse(Call<UserDetailsUpdate> call, Response<UserDetailsUpdate> response) {
 
                if(response.isSuccessful())
                {
                    UserDetailsUpdate Results = response.body();
                    if(response.body().getSuccess()==true)
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }
 
            @Override
            public void onFailure(Call<UserDetailsUpdate> call, Throwable t) {
 
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });



// getSliderImageDetails-----------------------------------------------------------------------------------------------------------------

        Call<GetSliderImageDetails> call = RetrofitClient.getInstance().getMyApi().getSliderImageDetails();
        call.enqueue(new Callback<GetSliderImageDetails>() {
            @Override
            public void onResponse(Call<GetSliderImageDetails> call, Response<GetSliderImageDetails> response) {

                if(response.isSuccessful())
                {
                    List<GetSliderImageDetails.SliderImage> getSliderImages = response.body().getSliderImages();

                    if(response.body().getSuccess()==true)
                    {
                        Toast.makeText(MainActivity.this,getSliderImages.get(1).getSliderimagename(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetSliderImageDetails> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });



// addProduct----------------------------------------------------------------------------------------------------------------------------

        Call<AddProduct> call = RetrofitClient.getInstance().getMyApi().addProduct("Pokemon-Pikachu","Pokemon","This is a special line of card that puts a holo gleam on every part of it except the actual picture. Any card in a set can be a reverse holo, which makes some cards, like Welder from Unbroken Bonds, more pricey.","This is a special line of card that puts a holo gleam on every part of it except the actual picture. Any card in a set can be a reverse holo, which makes some cards, like Welder from Unbroken Bonds, more pricey.","578445597","PSA","Good","9","2010","12","20",1,"pokemon_image1","pokmeon_image2","UK","NA","OGAU2");
        call.enqueue(new Callback<AddProduct>() {
            @Override
            public void onResponse(Call<AddProduct> call, Response<AddProduct> response) {

                if(response.isSuccessful())
                {
                    AddProduct Results = response.body();
                    if (response.body().getSuccess()==true)
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<AddProduct> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });




// getAllProductList--------------------------------------------------------------------------------------------------------------------

        Call<GetAllProductList> call = RetrofitClient.getInstance().getMyApi().getAllProductList();
        call.enqueue(new Callback<GetAllProductList>() {
            @Override
            public void onResponse(Call<GetAllProductList> call, Response<GetAllProductList> response) {

                if(response.isSuccessful())
                {
                    List<GetAllProductList.Product> getProducts = response.body().getProducts();

                    if(response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getProducts.get(0).getProductName(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetAllProductList> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });




// getProductsListByCategory------------------------------------------------------------------------------------------------------------

        Call<GetProductsListByCategory> call = RetrofitClient.getInstance().getMyApi().getProductsListByCategory("OGB1");
        call.enqueue(new Callback<GetProductsListByCategory>() {
            @Override
            public void onResponse(Call<GetProductsListByCategory> call, Response<GetProductsListByCategory> response) {


                if(response.isSuccessful())
                {

                    List<GetProductsListByCategory.Product> getProducts = response.body().getProducts();

                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getProducts.getProductName,Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetProductsListByCategory> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });





// getProductsListByRecentAdded---------------------------------------------------------------------------------------------------------

        Call<GetProductsListByRecentAdded> call = RetrofitClient.getInstance().getMyApi().getProductsListByRecentAdded();
        call.enqueue(new Callback<GetProductsListByRecentAdded>() {
            @Override
            public void onResponse(Call<GetProductsListByRecentAdded> call, Response<GetProductsListByRecentAdded> response) {

                if(response.isSuccessful())
                {
                    List<GetProductsListByRecentAdded.Product> getProducts = response.body().getProducts();
                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getProducts.get(0).getProductName(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetProductsListByRecentAdded> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });





// getProductListForSort---------------------------------------------------------------------------------------------------------------

        Call<GetProductListForSort> call = RetrofitClient.getInstance().getMyApi().getProductListForSort("Price","HTL","OGB1");
        call.enqueue(new Callback<GetProductListForSort>() {
            @Override
            public void onResponse(Call<GetProductListForSort> call, Response<GetProductListForSort> response) {

                if(response.isSuccessful())
                {
                    List<GetProductListForSort.Product> getProducts = response.body().getProducts();
                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getProducts.get(0).getProductCategory(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetProductListForSort> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });    




// getProductListForFilter--------------------------------------------------------------------------------------------------------------

        Call<GetProductListForFilter> call = RetrofitClient.getInstance().getMyApi().getProductListForFilter("product_grader","PSA");
        call.enqueue(new Callback<GetProductListForFilter>() {
            @Override
            public void onResponse(Call<GetProductListForFilter> call, Response<GetProductListForFilter> response) {

                if(response.isSuccessful())
                {
                    List<GetProductListForFilter.Product> getProducts = response.body().getProducts();
                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getProducts.get(0).getProductGrader(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetProductListForFilter> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });




// getGradingScalesByGrader--------------------------------------------------------------------------------------------------------------

        Call<GetGradingScalesByGrader> call = RetrofitClient.getInstance().getMyApi().getGradingScalesByGrader("BGS");
        call.enqueue(new Callback<GetGradingScalesByGrader>() {
            @Override
            public void onResponse(Call<GetGradingScalesByGrader> call, Response<GetGradingScalesByGrader> response) {

                if(response.isSuccessful())
                {
                    List<GetGradingScalesByGrader.Gradingscale> getgradinScales = response.body().getGradingscales();
                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getgradinScales.get(4).getGradingscaleValue(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetGradingScalesByGrader> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });






// getSellerRatingByUser----------------------------------------------------------------------------------------------------------------

        Call<GetSellerRatingByUser> call = RetrofitClient.getInstance().getMyApi().getSellerRatingByUser("OGAU2");
        call.enqueue(new Callback<GetSellerRatingByUser>() {
            @Override
            public void onResponse(Call<GetSellerRatingByUser> call, Response<GetSellerRatingByUser> response) {

                if(response.isSuccessful())
                {
                    List<GetSellerRatingByUser.Sellerrating> getsellerrating = response.body().getSellerrating();
                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getsellerrating.get(0).getSellerratingComments(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetSellerRatingByUser> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });




// getAllSiteLabels---------------------------------------------------------------------------------------------------------------------

        Call<GetAllSiteLabels> call = RetrofitClient.getInstance().getMyApi().getAllSiteLabels();
        call.enqueue(new Callback<GetAllSiteLabels>() {
            @Override
            public void onResponse(Call<GetAllSiteLabels> call, Response<GetAllSiteLabels> response) {

                if(response.isSuccessful())
                {
                    List<GetAllSiteLabels.Sitelabel> getsitelabel = response.body().getSitelabel();
                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getsitelabel.get(7).getSitelabelDescription(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetAllSiteLabels> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });





// AddProductToWishlist----------------------------------------------------------------------------------------------------------------

        Call<AddProductToWishlist> call = RetrofitClient.getInstance().getMyApi().addProductToWishlist("1", "OGAU1", "OGAU2");
        call.enqueue(new Callback<AddProductToWishlist>() {
            @Override
            public void onResponse(Call<AddProductToWishlist> call, Response<AddProductToWishlist> response) {

                if(response.isSuccessful())
                {
                    AddProductToWishlist Results = response.body();
                    if (response.body().getSuccess()==true)
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<AddProductToWishlist> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });



// getWishlistProducts-----------------------------------------------------------------------------------------------------------------

        Call<GetWishlistProducts> call = RetrofitClient.getInstance().getMyApi().getWishlistProducts("OGAU1");
        call.enqueue(new Callback<GetWishlistProducts>() {
            @Override
            public void onResponse(Call<GetWishlistProducts> call, Response<GetWishlistProducts> response) {

                if(response.isSuccessful())
                {
                    List<GetWishlistProducts.Wishlist> getwishlist = response.body().getWishlist();
                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getwishlist.get(0).getProductName(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetWishlistProducts> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });




// addProductToCart---------------------------------------------------------------------------------------------------------------------

        Call<AddProductToCart> call = RetrofitClient.getInstance().getMyApi().addProductToCart("1","OGAU1", "OGAU2");
        call.enqueue(new Callback<AddProductToCart>() {
            @Override
            public void onResponse(Call<AddProductToCart> call, Response<AddProductToCart> response) {

                if(response.isSuccessful())
                {
                    AddProductToCart Results = response.body();
                    if (response.body().getSuccess()==true)
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<AddProductToCart> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

            }
        });




// getcartlistProducts------------------------------------------------------------------------------------------------------------------

        Call<GetCartlistProducts> call = RetrofitClient.getInstance().getMyApi().getcartlistProducts("OGAU1");
        call.enqueue(new Callback<GetCartlistProducts>() {
            @Override
            public void onResponse(Call<GetCartlistProducts> call, Response<GetCartlistProducts> response) {


                if(response.isSuccessful())
                {
                    List<GetCartlistProducts.Wishlist> getwishlist = response.body().getWishlist();
                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getwishlist.get(0).getProductName(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetCartlistProducts> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

            }
        });





// placeOrder---------------------------------------------------------------------------------------------------------------------------
        
        Call<PlaceOrder> call = RetrofitClient.getInstance().getMyApi().placeOrder("Order Placed", "OGAU1", "2","240","0","STRIPE#345456453848","Success","true","Payment Successfully Transferred","","");
        call.enqueue(new Callback<PlaceOrder>() {
            @Override
            public void onResponse(Call<PlaceOrder> call, Response<PlaceOrder> response) {

                if(response.isSuccessful())
                {
                    PlaceOrder Results = response.body();
                    if (response.body().getRespose()==true)
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<PlaceOrder> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

            }
        });




// getOrderlistByStatus-------------------------------------------------------------------------------------------------------------------

        Call<GetOrderlistByStatus> call = RetrofitClient.getInstance().getMyApi().getOrderlistByStatus("Order Placed", "OGAU1");
        call.enqueue(new Callback<GetOrderlistByStatus>() {
            @Override
            public void onResponse(Call<GetOrderlistByStatus> call, Response<GetOrderlistByStatus> response) {


                if(response.isSuccessful())
                {
                    List<GetOrderlistByStatus.Order> getorder = response.body().getOrders();
                    if (response.body().getResponse()==true)
                    {
                        Toast.makeText(MainActivity.this,getorder.get(0).getOrderPaymentTransactiondetails(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetOrderlistByStatus> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

            }
        });








// orderStatusUpdate--------------------------------------------------------------------------------------------------------------------

        Call<OrderStatusUpdate> call = RetrofitClient.getInstance().getMyApi().orderStatusUpdate("OGPO1","Cancelled");
        call.enqueue(new Callback<OrderStatusUpdate>() {
            @Override
            public void onResponse(Call<OrderStatusUpdate> call, Response<OrderStatusUpdate> response) {

                if(response.isSuccessful())
                {
                    OrderStatusUpdate Results = response.body();
                    if (response.body().getSuccess()==true)
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<OrderStatusUpdate> call, Throwable t) {

                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

            }
        });






// placeProductPurchase-------------------------------------------------------------------------------------------------------------------
        
       Call<PlaceProductPurchase> call = RetrofitClient.getInstance().getMyApi().placeProductPurchase("OGPO1","1","210","OGAU1","AGAU2","Not Started");
       call.enqueue(new Callback<PlaceProductPurchase>() {
           @Override
           public void onResponse(Call<PlaceProductPurchase> call, Response<PlaceProductPurchase> response) {

               if(response.isSuccessful())
               {
                   PlaceProductPurchase Results = response.body();
                   if (response.body().getRespose()==true)
                   {
                       Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                   }
                   else
                   {
                       Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                   }
               }

           }

           @Override
           public void onFailure(Call<PlaceProductPurchase> call, Throwable t) {

               Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

           }
       });
       




// getPurchaselist---------------------------------------------------------------------------------------------------------------------------
        
       Call<GetPurchaseOrderList> call = RetrofitClient.getInstance().getMyApi().getPurchaseOrderList("OGPO1");
       call.enqueue(new Callback<GetPurchaseOrderList>() {
           @Override
           public void onResponse(Call<GetPurchaseOrderList> call, Response<GetPurchaseOrderList> response) {

               if(response.isSuccessful())
               {
                   List<GetPurchaseOrderList.Purchaselist> getpuchaselist = response.body().getPurchaselist();
                   if (response.body().getResponse()==true)
                   {
                       Toast.makeText(MainActivity.this,getpuchaselist.get(0).getProductName(),Toast.LENGTH_SHORT).show();
                   }
                   else
                   {
                       Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                   }
               }
           }

           @Override
           public void onFailure(Call<GetPurchaseOrderList> call, Throwable t) {

               Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
           }
       });





// purchaseShippingStatusUpdate--------------------------------------------------------------------------------------------------------

       Call<PurchaseShippingStatusUpdate> call = RetrofitClient.getInstance().getMyApi().purchaseShippingStatusUpdate("OGPP1", "InTransit");
       call.enqueue(new Callback<PurchaseShippingStatusUpdate>() {
           @Override
           public void onResponse(Call<PurchaseShippingStatusUpdate> call, Response<PurchaseShippingStatusUpdate> response) {


               if(response.isSuccessful())
               {
                   PurchaseShippingStatusUpdate Results = response.body();
                   if (response.body().getSuccess()==true)
                   {
                       Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                   }
                   else
                   {
                       Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                   }
               }
           }

           @Override
           public void onFailure(Call<PurchaseShippingStatusUpdate> call, Throwable t) {

               Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

           }
       });




// addShippingDetails------------------------------------------------------------------------------------------------------------------

       Call<AddShippingDetails> call = RetrofitClient.getInstance().getMyApi().addShippingDetails("Dinesh Kumar","Main Street","444","609801","Chennai","India","9514533393","dinesh@gmail.com","OGPO1");
       call.enqueue(new Callback<AddShippingDetails>() {
           @Override
           public void onResponse(Call<AddShippingDetails> call, Response<AddShippingDetails> response) {
 
               if(response.isSuccessful())
               {
                   AddShippingDetails Results = response.body();
                   if (response.body().getSuccess()==true)
                   {
                       Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                   }
                   else
                   {
                       Toast.makeText(MainActivity.this,Results.getMessage(),Toast.LENGTH_SHORT).show();
                   }
               }
           }
 
           @Override
           public void onFailure(Call<AddShippingDetails> call, Throwable t) {
 
               Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
 
           }
       });




// getShippingDettails-------------------------------------------------------------------------------------------------------------------

       Call<GetShippingDetails> call = RetrofitClient.getInstance().getMyApi().getShippingDettails("OGPO1");
       call.enqueue(new Callback<GetShippingDetails>() {
           @Override
           public void onResponse(Call<GetShippingDetails> call, Response<GetShippingDetails> response) {

               if(response.isSuccessful())
               {
                   List<GetShippingDetails.Shippingresult> getshippingresult = response.body().getShippingresults();
                   if (response.body().getSuccess()==true)
                   {
                       Toast.makeText(MainActivity.this,getshippingresult.get(0).getShippingCity(),Toast.LENGTH_SHORT).show();
                   }
                   else
                   {
                       Toast.makeText(MainActivity.this,"Something Wrong in your code",Toast.LENGTH_SHORT).show();
                   }
               }
           }

           @Override
           public void onFailure(Call<GetShippingDetails> call, Throwable t) {

               Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

           }
       });






// getNotificationByUser---------------------------------------------------------------------------------------------------------------
       
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
