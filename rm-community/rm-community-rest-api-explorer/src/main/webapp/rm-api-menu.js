<import 

var originalGenerateMenu = generateMenu;

function generateMenu() {
   
   originalGenerateMenu();

   var apiSelect = document.getElementById("select_baseUrl");
   
   var item = document.createElement("option");
   item.setAttribute("value", "definitions/newGS.yaml");
   var textnode = document.createTextNode("New GS API");
   item.appendChild(textnode); 
   
   apiSelect.appendChild(item);    
}