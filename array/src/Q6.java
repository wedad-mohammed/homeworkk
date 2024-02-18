public class Q6 {
    function findRepeatedInteger(A):
    HashSet seenNumbers

    for element in A:
            // Check if the current element exists in the hash set
            if seenNumbers.contains(element):
            // If it does, return the repeated integer
            return element
        else:
                seenNumbers.add(element)

            return -1
}
