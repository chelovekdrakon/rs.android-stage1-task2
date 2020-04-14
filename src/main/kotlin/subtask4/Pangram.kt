package subtask4

class Pangram {

    fun getResult(inputString: String): String {
        var abc = mutableSetOf<Char>()
        abc.addAll(
            inputString
                .toLowerCase()
                .asIterable()
                .filter { it in 'a'..'z' }
        )

        val isPangram = abc.size == 26

        val vowels = setOf('a','e','i','o','u','y')
        val vowelsRegex = "[aeiouy]".toRegex()
        val consonantsRegex = "[bcdfghj-np-tvwxz]".toRegex()

        var words = inputString
            .replace('\n', ' ')
            .split(' ')
            .filter { it -> it.isNotEmpty() } as MutableList

        for(index in words.indices) {
            words[index] = if (isPangram) {
                words[index].count { c -> vowels.contains(c.toLowerCase()) }
                    .toString() + vowelsRegex.replace(words[index]) { m -> m.value.toUpperCase() }
            } else {
                words[index].count { c -> !vowels.contains(c.toLowerCase()) and (c.toLowerCase() in 'a'..'z') }
                    .toString() + consonantsRegex.replace(words[index]) { m -> m.value.toUpperCase() }
            }
        }

        words.sortWith(compareBy { it -> it[0] })

        return words.joinToString(" ")
    }
}
