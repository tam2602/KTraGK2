package main;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String id;
    private String name;
    private String address;
    private LocalDate ngaysinh;
    private String mahoatuoi;
    private boolean songuyento;

    public Student(String id, String name, String address, LocalDate ngaysinh) {
        if (id == null || name == null || address == null || ngaysinh == null) {
            throw new IllegalArgumentException("Missing attribute");
        }
        this.id = id;
        this.name = name;
        this.address = address;
        this.ngaysinh = ngaysinh;
    }

    public int tinhTuoi() {
        return Period.between(this.ngaysinh, LocalDate.now()).getYears();
    }

    public String mahoaTuoi(int age) {
        return new StringBuilder().append(age).reverse().toString();
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getNgaySinh() {
        return ngaysinh;
    }

    public void setNgaySinh(LocalDate dob) {
        this.ngaysinh = dob;
    }

    public String getTuoiMaHoa() {
        if (this.mahoatuoi == null) {
            this.mahoatuoi = mahoaTuoi(tinhTuoi());
        }
        return this.mahoatuoi;
    }

    public boolean getSoNguyenTo() {
        return this.songuyento;
    }


}

