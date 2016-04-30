<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Saisir un Développeur</title>
</head>
<body>
<center><h2>Bienvnue sur le site developpez.com</h2>

	<div id="formulaire">
		<s:form method ="post" action="enregistrer_Developpeur">
		
			<s:textfield name="identifiant" id="identifiant"
				label="Identifiant" labelposition="left">
			</s:textfield>
			
			<s:textfield name="pseudo" id="pseudo"
				label="Pseudo" labelposition="left">
			</s:textfield>	
			
			<s:textfield name="mail" id="mail" 
				label="Email" labelposition="left">
			</s:textfield>
			
			<s:textfield name="codePostal" id="codePostal" 
				label="Code Postale" labelposition="left">
			</s:textfield>
		
			<s:textfield name="dateInscription" id="dateInceription" 
				label="Date Inscription" labelposition="left">
			</s:textfield>
			
			<s:submit value = "Envoyer"></s:submit>
		
		</s:form>
	</div>
</center>
</body>
</html>