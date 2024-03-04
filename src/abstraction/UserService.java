package abstraction;

import java.io.Serializable;
import java.util.List;

public interface UserService extends CommonService,List<String>,Serializable {
	
    void addUser();
	void deleteUser(); 
	
	default void editUser() {
		
	}
	
	static void updateUser() {
		
		 System.out.println("....update");
	}

}
