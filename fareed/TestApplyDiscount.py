import unittest
import applying_discount

class TestApplyDiscount(unittest.TestCase):
    def test_valid_save10_code(self):
        result = applying_discount.apply_discount("Garri", 1000, "SAVE10")
        self.assertEqual(result, 900.0)

    def test_invalid_code_returns_full_price(self):
        result = applying_discount.apply_discount("Book", 30, "INVALID")
        self.assertEqual(result, 30.0)

    def test_zero_price_with_discount(self):
        result = applying_discount.apply_discount("Bread", 0, "SAVE10")
        self.assertEqual(result, 0.0)

  

   
