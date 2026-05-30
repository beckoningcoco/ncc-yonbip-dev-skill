# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8301.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dbitem | pk_dbitem | pk_dbitem | char(20) | √ |
| 2 | assid | assid | assid | char(20) |
| 3 | bankaccount | bankaccount | bankaccount | varchar2(20) |  |  | '~' |
| 4 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 5 | busireconno | busireconno | busireconno | varchar2(60) |
| 6 | cashflowitem | cashflowitem | cashflowitem | varchar2(20) |  |  | '~' |
| 7 | checkdate | checkdate | checkdate | char(19) |
| 8 | checkno | checkno | checkno | varchar2(30) |
| 9 | checkstyle | checkstyle | checkstyle | varchar2(20) |  |  | '~' |
| 10 | contractno | contractno | contractno | varchar2(50) |
| 11 | creditamount | creditamount | creditamount | number(28, 8) |  |  | 0 |
| 12 | creditquantity | creditquantity | creditquantity | number(28, 8) |  |  | 0 |
| 13 | creditquantity2 | creditquantity2 | creditquantity2 | number(28, 8) |
| 14 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 15 | debitamount | debitamount | debitamount | number(28, 8) |  |  | 0 |
| 16 | debitquantity | debitquantity | debitquantity | number(28, 8) |  |  | 0 |
| 17 | debitquantity2 | debitquantity2 | debitquantity2 | number(28, 8) |
| 18 | detailindex | detailindex | detailindex | number(38, 0) |
| 19 | direction | direction | direction | char(1) |
| 20 | excrate1 | excrate1 | excrate1 | number(15, 8) |  |  | 0 |
| 21 | excrate2 | excrate2 | excrate2 | number(15, 8) |  |  | 0 |
| 22 | excrate3 | excrate3 | excrate3 | number(15, 8) |  |  | 0 |
| 23 | excrate4 | excrate4 | excrate4 | number(15, 8) |  |  | 0 |
| 24 | explanation | explanation | explanation | varchar2(400) |
| 25 | fraccreditamount | fraccreditamount | fraccreditamount | number(28, 8) |  |  | 0 |
| 26 | fracdebitamount | fracdebitamount | fracdebitamount | number(28, 8) |  |  | 0 |
| 27 | globalcreditamount | globalcreditamount | globalcreditamount | number(28, 8) |  |  | 0 |
| 28 | globaldebitamount | globaldebitamount | globaldebitamount | number(28, 8) |  |  | 0 |
| 29 | groupcreditamount | groupcreditamount | groupcreditamount | number(28, 8) |  |  | 0 |
| 30 | groupdebitamount | groupdebitamount | groupdebitamount | number(28, 8) |  |  | 0 |
| 31 | innerbusdate | innerbusdate | innerbusdate | char(19) |
| 32 | innerbusno | innerbusno | innerbusno | varchar2(60) |
| 33 | istrans2cm | istrans2cm | istrans2cm | char(1) |
| 34 | istrans2gl | istrans2gl | istrans2gl | char(1) |
| 35 | istrans2ra | istrans2ra | istrans2ra | char(1) |
| 36 | localcreditamount | localcreditamount | localcreditamount | number(28, 8) |  |  | 0 |
| 37 | localdebitamount | localdebitamount | localdebitamount | number(28, 8) |  |  | 0 |
| 38 | modifyflag | modifyflag | modifyflag | char(20) |
| 39 | netbankflag | netbankflag | netbankflag | varchar2(50) |
| 40 | oppositesubj | oppositesubj | oppositesubj | varchar2(200) |
| 41 | periodv | periodv | periodv | char(2) |
| 42 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 43 | pk_accasoa2 | pk_accasoa2 | pk_accasoa2 | varchar2(20) |  |  | '~' |
| 44 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 45 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 46 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 47 | pk_cust_supplier | pk_cust_supplier | pk_cust_supplier | varchar2(20) |  |  | '~' |
| 48 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 49 | pk_deptid_v | pk_deptid_v | pk_deptid_v | varchar2(20) |  |  | '~' |
| 50 | pk_detailbook | pk_detailbook | pk_detailbook | char(20) | √ |
| 51 | pk_factorasoa | pk_factorasoa | pk_factorasoa | varchar2(20) |  |  | '~' |
| 52 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 53 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 54 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 55 | pk_innercorp | pk_innercorp | pk_innercorp | varchar2(20) |  |  | '~' |
| 56 | pk_insidesupplier | pk_insidesupplier | pk_insidesupplier | varchar2(20) |  |  | '~' |
| 57 | pk_marbasclass | pk_marbasclass | pk_marbasclass | char(20) |
| 58 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 59 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 60 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 61 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 62 | pk_pcenter_v | pk_pcenter_v | pk_pcenter_v | varchar2(20) |  |  | '~' |
| 63 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 64 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 65 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 66 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 67 | pk_subjcode | pk_subjcode | pk_subjcode | varchar2(20) |  |  | '~' |
| 68 | pk_systemv | pk_systemv | pk_systemv | varchar2(50) |
| 69 | pk_unit | pk_unit | pk_unit | varchar2(20) |  |  | '~' |
| 70 | pk_unit_v | pk_unit_v | pk_unit_v | varchar2(20) |  |  | '~' |
| 71 | pk_vouchertypev | pk_vouchertypev | pk_vouchertypev | varchar2(20) |  |  | '~' |
| 72 | prepareddatev | prepareddatev | prepareddatev | char(19) |
| 73 | price | price | price | number(28, 8) |  |  | 0 |
| 74 | resavouchertypev | resavouchertypev | resavouchertypev | varchar2(20) |  |  | '~' |
| 75 | rowno | rowno | rowno | number(38, 0) |
| 76 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 77 | srcrowid | srcrowid | srcrowid | varchar2(50) |
| 78 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 79 | uniqueid | uniqueid | uniqueid | varchar2(50) |
| 80 | unit | unit | unit | varchar2(20) |  |  | '~' |
| 81 | unit2 | unit2 | unit2 | varchar2(20) |  |  | '~' |
| 82 | unitname | unitname | unitname | varchar2(50) |
| 83 | verifydate | verifydate | verifydate | char(19) |
| 84 | verifyno | verifyno | verifyno | varchar2(60) |
| 85 | voucherkindv | voucherkindv | voucherkindv | number(38, 0) |
| 86 | yearv | yearv | yearv | char(4) |
| 87 | def1 | def1 | def1 | varchar2(101) |
| 88 | def2 | def2 | def2 | varchar2(101) |
| 89 | def3 | def3 | def3 | varchar2(101) |
| 90 | def4 | def4 | def4 | varchar2(101) |
| 91 | def5 | def5 | def5 | varchar2(101) |
| 92 | def6 | def6 | def6 | varchar2(101) |
| 93 | def7 | def7 | def7 | varchar2(101) |
| 94 | def8 | def8 | def8 | varchar2(101) |
| 95 | def9 | def9 | def9 | varchar2(101) |
| 96 | def10 | def10 | def10 | varchar2(101) |
| 97 | def11 | def11 | def11 | varchar2(101) |
| 98 | def12 | def12 | def12 | varchar2(101) |
| 99 | def13 | def13 | def13 | varchar2(101) |
| 100 | def14 | def14 | def14 | varchar2(101) |
| 101 | def15 | def15 | def15 | varchar2(101) |
| 102 | def16 | def16 | def16 | varchar2(101) |
| 103 | def17 | def17 | def17 | varchar2(101) |
| 104 | def18 | def18 | def18 | varchar2(101) |
| 105 | def19 | def19 | def19 | varchar2(101) |
| 106 | def20 | def20 | def20 | varchar2(101) |
| 107 | def21 | def21 | def21 | varchar2(101) |
| 108 | def22 | def22 | def22 | varchar2(101) |
| 109 | def23 | def23 | def23 | varchar2(101) |
| 110 | def24 | def24 | def24 | varchar2(101) |
| 111 | def25 | def25 | def25 | varchar2(101) |
| 112 | def26 | def26 | def26 | varchar2(101) |
| 113 | def27 | def27 | def27 | varchar2(101) |
| 114 | def28 | def28 | def28 | varchar2(101) |
| 115 | def29 | def29 | def29 | varchar2(101) |
| 116 | def30 | def30 | def30 | varchar2(101) |
| 117 | def31 | def31 | def31 | varchar2(101) |
| 118 | def32 | def32 | def32 | varchar2(101) |
| 119 | def33 | def33 | def33 | varchar2(101) |
| 120 | def34 | def34 | def34 | varchar2(101) |
| 121 | def35 | def35 | def35 | varchar2(101) |
| 122 | def36 | def36 | def36 | varchar2(101) |
| 123 | def37 | def37 | def37 | varchar2(101) |
| 124 | def38 | def38 | def38 | varchar2(101) |
| 125 | def39 | def39 | def39 | varchar2(101) |
| 126 | def40 | def40 | def40 | varchar2(101) |
| 127 | def41 | def41 | def41 | varchar2(101) |
| 128 | def42 | def42 | def42 | varchar2(101) |
| 129 | def43 | def43 | def43 | varchar2(101) |
| 130 | def44 | def44 | def44 | varchar2(101) |
| 131 | def45 | def45 | def45 | varchar2(101) |
| 132 | def46 | def46 | def46 | varchar2(101) |
| 133 | def47 | def47 | def47 | varchar2(101) |
| 134 | def48 | def48 | def48 | varchar2(101) |
| 135 | def49 | def49 | def49 | varchar2(101) |
| 136 | def50 | def50 | def50 | varchar2(101) |
| 137 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 138 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |