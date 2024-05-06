# Tugas Kecil Strategi Algoritma IF2211

## Membangun Kurva Bézier dengan Algoritma Titik Tengah berbasis Divide and Conquer

## Table of Contents

- [Table of Contents](#table-of-contents)
- [General Information](#general-information)
- [Contributor](#contributor)
- [Structure](#structure)
- [Dependencies](#dependencies)
- [How to Use](#how-to-use)

## General Information

Tujuan dari pembuatan tugas kecil ini adalah mengimplementasikan algoritma UCS, Greedy Best First Search, dan A* untuk menyelesaikan permainan Word Ladder.

Word ladder adalah permainan teka-teki kata yang dimainkan dengan cara mengubah dari satu kata menjadi kata lainnya dengan mengubah satu huruf per suatu langkah. Setiap langkah harus menghasilkan kata baru yang valid, dan tujuannya adalah untuk mencapai kata target dalam jumlah langkah minimum.

## Contributor

| Name                    | NIM      |
| ----------------------- | -------- |
| Ikhwan Al Hakim         | 13522147 |

## Structure

```
.
├── bin
│   ├── AStar.class
│   ├── GBFS.class
│   ├── Main.class
│   ├── NodeAStar.class
│   ├── NodeGBFS.class
│   ├── NodeUCS.class
│   ├── UCS.class
│   └── words_alpha.txt
├── doc
│   └── Tucil3_13522147.pdf
├── readme.md
├── src
│   ├── AStar.java
│   ├── GBFS.java
│   ├── Main.java
│   ├── NodeAStar.java
│   ├── NodeGBFS.java
│   ├── NodeUCS.java
│   ├── UCS.java
│   └── words_alpha.txt
└── test
    ├── 1
    │   ├── astar.png
    │   ├── gbfs.png
    │   └── ucs.png
    ├── 2
    │   ├── astar.png
    │   ├── gbfs.png
    │   └── ucs.png
    ├── 3
    │   ├── astar.png
    │   ├── gbfs.png
    │   └── ucs.png
    ├── 4
    │   ├── astar.png
    │   ├── gbfs.png
    │   └── ucs.png
    ├── 5
    │   ├── astar.png
    │   ├── gbfs.png
    │   └── ucs.png
    └── 6
        ├── astar.png
        ├── gbfs.png
        └── ucs.png
```

## Dependencies

OpenJDK

## How to Use

### Cara pertama (tanpa compile)

1. Clone repositori ini
    ```
    git clone https://github.com/Nerggg/Tucil3_13522147
    ```
2. Navigasi ke folder `bin`
    ```
    cd Tucil3_13522147/bin
    ```
3. Jalankan file `Main.class`
    ```
    java Main
    ```

### Cara kedua (compile)

1. Clone repositori ini
    ```
    git clone https://github.com/Nerggg/Tucil3_13522147
    ```
2. Navigasi ke folder `src`
    ```
    cd Tucil3_13522147/src
    ```
3. Lakukan kompilasi terhadap file `Main.java`
    ```
    javac Main.java
    ```
4. Jalankan file `Main.class`
    ```
    java Main
    ```
