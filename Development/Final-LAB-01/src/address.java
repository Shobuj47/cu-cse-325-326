/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agent47
 */
public class address {

    private int FlatNo;
    private int FloorNo;
    private String RoadNo;
    private String HouseNo;
    private String City;
    private String State;

    public int getFlatNo() {
        return FlatNo;
    }

    public void setFlatNo(int FlatNo) {
        this.FlatNo = FlatNo;
    }

    public int getFloorNo() {
        return FloorNo;
    }

    public void setFloorNo(int FloorNo) {
        this.FloorNo = FloorNo;
    }

    public String getRoadNo() {
        return RoadNo;
    }

    public void setRoadNo(String RoadNo) {
        this.RoadNo = RoadNo;
    }

    public String getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(String HouseNo) {
        this.HouseNo = HouseNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public address(int FlatNo, int FloorNo, String RoadNo, String HouseNo, String City, String State) {
        this.FlatNo = FlatNo;
        this.FloorNo = FloorNo;
        this.RoadNo = RoadNo;
        this.HouseNo = HouseNo;
        this.City = City;
        this.State = State;
    }

    public String address (){
        String addrProp = "Flat No : " + this.getFlatNo() + " ,Floor No : " + this.getFloorNo() + " ,Road No : " + this.getRoadNo() 
                + " ,State : " + this.getState() + " ,City : " + this.getCity();
        return addrProp;
    }
    public address() {
        super();
    }
    
    
    
    
}
