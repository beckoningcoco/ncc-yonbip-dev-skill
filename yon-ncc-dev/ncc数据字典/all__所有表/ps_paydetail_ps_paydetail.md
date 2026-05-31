# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10844.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paydetail | pk_paydetail | pk_paydetail | char(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | commitapprovedate | commitapprovedate | commitapprovedate | char(19) |
| 6 | commitapprover | commitapprover | commitapprover | varchar2(20) |  |  | '~' |
| 7 | contractno | contractno | contractno | varchar2(200) |
| 8 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 9 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 10 | executedate | executedate | executedate | char(19) |
| 11 | freecust | freecust | freecust | varchar2(20) |  |  | '~' |
| 12 | frozensrc | frozensrc | frozensrc | number(38, 0) |
| 13 | glcpaymny | glcpaymny | glcpaymny | number(28, 8) |
| 14 | glcpaymnysum | glcpaymnysum | glcpaymnysum | number(28, 8) |
| 15 | glcrate | glcrate | glcrate | number(15, 8) |
| 16 | glcsettlementmny | glcsettlementmny | glcsettlementmny | number(28, 8) |
| 17 | gllcpaymny | gllcpaymny | gllcpaymny | number(28, 8) |
| 18 | gllcpaymnysum | gllcpaymnysum | gllcpaymnysum | number(28, 8) |
| 19 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 20 | gllcsettlementmny | gllcsettlementmny | gllcsettlementmny | number(28, 8) |
| 21 | groupid | groupid | groupid | varchar2(100) |
| 22 | iinvoiceno | iinvoiceno | iinvoiceno | varchar2(200) |
| 23 | isfreecust | isfreecust | isfreecust | char(1) |
| 24 | isfrozen | isfrozen | isfrozen | char(1) |
| 25 | isprepay | isprepay | isprepay | char(1) |
| 26 | isputdown | isputdown | isputdown | char(1) |
| 27 | lastbillno | lastbillno | lastbillno | varchar2(50) |
| 28 | lastbilltype | lastbilltype | lastbilltype | varchar2(20) |  |  | '~' |
| 29 | maturitydate | maturitydate | maturitydate | char(19) |
| 30 | olcpaymny | olcpaymny | olcpaymny | number(28, 8) |
| 31 | olcpaymnysum | olcpaymnysum | olcpaymnysum | number(28, 8) |
| 32 | olcrate | olcrate | olcrate | number(15, 8) |
| 33 | olcsettlementmny | olcsettlementmny | olcsettlementmny | number(28, 8) |
| 34 | orderno | orderno | orderno | varchar2(200) |
| 35 | paymny | paymny | paymny | number(28, 8) |
| 36 | paymnysum | paymnysum | paymnysum | number(28, 8) |
| 37 | paytype | paytype | paytype | number(38, 0) |
| 38 | pk_acceptorg | pk_acceptorg | pk_acceptorg | varchar2(20) |  |  | '~' |
| 39 | pk_acceptorg_v | pk_acceptorg_v | pk_acceptorg_v | varchar2(20) |  |  | '~' |
| 40 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 41 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 42 | pk_bankacc_pd_r | pk_bankacc_pd_r | pk_bankacc_pd_r | varchar2(20) |  |  | '~' |
| 43 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 44 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 45 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 46 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 47 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 48 | pk_decidedept | pk_decidedept | pk_decidedept | varchar2(20) |  |  | '~' |
| 49 | pk_fundtype | pk_fundtype | pk_fundtype | varchar2(20) |  |  | '~' |
| 50 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 51 | pk_lastbillid | pk_lastbillid | pk_lastbillid | varchar2(20) |  |  | '~' |
| 52 | pk_lastbillrowid | pk_lastbillrowid | pk_lastbillrowid | varchar2(20) |  |  | '~' |
| 53 | pk_note | pk_note | pk_note | varchar2(20) |  |  | '~' |
| 54 | pk_notetype | pk_notetype | pk_notetype | varchar2(20) |  |  | '~' |
| 55 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 56 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 57 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 58 | pk_payterm_b | pk_payterm_b | pk_payterm_b | varchar2(20) |  |  | '~' |
| 59 | pk_plandetail | pk_plandetail | pk_plandetail | varchar2(20) |  |  | '~' |
| 60 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 61 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 62 | pk_ptrate | pk_ptrate | pk_ptrate | varchar2(181) |
| 63 | pk_resuser | pk_resuser | pk_resuser | varchar2(20) |  |  | '~' |
| 64 | pk_sourcebillid | pk_sourcebillid | pk_sourcebillid | varchar2(20) |  |  | '~' |
| 65 | pk_sourcebillrowid | pk_sourcebillrowid | pk_sourcebillrowid | varchar2(20) |  |  | '~' |
| 66 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 67 | purquantity | purquantity | purquantity | number(28, 8) |
| 68 | settlementmny | settlementmny | settlementmny | number(28, 8) |
| 69 | sourcebillno | sourcebillno | sourcebillno | varchar2(50) |
| 70 | sourcebilltype | sourcebilltype | sourcebilltype | varchar2(20) |  |  | '~' |
| 71 | usages | usages | usages | varchar2(181) |
| 72 | vapprovenote | vapprovenote | vapprovenote | varchar2(300) |
| 73 | vbilldate | vbilldate | vbilldate | char(19) |
| 74 | vbillno | vbillno | vbillno | varchar2(50) |
| 75 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 76 | wlobj | wlobj | wlobj | number(38, 0) |
| 77 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 78 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 79 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 80 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 81 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 82 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 83 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 84 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 85 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 86 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 87 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 88 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 89 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 90 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 91 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 92 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 93 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 94 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 95 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 96 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 97 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 98 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 99 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 100 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 101 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 102 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 103 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 104 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 105 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 106 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 107 | creationtime | creationtime | creationtime | char(19) |
| 108 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 109 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 110 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 111 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 112 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |