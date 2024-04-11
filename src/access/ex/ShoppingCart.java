package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemcount;

    public void addItem(Item item){
        if (itemcount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemcount] = item;
        itemcount++;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i=0; i<itemcount;i++){
            Item item = items[i];
            System.out.println("상품명:" + item.name() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체가격 합: " + calculateTotalPrice());
    }

    public int calculateTotalPrice() {
        int totalprice = 0;
        for (int i = 0; i < itemcount; i++) {
            Item item = items[i];
            totalprice += item.getTotalPrice();
        }
        return totalprice;
    }

}
