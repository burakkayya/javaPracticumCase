package com.company;

public class EmployeeManager {

    Employee _employee;

    public EmployeeManager(Employee employee) {
        this._employee = employee;
    }

    public double tax() {
        if (_employee.getSalary() < 1000) {
            //System.out.println("Maaş 1000 TL'den az, vergi uygulanmadı.");
        } else {
            //System.out.println("Maaş 1000 TL'den fazla, %3 vergi uygulandı.");
            return _employee.getSalary() * 3 / 100;
        }
        return 0;
    }

    public double bonus() {
        if (_employee.getWorkHours() > 40) {
            //System.out.println("Çalışma saati 40 saati geçti. Bonuslar verildi.");
            return (_employee.getWorkHours() - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {

        if ((2021 - Integer.parseInt(_employee.getHireYear())) < 10) {

            return _employee.getSalary() * 5 / 100;

        } else if ((2021 - Integer.parseInt(_employee.getHireYear())) > 9 && (2021 - Integer.parseInt(_employee.getHireYear())) < 20) {

            return _employee.getSalary() * 10 / 100;

        } else if ((2021 - Integer.parseInt(_employee.getHireYear())) > 19) {

            return _employee.getSalary() * 15 / 100;

        }
        return 0;
    }

    public void employeeToString() {
        System.out.println("Ad Soyad : " + _employee.getName());
        System.out.println("Maaş : " + _employee.getSalary() + " TL");
        System.out.println("Çalışma Saati : " + _employee.getWorkHours() + " saat");
        System.out.println("Başlangıç Yılı : " + _employee.getHireYear());
    }
}
