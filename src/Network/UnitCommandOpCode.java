package Network;

/**
 * Created by Shai on 31/01/2015.
 */
public enum UnitCommandOpCode {

    MOTORAFORWARD(10),
    MOTORABACKWARD(11),
    MOTORASTOP(12),
    MOTORBFORWARD(13),
    MOTORBBACKWARD(14),
    MOTORBSTOP(15),
    MOTORAFORWARDTIMED(20),
    MOTORABACKWARDTIMED(21),
    MOTORASTOPTIMED(22),
    MOTORBFORWARDTIMED(23),
    MOTORBBACKWARDTIMED(24),
    MOTORBSTOPTIMED(25),
    MOVEFORWARD(100),
    MOVEBACKWARD(101),
    MOVEFORWARDTIMED(102),
    MOVEBACKWARDTIMED(103),
    ROTATELEFT(104),
    ROTATERIGHT(105),
    ROTATELEFTTIMED(106),
    ROTATERIGHTTIMED(107),
    ROTATELEFTDEGREES(108),
    ROTATERIGHTDEGREES(109),
    MOVESTOP(110)
    ;
    private final int UnitCommandOpCodeCode;

    UnitCommandOpCode(int UnitCommandOpCodeCode) {
        this.UnitCommandOpCodeCode = UnitCommandOpCodeCode;
    }

    public int getUnitCommandOpCodeCode() {
        return this.UnitCommandOpCodeCode;
    }

}
