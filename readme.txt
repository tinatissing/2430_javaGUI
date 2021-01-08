Problem: The problem is to create a GUI for the eStoreSearch program we have created over the span of the last 2 assignments. There should be a menu page, an add page, a search page, and an option to exit the program by clicking the X in the top right corner, or by choosing the exit option in the drop down menu.

Assumptions/Limitations: No two products can have the same ID. Must use a HashMap to store description words and must utilize HashMap when searching for a description match. Must use super class Product with subclasses Book and Electronics. Must use single Product ArrayList to store all products. Format of the GUI must resemble the example given in the assignment description. Must only use Swing and awt.

UserGuide: gradle run to run the program. Once the GUI is open, use the drop down menu to choose whether to add, search, or exit the program. If you would like to add a product, you must enter the productID, description, and year, all other inputs are optional. All search inputs are optional. 

Test Plan: 
	- if ProductID, description, and year are empty, print error
	- check if productID is a 6 digit number and if it already exists
	- check if the year is a number and if it's within the range 1000-9999
	- if the GUI panel changes when a new menu item is choses
	- if the program ends if I choose exit on the menu
	- if the GUI panel changes when I switch from book to electronic in add
	- if search works with no inputs
	- if search works with all inputs

Improvements: If I were to do this assignment again, I would clean up my App constructor. The GUI code got very messy very quickly, so I would have structured it differently (with a better plan going in) to utilize less panels (eliminating anything that may be reductant if replaced with something else) which would make my code more efficient. 
