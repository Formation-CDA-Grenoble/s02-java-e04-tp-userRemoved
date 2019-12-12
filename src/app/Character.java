package app;

class Character {

        private  int lives;
        private boolean isBig;
        private boolean isInvulnerable ;
        
        Character(int number){
            lives=number;
        }

        public  int getLives(){
            return lives;
        }

        public void  addLife (){
        lives ++;
        }
        public void loseLife(){
            lives --;
        }
        public boolean hasLives(){
            if (lives > 0){
                return true; }
            else{
            return false;
            }
        }
        
        public  boolean  getIsBig (){
            return isBig;
        }
        
        public void pickUpMushroom(){
            isBig = true;
        }
        
        public void takeHit(){
            isBig = false;
            }
        public boolean getIsInvulnerable(){
                return isInvulnerable;
            }
        public void pickUpStar(){
            isInvulnerable = true;
        }

        public void invulnerableWearsOff(){
              isInvulnerable = false; 
        }
    }
