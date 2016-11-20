<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1479621424974" ID="ID_88950654" MODIFIED="1479622300152" TEXT="VisitorTest">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <font size="3">Main entry point, where program is started. </font>
    </p>
    <p>
      <font size="3">Here are defined all items required by Visitable class. They are not populated!</font>
    </p>
  </body>
</html>
</richcontent>
<node CREATED="1479621462387" ID="ID_1383469485" MODIFIED="1479622278964" POSITION="right" TEXT="TaxVisitor">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <font size="3">TaxVisitor is an implementation of Visitor </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">It handles all business logic of the Visitor. The Visitor just delegates through Visitable! </font>
    </p>
    <p>
      <font size="3">Everything is done on &quot;Program to Interface&quot; principle.</font>
    </p>
  </body>
</html>
</richcontent>
<node CREATED="1479621481653" ID="ID_218430875" MODIFIED="1479622283984" TEXT="Visitor">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <font size="3">Definition of all our existing classes. </font>
    </p>
    <p>
      <font size="3">They should be included here in order to be populated later.</font>
    </p>
  </body>
</html>
</richcontent>
<linktarget COLOR="#b0b0b0" DESTINATION="ID_218430875" ENDARROW="Default" ENDINCLINATION="80;0;" ID="Arrow_ID_1663252148" SOURCE="ID_1779420342" STARTARROW="None" STARTINCLINATION="80;0;"/>
</node>
</node>
<node CREATED="1479621552601" ID="ID_1779420342" MODIFIED="1479622273250" POSITION="right" TEXT="Visitable">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <font size="3">Simple interface which must be implemented by each item (class). </font>
    </p>
    <p>
      <font size="3">Implementation must state: </font>
    </p>
    <p>
      <font size="3">return visitor.visit ( this ); // Which should notify Visitor to trigger it's implementation</font>
    </p>
  </body>
</html>
</richcontent>
<arrowlink DESTINATION="ID_218430875" ENDARROW="Default" ENDINCLINATION="80;0;" ID="Arrow_ID_1663252148" STARTARROW="None" STARTINCLINATION="80;0;"/>
<linktarget COLOR="#b0b0b0" DESTINATION="ID_1779420342" ENDARROW="Default" ENDINCLINATION="22;0;" ID="Arrow_ID_1977546281" SOURCE="ID_1159934160" STARTARROW="None" STARTINCLINATION="22;0;"/>
<linktarget COLOR="#b0b0b0" DESTINATION="ID_1779420342" ENDARROW="Default" ENDINCLINATION="45;0;" ID="Arrow_ID_179367706" SOURCE="ID_1828117592" STARTARROW="None" STARTINCLINATION="45;0;"/>
<linktarget COLOR="#b0b0b0" DESTINATION="ID_1779420342" ENDARROW="Default" ENDINCLINATION="66;0;" ID="Arrow_ID_1759405144" SOURCE="ID_1743049716" STARTARROW="None" STARTINCLINATION="66;0;"/>
</node>
<node CREATED="1479621517840" ID="ID_1159934160" MODIFIED="1479621767245" POSITION="right" TEXT="Tabacco">
<arrowlink DESTINATION="ID_1779420342" ENDARROW="Default" ENDINCLINATION="22;0;" ID="Arrow_ID_1977546281" STARTARROW="None" STARTINCLINATION="22;0;"/>
</node>
<node CREATED="1479621525662" ID="ID_1828117592" MODIFIED="1479621777051" POSITION="right" TEXT="Liquor">
<arrowlink DESTINATION="ID_1779420342" ENDARROW="Default" ENDINCLINATION="45;0;" ID="Arrow_ID_179367706" STARTARROW="None" STARTINCLINATION="45;0;"/>
</node>
<node CREATED="1479621505114" ID="ID_1743049716" MODIFIED="1479621781691" POSITION="right" TEXT="Necessity">
<arrowlink DESTINATION="ID_1779420342" ENDARROW="Default" ENDINCLINATION="66;0;" ID="Arrow_ID_1759405144" STARTARROW="None" STARTINCLINATION="66;0;"/>
</node>
</node>
</map>
