package mx.model;

import java.math.BigDecimal;

public class Factura implements java.io.Serializable {

    private int id;
    private String factura;
    private String fecha;
    private String folio;
    private String serie;
    private String versioncfdi;
    private BigDecimal importe;
    private BigDecimal total;
    private BigDecimal tipoCambio;
    private String moneda;
    private String metodoPago;
    private String tipoComprobante;
    private String lugarExpedicion;
    private String certificado;
    private String noCertificado;
    private String formaPago;
    private String sello;
    private String nombreE;
    private String rfcE;
    private String regimenFiscal;
    private String nombreR;
    private String rfcR;
    private String usoCfdi;
    private String impuesto;
    private String tipoFactor;
    private String tasaCouta;
    private BigDecimal importeCouta;
    private String referencia;
    private String fechaRecepcion;
    private String fechaPago;
    private String estatus;
    private String calle;
    private String colonia;
    private String estado;
    private String municipio;
    private String pais;
    private String comentario;
    private String comentarioProveedor;
    private String estatusSat;
    private String versioncfd;
    private String uuid;
    private String fechaTimbrado;
    private String rfcProvCert;
    private String selloCfd;
    private String selloSat;
    private String wcxp;
    private String enviado;
    private Integer foliowcxp;
    private String claveProv;
    private String nombreArchivo;
    private String noCertificadoSat;
    private String condicionesPago;
    private String estatusCom;
    private String uuidrel;

    public Factura() {
    }

    public Factura(int id) {
        this.id = id;
    }

    public Factura(int id, String factura, String fecha, String folio, String serie, String versioncfdi, BigDecimal importe, BigDecimal total, BigDecimal tipoCambio, String moneda, String metodoPago, String tipoComprobante, String lugarExpedicion, String certificado, String noCertificado, String formaPago, String sello, String nombreE, String rfcE, String regimenFiscal, String nombreR, String rfcR, String usoCfdi, String impuesto, String tipoFactor, String tasaCouta, BigDecimal importeCouta, String referencia, String fechaRecepcion, String fechaPago, String estatus, String calle, String colonia, String estado, String municipio, String pais, String comentario, String comentarioProveedor, String estatusSat, String versioncfd, String uuid, String fechaTimbrado, String rfcProvCert, String selloCfd, String selloSat, String wcxp, String enviado, Integer foliowcxp, String claveProv, String nombreArchivo, String noCertificadoSat, String condicionesPago, String estatusCom, String uuidrel) {
        this.id = id;
        this.factura = factura;
        this.fecha = fecha;
        this.folio = folio;
        this.serie = serie;
        this.versioncfdi = versioncfdi;
        this.importe = importe;
        this.total = total;
        this.tipoCambio = tipoCambio;
        this.moneda = moneda;
        this.metodoPago = metodoPago;
        this.tipoComprobante = tipoComprobante;
        this.lugarExpedicion = lugarExpedicion;
        this.certificado = certificado;
        this.noCertificado = noCertificado;
        this.formaPago = formaPago;
        this.sello = sello;
        this.nombreE = nombreE;
        this.rfcE = rfcE;
        this.regimenFiscal = regimenFiscal;
        this.nombreR = nombreR;
        this.rfcR = rfcR;
        this.usoCfdi = usoCfdi;
        this.impuesto = impuesto;
        this.tipoFactor = tipoFactor;
        this.tasaCouta = tasaCouta;
        this.importeCouta = importeCouta;
        this.referencia = referencia;
        this.fechaRecepcion = fechaRecepcion;
        this.fechaPago = fechaPago;
        this.estatus = estatus;
        this.calle = calle;
        this.colonia = colonia;
        this.estado = estado;
        this.municipio = municipio;
        this.pais = pais;
        this.comentario = comentario;
        this.comentarioProveedor = comentarioProveedor;
        this.estatusSat = estatusSat;
        this.versioncfd = versioncfd;
        this.uuid = uuid;
        this.fechaTimbrado = fechaTimbrado;
        this.rfcProvCert = rfcProvCert;
        this.selloCfd = selloCfd;
        this.selloSat = selloSat;
        this.wcxp = wcxp;
        this.enviado = enviado;
        this.foliowcxp = foliowcxp;
        this.claveProv = claveProv;
        this.nombreArchivo = nombreArchivo;
        this.noCertificadoSat = noCertificadoSat;
        this.condicionesPago = condicionesPago;
        this.estatusCom = estatusCom;
        this.uuidrel = uuidrel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getVersioncfdi() {
        return versioncfdi;
    }

    public void setVersioncfdi(String versioncfdi) {
        this.versioncfdi = versioncfdi;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getNoCertificado() {
        return noCertificado;
    }

    public void setNoCertificado(String noCertificado) {
        this.noCertificado = noCertificado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getRfcE() {
        return rfcE;
    }

    public void setRfcE(String rfcE) {
        this.rfcE = rfcE;
    }

    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    public void setRegimenFiscal(String regimenFiscal) {
        this.regimenFiscal = regimenFiscal;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getRfcR() {
        return rfcR;
    }

    public void setRfcR(String rfcR) {
        this.rfcR = rfcR;
    }

    public String getUsoCfdi() {
        return usoCfdi;
    }

    public void setUsoCfdi(String usoCfdi) {
        this.usoCfdi = usoCfdi;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public String getTipoFactor() {
        return tipoFactor;
    }

    public void setTipoFactor(String tipoFactor) {
        this.tipoFactor = tipoFactor;
    }

    public String getTasaCouta() {
        return tasaCouta;
    }

    public void setTasaCouta(String tasaCouta) {
        this.tasaCouta = tasaCouta;
    }

    public BigDecimal getImporteCouta() {
        return importeCouta;
    }

    public void setImporteCouta(BigDecimal importeCouta) {
        this.importeCouta = importeCouta;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(String fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComentarioProveedor() {
        return comentarioProveedor;
    }

    public void setComentarioProveedor(String comentarioProveedor) {
        this.comentarioProveedor = comentarioProveedor;
    }

    public String getEstatusSat() {
        return estatusSat;
    }

    public void setEstatusSat(String estatusSat) {
        this.estatusSat = estatusSat;
    }

    public String getVersioncfd() {
        return versioncfd;
    }

    public void setVersioncfd(String versioncfd) {
        this.versioncfd = versioncfd;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFechaTimbrado() {
        return fechaTimbrado;
    }

    public void setFechaTimbrado(String fechaTimbrado) {
        this.fechaTimbrado = fechaTimbrado;
    }

    public String getRfcProvCert() {
        return rfcProvCert;
    }

    public void setRfcProvCert(String rfcProvCert) {
        this.rfcProvCert = rfcProvCert;
    }

    public String getSelloCfd() {
        return selloCfd;
    }

    public void setSelloCfd(String selloCfd) {
        this.selloCfd = selloCfd;
    }

    public String getSelloSat() {
        return selloSat;
    }

    public void setSelloSat(String selloSat) {
        this.selloSat = selloSat;
    }

    public String getWcxp() {
        return wcxp;
    }

    public void setWcxp(String wcxp) {
        this.wcxp = wcxp;
    }

    public String getEnviado() {
        return enviado;
    }

    public void setEnviado(String enviado) {
        this.enviado = enviado;
    }

    public Integer getFoliowcxp() {
        return foliowcxp;
    }

    public void setFoliowcxp(Integer foliowcxp) {
        this.foliowcxp = foliowcxp;
    }

    public String getClaveProv() {
        return claveProv;
    }

    public void setClaveProv(String claveProv) {
        this.claveProv = claveProv;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNoCertificadoSat() {
        return noCertificadoSat;
    }

    public void setNoCertificadoSat(String noCertificadoSat) {
        this.noCertificadoSat = noCertificadoSat;
    }

    public String getCondicionesPago() {
        return condicionesPago;
    }

    public void setCondicionesPago(String condicionesPago) {
        this.condicionesPago = condicionesPago;
    }

    public String getEstatusCom() {
        return estatusCom;
    }

    public void setEstatusCom(String estatusCom) {
        this.estatusCom = estatusCom;
    }

    public String getUuidrel() {
        return uuidrel;
    }

    public void setUuidrel(String uuidrel) {
        this.uuidrel = uuidrel;
    }

}
