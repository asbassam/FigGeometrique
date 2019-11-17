# Creation of geometric figures in JAVA

We create a Java application to manipulate geometric figures. A geometric figure is a compound object:
- An anchor attribute of type Point
- A drawing method () to draw a geometrical figure and two methods area () and perimeter () which respectively return the area and the perimeter of the figure.
The methods will be declared in an IFigureGeometrique interface. The attribute "anchorage" meanwhile, in an AbstractFigureGeometric class. The latter implements the IFigureGeometrique interface and manages the reading and modification of the anchor point.
A geometric figure can be:
- A Rectangle having more than one anchor point representing a side, a length and a width
- A square that is a rectangle whose length is equal to the width
- An Ellipse having more anchor representing the center, two half-axes.
- A Circle, which is an Ellipse whose two half-axes are equal.
