/* Parte 1 : Preguntas adicionales */

const questions = [
    {
        question: "¿Cuál es el resultado de multiplicar 7 x 8 y luego restarle 6?",
        options: [
            "56",
            "50",
            "42"
        ],
        correct: 1
    },
    {
        question: "¿En el mundo de los videojuegos, ¿cuál es el nombre del hermano de Mario Bros?",
        options: [
            "Luigi",
            "Bowser",
            "Princess Peach"
        ],
        correct: 0
    },
    {
        question: "¿Cuántas cuerdas tiene generalmente una guitarra acústica estándar?",
        options: [
            "4",
            "6",
            "8"
        ],
        correct: 1
    },
    {
        question: "¿En qué deporte se utiliza el término 'Home Run'?",
        options: [
            "Béisbol",
            "Fútbol",
            "Baloncesto"
        ],
        correct: 0
    },
    {
        question: "Si tienes 3 manzanas y compras otras 12, pero decides regalar la mitad a un amigo, ¿cuántas te quedan?",
        options: [
            "7.5",
            "8",
            "9"
        ],
        correct: 0
    },

    {
        question: "¿Cuál es el instrumento principal que toca el famoso personaje Bob Esponja?",
        options: [
            "Ukelele",
            "Clarinete",
            "Bateria"
        ],
        correct: 0
    },
    {
        question: "¿Qué color de cinturón representa el nivel más alto (maestro) en la mayoría de las artes marciales?",
        options: [
            "Negro",
            "Blanco",
            "Rojo"
        ],
        correct: 0
    },
    {
        question: "¿Cómo se llama el bloque largo y recto en el juego Tetris?",
        options: [
            "|-block",
            "Square",
            "L-block"
        ],
        correct: 0
    },
    {
        question: "Si un partido de fútbol dura $90$ minutos y se añaden $5$ minutos de descuento, ¿cuántos segundos dura el partido en total?",
        options: [
            "5700",
            "5400",
            "5100"
        ],
        correct: 0
    },
    {
        question: "¿Qué cantante es conocido como el 'Rey del Pop'?",
        options: [
            "Elvis Presley",
            "Michael Jackson",
            "Prince"
        ],
        correct: 1
    }
];


// VARIABLES GLOBALES


let currentQuestionIndex = 0;
let score = 0;
let playerName = '';
let userAnswers = [];


// Parte 2: Selectores del DOM correctos 

// Pantallas
const startScreen = document.getElementById('startScreen');
const quizScreen = document.getElementById('quizScreen');
const resultScreen = document.getElementById('resultScreen');

// Elementos de la pantalla de inicio
const playerNameInput = document.getElementById('playerName');
const startBtn = document.getElementById('startBtn');

// Elementos de la pantalla del quiz
const progressBar = document.getElementById('progressBar');
const currentQSpan = document.getElementById('currentQ');
const totalQSpan = document.getElementById('totalQ');
const questionElement = document.getElementById('question');
const optionsContainer = document.getElementById('options');
const feedbackElement = document.getElementById('feedback');

// Elementos de la pantalla de resultados
const playerResultElement = document.getElementById('playerResult');
const scoreTextElement = document.getElementById('scoreText');
const scoreMessageElement = document.getElementById('scoreMessage');
const summaryContainer = document.getElementById('summary');
const restartBtn = document.getElementById('restartBtn');


// FUNCIONES 

/**
 * Parte 3: Función showScreen funcional
 */
const showScreen = (screenToShow) => {
    startScreen.classList.add('hidden');
    quizScreen.classList.add('hidden');
    resultScreen.classList.add('hidden');
    screenToShow.classList.remove('hidden');
};

/**
 * Parte 4: Barra de progreso actualiza correctamente
 */
const updateProgressBar = () => {
    const percentage = (currentQuestionIndex / questions.length) * 100;
    progressBar.style.width = percentage + '%';
};


// FUNCIONES PRINCIPALES DEL QUIZ


/**
 * Parte 5: startQuiz valida y prepara el quiz
 */
const startQuiz = () => {
    playerName = playerNameInput.value.trim();

    if (playerName === '') {
        alert('Por favor, ingresa tu nombre para comenzar.');
        return;
    }

    currentQuestionIndex = 0;
    score = 0;
    userAnswers = [];

    totalQSpan.textContent = questions.length;

    showScreen(quizScreen);
    showQuestion();
};

/**
 * Parte 6: showQuestion muestra pregunta y opciones
 */
const showQuestion = () => {
    const currentQuestion = questions[currentQuestionIndex];

    currentQSpan.textContent = currentQuestionIndex + 1;
    questionElement.textContent = currentQuestion.question;

    updateProgressBar();

    optionsContainer.innerHTML = '';
    feedbackElement.classList.add('hidden');

    currentQuestion.options.forEach((option, index) => {
        const button = document.createElement('button');
        button.classList.add('option-btn');
        button.textContent = option;
        button.dataset.index = index;
        button.addEventListener('click', () => checkAnswer(index));
        optionsContainer.appendChild(button);
    });
};

/**
 * Parte 7: checkAnswer verifica y muestra feedback
 */
const checkAnswer = (selectedIndex) => {
    const currentQuestion = questions[currentQuestionIndex];
    const isCorrect = selectedIndex === currentQuestion.correct;

    if (isCorrect) {
        score++;
    }

    userAnswers.push({
        question: currentQuestion.question,
        selectedAnswer: currentQuestion.options[selectedIndex],
        correctAnswer: currentQuestion.options[currentQuestion.correct],
        isCorrect: isCorrect
    });

    feedbackElement.classList.remove('hidden');
    if (isCorrect) {
        feedbackElement.classList.add('correct');
        feedbackElement.classList.remove('incorrect');
        feedbackElement.textContent = '¡Correcto! 😊';
    } else {
        feedbackElement.classList.add('incorrect');
        feedbackElement.classList.remove('correct');
        feedbackElement.textContent = 'Incorrecto 😞';
    }

    const allButtons = document.querySelectorAll('.option-btn');
    allButtons.forEach((button, index) => {
        button.disabled = true;
        if (index === currentQuestion.correct) {
            button.classList.add('correct');
        } else if (index === selectedIndex && !isCorrect) {
            button.classList.add('incorrect');
        }
    });

    setTimeout(() => {
        currentQuestionIndex++;
        if (currentQuestionIndex < questions.length) {
            showQuestion();
        } else {
            showResults();
        }
    }, 1500);
};

/**
 * Parte 8: showResults muestra puntaje y resumen
 */
const showResults = () => {
    showScreen(resultScreen);

    playerResultElement.textContent = `¡Buen trabajo, ${playerName}!`;
    scoreTextElement.textContent = `${score}/${questions.length}`;

    const percentage = (score / questions.length) * 100;
    if (percentage > 80) {
        scoreMessageElement.textContent = '¡Perfecto! Eres el mejor 🎉';
    } else if (percentage > 50) {
        scoreMessageElement.textContent = '¡Muy bien! Todavia puedes ser el mejor 👍';
    } else {
        scoreMessageElement.textContent = 'Necesitas repasar un poco más 📚';
    }

    summaryContainer.innerHTML = '';
    userAnswers.forEach((answer) => {
        const div = document.createElement('div');
        div.classList.add('summary-item');
        div.classList.add(answer.isCorrect ? 'correct' : 'incorrect');
        div.innerHTML = `
            <p class="question-text">${answer.question}</p>
            <p class="answer-text">Tu respuesta: ${answer.selectedAnswer}</p>
            <p class="answer-text">Respuesta correcta: ${answer.correctAnswer}</p>
        `;
        summaryContainer.appendChild(div);
    });
};

/**
 * Parte 9: restartQuiz reinicia correctamente
 */
const restartQuiz = () => {
    playerNameInput.value = '';
    showScreen(startScreen);
};



// Parte 10: Event listeners funcionando


startBtn.addEventListener('click', startQuiz);

restartBtn.addEventListener('click', restartQuiz);

/* Tecla enter para iniciar el quiz */
playerNameInput.addEventListener('keypress', (event) => {
    if (event.key === 'Enter') {
        startQuiz();
    }
});



// INICIALIZACIÓN

showScreen(startScreen);