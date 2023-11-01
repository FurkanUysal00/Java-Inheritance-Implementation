# Polymorphism Practice

In this project, you will be completing the `PolymorphismPractice` class, which involves working with objects of type `Shape`, `Circle`, and `Rectangle`. These classes are provided, and your task is to perform various operations with them.

## Step 1: Initialize an ArrayList

In the main method, initialize an `ArrayList` that will hold objects of type `Shape`. This ArrayList will serve as a container for both circles and rectangles.

## Step 2: Fill the ArrayList

Now, fill the ArrayList with 5 `Circle` objects and 5 `Rectangle` objects, for a total of 10 objects. You can use a for loop and `Math.random()` to create these objects and add them to the ArrayList.

**Testing:** To test this step, you can use the ArrayList's `size()` method to ensure it has a size of 10. You can also print out all 10 items in the ArrayList to verify the objects are correctly added.

## Step 3: Complete the `getInfo` Method

You will now complete the `getInfo` method. Start by editing the method header for `getInfo` so that it takes in an `ArrayList` of `Shape` objects as a parameter. In this method, you will iterate over the list and build a `StringBuilder` with shape information.

Use a foreach loop to iterate through the list. For each shape in the array, add the shape information to your `StringBuilder`. You can use the `toString` method for each `Shape` object.

**Testing:** Call and print the `getInfo` method inside your main method to verify that it correctly displays the information for all the shapes.
