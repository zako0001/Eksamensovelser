public class Motherboard {

    // Attribute
    private SataDrive[] sataDrives;

    // Contructor
    public Motherboard() {
        sataDrives = new SataDrive[4];
    }

    // Method
    public boolean connectSataDrive(SataDrive sataDrive) {
        if (sataDrive == null) {
            return false;
        }
        for (int i = 0; i < sataDrives.length; i++) {
            if (sataDrives[i] == null) {
                sataDrives[i] = sataDrive;
                return true;
            }
        }
        return false;
    }
}