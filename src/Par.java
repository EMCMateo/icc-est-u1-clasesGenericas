public class Par<K,V> {
    
    private K clave;
    private V valor;


    
    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }
    public Par(){}

    public K getClave() {
        return clave;
    }
    public void setClave(K clave) {
        this.clave = clave;
    }
    public V getValor() {
        return valor;
    }
    public void setValor(V valor) {
        this.valor = valor;
    }
    public void setValues(K clave, V valor) {
        this.valor = valor;
        this.clave = clave;
    }

    public String toString() {
        return clave + " " + valor;
    }

}
