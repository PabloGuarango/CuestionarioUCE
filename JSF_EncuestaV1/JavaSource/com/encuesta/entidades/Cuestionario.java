package com.encuesta.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the cuestionario database table.
 * 
 */
@Entity
@NamedQuery(name="Cuestionario.findAll", query="SELECT c FROM Cuestionario c")
public class Cuestionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_serial")
	private Integer idSerial;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_encuesta")
	private Date fechaEncuesta;

	private Integer p11;

	private Integer p12;

	private Integer p13;

	private Integer p14;

	private BigDecimal p15a;

	private BigDecimal p15b;

	private BigDecimal p15c;

	private BigDecimal p15d;

	private BigDecimal p15e;

	private BigDecimal p15f;

	private BigDecimal p15g;

	private BigDecimal p15h;

	private BigDecimal p15i;

	private BigDecimal p15j;

	private BigDecimal p15k;

	private BigDecimal p15l;

	private BigDecimal p15m;

	private BigDecimal p15n;

	private BigDecimal p15o;

	private BigDecimal p15p;

	private BigDecimal p15q;

	private BigDecimal p16;

	private Integer p21;

	private Integer p210;

	private Integer p211;

	private Integer p212;

	private Integer p213;

	private Integer p214a;

	private Integer p214b;

	private Integer p214c;

	private Integer p214d;

	private Integer p214e;

	private Integer p214f;

	private Integer p214g;

	private Integer p214h;

	private Integer p214i;

	private Integer p214j;

	private Integer p215;

	private Integer p216;

	private Integer p217;

	private Integer p218a;

	private Integer p218b;

	private Integer p218c;

	private Integer p218d;

	private Integer p218e;

	private Integer p218f;

	private Integer p218g;

	private Integer p218h;

	private Integer p219a;

	private Integer p219b;

	private Integer p219c;

	private Integer p219d;

	private Integer p219e;

	private Integer p219f;

	private Integer p219g;

	private Integer p219h;

	private Integer p219i;

	private Integer p219j;

	private Integer p22a;

	private Integer p22b;

	private Integer p22c;

	private Integer p22d;

	private Integer p22e;

	private Integer p22f;

	private Integer p22g;

	private Integer p23a;

	private Integer p23b;

	private Integer p23c;

	private Integer p23d;

	private Integer p23e;

	private Integer p23f;

	private Integer p23g;

	private Integer p23h;

	private Integer p24a;

	private Integer p24b;

	private Integer p24c;

	private Integer p24d;

	private Integer p24e;

	private Integer p25a;

	private Integer p25b;

	private Integer p25c;

	private Integer p25d;

	private Integer p25e;

	private Integer p26a;

	private Integer p26b;

	private Integer p26c;

	private Integer p26d;

	private Integer p26e;

	private Integer p26f;

	private Integer p27;

	private Integer p28;

	private Integer p29;

	private Integer p31;

	private Integer p32;

	private Integer p33;

	private Integer p41a;

	private Integer p41b;

	private Integer p41c;

	private Integer p41d;

	private Integer p41e;

	private Integer p41f;

	private Integer p41g;

	private Integer p42a;

	private Integer p42b;

	private Integer p42c;

	private Integer p42d;

	private Integer p42e;

	private Integer p42f;

	private Integer p42g;

	private Integer p43a;

	private Integer p43b;

	private Integer p43c;

	private Integer p43d;

	private Integer p43e;

	private Integer p43f;

	private Integer p43g;

	private Integer p44a;

	private Integer p44b;

	private Integer p44c;

	private Integer p44d;

	private Integer p44e;

	private Integer p44f;

	private Integer p44g;

	private Integer p45a;

	private Integer p45b;

	private Integer p45c;

	private Integer p45d;

	private Integer p45e;

	private Integer p51a;

	private Integer p51b;

	private Integer p51c;

	private Integer p51d;

	private Integer p51e;

	private Integer p51f;

	private Integer p52a;

	private Integer p52b;

	private Integer p52c;

	private Integer p52d;

	private Integer p52e;

	private Integer p52f;

	private Integer p53a;

	private Integer p53b;

	private Integer p53c;

	private Integer p53d;

	private Integer p53e;

	private Integer p53f;

	public Cuestionario() {
	}

	public Integer getIdSerial() {
		return this.idSerial;
	}

	public void setIdSerial(Integer idSerial) {
		this.idSerial = idSerial;
	}

	public Date getFechaEncuesta() {
		return this.fechaEncuesta;
	}

	public void setFechaEncuesta(Date fechaEncuesta) {
		this.fechaEncuesta = fechaEncuesta;
	}

	public Integer getP11() {
		return this.p11;
	}

	public void setP11(Integer p11) {
		this.p11 = p11;
	}

	public Integer getP12() {
		return this.p12;
	}

	public void setP12(Integer p12) {
		this.p12 = p12;
	}

	public Integer getP13() {
		return this.p13;
	}

	public void setP13(Integer p13) {
		this.p13 = p13;
	}

	public Integer getP14() {
		return this.p14;
	}

	public void setP14(Integer p14) {
		this.p14 = p14;
	}

	public BigDecimal getP15a() {
		return this.p15a;
	}

	public void setP15a(BigDecimal p15a) {
		this.p15a = p15a;
	}

	public BigDecimal getP15b() {
		return this.p15b;
	}

	public void setP15b(BigDecimal p15b) {
		this.p15b = p15b;
	}

	public BigDecimal getP15c() {
		return this.p15c;
	}

	public void setP15c(BigDecimal p15c) {
		this.p15c = p15c;
	}

	public BigDecimal getP15d() {
		return this.p15d;
	}

	public void setP15d(BigDecimal p15d) {
		this.p15d = p15d;
	}

	public BigDecimal getP15e() {
		return this.p15e;
	}

	public void setP15e(BigDecimal p15e) {
		this.p15e = p15e;
	}

	public BigDecimal getP15f() {
		return this.p15f;
	}

	public void setP15f(BigDecimal p15f) {
		this.p15f = p15f;
	}

	public BigDecimal getP15g() {
		return this.p15g;
	}

	public void setP15g(BigDecimal p15g) {
		this.p15g = p15g;
	}

	public BigDecimal getP15h() {
		return this.p15h;
	}

	public void setP15h(BigDecimal p15h) {
		this.p15h = p15h;
	}

	public BigDecimal getP15i() {
		return this.p15i;
	}

	public void setP15i(BigDecimal p15i) {
		this.p15i = p15i;
	}

	public BigDecimal getP15j() {
		return this.p15j;
	}

	public void setP15j(BigDecimal p15j) {
		this.p15j = p15j;
	}

	public BigDecimal getP15k() {
		return this.p15k;
	}

	public void setP15k(BigDecimal p15k) {
		this.p15k = p15k;
	}

	public BigDecimal getP15l() {
		return this.p15l;
	}

	public void setP15l(BigDecimal p15l) {
		this.p15l = p15l;
	}

	public BigDecimal getP15m() {
		return this.p15m;
	}

	public void setP15m(BigDecimal p15m) {
		this.p15m = p15m;
	}

	public BigDecimal getP15n() {
		return this.p15n;
	}

	public void setP15n(BigDecimal p15n) {
		this.p15n = p15n;
	}

	public BigDecimal getP15o() {
		return this.p15o;
	}

	public void setP15o(BigDecimal p15o) {
		this.p15o = p15o;
	}

	public BigDecimal getP15p() {
		return this.p15p;
	}

	public void setP15p(BigDecimal p15p) {
		this.p15p = p15p;
	}

	public BigDecimal getP15q() {
		return this.p15q;
	}

	public void setP15q(BigDecimal p15q) {
		this.p15q = p15q;
	}

	public BigDecimal getP16() {
		return this.p16;
	}

	public void setP16(BigDecimal p16) {
		this.p16 = p16;
	}

	public Integer getP21() {
		return this.p21;
	}

	public void setP21(Integer p21) {
		this.p21 = p21;
	}

	public Integer getP210() {
		return this.p210;
	}

	public void setP210(Integer p210) {
		this.p210 = p210;
	}

	public Integer getP211() {
		return this.p211;
	}

	public void setP211(Integer p211) {
		this.p211 = p211;
	}

	public Integer getP212() {
		return this.p212;
	}

	public void setP212(Integer p212) {
		this.p212 = p212;
	}

	public Integer getP213() {
		return this.p213;
	}

	public void setP213(Integer p213) {
		this.p213 = p213;
	}

	public Integer getP214a() {
		return this.p214a;
	}

	public void setP214a(Integer p214a) {
		this.p214a = p214a;
	}

	public Integer getP214b() {
		return this.p214b;
	}

	public void setP214b(Integer p214b) {
		this.p214b = p214b;
	}

	public Integer getP214c() {
		return this.p214c;
	}

	public void setP214c(Integer p214c) {
		this.p214c = p214c;
	}

	public Integer getP214d() {
		return this.p214d;
	}

	public void setP214d(Integer p214d) {
		this.p214d = p214d;
	}

	public Integer getP214e() {
		return this.p214e;
	}

	public void setP214e(Integer p214e) {
		this.p214e = p214e;
	}

	public Integer getP214f() {
		return this.p214f;
	}

	public void setP214f(Integer p214f) {
		this.p214f = p214f;
	}

	public Integer getP214g() {
		return this.p214g;
	}

	public void setP214g(Integer p214g) {
		this.p214g = p214g;
	}

	public Integer getP214h() {
		return this.p214h;
	}

	public void setP214h(Integer p214h) {
		this.p214h = p214h;
	}

	public Integer getP214i() {
		return this.p214i;
	}

	public void setP214i(Integer p214i) {
		this.p214i = p214i;
	}

	public Integer getP214j() {
		return this.p214j;
	}

	public void setP214j(Integer p214j) {
		this.p214j = p214j;
	}

	public Integer getP215() {
		return this.p215;
	}

	public void setP215(Integer p215) {
		this.p215 = p215;
	}

	public Integer getP216() {
		return this.p216;
	}

	public void setP216(Integer p216) {
		this.p216 = p216;
	}

	public Integer getP217() {
		return this.p217;
	}

	public void setP217(Integer p217) {
		this.p217 = p217;
	}

	public Integer getP218a() {
		return this.p218a;
	}

	public void setP218a(Integer p218a) {
		this.p218a = p218a;
	}

	public Integer getP218b() {
		return this.p218b;
	}

	public void setP218b(Integer p218b) {
		this.p218b = p218b;
	}

	public Integer getP218c() {
		return this.p218c;
	}

	public void setP218c(Integer p218c) {
		this.p218c = p218c;
	}

	public Integer getP218d() {
		return this.p218d;
	}

	public void setP218d(Integer p218d) {
		this.p218d = p218d;
	}

	public Integer getP218e() {
		return this.p218e;
	}

	public void setP218e(Integer p218e) {
		this.p218e = p218e;
	}

	public Integer getP218f() {
		return this.p218f;
	}

	public void setP218f(Integer p218f) {
		this.p218f = p218f;
	}

	public Integer getP218g() {
		return this.p218g;
	}

	public void setP218g(Integer p218g) {
		this.p218g = p218g;
	}

	public Integer getP218h() {
		return this.p218h;
	}

	public void setP218h(Integer p218h) {
		this.p218h = p218h;
	}

	public Integer getP219a() {
		return this.p219a;
	}

	public void setP219a(Integer p219a) {
		this.p219a = p219a;
	}

	public Integer getP219b() {
		return this.p219b;
	}

	public void setP219b(Integer p219b) {
		this.p219b = p219b;
	}

	public Integer getP219c() {
		return this.p219c;
	}

	public void setP219c(Integer p219c) {
		this.p219c = p219c;
	}

	public Integer getP219d() {
		return this.p219d;
	}

	public void setP219d(Integer p219d) {
		this.p219d = p219d;
	}

	public Integer getP219e() {
		return this.p219e;
	}

	public void setP219e(Integer p219e) {
		this.p219e = p219e;
	}

	public Integer getP219f() {
		return this.p219f;
	}

	public void setP219f(Integer p219f) {
		this.p219f = p219f;
	}

	public Integer getP219g() {
		return this.p219g;
	}

	public void setP219g(Integer p219g) {
		this.p219g = p219g;
	}

	public Integer getP219h() {
		return this.p219h;
	}

	public void setP219h(Integer p219h) {
		this.p219h = p219h;
	}

	public Integer getP219i() {
		return this.p219i;
	}

	public void setP219i(Integer p219i) {
		this.p219i = p219i;
	}

	public Integer getP219j() {
		return this.p219j;
	}

	public void setP219j(Integer p219j) {
		this.p219j = p219j;
	}

	public Integer getP22a() {
		return this.p22a;
	}

	public void setP22a(Integer p22a) {
		this.p22a = p22a;
	}

	public Integer getP22b() {
		return this.p22b;
	}

	public void setP22b(Integer p22b) {
		this.p22b = p22b;
	}

	public Integer getP22c() {
		return this.p22c;
	}

	public void setP22c(Integer p22c) {
		this.p22c = p22c;
	}

	public Integer getP22d() {
		return this.p22d;
	}

	public void setP22d(Integer p22d) {
		this.p22d = p22d;
	}

	public Integer getP22e() {
		return this.p22e;
	}

	public void setP22e(Integer p22e) {
		this.p22e = p22e;
	}

	public Integer getP22f() {
		return this.p22f;
	}

	public void setP22f(Integer p22f) {
		this.p22f = p22f;
	}

	public Integer getP22g() {
		return this.p22g;
	}

	public void setP22g(Integer p22g) {
		this.p22g = p22g;
	}

	public Integer getP23a() {
		return this.p23a;
	}

	public void setP23a(Integer p23a) {
		this.p23a = p23a;
	}

	public Integer getP23b() {
		return this.p23b;
	}

	public void setP23b(Integer p23b) {
		this.p23b = p23b;
	}

	public Integer getP23c() {
		return this.p23c;
	}

	public void setP23c(Integer p23c) {
		this.p23c = p23c;
	}

	public Integer getP23d() {
		return this.p23d;
	}

	public void setP23d(Integer p23d) {
		this.p23d = p23d;
	}

	public Integer getP23e() {
		return this.p23e;
	}

	public void setP23e(Integer p23e) {
		this.p23e = p23e;
	}

	public Integer getP23f() {
		return this.p23f;
	}

	public void setP23f(Integer p23f) {
		this.p23f = p23f;
	}

	public Integer getP23g() {
		return this.p23g;
	}

	public void setP23g(Integer p23g) {
		this.p23g = p23g;
	}

	public Integer getP23h() {
		return this.p23h;
	}

	public void setP23h(Integer p23h) {
		this.p23h = p23h;
	}

	public Integer getP24a() {
		return this.p24a;
	}

	public void setP24a(Integer p24a) {
		this.p24a = p24a;
	}

	public Integer getP24b() {
		return this.p24b;
	}

	public void setP24b(Integer p24b) {
		this.p24b = p24b;
	}

	public Integer getP24c() {
		return this.p24c;
	}

	public void setP24c(Integer p24c) {
		this.p24c = p24c;
	}

	public Integer getP24d() {
		return this.p24d;
	}

	public void setP24d(Integer p24d) {
		this.p24d = p24d;
	}

	public Integer getP24e() {
		return this.p24e;
	}

	public void setP24e(Integer p24e) {
		this.p24e = p24e;
	}

	public Integer getP25a() {
		return this.p25a;
	}

	public void setP25a(Integer p25a) {
		this.p25a = p25a;
	}

	public Integer getP25b() {
		return this.p25b;
	}

	public void setP25b(Integer p25b) {
		this.p25b = p25b;
	}

	public Integer getP25c() {
		return this.p25c;
	}

	public void setP25c(Integer p25c) {
		this.p25c = p25c;
	}

	public Integer getP25d() {
		return this.p25d;
	}

	public void setP25d(Integer p25d) {
		this.p25d = p25d;
	}

	public Integer getP25e() {
		return this.p25e;
	}

	public void setP25e(Integer p25e) {
		this.p25e = p25e;
	}

	public Integer getP26a() {
		return this.p26a;
	}

	public void setP26a(Integer p26a) {
		this.p26a = p26a;
	}

	public Integer getP26b() {
		return this.p26b;
	}

	public void setP26b(Integer p26b) {
		this.p26b = p26b;
	}

	public Integer getP26c() {
		return this.p26c;
	}

	public void setP26c(Integer p26c) {
		this.p26c = p26c;
	}

	public Integer getP26d() {
		return this.p26d;
	}

	public void setP26d(Integer p26d) {
		this.p26d = p26d;
	}

	public Integer getP26e() {
		return this.p26e;
	}

	public void setP26e(Integer p26e) {
		this.p26e = p26e;
	}

	public Integer getP26f() {
		return this.p26f;
	}

	public void setP26f(Integer p26f) {
		this.p26f = p26f;
	}

	public Integer getP27() {
		return this.p27;
	}

	public void setP27(Integer p27) {
		this.p27 = p27;
	}

	public Integer getP28() {
		return this.p28;
	}

	public void setP28(Integer p28) {
		this.p28 = p28;
	}

	public Integer getP29() {
		return this.p29;
	}

	public void setP29(Integer p29) {
		this.p29 = p29;
	}

	public Integer getP31() {
		return this.p31;
	}

	public void setP31(Integer p31) {
		this.p31 = p31;
	}

	public Integer getP32() {
		return this.p32;
	}

	public void setP32(Integer p32) {
		this.p32 = p32;
	}

	public Integer getP33() {
		return this.p33;
	}

	public void setP33(Integer p33) {
		this.p33 = p33;
	}

	public Integer getP41a() {
		return this.p41a;
	}

	public void setP41a(Integer p41a) {
		this.p41a = p41a;
	}

	public Integer getP41b() {
		return this.p41b;
	}

	public void setP41b(Integer p41b) {
		this.p41b = p41b;
	}

	public Integer getP41c() {
		return this.p41c;
	}

	public void setP41c(Integer p41c) {
		this.p41c = p41c;
	}

	public Integer getP41d() {
		return this.p41d;
	}

	public void setP41d(Integer p41d) {
		this.p41d = p41d;
	}

	public Integer getP41e() {
		return this.p41e;
	}

	public void setP41e(Integer p41e) {
		this.p41e = p41e;
	}

	public Integer getP41f() {
		return this.p41f;
	}

	public void setP41f(Integer p41f) {
		this.p41f = p41f;
	}

	public Integer getP41g() {
		return this.p41g;
	}

	public void setP41g(Integer p41g) {
		this.p41g = p41g;
	}

	public Integer getP42a() {
		return this.p42a;
	}

	public void setP42a(Integer p42a) {
		this.p42a = p42a;
	}

	public Integer getP42b() {
		return this.p42b;
	}

	public void setP42b(Integer p42b) {
		this.p42b = p42b;
	}

	public Integer getP42c() {
		return this.p42c;
	}

	public void setP42c(Integer p42c) {
		this.p42c = p42c;
	}

	public Integer getP42d() {
		return this.p42d;
	}

	public void setP42d(Integer p42d) {
		this.p42d = p42d;
	}

	public Integer getP42e() {
		return this.p42e;
	}

	public void setP42e(Integer p42e) {
		this.p42e = p42e;
	}

	public Integer getP42f() {
		return this.p42f;
	}

	public void setP42f(Integer p42f) {
		this.p42f = p42f;
	}

	public Integer getP42g() {
		return this.p42g;
	}

	public void setP42g(Integer p42g) {
		this.p42g = p42g;
	}

	public Integer getP43a() {
		return this.p43a;
	}

	public void setP43a(Integer p43a) {
		this.p43a = p43a;
	}

	public Integer getP43b() {
		return this.p43b;
	}

	public void setP43b(Integer p43b) {
		this.p43b = p43b;
	}

	public Integer getP43c() {
		return this.p43c;
	}

	public void setP43c(Integer p43c) {
		this.p43c = p43c;
	}

	public Integer getP43d() {
		return this.p43d;
	}

	public void setP43d(Integer p43d) {
		this.p43d = p43d;
	}

	public Integer getP43e() {
		return this.p43e;
	}

	public void setP43e(Integer p43e) {
		this.p43e = p43e;
	}

	public Integer getP43f() {
		return this.p43f;
	}

	public void setP43f(Integer p43f) {
		this.p43f = p43f;
	}

	public Integer getP43g() {
		return this.p43g;
	}

	public void setP43g(Integer p43g) {
		this.p43g = p43g;
	}

	public Integer getP44a() {
		return this.p44a;
	}

	public void setP44a(Integer p44a) {
		this.p44a = p44a;
	}

	public Integer getP44b() {
		return this.p44b;
	}

	public void setP44b(Integer p44b) {
		this.p44b = p44b;
	}

	public Integer getP44c() {
		return this.p44c;
	}

	public void setP44c(Integer p44c) {
		this.p44c = p44c;
	}

	public Integer getP44d() {
		return this.p44d;
	}

	public void setP44d(Integer p44d) {
		this.p44d = p44d;
	}

	public Integer getP44e() {
		return this.p44e;
	}

	public void setP44e(Integer p44e) {
		this.p44e = p44e;
	}

	public Integer getP44f() {
		return this.p44f;
	}

	public void setP44f(Integer p44f) {
		this.p44f = p44f;
	}

	public Integer getP44g() {
		return this.p44g;
	}

	public void setP44g(Integer p44g) {
		this.p44g = p44g;
	}

	public Integer getP45a() {
		return this.p45a;
	}

	public void setP45a(Integer p45a) {
		this.p45a = p45a;
	}

	public Integer getP45b() {
		return this.p45b;
	}

	public void setP45b(Integer p45b) {
		this.p45b = p45b;
	}

	public Integer getP45c() {
		return this.p45c;
	}

	public void setP45c(Integer p45c) {
		this.p45c = p45c;
	}

	public Integer getP45d() {
		return this.p45d;
	}

	public void setP45d(Integer p45d) {
		this.p45d = p45d;
	}

	public Integer getP45e() {
		return this.p45e;
	}

	public void setP45e(Integer p45e) {
		this.p45e = p45e;
	}

	public Integer getP51a() {
		return this.p51a;
	}

	public void setP51a(Integer p51a) {
		this.p51a = p51a;
	}

	public Integer getP51b() {
		return this.p51b;
	}

	public void setP51b(Integer p51b) {
		this.p51b = p51b;
	}

	public Integer getP51c() {
		return this.p51c;
	}

	public void setP51c(Integer p51c) {
		this.p51c = p51c;
	}

	public Integer getP51d() {
		return this.p51d;
	}

	public void setP51d(Integer p51d) {
		this.p51d = p51d;
	}

	public Integer getP51e() {
		return this.p51e;
	}

	public void setP51e(Integer p51e) {
		this.p51e = p51e;
	}

	public Integer getP51f() {
		return this.p51f;
	}

	public void setP51f(Integer p51f) {
		this.p51f = p51f;
	}

	public Integer getP52a() {
		return this.p52a;
	}

	public void setP52a(Integer p52a) {
		this.p52a = p52a;
	}

	public Integer getP52b() {
		return this.p52b;
	}

	public void setP52b(Integer p52b) {
		this.p52b = p52b;
	}

	public Integer getP52c() {
		return this.p52c;
	}

	public void setP52c(Integer p52c) {
		this.p52c = p52c;
	}

	public Integer getP52d() {
		return this.p52d;
	}

	public void setP52d(Integer p52d) {
		this.p52d = p52d;
	}

	public Integer getP52e() {
		return this.p52e;
	}

	public void setP52e(Integer p52e) {
		this.p52e = p52e;
	}

	public Integer getP52f() {
		return this.p52f;
	}

	public void setP52f(Integer p52f) {
		this.p52f = p52f;
	}

	public Integer getP53a() {
		return this.p53a;
	}

	public void setP53a(Integer p53a) {
		this.p53a = p53a;
	}

	public Integer getP53b() {
		return this.p53b;
	}

	public void setP53b(Integer p53b) {
		this.p53b = p53b;
	}

	public Integer getP53c() {
		return this.p53c;
	}

	public void setP53c(Integer p53c) {
		this.p53c = p53c;
	}

	public Integer getP53d() {
		return this.p53d;
	}

	public void setP53d(Integer p53d) {
		this.p53d = p53d;
	}

	public Integer getP53e() {
		return this.p53e;
	}

	public void setP53e(Integer p53e) {
		this.p53e = p53e;
	}

	public Integer getP53f() {
		return this.p53f;
	}

	public void setP53f(Integer p53f) {
		this.p53f = p53f;
	}

}