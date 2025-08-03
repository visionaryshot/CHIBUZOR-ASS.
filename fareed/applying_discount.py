#we should define a function that takes 3 parameters
#now use if statement to check if the original price is a valid number (maybe its int or float) and make sure is not negative
#then convert the promotional code to uppercase letters
#now check the promotional code using if statement to check the discounts, or else if the code doesn't match any option, then no apply discount
#then calculate the discount price by multiplying the original price by the percentage left after removing the discount
#then round the final price to 2 decimal place 


def apply_discount(item_name, original_price, promo_code):
    if not isinstance(original_price, (int, float)) or original_price < 0:
        raise ValueError("Original price must be a non-negative number.")

    promo_code = promo_code.upper()  

    if promo_code == "SAVE10":
        discount = 0.10
    elif promo_code == "HALFOFF":
        discount = 0.50
    else:
        discount = 0.0

    discounted_price = original_price * (1 - discount)
    return round(discounted_price, 2)