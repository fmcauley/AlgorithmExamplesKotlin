import java.lang.StringBuilder
import java.lang.reflect.Array.get

class RemoveVowels {

    fun removeVowels(S: String) : String {

        var chars =  StringBuilder()

        for (x in S) {
            if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u') {
                chars.append(x)
            }
        }

        return  chars.toString()
    }
}