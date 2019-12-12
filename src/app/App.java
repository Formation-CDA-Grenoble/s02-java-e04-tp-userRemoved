package app;

import app.Character;

public class App {

    private static boolean isEqual(Object value1, Object value2) {
        return value1 == value2;
    }
     private  static  void test(String call, Object actualValue, Object expectedValue ){
        
            String message = "L'appel  " + call + "  renvoie: " + String.valueOf(actualValue) + ". (valeur attendue: " + expectedValue + ")  ";
                 if (isEqual(actualValue, expectedValue)) {
                message += "C'est bon! ☑️";
                 } else {
                message += "Encore un coup des Illuminati... ❔";
                }
                System.out.println(message);
        }
        
        
        private static Character createCharacter() {
            System.out.println("Créons Mario avec 3 vies...");
            return new Character(3);
        }   

            
        
        
    public static void main(String[] args) throws Exception {
    
        Character mario; 
        mario = createCharacter();
        test("mario.getLives()", mario.getLives(), 3);
        mario = createCharacter();
        System.out.println("Ajoutons une vie à Mario...");
        mario.addLife();
        test("mario.getLives()", mario.getLives(), 4);
        test("mario.hasLives()", mario.hasLives(), true);
        System.out.println("Puis faisons-lui en perdre une...");
        mario.loseLife();
        test("mario.getLives()", mario.getLives(), 3);
        test("mario.hasLives()", mario.hasLives(), true);
        System.out.println("Maintenant, on lui en prend 3...");
        mario.loseLife();
        mario.loseLife();
        mario.loseLife();
        test("mario.getLives()", mario.getLives(), 0);
        test("mario.hasLives()", mario.hasLives(), false);      
        mario = createCharacter();
        test("mario.getIsBig()", mario.getIsBig(), false);
        System.out.println("Mario ramasse un champignon...");
        mario.pickUpMushroom();
        test("mario.getIsBig()", mario.getIsBig(), true);
        System.out.println("Mario ramasse un autre champignon...");
        mario.pickUpMushroom();
        test("mario.getIsBig()", mario.getIsBig(), true);
        System.out.println("Mario prend un coup...");
        mario.takeHit();
        test("mario.getIsBig()", mario.getIsBig(), false);
        System.out.println("Mario prend un autre coup...");
        mario.takeHit();
        test("mario.getIsBig()", mario.getIsBig(), false);
        test("mario.getLives()", mario.getLives(), 2);
        mario = createCharacter();
        test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), false);
        System.out.println("Mario ramasse une étoile...");
        mario.pickUpStar();
        test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), true);
        System.out.println("Mario prend un coup...");
        mario.takeHit();
        test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), true);
        test("mario.getLives()", mario.getLives(), 3);
        System.out.println("L'effet de l'étoile se dissipe...");
        mario.invulnerableWearsOff();
        test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), false);
        System.out.println("Mario prend un coup...");
        mario.takeHit();
        test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), false);
        test("mario.getLives()", mario.getLives(), 2);
    }


        /*
        * 1. Dieu créa Mario
        * =====================================================================
        * Décommente le code ci-dessous lorsque tu atteins cette partie
        */
        // mario = createCharacter();
        // test("mario.getLives()", mario.getLives(), 3);



        /*
        * 2. C'est la vie
        * =====================================================================
        * Décommente le code ci-dessous lorsque tu atteins cette partie
        */
        // mario = createCharacter();
        // System.out.println("Ajoutons une vie à Mario...");
        // mario.addLife();
        // test("mario.getLives()", mario.getLives(), 4);
        // test("mario.hasLives()", mario.hasLives(), true);
        // System.out.println("Puis faisons-lui en perdre une...");
        // mario.loseLife();
        // test("mario.getLives()", mario.getLives(), 3);
        // test("mario.hasLives()", mario.hasLives(), true);
        // System.out.println("Maintenant, on lui en prend 3...");
        // mario.loseLife();
        // mario.loseLife();
        // mario.loseLife();
        // test("mario.getLives()", mario.getLives(), 0);
        // test("mario.hasLives()", mario.hasLives(), false);



        /*
        * 3. Petit Mario deviendra grand
        * =====================================================================
        * Décommente le code ci-dessous lorsque tu atteins cette partie
        */
        // mario = createCharacter();
        // test("mario.getIsBig()", mario.getIsBig(), false);
        // System.out.println("Mario ramasse un champignon...");
        // mario.pickUpMushroom();
        // test("mario.getIsBig()", mario.getIsBig(), true);
        // System.out.println("Mario ramasse un autre champignon...");
        // mario.pickUpMushroom();
        // test("mario.getIsBig()", mario.getIsBig(), true);
        // System.out.println("Mario prend un coup...");
        // mario.takeHit();
        // test("mario.getIsBig()", mario.getIsBig(), false);
        // System.out.println("Mario prend un autre coup...");
        // mario.takeHit();
        // test("mario.getIsBig()", mario.getIsBig(), false);
        // test("mario.getLives()", mario.getLives(), 2);



        /*
        * 4. La tête dans les étoiles
        * =====================================================================
        * Décommente le code ci-dessous lorsque tu atteins cette partie
        */
        // mario = createCharacter();
        // test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), false);
        // System.out.println("Mario ramasse une étoile...");
        // mario.pickUpStar();
        // test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), true);
        // System.out.println("Mario prend un coup...");
        // mario.takeHit();
        // test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), true);
        // test("mario.getLives()", mario.getLives(), 3);
        // System.out.println("L'effet de l'étoile se dissipe...");
        // mario.invulnerableWearsOff();
        // test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), false);
        // System.out.println("Mario prend un coup...");
        // mario.takeHit();
        // test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), false);
        // test("mario.getLives()", mario.getLives(), 2);
    }
