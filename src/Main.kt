import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun main() {

    val path = "C:/Users/Админ/Desktop/"
    val name = "myfile2.txt"
    val num = 30

    val file = File(path + name)
    val writer = FileWriter(file)
    for (i in 1..num){
        if (i % 2 == 0){
            writer.write("\n $i")
        }
    }
    writer.close()

}
