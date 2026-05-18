/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */
public class FacturacionLegacy {

    private static final double DESCUENTO_VIP = 0.25;
    private static final double DESCUENTO_CLIENTE_ESTANDAR = 0.05;
    private static final double DESCUENTO_NORMAL = 0.15;

    /**
     * Calcula el total de la factura aplicando los descuentos correspondientes 
     * según el tipo de cliente y su estado de socio.
     *
     * @param importeBase El importe original de la factura antes de aplicar descuentos. Debe ser mayor que cero.
     * @param tipoCliente El identificador del tipo de cliente (1 para cliente prioritario/normal, 2 para estándar).
     * @param esSocioVip  Indica si el cliente cuenta con una membresía VIP activa.
     * @return El importe total final tras aplicar las deducciones, o 0 si el importe base no es válido.
     */
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
        // Cláusula de guarda para importes no válidos
        if (importeBase <= 0) {
            return 0;
        }

        // Casos para Tipo de Cliente 1 (Prioritario / Normal)
        if (tipoCliente == 1) {
            if (esSocioVip) {
                return importeBase - (importeBase * DESCUENTO_VIP);
            }
            return importeBase - (importeBase * DESCUENTO_NORMAL);
        }

        // Caso para Tipo de Cliente 2 (Estándar)
        if (tipoCliente == 2) {
            return importeBase - (importeBase * DESCUENTO_CLIENTE_ESTANDAR);
        }

        // Caso por defecto (sin descuentos aplicables)
        return importeBase;
    }
}