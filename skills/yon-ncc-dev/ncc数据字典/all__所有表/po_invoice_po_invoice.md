# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10755.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice | pk_invoice | pk_invoice | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |
| 3 | bapflag | bapflag | bapflag | char(1) |  |  | 'N' |
| 4 | bfee | bfee | bfee | char(1) |  |  | 'N' |
| 5 | bfrozen | bfrozen | bfrozen | char(1) |  |  | 'N' |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |
| 7 | binitial | binitial | binitial | char(1) |  |  | 'N' |
| 8 | bopptaxflag | bopptaxflag | bopptaxflag | char(1) |  |  | 'N' |
| 9 | btriatradeflag | btriatradeflag | btriatradeflag | char(1) |
| 10 | bvirtual | bvirtual | bvirtual | char(1) |  |  | 'N' |
| 11 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |
| 12 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |
| 13 | crececountryid | crececountryid | crececountryid | varchar2(20) |
| 14 | csaleinvoiceid | csaleinvoiceid | csaleinvoiceid | char(20) |
| 15 | csendcountryid | csendcountryid | csendcountryid | varchar2(20) |
| 16 | ctaxcountryid | ctaxcountryid | ctaxcountryid | varchar2(20) |
| 17 | ctradewordid | ctradewordid | ctradewordid | varchar2(20) |
| 18 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 19 | darrivedate | darrivedate | darrivedate | varchar2(19) |
| 20 | dbilldate | dbilldate | dbilldate | char(19) |
| 21 | dmakedate | dmakedate | dmakedate | char(19) |
| 22 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) |  |  | 0 |
| 23 | fbuysellflag | fbuysellflag | fbuysellflag | number(38, 0) |
| 24 | finvoiceclass | finvoiceclass | finvoiceclass | number(38, 0) |  |  | 0 |
| 25 | finvoicetype | finvoicetype | finvoicetype | number(38, 0) |
| 26 | ftaxtypeflagh | ftaxtypeflagh | ftaxtypeflagh | number(38, 0) |  |  | 1 |
| 27 | iprintcount | iprintcount | iprintcount | number(38, 0) |  |  | 0 |
| 28 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |  |  | 1.00 |
| 29 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 30 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 31 | ntaxrateh | ntaxrateh | ntaxrateh | number(28, 8) |
| 32 | ntotalastnum | ntotalastnum | ntotalastnum | number(28, 8) |
| 33 | ntotalorigmny | ntotalorigmny | ntotalorigmny | number(28, 8) |
| 34 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |
| 35 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |
| 36 | pk_bizpsn | pk_bizpsn | pk_bizpsn | varchar2(20) |
| 37 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |
| 38 | pk_dept | pk_dept | pk_dept | varchar2(20) |
| 39 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |
| 40 | pk_freecust | pk_freecust | pk_freecust | varchar2(20) |
| 41 | pk_frozenuser | pk_frozenuser | pk_frozenuser | varchar2(20) |
| 42 | pk_group | pk_group | pk_group | varchar2(20) |
| 43 | pk_org | pk_org | pk_org | varchar2(20) |
| 44 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 45 | pk_parentinvoice | pk_parentinvoice | pk_parentinvoice | varchar2(20) |
| 46 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |
| 47 | pk_paytosupplier | pk_paytosupplier | pk_paytosupplier | varchar2(20) |
| 48 | pk_purchaseorg | pk_purchaseorg | pk_purchaseorg | varchar2(20) |
| 49 | pk_purchaseorg_v | pk_purchaseorg_v | pk_purchaseorg_v | varchar2(20) |
| 50 | pk_stockorg | pk_stockorg | pk_stockorg | varchar2(20) |
| 51 | pk_stockorg_v | pk_stockorg_v | pk_stockorg_v | varchar2(20) |
| 52 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |
| 53 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 54 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 55 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 56 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 57 | taudittime | taudittime | taudittime | varchar2(19) |
| 58 | tfrozentime | tfrozentime | tfrozentime | varchar2(19) |
| 59 | vadjustreason | vadjustreason | vadjustreason | varchar2(181) |
| 60 | vbillcode | vbillcode | vbillcode | varchar2(200) |
| 61 | vfrozenreason | vfrozenreason | vfrozenreason | varchar2(181) |
| 62 | vmemo | vmemo | vmemo | varchar2(181) |
| 63 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 64 | vvatcode | vvatcode | vvatcode | varchar2(40) |
| 65 | vvendorvatcode | vvendorvatcode | vvendorvatcode | varchar2(40) |
| 66 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 67 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 68 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 69 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 70 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 71 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 72 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 73 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 74 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 75 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 76 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 77 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 78 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 79 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 80 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 81 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 82 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 83 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 84 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 85 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 86 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 87 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 88 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 89 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 90 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 91 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 92 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 93 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 94 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 95 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 96 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 97 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 98 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 99 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 100 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 101 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 102 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 103 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 104 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 105 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 106 | vdef41 | vdef41 | vdef41 | varchar2(101) |
| 107 | vdef42 | vdef42 | vdef42 | varchar2(101) |
| 108 | vdef43 | vdef43 | vdef43 | varchar2(101) |
| 109 | vdef44 | vdef44 | vdef44 | varchar2(101) |
| 110 | vdef45 | vdef45 | vdef45 | varchar2(101) |
| 111 | vdef46 | vdef46 | vdef46 | varchar2(101) |
| 112 | vdef47 | vdef47 | vdef47 | varchar2(101) |
| 113 | vdef48 | vdef48 | vdef48 | varchar2(101) |
| 114 | vdef49 | vdef49 | vdef49 | varchar2(101) |
| 115 | vdef50 | vdef50 | vdef50 | varchar2(101) |
| 116 | creationtime | creationtime | creationtime | char(19) |
| 117 | creator | creator | creator | varchar2(20) |
| 118 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 119 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 120 | modifier | modifier | modifier | varchar2(20) |
| 121 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |