DosenTetap dosenTetap = new DosenTetap("John Doe","12345","S2","Bahasa Inggris",0);
DosenTerbang dosenTerbang = new DosenTerbang("Jane Doe","67890","S3","Matematika",0);

dosenTetap.jamStandby();
dosenTerbang.jamStandby();

double totalGajiDosenTetap = dosenTetap.tunjanganMakan() + dosenTetap.tunjanganTransport() + dosenTetap.honorBerdasarkanJam(40);
double totalGajiDosenTerbang = dosenTerbang.tunjanganMakan() + dosenTerbang.tunjanganTransport() + dosenTerbang.honorBerdasarkanJam(30);

dosenTetap.setTotalGaji(totalGajiDosenTetap);
dosenTerbang.setTotalGaji(totalGajiDosenTerbang);

System.out.println("Informasi Dosen Tetap:");
System.out.println("Nama: " + dosenTetap.getNama());
System.out.println("NIP: " + dosenTetap.getNip());
System.out.println("Pendidikan Terakhir: " + dosenTetap.getPendidikanAhir());
System.out.println("Mata Kuliah Yang Diampu: " + dosenTetap.getMataKuliah());
System.out.println("Total Gaji: " + dosenTetap.getTotalGaji());

System.out.println("Informasi Dosen Terbang:");
System.out.println("Nama: " + dosenTerbang.getNama());
System.out.println("NIP: " + dosenTerbang.getNip());
System.out.println("Pendidikan Terakhir: " + dosenTerbang.getPendidikanAhir());
System.out.println("Mata Kuliah Yang Diampu: " + dosenTerbang.getMataKuliah());
System.out.println("Total Gaji: " + dosenTerbang.getTotalGaji());
