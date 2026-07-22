/*Question 1: Defeat the Monsters
Difficulty: Medium
Core Concept: Sorting + Greedy

Problem Statement:
You are playing a video game where your initial experience points are E. 
You are facing N monsters in a dungeon. To defeat the i-th monster
, you need to have at least power[i] experience points. 
If you successfully defeat the i-th monster, you receive bonus[i] experience points
, which are instantly added to your current experience. 
You can choose to fight the monsters in any order you want.

Write a program to calculate the maximum number of monsters you can defeat.
Input Format:
The first line contains two integers: N (number of monsters) and E (initial experience).
The second line contains N space-separated integers representing the power array.
The third line contains N space-separated integers representing the bonus array.

Constraints:
1 <= N <= 10^5
1 <= E, power[i], bonus[i] <= 10^9*/

import java.util.*;

public class Defeat_Monster{

    public static int monster(int NOM, long ep , int [] power , int [] bonus){
        int [][] monsters = new int [NOM][2];
        for(int i = 0 ; i < NOM ; i++){
            monsters[i][0] = power[i];
            monsters[i][1] = bonus[i]; 
        }
        Arrays.sort(monsters, (a,b) -> Integer.compare(a[0] , b[0]));
        int defeatedCount = 0 ;
        for(int i = 0 ; i < NOM; i ++){
            if(ep >= monsters[i][0]){
                ep += monsters[i][1];
                defeatedCount++;
            }
            else{
                break;
            }
        }
        return defeatedCount;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int NOM = sc.nextInt();
        long ep = sc.nextLong();

        int [] power = new int [NOM]; 
        for(int i = 0 ; i < power.length ; i++){
            power[i] = sc.nextInt();
        }
        
        int [] bonus = new int [NOM]; 
        for(int i = 0 ; i < bonus.length ; i++){
            bonus[i] = sc.nextInt();
        }

        int Defeated = monster( NOM, ep, power, bonus);
        System.out.println(Defeated);
        sc.close();
    }
}