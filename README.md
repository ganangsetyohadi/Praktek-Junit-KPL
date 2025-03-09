# Praktek JUnit pada Android

Proyek ini dibuat untuk memenuhi tugas mata kuliah KPL tentang pengujian di Android menggunakan JUnit.

## Deskripsi
Aplikasi sederhana dengan dua jenis pengujian:
1. Local Unit Test - Menguji logika bisnis aplikasi (kelas Calculator)
2. Instrumented Test - Menguji interaksi UI dan konteks aplikasi

## Tes yang Dibuat
### Local Unit Test
- Test penambahan: Memastikan fungsi add() di kelas Calculator berfungsi dengan benar
- Test pengurangan: Memastikan fungsi subtract() di kelas Calculator berfungsi dengan benar

### Instrumented Test
- Test konteks aplikasi: Memastikan konteks aplikasi dapat diakses dengan benar
- Test interaksi UI: Memastikan UI merespons dengan benar saat tombol diklik

## Cara Menjalankan
### Local Unit Test
1. Buka project di Android Studio
2. Navigasi ke src/test/java/com.example.praktek_junit_kpl/ExampleUnitTest.java
3. Klik kanan pada file dan pilih "Run 'ExampleUnitTest'"

### Instrumented Test
1. Pastikan emulator atau perangkat fisik terhubung
2. Navigasi ke src/androidTest/java/com.example.praktek_junit_kpl/ExampleInstrumentedTest.java
3. Klik kanan pada file dan pilih "Run 'ExampleInstrumentedTest'"