public class Employee {
        String name;
        int salary;
        double workHours;
        int hireYear;
         double vergi;
         double maasArtisi;
         double Bonus;
         public Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        }
        public void Tax()  {
            if (salary < 1000) {
                vergi = 0;
            }
        else if (salary>1000) {
                vergi = salary * 0.03;
            }
        else {
                System.out.println("maaş 1000 altı veya 1000 üstü olmalıdır");
                System.exit(0);
            }

        }
        public void Bonus(){
             if (workHours>40){
                 Bonus=(((workHours-40) * 30)/7*30);
             }
        }
        public void raiseSalary(){
             if ((2021-hireYear)<10 && (2021-hireYear)>=0){
                 maasArtisi= ((salary-vergi+Bonus) * 0.05);
             }
            if ((2021-hireYear)>9 && (2021-hireYear)<20){
                maasArtisi= ((salary-vergi+Bonus) * 0.1);
            }
            if ((2021-hireYear)>19){
                maasArtisi= ((salary-vergi+Bonus) * 0.15);
            }
        }
        public void ToString(){
            System.out.println("Adı : "+name +"\n"+"Maaşı : "+ salary+"\n"+"haftalık Çalışma saati : "+workHours+"\n"+"Başlangıç yılı : "+hireYear+"\n"
                    +"Vergi : "+vergi+"\n"+"aylık Bonus : "+Bonus+"\n"+"Maaş artışı : "+maasArtisi+"\n"
                    +"Vergi ve bonuslarla birlikte maaş : "+(salary+Bonus-vergi)+"\n"+"Toplam maaş : "+(salary+Bonus+maasArtisi));
        }
    }
