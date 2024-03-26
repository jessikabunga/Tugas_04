public class LCD {
    //Mendeklarasikan variable
    private String status;
    private int volume;
    private int brightness;
    private String[] cables; //Menggunakan array untuk menyimpan jenis kabel
    private int cableIndex;

    //Konstruktor untuk menginisialisasi objek LCD dengan nilai awal
    public LCD() {
        status = "Mati";
        volume = 0;
        brightness = 0;
        cables = new String[]{"Tidak terhubung", "VGA", "HDMI", "DVI", "DisplayPort"};
        cableIndex = 0;
    }

    //Method untuk mengatur status LCD menjadi "Menyala" pada saat turn on
    public void turnOn() {
        status = "Menyala";
    }

    //Method untuk mengatur status LCD menjadi "Mati" pada saat turn of
    public void turnOff() {
        status = "Mati";
    }

    //Method untuk mengatur status LCD menjadi "Freeze" saat mode freeze dinyalakan
    public void Freeze() {
        status = "Freeze";
    }

    //Method untuk mengatur volume LCD dengan parameter volume yang diinginkan
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void volumeUp() {
        volume++;
    }
    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    //Mthod untuk mengatur brightness LCD dengan parameter brightness yang diinginkan
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    public void brightnessUp() {
        brightness++;
    }
    public void brightnessDown() {
        if (brightness > 0) {
            brightness--;
        }
    }

    //Mengatur jenis kabeldengan menggunakan nilai indeks dari array cable dengan parameter jenis cable
    public void setCable(int cableType) {
        if (cableType >= 0 && cableType < cables.length) {
            cableIndex = cableType;
        } else {
            cableIndex = 0; // Tidak terhubung jika indeks tidak valid
        }
    }

    //Menggunakan method accessor untuk mendapatkan status, volume, brightness, dan jenis cable
    public String getStatus() {
        return status;
    }
    public int getVolume() {
        return volume;
    }
    public int getBrightness() {
        return brightness;
    }
    public String getCable() {
        return cables[cableIndex];
    }

    //Menampilkan informasi mengenai LCD
    public void displayMessage() {
        System.out.println("LCD Status: " + getStatus());
        System.out.println("Volume: " + getVolume());
        System.out.println("Brightness: " + getBrightness());
        System.out.println("Cable: " + getCable());
    }
}
