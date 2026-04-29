Nomor 4.3h :
BFS (Breadth First Search) dan Pre-order akan menjadi sama jika kondisinya terdapat tree yang memiliki child namun tidak memiliki percabangan.
Contohnya : 
A > B > C > D
Tree tersebut, merupakan tree yang lurus kebawah tanpa adanya percabangan kiri dan kanan yang membuat BFS dan Pre-Order akan melakukan pemeriksaan yang sama. BFS akan mencari per level yang memberikan output A B C D secara berurutan. Sama halnya dengan Pre-Order yang melakukan pengecekan melalui akar lalu ke sub pohon kiri lalu ke kanan. Namun pada kondisi ini, tidak terdapat sub-sub pohon atau percabangan dan hanya mempunyai child atau keturunan yang membuat Pre-Order hanya memeriksa dari atas ke bawah yang memberikan output yang sama seperti BFS 

Nomor 4.3i :
