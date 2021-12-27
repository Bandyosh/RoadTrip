
public class Lives {
static int lives = 3;

public Lives() {

if (lives != 3) {
console.error("Error Handler: Changed Static Lives");
 return;
}

    console.log("You will start with " + lives + " lives if you choose the wrong int it will decrease, when your lives reach 0 you loose.\n");//Print statement of lives

    sys();

    if (lives == 2) { //checks your lives
        console.log("Lives Remaining: 2\nYou crashed and lost your legs... imagine"); //print statement if you failed to guess right number

        sys();
    }
    if (lives == 1) {//checks your lives

        console.log("Lives Remaining: 1\nYou crashed and lost your arms... Imagine.") ; //print statement if you failed to guess right number

        sys();

    }

    if (lives == 0) {//checks your lives

        console.log("You crashed and finally lost your head... Imagine."); //print statement if you failed to guess right number
    }
}

public void sys() {

    int MathRandom = (int) (Math.random() * 100);

    int userInt = zForm.Int(ANSI.YELLOW(),"Enter Random Integer 0-100; HINT: (Between " + guessLow(MathRandom) + " and " + guessHigh(MathRandom) + ")");

    if (userInt == MathRandom) {

        console.log("Congraluations, You've guessed the right number. You have reached Florida safely.");

    } else{
        lives -= 1;
        console.error("Incorrect Guess: The computer's number was: " + MathRandom);
    }
}



public int guessHigh(int MathRandom){
int hintRandom = (int) (Math.random() * 10);
int response = MathRandom + hintRandom;
if(response > 100){
 response = 100;
}
return response;

}
public int guessLow(int MathRandom){
int hintRandom = (int) (Math.random() * 10);
int response = MathRandom - hintRandom;
if(response < 0){
response = 0;
}
return response;
    }

}
