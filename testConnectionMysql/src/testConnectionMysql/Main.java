package testConnectionMysql;

import java.sql.*;



public class Main {

	public static void main(String[] args) {
		/* Chargement du driver JDBC pour MySQL */
		try {
		    Class.forName( "com.mysql.jdbc.Driver" );
		} catch ( ClassNotFoundException e ) {
		    /* Gérer les éventuelles erreurs ici. */
		}
		
		/* Connexion à la base de données */
		String url = "jdbc:mysql://localhost:3306/jeux_video";
		String utilisateur = "root";
		String motDePasse = "";//root pour les macs
		Connection connexion = null;
		try {
		    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
		    
		    /* Ici, nous placerons nos requêtes vers la BDD */
		    displayTable(connexion, "jeux_video");
		    
		} catch ( SQLException e ) {
		    /* Gérer les éventuelles erreurs ici */
		} finally {
		    if ( connexion != null )
		        try {
		            /* Fermeture de la connexion */
		            connexion.close();
		        } catch ( SQLException ignore ) {
		            /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
		        }
		}
	}
	
	public static void displayTable(Connection connexion, String table) throws SQLException  {
        String aff = "";
        String columnName = "";
        int type = 0;

        java.sql.Statement statement = connexion.createStatement();
        
        ResultSet resultat = statement.executeQuery("SELECT * from "+ table);
        ResultSetMetaData rsmd = resultat.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        
        for (int a = 1; a<= columnsNumber; a++){
            if (a != columnsNumber){
                aff += rsmd.getColumnName(a) + " | ";
            }
            else aff += rsmd.getColumnName(a);
        }
        System.out.println(aff);
        aff= "";
        while (resultat.next()){
            for (int b = 1; b <= columnsNumber; b++){
                columnName = rsmd.getColumnName(b);
                type = rsmd.getColumnType(b);
                if (type == Types.VARCHAR || type == Types.CHAR){
                    String temp = resultat.getString(columnName);
                    aff += temp +" | ";
                }
                else if (type == Types.TIMESTAMP){
                    String temp = resultat.getString(columnName);
                    aff += temp + " | ";
                }
                else if (type == Types.INTEGER){
                    String temp = "" + resultat.getInt(columnName);
                    aff += temp +" | ";
                } 
                else {
                    String temp = resultat.getString(columnName);
                    aff += temp + " | ";
                }

            }
            System.out.println(aff);
            aff = "";
        }

    }
}
