package com.api.gateway.Dto;
  
public class LightActionDto {
  
    private int room_id;
    private int equipment_id;
    private int state_id;
    
    public int getRoomId() {
        return room_id;
    }
  
    public void setRoomId(int room_id) {
        this.room_id = room_id;
    }
  
    public int getEquipmentId() {
        return equipment_id;
    }
  
    public void setEquipmentId(int equipment_id) {
        this.equipment_id = equipment_id;
    }
  
    public int getStateId() {
        return state_id;
    }
  
    public void setStateId(int state_id) {
        this.state_id = state_id;
    }
  
    @Override
    public String toString() {
        return "LightActionDto [room_id=" + room_id + ", equipment_id=" + equipment_id + ", state_id=" + state_id + "]";
    }
  
}