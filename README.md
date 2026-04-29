Nomor 4.3h :
BFS (Breadth First Search) dan Pre-order akan menjadi sama jika kondisinya terdapat tree yang memiliki child namun tidak memiliki percabangan.
Contohnya : 
A > B > C > D
Tree tersebut, merupakan tree yang lurus kebawah tanpa adanya percabangan kiri dan kanan yang membuat BFS dan Pre-Order akan melakukan pemeriksaan yang sama. BFS akan mencari per level yang memberikan output A B C D secara berurutan. Sama halnya dengan Pre-Order yang melakukan pengecekan melalui akar lalu ke sub pohon kiri lalu ke kanan. Namun pada kondisi ini, tidak terdapat sub-sub pohon atau percabangan dan hanya mempunyai child atau keturunan yang membuat Pre-Order hanya memeriksa dari atas ke bawah yang memberikan output yang sama seperti BFS 

Nomor 4.3i :
A. jika yang di bahas berapa lama run time traversalnya jika memprint nama direktorinya tanpa memproses file di dalamnya makanya kompleksitasnya adalah O(n) karena traversal mengunjungi setiap direktori sekali dan melakukan print sehingga total direktori adalah total waktunya juga

B. untuk bisa mencetak nama file maka traversal harus melewati direktori juga namun operasi printnya hanya berlaku pada pencetakan jumlah file yang mendapatkan kompleksitas O(N) juga karena operasinya hanya berlaku di file dan hanya melewati direktori untuk menuju ke file tersebut

C. Jika ditanya apakah kompleksitasnya berubah ketika di ketahui bahwa N = (n)?, maka jawabannya adalah Tidak. kompleksitasnya tidak berubah ketika di ketahui bahwa N memiliki ukuran lebih besar ketimbang ukuran n dan tidak memungkinkan bahwa N ukurannya lebih kecil dari n maka ketika di tanya kompleksitas terhadap nomor B maka tetap saja kompleksitasnya O(N) karena hanya berfokus pada file atau N sedangkan omega disini hanyalah sebagai informasi tambahan bahwa N itu tidak mungkin lebih kecil dari jumlah n.