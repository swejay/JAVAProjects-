package com.deloitte.cui;

public class Harbor {

	public static void main(String[] args) {
Harbor bostonHarbor =new Harbor();
RiverBarge barge=new RiverBarge();
SeaPlane sPlane =new SeaPlane();
bostonHarbor.givePermissionToDock(barge);
bostonHarbor.givePermissionToDock(sPlane);
	}
private void givePermissionToDock(Sailor s) {
	s.dock();
	
}
}
