/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.indra_prasnikar.springtest2;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author robert
 */
@Entity
@Table(name = "orderTab")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MyOrder.findAll", query = "SELECT m FROM MyOrder m"),
    @NamedQuery(name = "MyOrder.findByOrderid", query = "SELECT m FROM MyOrder m WHERE m.orderid = :orderid"),
    @NamedQuery(name = "MyOrder.findByOrderdate", query = "SELECT m FROM MyOrder m WHERE m.orderdate = :orderdate"),
    @NamedQuery(name = "MyOrder.findByCountry", query = "SELECT m FROM MyOrder m WHERE m.country = :country")})
public class MyOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "orderid")
    private Short orderid;
    @Basic(optional = false)
    @Column(name = "orderdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderdate;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;

    public MyOrder() {
    }

    public MyOrder(Short orderid) {
        this.orderid = orderid;
    }

    public MyOrder(Short orderid, Date orderdate, String country) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.country = country;
    }

    public Short getOrderid() {
        return orderid;
    }

    public void setOrderid(Short orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderid != null ? orderid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MyOrder)) {
            return false;
        }
        MyOrder other = (MyOrder) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "at.indra_prasnikar.springtest2.MyOrder[ orderid=" + orderid + " ]";
    }
    
}
