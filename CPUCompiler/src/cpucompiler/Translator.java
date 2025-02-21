/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpucompiler;

/**
 *
 * @author Hakim
 */
public class Translator {

    Translator() {
    }

    public String BinToHex(int bin) {
        String newBin = bin + "";
        switch (bin) {
            case 0:
                newBin = "0";
                break;
            case 1:
                newBin = "1";
                break;
            case 10:
                newBin = "2";
                break;
            case 11:
                newBin = "3";
                break;
            case 100:
                newBin = "4";
                break;
            case 101:
                newBin = "5";
                break;
            case 110:
                newBin = "6";
                break;
            case 111:
                newBin = "7";
                break;
            case 1000:
                newBin = "8";
                break;
            case 1001:
                newBin = "9";
                break;
            case 1010:
                newBin = "A";
                break;
            case 1011:
                newBin = "B";
                break;
            case 1100:
                newBin = "C";
                break;
            case 1101:
                newBin = "D";
                break;
            case 1110:
                newBin = "E";
                break;
            case 1111:
                newBin = "F";
                break;
        }
        return newBin;
    }

    public String DecToBin(String dec) {
        String newBin = "";
        switch (dec) {
            case "0":
                newBin = "000";
                break;
            case "1":
                newBin = "001";
                break;
            case "2":
                newBin = "010";
                break;
            case "3":
                newBin = "011";
                break;
            case "4":
                newBin = "100";
                break;
            case "5":
                newBin = "101";
                break;
            case "6":
                newBin = "110";
                break;
            case "7":
                newBin = "111";
                break;
        }
        return newBin;
    }

    public String RegCode(String reg) {
        String newBin = "";
        switch (reg) {
            case "A":
                newBin = "000";
                break;
            case "L":
                newBin = "001";
                break;
            case "H":
                newBin = "010";
                break;
            case "B":
                newBin = "011";
                break;
            case "C":
                newBin = "100";
                break;
            case "D":
                newBin = "101";
                break;
            case "E":
                newBin = "110";
                break;
        }
        return newBin;
    }
    
    public String RegCode2(String reg){
        String newBin = "";
        switch (reg) {
            case "A":
                newBin = "001";
                break;
            case "L":
                newBin = "010";
                break;
            case "H":
                newBin = "011";
                break;
            case "B":
                newBin = "100";
                break;
            case "C":
                newBin = "101";
                break;
            case "D":
                newBin = "110";
                break;
            case "E":
                newBin = "111";
                break;
        }
        return newBin;
    }

    public String RegPairCode(String rp) {
        String newBin = "";
        switch (rp) {
            case "H-L":
                newBin = "001";
                break;
            case "B-C":
                newBin = "010";
                break;
            case "D-E":
                newBin = "011";
                break;
        }
        return newBin;
    }
}
