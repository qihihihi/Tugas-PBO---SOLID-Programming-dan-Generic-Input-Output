// T = tipe nama, U = tipe harga, V = tipe stok
public class Produk<T, U, V> {
    private T nama;
    private U harga;
    private V stok;

    public Produk(T nama, U harga, V stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public T getNama()  { return nama; }
    public U getHarga() { return harga; }
    public V getStok()  { return stok; }

    @Override
    public String toString() {
        return nama + "," + harga + "," + stok;
    }
}
