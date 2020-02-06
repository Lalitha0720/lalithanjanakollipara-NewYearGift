package NewYearGift;

abstract class Sweets {
    Chocolates chocolate;
    OtherSweets otherSweets;
    abstract int getWeight();
    public Chocolates getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolates chocolate) {
        this.chocolate = chocolate;
    }

    public OtherSweets getOtherSweets() {
        return otherSweets;
    }

    public void setOtherSweets(OtherSweets otherSweets) {
        this.otherSweets = otherSweets;
    }
}