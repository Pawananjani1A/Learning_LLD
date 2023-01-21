package main.java.models.gate;

public abstract class Gate {

    private int floorNo;
    private int gateNo;
    private boolean isOpen;
    private boolean isClosed;

    public Gate(int floorNo, int gateNo, boolean isClosed, boolean isOpen){
        this.floorNo = floorNo;
        this.gateNo = gateNo;
        this.isOpen = isOpen;
        this.isClosed = isClosed;
    }



    public int getFloorNo() {
        return floorNo;
    }

    public int getGateNo() {
        return gateNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public void setGateNo(int gateNo) {
        this.gateNo = gateNo;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void closeGate(){
        this.isClosed = true;
        this.isOpen = false;
    }

    public void openGate(){
        this.isOpen = true;
        this.isClosed = false;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "floorNo=" + floorNo +
                ", gateNo=" + gateNo +
                ", isOpen=" + isOpen +
                ", isClosed=" + isClosed +
                '}';
    }
}
