/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.db4oUtil;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import healthcare.Configsystem;
import healthcare.Ecosystem;
import java.nio.file.Paths;

/**
 *
 * @author Tejas
 */
public class Db4oUtil {
    
    private static final String databaseFileName = Paths.get("DataStore.DB4O").toAbsolutePath().toString();
    private static Db4oUtil db4oUtil;
    
    public synchronized static Db4oUtil getDb4oInstance(){
        if (db4oUtil == null){
            db4oUtil = new Db4oUtil();
        }
        return db4oUtil;
    }
    
    protected synchronized static void shutDownDb4oConnection(ObjectContainer connection){
        if (connection != null) {
            connection.close();
        }
    }
    
    private ObjectContainer createDb4oConnection(){
        
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            ObjectContainer db = Db4oEmbedded.openFile(config, databaseFileName);
            config.common().add(new TransparentPersistenceSupport());
            //Control number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls level of update of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Ecosystem.class).cascadeOnUpdate(true); // Change to the object to save

            return db;
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        
        return null;
    }
    
    public synchronized void storeDb4oEcosystem(Ecosystem ecosystem) {
        ObjectContainer connection = createDb4oConnection();
        connection.store(ecosystem);
        connection.commit();
        connection.close();
    }
    
    public Ecosystem retrieveDb4oSystem(){
        ObjectContainer connection = createDb4oConnection();
        ObjectSet<Ecosystem> ecosystems = connection.query(Ecosystem.class); // Change to the object you want to save
        Ecosystem ecosystem;
        if (ecosystems.isEmpty()) {
            ecosystem = Configsystem.configureEcosystem(); // If there's no System in the record, create a new one
        } 
        else {
            ecosystem = ecosystems.get(ecosystems.size() - 1);
        }
        connection.close();
        return ecosystem;
    }

}
