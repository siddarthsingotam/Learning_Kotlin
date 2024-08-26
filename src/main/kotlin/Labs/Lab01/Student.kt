package Labs.Lab01

class Student(name: String, age: Int) : Human(name, age) {
    var courses = mutableListOf<CourseRecord>()

    fun addCourse(courseRecord: CourseRecord){
        courses.add(courseRecord)
    }

    fun weightedAverage(): Double{
        var totalCredits = 0
        var totalWeightedGrade = 0.0

        for (course in courses){
            totalCredits += course.credits
            totalWeightedGrade += course.grade * course.credits
        }

        return if (totalCredits > 0) totalWeightedGrade / totalCredits else 0.0
    }

    fun weightedAverage(year: Int): Double{
        var totalCredits = 0
        var totalWeightedGrade = 0.0

        for (course in courses){
            if (year == course.yearCompleted){
                totalCredits += course.credits
                totalWeightedGrade += course.grade * course.credits
            }
        }
        return if (totalCredits > 0) totalWeightedGrade / totalCredits else 0.0

    }

    fun minMaxGrades(): Pair<Double, Double>? {
        if (courses.isEmpty()) return null

        var minGrade = Double.MAX_VALUE
        var maxGrade = Double.MIN_VALUE

        for (course in courses) {
            if (course.grade < minGrade) minGrade = course.grade
            if (course.grade > maxGrade) maxGrade = course.grade
        }

        return Pair(minGrade, maxGrade)
    }
}