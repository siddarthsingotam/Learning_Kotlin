package Labs.Lab01

class Major(val name: String) {
    private var students = mutableListOf<Student>()

    fun addStudents(student: Student){
        students.add(student)
    }

    fun stats(): Triple<Double, Double, Double>?{
        if (students.isEmpty()) return null

        var minAverage = Double.MAX_VALUE
        var maxAverage = Double.MIN_VALUE
        var totalAverage = 0.0

        for (student in students){
            val average = student.weightedAverage()
            if (average < minAverage) minAverage = average
            if (average > maxAverage) maxAverage = average
            totalAverage += average
        }

        val avgOfAverages = totalAverage / students.size
        return Triple(minAverage, maxAverage, avgOfAverages)
    }

    fun stats(courseName: String): Triple<Double, Double, Double>? {
        if (students.isEmpty()) return null

        var minGrade = Double.MAX_VALUE
        var maxGrade = Double.MIN_VALUE
        var totalGrade = 0.0
        var count = 0

        for (student in students) {
            for (course in student.courses) {
                if (course.name == courseName) {
                    val grade = course.grade
                    if (grade < minGrade) minGrade = grade
                    if (grade > maxGrade) maxGrade = grade
                    totalGrade += grade
                    count++
                }
            }
        }

        if (count == 0) return null
        val avgGrade = totalGrade / count
        return Triple(minGrade, maxGrade, avgGrade)
    }
}