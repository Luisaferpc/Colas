public class objFastFood{
    int NumOrden;
    String TipoFood;
    Double Price;
    int Cant;
    
    public objFastFood(objFastFood o) {
        this.NumOrden = o.NumOrden;
        this.TipoFood = o.TipoFood;
        this.Price = o.Price;
        this.Cant = o.Cant;
    } // Este constructor lleno se puede usar para 
    public objFastFood() {
    }
    public int getNumOrden() {
        return NumOrden;
    }
    public void setNumOrden(int numOrden) {
        NumOrden = numOrden;
    }
    public String getTipoFood() {
        return TipoFood;
    }
    public void setTipoFood(String tipoFood) {
        TipoFood = tipoFood;
    }
    public Double getPrice() {
        return Price;
    }
    public void setPrice(Double price) {
        Price = price;
    }
    public int getCant() {
        return Cant;
    }
    public void setCant(int cant) {
        Cant = cant;
    }
    
}