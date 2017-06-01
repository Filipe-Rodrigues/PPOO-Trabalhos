/**
 * Classe que representa um Carro.
 * Carro herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * E acrescenta se o carro é flex ou comum (em relacao ao combustivel).
 * 
 * @author Julio Cesar Alves 
 * @version 2016-09-16
 */
public class Carro extends Veiculo {
    // definimos apenas os atributos que sao especificos do carro
    private boolean ehFlex;

    /**
     * Controi objeto da classe Carro a partir dos parametros passados
     * Obs: a velocidade inicial do carro eh definida na classe Veiculo
     * 
     * @param modelo Modelo do carro a ser criado.
     * @param marca Marca do carro a ser criado.
     * @param placa Placa do carro a ser criado.
     * @param ehFlex Indica se o carro eh flex ou nao (em relacao ao combustivel)
     */
    public Carro(String modelo, String marca, String placa, boolean ehFlex) {
        super(modelo, marca, placa);
        this.ehFlex = ehFlex;
    }

    /**
     * Retorna se o carro eh flex ou nao (em relacao ao combustivel)
	 *
	 * @return Indicacao se o carro eh flex ou nao
     */
    public boolean getEhFlex() {
        return ehFlex;
    }
    
     /**
     * Calcula o valor do imposto do veículo:
	 * 
	 * @return Retorna o imposto em reais
     */
    @Override
    public double getImposto() {
        double imposto = impostoBase;
        if (ehFlex) {
            imposto *= 0.9d;
        } else {
            imposto *= 1.05d;
        }
        return imposto;
    }
    
        /**
     * Retorna a descricao do carro no formato:
     *  Placa   Modelo  Marca   Velocidade km/h     Flex (ou Comum)
	 * 
	 * @return A descricao do carro (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    @Override
    public String getDescricaoVeiculo() {
        String descricao = super.getDescricaoVeiculo();
        if (ehFlex) {
            descricao = descricao + "\tFlex";
        }
        else {
            descricao = descricao + "\tComum";
        }
        return descricao;
    }
}
