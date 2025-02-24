document.addEventListener("DOMContentLoaded", function () {
        let currentQuestion = 0;
        let questions = document.querySelectorAll('.question-box');
        let nextButtons = document.querySelectorAll('.next-btn');

        nextButtons.forEach((button, index) => {
            button.addEventListener("click", function () {
                if (index < questions.length - 1) {
                    questions[index].style.display = 'none';
                    questions[index + 1].style.display = 'block';
                }
            });
        });
    });