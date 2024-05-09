void main() {
  int x = 12;
  bool y = false;
  bool iHaveACat = true;
  int catOnesAge = 5;
  int catTwosAge = 10;

  //2way selection using comaprison operations
  if (x > x / 3) {
    print("x is greater than x/3");
  } else {
    print("x is not greater than x/3");
  }

  //2way selection using logical expressions
  if (y || x > 15) {
    print("y is true or x is greater than 15");
  } else {
    print("y is falsy and x is less than 15");
  }

  //usage of else if

  if (y) {
    print("y is true");
  } else if (x < 15) {
    print("x is less than 15");
  } else {
    print("y is falsy and x is greater than 15");
  }

  //2way selection using nested ifs.
  if (iHaveACat) {
    if (catOnesAge < catTwosAge) {
      print("Cat one is younger than cat two");
    } else {
      print("Cat two is older than cat one");
    }
  } else {
    print("I dont have a cat");
  }
}
