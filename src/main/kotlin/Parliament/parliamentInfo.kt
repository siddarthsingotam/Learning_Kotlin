package Parliament

import ParliamentMembersData


class parliamentInfo{
    fun parties(parliamentList: List<ParliamentMember>): List<String>{
        var listOfParties: MutableList<String> = mutableListOf()
        for( member in parliamentList){
            listOfParties.add(member.party)
        }
        return listOfParties
    }

}

fun main() {
//    val parliamentInstance = parliamentInfo()
//    val partiesList = parliamentInstance.parties()

    val parties = ParliamentMembersData.members.map { it.party }.toSet().sorted()
    println(parties)

    val b = ParliamentMembersData.members.groupBy { it.party }.map { it.key to it.value.size }.sortedByDescending { it.second }
    println(b)

    val c = ParliamentMembersData.members.filter { it.party == "ps" }.sortedByDescending { it.firstname }.map { it.firstname to it.lastname}
    println(c)

    val d = ParliamentMembersData.members
        .filter { it.minister }
        .toSet()

    println(d)

    val e = ParliamentMembersData.members
        .filter { it.minister }
        .groupBy { it.party }
        .map { it.key to it.value.size }
        .sortedByDescending { it.second }

    println(e)

    val f = ParliamentMembersData.members
        .filter { it.minister }
        .groupBy { it.party }
        .map { it.key to it.value.sumOf { member -> member.seatNumber } }
        .sortedByDescending { it.second }

    println(f)

}

