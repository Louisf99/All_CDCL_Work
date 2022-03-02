import unittest

from src.fizz_buzz import fizz_buzz

class TestFizzBuzz(unittest.TestCase):

  def test_fizz_buzz__3_return_fizz(self):
    self.assertEqual("fizz", fizz_buzz(3))

  def test_fizz_buzz__5_return_buzz(self):
    self.assertEqual("buzz", fizz_buzz(5))

  def test_fizz_buzz__15_return_fizzbuzz(self):
    self.assertEqual('fizzbuzz', fizz_buzz(15))

  def test_fizz_buzz__7_return_str(self):
    self.assertEqual("7",fizz_buzz(7))