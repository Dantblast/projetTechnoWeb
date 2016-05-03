<%@ include file="/imports/importsCss.jsp" %>
<title>Mon Groupe</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/menu.jsp" %>
     
          
        
        <div class=" accelev col-sm-10 col-md-10">
        
         <center><h1>Mon Groupe : G4 E</h1></center></br>
         <div class="row">
        	<div class="col-md-3">
        		<center>Membres</center>
        		
        		
        	</div>
        	
        	<div class="col-md-4 col-md-offset-1">
        		<center>Remarques sur le groupe</center>
        		
        	</div>
        	
        	<div class="col-md-3 col-md-offset-1">
        	 <s:url id="urlEvaluationCroise" action="gotoEvaluationCroise" />
        		<center>Évaluation croisée</center>
        		<center><s:a class=" eva_croise btn btn-primary" href="%{urlEvaluationCroise}">Commencer</s:a></center>
        	</div>
        </div>
        
       
        </div>
<%@ include file="/HeaderEtFooter/footer.jsp" %> 
<%@ include file="/imports/importsJs.jsp" %>