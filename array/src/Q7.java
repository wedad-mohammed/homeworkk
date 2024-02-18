public class Q7 {
    function findFiveRepeatedIntegers(B):
    // Initialize an empty hash set
    HashSet seenNumbers

    // Initialize an empty list to store the repeated integers
    List repeatedIntegers

    for element in B:
            // Check if the current element exists in the hash set
            if seenNumbers.contains(element):
            // If it does, check if it is already in the list of repeated integers
            if element not in repeatedIntegers:
            // If it isn't, add it to the list
            repeatedIntegers.add(element)
            else:
            // If it doesn't, add it to the hash set
            seenNumbers.add(element)

            // If the size of the list of repeated integers reaches five, return the list
            if size(repeatedIntegers) == 5:
            return repeatedIntegers

    return empty list
}
