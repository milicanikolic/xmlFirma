
package generisani;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for stavkaPreseka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stavkaPreseka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duznik" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svrhaPlacanja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primalac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datumNaloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="datumValute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="racunDuznika" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelZaduzenja" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="pozivNaBrZaduzenja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="racunPrimaoca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelOdobrenja" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="pozivNaBrOdobrenja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iznos" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="smer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stavkaPreseka", namespace = "http://ftn.uns.ac.rs/presek", propOrder = {
    "duznik",
    "svrhaPlacanja",
    "primalac",
    "datumNaloga",
    "datumValute",
    "racunDuznika",
    "modelZaduzenja",
    "pozivNaBrZaduzenja",
    "racunPrimaoca",
    "modelOdobrenja",
    "pozivNaBrOdobrenja",
    "iznos",
    "smer"
})
public class StavkaPreseka {

    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected String duznik;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected String svrhaPlacanja;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected String primalac;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNaloga;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumValute;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected String racunDuznika;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected BigInteger modelZaduzenja;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected String pozivNaBrZaduzenja;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected String racunPrimaoca;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected BigInteger modelOdobrenja;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected String pozivNaBrOdobrenja;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected BigDecimal iznos;
    @XmlElement(namespace = "http://ftn.uns.ac.rs/presek", required = true)
    protected String smer;

    /**
     * Gets the value of the duznik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuznik() {
        return duznik;
    }

    /**
     * Sets the value of the duznik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuznik(String value) {
        this.duznik = value;
    }

    /**
     * Gets the value of the svrhaPlacanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrhaPlacanja() {
        return svrhaPlacanja;
    }

    /**
     * Sets the value of the svrhaPlacanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrhaPlacanja(String value) {
        this.svrhaPlacanja = value;
    }

    /**
     * Gets the value of the primalac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimalac() {
        return primalac;
    }

    /**
     * Sets the value of the primalac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimalac(String value) {
        this.primalac = value;
    }

    /**
     * Gets the value of the datumNaloga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNaloga() {
        return datumNaloga;
    }

    /**
     * Sets the value of the datumNaloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNaloga(XMLGregorianCalendar value) {
        this.datumNaloga = value;
    }

    /**
     * Gets the value of the datumValute property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumValute() {
        return datumValute;
    }

    /**
     * Sets the value of the datumValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumValute(XMLGregorianCalendar value) {
        this.datumValute = value;
    }

    /**
     * Gets the value of the racunDuznika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacunDuznika() {
        return racunDuznika;
    }

    /**
     * Sets the value of the racunDuznika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacunDuznika(String value) {
        this.racunDuznika = value;
    }

    /**
     * Gets the value of the modelZaduzenja property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModelZaduzenja() {
        return modelZaduzenja;
    }

    /**
     * Sets the value of the modelZaduzenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModelZaduzenja(BigInteger value) {
        this.modelZaduzenja = value;
    }

    /**
     * Gets the value of the pozivNaBrZaduzenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozivNaBrZaduzenja() {
        return pozivNaBrZaduzenja;
    }

    /**
     * Sets the value of the pozivNaBrZaduzenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozivNaBrZaduzenja(String value) {
        this.pozivNaBrZaduzenja = value;
    }

    /**
     * Gets the value of the racunPrimaoca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacunPrimaoca() {
        return racunPrimaoca;
    }

    /**
     * Sets the value of the racunPrimaoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacunPrimaoca(String value) {
        this.racunPrimaoca = value;
    }

    /**
     * Gets the value of the modelOdobrenja property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModelOdobrenja() {
        return modelOdobrenja;
    }

    /**
     * Sets the value of the modelOdobrenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModelOdobrenja(BigInteger value) {
        this.modelOdobrenja = value;
    }

    /**
     * Gets the value of the pozivNaBrOdobrenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozivNaBrOdobrenja() {
        return pozivNaBrOdobrenja;
    }

    /**
     * Sets the value of the pozivNaBrOdobrenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozivNaBrOdobrenja(String value) {
        this.pozivNaBrOdobrenja = value;
    }

    /**
     * Gets the value of the iznos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIznos(BigDecimal value) {
        this.iznos = value;
    }

    /**
     * Gets the value of the smer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmer() {
        return smer;
    }

    /**
     * Sets the value of the smer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmer(String value) {
        this.smer = value;
    }

}
