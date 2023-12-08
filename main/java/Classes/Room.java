package Classes;

public class Room {
    private String roomNumber;
    private String type;
    private String price;
    private String isAvailable;

    public Room(String roomNumber, String type, String price, String isAvailable) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIsIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Room{roomNumber=").append(roomNumber);
        sb.append(", quantity=").append(type);
        sb.append(", price=").append(price);
        sb.append(", isAvailable=").append(isAvailable);
        sb.append('}');
        return sb.toString();
    }

 }
