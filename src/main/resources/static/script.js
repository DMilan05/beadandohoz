// Event handler for creating an exam
document.getElementById("createExamForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const examName = document.getElementById("createExamName").value;
    createExam(examName);
});

// Event handler for deleting an exam
document.getElementById("deleteExamForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const examName = document.getElementById("deleteExamName").value;
    deleteExam(examName);
});

// Event handler for registering for an exam
document.getElementById("registerExamForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const examName = document.getElementById("registerExamName").value;
    registerForExam(examName);
});

// Event handler for quitting an exam
document.getElementById("quitExamForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const examName = document.getElementById("quitExamName").value;
    quitExam(examName);
});

// Function to create an exam
function createExam(examName) {
    if (!checkIfExamExists(examName)) {
        document.getElementById("createExamResult").textContent = "Exam already exists.";
        return;
    }
    console.log("Exam created:", examName);
    document.getElementById("createExamResult").textContent = "Exam created: " + examName;
}

// Function to delete an exam
function deleteExam(examName) {
    if (!checkIfExamExists(examName)) {
        document.getElementById("deleteExamResult").textContent = "Exam not found.";
        return;
    }
    console.log("Exam deleted:", examName);
    document.getElementById("deleteExamResult").textContent = "Exam deleted: " + examName;
}

// Function to register for an exam
function registerForExam(examName) {
    if (!checkIfExamExists(examName)) {
        document.getElementById("registerExamResult").textContent = "Exam does not exist or has been deleted.";
        return;
    }
    console.log("Registered for exam:", examName);
    document.getElementById("registerExamResult").textContent = "Registered for exam: " + examName;
}

// Function to check if the exam exists
function checkIfExamExists(examName) {
    // Simulate a check for the existence of exams
    const exams = ['Math', 'Physics', 'Computer Science'];
    return exams.includes(examName);
}
