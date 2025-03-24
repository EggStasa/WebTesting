document.addEventListener("DOMContentLoaded", function() {
    const questions = document.querySelectorAll(".question-box");
    const buttons = document.querySelectorAll(".next-btn");

    buttons.forEach((button, i) => {
        button.addEventListener("click", function() {
            let currentQuestionBox = questions[i];
            let selectedAnswer = currentQuestionBox.querySelector('input[type="radio"]:checked');

            if (selectedAnswer) {
                if (i < questions.length - 1) {
                    questions[i].style.display = 'none';
                    questions[i + 1].style.display = 'block';
                }
            } else {
                alert("Please select an answer before proceeding to the next question.");
            }
        });
    });
});
