<div style="text-align: center;">
  <img src="https://pbs.twimg.com/media/F-j9h-saUAABiEE.jpg" alt="Contoh Gambar" style="width:100%; height:240px; object-fit:cover">
</div>

<a name="top"></a>

<h1 align="center">
 ▶︎ Markdown Guide  ◀︎
</h1>

<br/>

> [!IMPORTANT] Perhatian
> Dokumentasi ini dikembangakan oleh [Pemilik Profile ini](https://docs.github.com/limpixel).

## Daftar isi
- [Daftar isi](#daftar-isi)
- [Color reference :](#color-reference-)
- [Penjelasan](#penjelasan)
- [Heading](#heading)
- [Text Style](#text-style)
- [Aligments](#aligments)
- [Table](#table)
- [Link](#link)
- [Images](#images)
- [Badge](#badge)
- [List](#list)
  - [Ordered](#ordered)
  - [Unordered](#unordered)
- [Task](#task)
- [Buttons](#buttons)

---
## Color reference : 
- Base : `#7E8EF1` 
- Succes : `#799351`
- Warning : `#FF7D29`
- Error : `#FC4100`



## Penjelasan

🗣🔥 : <span style="color: #7E8EF1;">Bang Markdown Apaan?</span>

Markdown adalah bahasa markup ringan yang digunakan untuk menulis teks yang mudah dibaca dan ditulis, yang dimana dikonversikan menjadi HTML secara otomatis. Ini dirancang untuk memungkinkan orang menulis dalam format teks biasa yang mudah dipahami, yang juga bisa diubah menjadi format yang terlihat bagus di web.

🗣🔥 : <span style="color:#7E8EF1;">Mengapa Menggunakan Markdown?</span>

- **Sederhana**: Mudah dipelajari dan digunakan, bahkan untuk pemula.
- **Bersih**: Membuat dokumen yang bersih dan tidak berantakan.
- **Portabel**: Didukung oleh banyak platform dan alat, seperti GitHub, Bitbucket, dan banyak editor teks.
- **Fleksibel**: Dapat digunakan untuk menulis berbagai jenis dokumen, termasuk catatan, artikel, dokumentasi, dan banyak lagi.

Contoh Penggunaan Markdown

- Penulisan Artikel dan Blog: Banyak penulis dan blogger menggunakan Markdown untuk menulis konten mereka.
- Dokumentasi Proyek: Pengembang perangkat lunak sering menggunakannya untuk membuat dokumentasi proyek.
- Catatan Pribadi: Banyak orang menggunakan Markdown untuk mencatat karena kesederhanaannya.

🗣🔥 : <span style="color:#7E8EF1;">Mana Guidenya?</span>
<br/>

Masnya ga sabaran cik 😂

---
## Heading
Heading ini bisa menggunakan `<h1>..</h1>` atau menggunakan `# head`, dan ini kembali ke kalian apakah mau menggunakan syntax HTML atau Markdown. Berikut contoh dan hasilnya : 

- <span style="color:#7E8EF1;" > ➡️ HTML</span> <br/>
   Code : 
   ```html 
    <h1>Heading 1</h1>
    <h2>Heading 2</h2>
    <h3>Heading 3</h3>
    <h4>Heading 4</h4>
    <h5>Heading 5</h5>
   ```
   Output : 
    <h1>Heading 1</h1>
    <h2>Heading 2</h2>
    <h3>Heading 3</h3>
    <h4>Heading 4</h4>
    <h5>Heading 5</h5>


- <span style="color:#FF7D29;" > ➡️ Markdown</span> </br>
  Code : 
  ```markdown
  # Heading 1
  ## Heading 2
  ### Heading 3
  #### Heading 4
  ##### Heading 5
  ```
  Output : 
    # Heading 1
    ## Heading 2
    ### Heading 3
    #### Heading 4
    ##### Heading 5

---
## Text Style
  - ### Font Weigh 
    - ### Normal 
      ```
      Hellow world 
      ```
      output : <br/>
      Hellow world
    - ### Bold 
      ```markdown
      **Hellow world .** <br/>
      __Hellow world .__ <br/>
      <strong>Hellow world .</strong> <br/>
      ```
      > <span>Output :</span> </br>
      **Hellow world .** </br>
      __Hellow world .__ </br>
      <strong>Hellow world .</strong> </br>
      
    - ### Italic 
      ```markdown
      *Hellow world .* </br>
      _Hellow world ._ </br>
      <em>Hellow world .</em> </br>
      ```

      > Output <br/>
      *Hellow world .* </br>
      _Hellow world ._ </br>
      <em>Hellow world .</em> </br>

    - ### Bold & Italic 
      ```markdown
      **_Hellow world_** <br/>
      <strong><em>Hellow world</em></strong>
      ```

      > Output <br/>
      **_Hellow world_** <br/>
      <strong><em>Hellow world</em></strong>
    - ### Blockquotes
      ```markdown
      > Hello World
      > Hello World
      >
      > Hello World
      >
      > Hello World
      > Hello World
      >> Hello World
      >>> Hello World
      > **Hello** *jumps over the lazy dog.*
      ```
      > Output : </br>
      > Hello World </br>
      > Hello World </br>
      > Hello World </br>
      > Hello World </br>
      > Hello World
      >> Hello World
      >>> Hello World
      > **Hello** *jumps over the lazy dog.*

    - ### Monospaced ( Font untuk codingan)
      ```markdown
      <samp>The quick brown fox jumps over the lazy dog.</samp>
      ```
      > Output : <br>
      <samp>The quick brown fox jumps over the lazy dog.</samp>
    - ### Underlined ( Text Di garis bawahi)
      ```markdown
      <ins>The quick brown fox jumps over the lazy dog.</ins>
      ```    
      > Output : <br>
      <ins>The quick brown fox jumps over the lazy dog.</ins>
    - ### Strike Through (Text garis)
      ```markdown
      ~~The quick brown fox jumps over the lazy dog.~~
      ```
      
      > Output : <br>
      ~~The quick brown fox jumps over the lazy dog.~~
    - ### Boxed ( Ada Kotak nya rek )
      ```markdown
      <table><tr><td>The quick brown fox jumps over the lazy dog.</td></tr></table>
      ```
      > Output : <br>
      <table><tr><td>The quick brown fox jumps over the lazy dog.</td></tr></table>
    - ### SubScripts 
      ```markdown
      log<sub>2</sub>(x)
      Subscript <sub>The quick brown fox jumps over the lazy dog.</sub>
      ```
      > Output : <br/>
      log<sub style="color: white;">2</sub>(x) <br/>
      Subscript <sub style="color: white;">The quick brown fox jumps over the lazy dog.</sub>
    - ### SuperScripts
      ```markdown
      2 <sup>53-1</sup> and -2 <sup>53-1</sup>
      Superscript <sup>The quick brown fox jumps over the lazy dog.</sup>
      ```
  
      > Output : <br>
      2 <sup style="color: orange">53-1</sup> and -2 <sup style="color: orange">53-1</sup> <br>
      Superscript <sup style="color:yellow">The quick brown fox jumps over the lazy dog.</sup>

      - ### Text Color
      | Color Name      | Code                                                                                         |Example                                                        |
      |-----------------|----------------------------------------------------------------------------------------------|----------------------------------------------------------------|
      | Apricot         | `$\color{Apricot}{The\ quick\ brown\ fox\ jumps\ over\ the\ lazy\ dog.}   $`                | $\color{Apricot}{The\ quick\ brown\ fox\ jumps\ over\ the\ lazy\ dog.}$      |
      | Aquamarine      | `$\color{Aquamarine}{The\ quick\ brown\ fox\ jumps\ over\ the\ lazy\ dog.}$`                 | $\color{Aquamarine}{The\ quick\ brown\ fox\ jumps\ over\ the\ lazy\ dog.}$   |
      | Bittersweet     | `$\color{Bittersweet}{The\ quick\ brown\ fox\ jumps\ over\ the\ lazy\ dog.}$`                | $\color{Bittersweet}{The\ quick\ brown\ fox\ jumps\ over\ the\ lazy\ dog.}$  |
      | Black           | `$\color{Black}{The\ quick\ brown\ fox\ jumps\ over\ the\ lazy\ dog.}$`                      | $\color{Black}{The\ quick\ brown\ fox\ jumps\ over\ the\ lazy\ dog.}$        |

  - ### Syntax Higlighting 
    "dafh"



## Aligments

## Table 

## Link
  - ### Inline
  - ### Reference 
  - ### Footnote 
  - ### Auto 
  - ### Section 
  - ### Hover 

## Images
  - ### Themes


## Badge 

## List 
### Ordered
### Unordered 


## Task

## Buttons 
  - ### Normal Button 
  - ### Emoji inline Button