package CleanCodeThink.SRP;

class EmployeeFacade {
    int calculatePay() {
        return 0;
    }

    int reportHours() {
        return 0;
    }

    void saveEmployee() {
    }
}

class PayCalculator extends EmployeeFacade {
    // Actor: CFO
    public PayCalculator() {
        this.calculatePay();
    }

    @Override
    int calculatePay() {
        return 1234;
    }
}

class HourReporter extends EmployeeFacade {
    // COO
    @Override
    int reportHours() {
        return super.reportHours();
    }
}

class EmployeeSaver extends EmployeeFacade {
    // CTO
    @Override
    void saveEmployee() {
        super.saveEmployee();
    }
}


class CFO {

    int totalEmployeePay;


    void getPayCalculatorEmployee() {
        System.out.println("현재 직원의 급여 : " + totalEmployeePay);
    }

    void setPayCalculatorEmployee(int totalPay) {
        totalEmployeePay = totalPay;
        System.out.println("월급 계산됨 :" + totalEmployeePay);
    }

}


public class EmployeeData {
    public static void main(String[] args) {

        CFO cfo = new CFO();
        cfo.getPayCalculatorEmployee();

        PayCalculator employeePay = new PayCalculator();
        System.out.println(employeePay.calculatePay());

//        cfo.setPayCalculatorEmployee(new PayCalculator());


    }

}
