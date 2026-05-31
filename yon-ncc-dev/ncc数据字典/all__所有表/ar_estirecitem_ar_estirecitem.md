# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6599.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estirecitem | pk_estirecitem | pk_estirecitem | char(20) | √ |
| 2 | assetpactno | assetpactno | assetpactno | varchar2(80) |
| 3 | bankrollprojet | bankrollprojet | bankrollprojet | varchar2(20) |  |  | '~' |
| 4 | batchcode | batchcode | batchcode | varchar2(50) |
| 5 | billclass | billclass | billclass | varchar2(2) | √ |
| 6 | billdate | billdate | billdate | char(19) | √ |
| 7 | billno | billno | billno | varchar2(40) |
| 8 | busidate | busidate | busidate | char(19) |
| 9 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 10 | caltaxmny | caltaxmny | caltaxmny | number(28, 8) |
| 11 | cashitem | cashitem | cashitem | varchar2(20) |  |  | '~' |
| 12 | checkdirection | checkdirection | checkdirection | varchar2(50) |
| 13 | checkelement | checkelement | checkelement | varchar2(20) |  |  | '~' |
| 14 | checkno | checkno | checkno | varchar2(50) |
| 15 | checktype | checktype | checktype | char(20) |
| 16 | ckdid | ckdid | ckdid | char(20) |
| 17 | contractno | contractno | contractno | varchar2(40) |
| 18 | coordflag | coordflag | coordflag | number(38, 0) |
| 19 | costcenter | costcenter | costcenter | varchar2(20) |
| 20 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 21 | custvatcode | custvatcode | custvatcode | varchar2(50) |
| 22 | ddhid | ddhid | ddhid | char(20) |
| 23 | dealno | dealno | dealno | varchar2(20) |
| 24 | direction | direction | direction | number(38, 0) | √ |
| 25 | equipmentcode | equipmentcode | equipmentcode | varchar2(100) |
| 26 | facard | facard | facard | varchar2(50) |
| 27 | fphid | fphid | fphid | char(20) |
| 28 | freecust | freecust | freecust | varchar2(20) |  |  | '~' |
| 29 | globalbalance | globalbalance | globalbalance | number(28, 8) |  |  | 0 |
| 30 | globaldebit | globaldebit | globaldebit | number(28, 8) |  |  | 0 |
| 31 | globalnotax_de | globalnotax_de | globalnotax_de | number(28, 8) |  |  | 0 |
| 32 | globalrate | globalrate | globalrate | number(15, 8) |  |  | 1 |
| 33 | globaltax_de | globaltax_de | globaltax_de | number(28, 8) |  |  | 0 |
| 34 | groupbalance | groupbalance | groupbalance | number(28, 8) |  |  | 0 |
| 35 | groupdebit | groupdebit | groupdebit | number(28, 8) |  |  | 0 |
| 36 | groupnotax_de | groupnotax_de | groupnotax_de | number(28, 8) |  |  | 0 |
| 37 | grouprate | grouprate | grouprate | number(15, 8) |  |  | 1 |
| 38 | grouptax_de | grouptax_de | grouptax_de | number(28, 8) |  |  | 0 |
| 39 | innerorderno | innerorderno | innerorderno | varchar2(40) |
| 40 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 41 | local_money_bal | local_money_bal | local_money_bal | number(28, 8) |  |  | 0 |
| 42 | local_money_de | local_money_de | local_money_de | number(28, 8) |  |  | 0 |
| 43 | local_notax_de | local_notax_de | local_notax_de | number(28, 8) |  |  | 0 |
| 44 | local_tax_de | local_tax_de | local_tax_de | number(28, 8) |  |  | 0 |
| 45 | matcustcode | matcustcode | matcustcode | varchar2(20) |
| 46 | material | material | material | varchar2(20) |  |  | '~' |
| 47 | material_src | material_src | material_src | varchar2(20) |
| 48 | money_bal | money_bal | money_bal | number(28, 8) |  |  | 0 |
| 49 | money_de | money_de | money_de | number(28, 8) |  |  | 0 |
| 50 | notax_de | notax_de | notax_de | number(28, 8) |  |  | 0 |
| 51 | objtype | objtype | objtype | number(38, 0) |
| 52 | ordercubasdoc | ordercubasdoc | ordercubasdoc | char(20) |
| 53 | outstoreno | outstoreno | outstoreno | varchar2(40) |
| 54 | pausetransact | pausetransact | pausetransact | char(1) |
| 55 | payaccount | payaccount | payaccount | varchar2(20) |  |  | '~' |
| 56 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 57 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |
| 58 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 59 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 60 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 61 | pk_deptid_v | pk_deptid_v | pk_deptid_v | varchar2(20) |  |  | '~' |
| 62 | pk_estirecbill | pk_estirecbill | pk_estirecbill | char(20) |
| 63 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 64 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 65 | pk_group | pk_group | pk_group | char(20) | √ |
| 66 | pk_org | pk_org | pk_org | char(20) | √ |
| 67 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 68 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 69 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 70 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 71 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 72 | pk_subjcode | pk_subjcode | pk_subjcode | varchar2(20) |  |  | '~' |
| 73 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |
| 74 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) | √ |
| 75 | postprice | postprice | postprice | number(28, 8) |
| 76 | postpricenotax | postpricenotax | postpricenotax | number(28, 8) |
| 77 | postquantity | postquantity | postquantity | number(20, 8) |
| 78 | postunit | postunit | postunit | varchar2(40) |
| 79 | price | price | price | number(28, 8) |  |  | 0 |
| 80 | productline | productline | productline | varchar2(20) |  |  | '~' |
| 81 | project | project | project | char(20) |
| 82 | project_task | project_task | project_task | varchar2(20) |
| 83 | purchaseorder | purchaseorder | purchaseorder | varchar2(40) |
| 84 | quantity_bal | quantity_bal | quantity_bal | number(20, 8) |  |  | 0 |
| 85 | quantity_de | quantity_de | quantity_de | number(20, 8) |  |  | 0 |
| 86 | rate | rate | rate | number(15, 8) |  |  | 1 |
| 87 | recaccount | recaccount | recaccount | varchar2(20) |  |  | '~' |
| 88 | rececountryid | rececountryid | rececountryid | varchar2(20) |
| 89 | rowno | rowno | rowno | number(38, 0) |
| 90 | rowtype | rowtype | rowtype | number(38, 0) |
| 91 | scomment | scomment | scomment | varchar2(250) |
| 92 | sett_org | sett_org | sett_org | varchar2(20) |  |  | '~' |
| 93 | sett_org_v | sett_org_v | sett_org_v | varchar2(20) |  |  | '~' |
| 94 | so_deptid | so_deptid | so_deptid | varchar2(20) |  |  | '~' |
| 95 | so_deptid_v | so_deptid_v | so_deptid_v | varchar2(20) |  |  | '~' |
| 96 | so_ordertype | so_ordertype | so_ordertype | varchar2(20) |
| 97 | so_org | so_org | so_org | varchar2(20) |  |  | '~' |
| 98 | so_org_v | so_org_v | so_org_v | varchar2(20) |  |  | '~' |
| 99 | so_psndoc | so_psndoc | so_psndoc | varchar2(20) |  |  | '~' |
| 100 | so_transtype | so_transtype | so_transtype | varchar2(20) |
| 101 | src_billid | src_billid | src_billid | char(20) |
| 102 | src_billtype | src_billtype | src_billtype | varchar2(20) |
| 103 | src_itemid | src_itemid | src_itemid | char(20) |
| 104 | src_tradetype | src_tradetype | src_tradetype | varchar2(20) |
| 105 | subjcode | subjcode | subjcode | char(20) |
| 106 | taxcodeid | taxcodeid | taxcodeid | varchar2(20) |
| 107 | taxnum | taxnum | taxnum | varchar2(30) |
| 108 | taxprice | taxprice | taxprice | number(28, 8) |  |  | 0 |
| 109 | taxrate | taxrate | taxrate | number(9, 6) |  |  | 0 |
| 110 | taxtype | taxtype | taxtype | number(38, 0) |
| 111 | top_billid | top_billid | top_billid | char(20) |
| 112 | top_billtype | top_billtype | top_billtype | varchar2(20) |
| 113 | top_itemid | top_itemid | top_itemid | char(20) |
| 114 | top_tradetype | top_tradetype | top_tradetype | varchar2(20) |
| 115 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 116 | vatcode | vatcode | vatcode | varchar2(50) |
| 117 | def1 | def1 | def1 | varchar2(101) |
| 118 | def2 | def2 | def2 | varchar2(101) |
| 119 | def3 | def3 | def3 | varchar2(101) |
| 120 | def4 | def4 | def4 | varchar2(101) |
| 121 | def5 | def5 | def5 | varchar2(101) |
| 122 | def6 | def6 | def6 | varchar2(101) |
| 123 | def7 | def7 | def7 | varchar2(101) |
| 124 | def8 | def8 | def8 | varchar2(101) |
| 125 | def9 | def9 | def9 | varchar2(101) |
| 126 | def10 | def10 | def10 | varchar2(101) |
| 127 | def11 | def11 | def11 | varchar2(101) |
| 128 | def12 | def12 | def12 | varchar2(101) |
| 129 | def13 | def13 | def13 | varchar2(101) |
| 130 | def14 | def14 | def14 | varchar2(101) |
| 131 | def15 | def15 | def15 | varchar2(101) |
| 132 | def16 | def16 | def16 | varchar2(101) |
| 133 | def17 | def17 | def17 | varchar2(101) |
| 134 | def18 | def18 | def18 | varchar2(101) |
| 135 | def19 | def19 | def19 | varchar2(101) |
| 136 | def20 | def20 | def20 | varchar2(101) |
| 137 | def21 | def21 | def21 | varchar2(101) |
| 138 | def22 | def22 | def22 | varchar2(101) |
| 139 | def23 | def23 | def23 | varchar2(101) |
| 140 | def24 | def24 | def24 | varchar2(101) |
| 141 | def25 | def25 | def25 | varchar2(101) |
| 142 | def26 | def26 | def26 | varchar2(101) |
| 143 | def27 | def27 | def27 | varchar2(101) |
| 144 | def28 | def28 | def28 | varchar2(101) |
| 145 | def29 | def29 | def29 | varchar2(101) |
| 146 | def30 | def30 | def30 | varchar2(101) |
| 147 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 148 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |