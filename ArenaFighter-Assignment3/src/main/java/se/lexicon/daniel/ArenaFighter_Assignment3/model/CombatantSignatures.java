package se.lexicon.daniel.ArenaFighter_Assignment3.model;

import java.util.List;

/**
 * Created by Daniel Henriksen.
 */

public interface CombatantSignatures {
	
    String getName();
	
    // Health related signatures
    int getHealth();
    int increaseHealth(int additionalHealth);
    int decreaseHealth(int opponentAttackPower);
    
    // Gain level
    int gainLevel(int level);
    int getMeleeAttack();
    int getMeleeDamage();
    int getMeleeDamageReduction();
    int getDodgeAttack();
    int getInitiative();
	
    // set armor and weapon grade
    int setArmor(int grade);
    int getArmor();
	int setWeapon(int grade);
    int getWeapon();
    
    // History 
    List setHistory(String string);
	
	// Get attributes
    int getStrenght();
    int getAgility();
    int getConstitution();
    int getCharisma();
    int getPerception();
    int getWill();
    
	// Gain attributes
    int gainStrenght(int i);
    int gainAgility(int i);
    int gainConstitution(int i);
    int gainCharisma(int i);
    int gainPerception(int i);
    int gainWill(int i);
    
    // set attributes
    void setStrenght(int i);
    void setAgility(int i);
    void setConstitution(int i);
    void setCharisma(int i);
    void setPerception(int i);
    void setWill(int i);

	void addHistory(String string);

	int getTurns();

}
