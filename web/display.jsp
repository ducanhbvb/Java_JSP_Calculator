
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<div id="content">
  <h2>Product Discount Calculator</h2>
  <form method="get"action="/converter">
    <legend>
      <label>Number One </label>
      <input type="text" name="numberOne" placeholder="numberOne" value="0"/><br/>
      <label>Calculator: </label>
      <select name="select_">
        <option value="summation">Summation</option>
        <option value="subtraction">Subtraction</option>
        <option value="multiplication">Multiplication</option>
        <option value="division">Division</option>
      </select></br>
      <label>Number Two</label>
      <input type="text" name="numberTwo" placeholder="numberTwo" value="0"/><br/>
      <input type = "submit" id = "submit" value = "Converter"/>
    </legend>
  </form>
</div>


</form>
</body>
</html>
