### Naver_LIKELION_ProjectEcomerce
#Tables
1. Cart

| Column  | Type  | Nullable  |
|---|---|---|
|  cart_id |  int | NOT NULL  |
2. Customer

| Column 	| Type 	| Nullable 	|
|---	|---	|---	|
| customer_id 	| int 	| NOT NULL 	|
| customer_name 	| varchar(50) 	| NOT NULL 	|
| address 	| varchar(100) 	|  	|
| phone_no 	| char(20) 	| NOT NULL 	|
| cart_id 	| int 	|  	|
3. Product

| Column 	| Type 	| Nullable 	|
|---	|---	|---	|
| product_id 	| int 	| NOT NULL 	|
| name_product 	| varchar(100) 	| NOT NULL 	|
| type 	| char(3) 	|  	|
| size 	| char(3) 	| NOT NULL 	|
| quantity 	| int 	| NOT NULL 	|
| price 	| numberic 	|  	|	

4. Cart_item

| Column 	| Type 	| Nullable 	|
|---	|---	|---	|
| cart_id 	| int 	| NOT NULL 	|
| product_id 	| int 	| NOT NULL 	|
| quantity_wished 	| int 	| NOT NULL 	|
| date_added 	| date 	| NOT NULL 	|
| total_amount 	| numberic 	| NOT NULL 	|
|  	|  	|  	|
## Kết quả bài tập ở folder Image: [https://github.com/PhamPhucHau/Naver_LIKELION_ProjectEcomerce/tree/main/Image link](https://github.com/PhamPhucHau/Naver_LIKELION_ProjectEcomerce/tree/main/Image)
# Get all product 
![](https://github.com/PhamPhucHau/Naver_LIKELION_ProjectEcomerce/blob/main/Image/GetAllProduct.jpg)
# Get all customer
![](https://github.com/PhamPhucHau/Naver_LIKELION_ProjectEcomerce/blob/main/Image/GetAllCustomer.jpg)
# Get All Product với condition
- Less Than
![](https://github.com/PhamPhucHau/Naver_LIKELION_ProjectEcomerce/blob/main/Image/GetAllProductLessThan.jpg)
- Greater Than
![](https://github.com/PhamPhucHau/Naver_LIKELION_ProjectEcomerce/blob/main/Image/GetAllProductGreaterThan.jpg)
- Equal
![](https://github.com/PhamPhucHau/Naver_LIKELION_ProjectEcomerce/blob/main/Image/GetAllProductEqual.jpg)
# Them item vao card bang customerId
![](https://github.com/PhamPhucHau/Naver_LIKELION_ProjectEcomerce/blob/main/Image/AddItemToCartByCustomerId.jpg)
# Them danh sach item vao card bang customerId
![](https://github.com/PhamPhucHau/Naver_LIKELION_ProjectEcomerce/blob/main/Image/AddListProductToCartByCustomerId.jpg)
# Get danh sach item của card:
![](https://github.com/PhamPhucHau/Naver_LIKELION_ProjectEcomerce/blob/main/Image/GetItemFromCart.jpg)
