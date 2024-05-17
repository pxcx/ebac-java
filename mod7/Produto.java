/**
 * Classe Produto que representa um produto com nome, preço de custo, alíquota de imposto e margem de lucro.
 * @author Paulo Cézar Rocha
 */
public class Produto {
    private String nome;
    private double precoCusto;
    private double aliquotaImposto;
    private double margemLucro;

    /**
     * Construtor da classe Produto.
     *
     * @param nome Nome do produto.
     * @param precoCusto Custo do produto.
     * @param aliquotaImposto Alíquota de imposto do produto.
     * @param margemLucro Margem de lucro do produto.
     */
    public Produto(String nome, double precoCusto, double aliquotaImposto, double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.aliquotaImposto = aliquotaImposto;
        this.margemLucro = margemLucro;
    }

    /**
     * Calcula e retorna o preço de venda do produto.
     *
     * @return Preço de venda do produto.
     */
    public double getPrecoVenda() {
        return precoCusto + getValorImposto() + getLucro();
    }

    /**
     * Calcula e retorna o valor do imposto do produto.
     *
     * @return Valor do imposto do produto.
     */
    public double getValorImposto() {
        return precoCusto * aliquotaImposto;
    }

    /**
     * Calcula e retorna o valor do lucro sobre o produto.
     *
     * @return Valor do lucro sobre o produto.
     */
    public double getLucro() {
        return precoCusto * margemLucro;
    }

    /**
     * Retorna o nome do produto.
     *
     * @return Nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome Nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o custo do produto.
     *
     * @return Custo do produto.
     */
    public double getPrecoCusto() {
        return precoCusto;
    }

    /**
     * Define o custo do produto.
     *
     * @param precoCusto Custo do produto.
     */
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    /**
     * Retorna a alíquota de imposto do produto.
     *
     * @return Alíquota de imposto do produto.
     */
    public double getAliquotaImposto() {
        return aliquotaImposto;
    }

    /**
     * Define a alíquota de imposto do produto.
     *
     * @param aliquotaImposto Alíquota de imposto do produto.
     */
    public void setAliquotaImposto(double aliquotaImposto) {
        this.aliquotaImposto = aliquotaImposto;
    }

    /**
     * Retorna a margem de lucro do produto.
     *
     * @return Margem de lucro do produto.
     */
    public double getMargemLucro() {
        return margemLucro;
    }

    /**
     * Define a margem de lucro do produto.
     *
     * @param margemLucro Margem de lucro do produto.
     */
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
}