# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6552.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estipayableitem | pk_estipayableitem | pk_estipayableitem | char(20) | √ |
| 2 | assetpactno | assetpactno | assetpactno | varchar2(50) |
| 3 | bankrollprojet | bankrollprojet | bankrollprojet | varchar2(20) |  |  | '~' |
| 4 | billclass | billclass | billclass | varchar2(2) | √ |
| 5 | billdate | billdate | billdate | char(19) | √ |
| 6 | billno | billno | billno | varchar2(40) |
| 7 | busidate | busidate | busidate | char(19) |
| 8 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 9 | caltaxmny | caltaxmny | caltaxmny | number(28, 8) |
| 10 | cashitem | cashitem | cashitem | varchar2(20) |  |  | '~' |
| 11 | checkdirection | checkdirection | checkdirection | varchar2(10) |
| 12 | checkelement | checkelement | checkelement | varchar2(20) |  |  | '~' |
| 13 | checkno | checkno | checkno | varchar2(50) |
| 14 | checktype | checktype | checktype | varchar2(20) |  |  | '~' |
| 15 | ckdid | ckdid | ckdid | char(20) |
| 16 | contractno | contractno | contractno | varchar2(40) |
| 17 | coordflag | coordflag | coordflag | number(38, 0) |
| 18 | costcenter | costcenter | costcenter | varchar2(20) |
| 19 | ddhid | ddhid | ddhid | char(20) |
| 20 | dealno | dealno | dealno | varchar2(20) |
| 21 | direction | direction | direction | number(38, 0) | √ |
| 22 | equipmentcode | equipmentcode | equipmentcode | varchar2(50) |
| 23 | facard | facard | facard | varchar2(50) |
| 24 | fphid | fphid | fphid | char(20) |
| 25 | freecust | freecust | freecust | varchar2(20) |  |  | '~' |
| 26 | globalbalance | globalbalance | globalbalance | number(28, 8) |  |  | 0 |
| 27 | globalcrebit | globalcrebit | globalcrebit | number(28, 8) |  |  | 0 |
| 28 | globalnotax_cre | globalnotax_cre | globalnotax_cre | number(28, 8) |  |  | 0 |
| 29 | globalrate | globalrate | globalrate | number(15, 8) |  |  | 1 |
| 30 | globaltax_cre | globaltax_cre | globaltax_cre | number(28, 8) |  |  | 0 |
| 31 | groupbalance | groupbalance | groupbalance | number(28, 8) |  |  | 0 |
| 32 | groupcrebit | groupcrebit | groupcrebit | number(28, 8) |  |  | 0 |
| 33 | groupnotax_cre | groupnotax_cre | groupnotax_cre | number(28, 8) |  |  | 0 |
| 34 | grouprate | grouprate | grouprate | number(15, 8) |  |  | 1 |
| 35 | grouptax_cre | grouptax_cre | grouptax_cre | number(28, 8) |  |  | 0 |
| 36 | innerorderno | innerorderno | innerorderno | varchar2(40) |
| 37 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 38 | local_money_bal | local_money_bal | local_money_bal | number(28, 8) |  |  | 0 |
| 39 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |  |  | 0 |
| 40 | local_notax_cr | local_notax_cr | local_notax_cr | number(28, 8) |  |  | 0 |
| 41 | local_tax_cr | local_tax_cr | local_tax_cr | number(28, 8) |  |  | 0 |
| 42 | material | material | material | varchar2(20) |  |  | '~' |
| 43 | material_src | material_src | material_src | varchar2(20) |
| 44 | money_bal | money_bal | money_bal | number(28, 8) |  |  | 0 |
| 45 | money_cr | money_cr | money_cr | number(28, 8) |  |  | 0 |
| 46 | nosubtax | nosubtax | nosubtax | number(28, 8) |
| 47 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 48 | notax_cr | notax_cr | notax_cr | number(28, 8) |  |  | 0 |
| 49 | objtype | objtype | objtype | number(38, 0) |
| 50 | opptaxflag | opptaxflag | opptaxflag | char(1) |
| 51 | ordercubasdoc | ordercubasdoc | ordercubasdoc | varchar2(20) |  |  | '~' |
| 52 | outstoreno | outstoreno | outstoreno | varchar2(40) |
| 53 | pausetransact | pausetransact | pausetransact | char(1) |
| 54 | payaccount | payaccount | payaccount | varchar2(20) |  |  | '~' |
| 55 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 56 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 57 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 58 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 59 | pk_deptid_v | pk_deptid_v | pk_deptid_v | varchar2(20) |  |  | '~' |
| 60 | pk_estipayablebill | pk_estipayablebill | pk_estipayablebill | char(20) |
| 61 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 62 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 63 | pk_group | pk_group | pk_group | char(20) | √ |
| 64 | pk_org | pk_org | pk_org | char(20) | √ |
| 65 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 66 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 67 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |
| 68 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 69 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 70 | pk_ssitem | pk_ssitem | pk_ssitem | char(20) |
| 71 | pk_subjcode | pk_subjcode | pk_subjcode | varchar2(20) |  |  | '~' |
| 72 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |
| 73 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) | √ |
| 74 | postprice | postprice | postprice | number(28, 8) |
| 75 | postpricenotax | postpricenotax | postpricenotax | number(28, 8) |
| 76 | postquantity | postquantity | postquantity | number(20, 8) |
| 77 | postunit | postunit | postunit | varchar2(40) |
| 78 | price | price | price | number(28, 8) |  |  | 0 |
| 79 | productline | productline | productline | char(20) |
| 80 | project | project | project | char(20) |
| 81 | project_task | project_task | project_task | varchar2(20) |
| 82 | purchaseorder | purchaseorder | purchaseorder | varchar2(40) |
| 83 | pu_deptid | pu_deptid | pu_deptid | varchar2(20) |  |  | '~' |
| 84 | pu_deptid_v | pu_deptid_v | pu_deptid_v | varchar2(20) |  |  | '~' |
| 85 | pu_org | pu_org | pu_org | varchar2(20) |  |  | '~' |
| 86 | pu_org_v | pu_org_v | pu_org_v | char(20) |
| 87 | pu_psndoc | pu_psndoc | pu_psndoc | varchar2(20) |  |  | '~' |
| 88 | quantity_bal | quantity_bal | quantity_bal | number(20, 8) |  |  | 0 |
| 89 | quantity_cr | quantity_cr | quantity_cr | number(20, 8) |  |  | 0 |
| 90 | rate | rate | rate | number(15, 8) |  |  | 1 |
| 91 | recaccount | recaccount | recaccount | varchar2(20) |  |  | '~' |
| 92 | rowno | rowno | rowno | number(38, 0) |
| 93 | rowtype | rowtype | rowtype | number(38, 0) |
| 94 | scomment | scomment | scomment | varchar2(250) |
| 95 | sendcountryid | sendcountryid | sendcountryid | varchar2(20) |
| 96 | sett_org | sett_org | sett_org | varchar2(20) |  |  | '~' |
| 97 | sett_org_v | sett_org_v | sett_org_v | varchar2(20) |  |  | '~' |
| 98 | src_billid | src_billid | src_billid | char(20) |
| 99 | src_billtype | src_billtype | src_billtype | varchar2(20) |
| 100 | src_itemid | src_itemid | src_itemid | char(20) |
| 101 | src_tradetype | src_tradetype | src_tradetype | varchar2(20) |
| 102 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 103 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 104 | taxcodeid | taxcodeid | taxcodeid | varchar2(20) |
| 105 | taxnum | taxnum | taxnum | varchar2(30) |  |  | '0' |
| 106 | taxprice | taxprice | taxprice | number(28, 8) |  |  | 0 |
| 107 | taxrate | taxrate | taxrate | number(9, 6) |  |  | 0 |
| 108 | taxtype | taxtype | taxtype | number(38, 0) |
| 109 | top_billid | top_billid | top_billid | char(20) |
| 110 | top_billtype | top_billtype | top_billtype | varchar2(20) |
| 111 | top_itemid | top_itemid | top_itemid | char(20) |
| 112 | top_tradetype | top_tradetype | top_tradetype | varchar2(20) |
| 113 | vatcode | vatcode | vatcode | varchar2(50) |
| 114 | vendorvatcode | vendorvatcode | vendorvatcode | varchar2(50) |
| 115 | def1 | def1 | def1 | varchar2(101) |
| 116 | def2 | def2 | def2 | varchar2(101) |
| 117 | def3 | def3 | def3 | varchar2(101) |
| 118 | def4 | def4 | def4 | varchar2(101) |
| 119 | def5 | def5 | def5 | varchar2(101) |
| 120 | def6 | def6 | def6 | varchar2(101) |
| 121 | def7 | def7 | def7 | varchar2(101) |
| 122 | def8 | def8 | def8 | varchar2(101) |
| 123 | def9 | def9 | def9 | varchar2(101) |
| 124 | def10 | def10 | def10 | varchar2(101) |
| 125 | def11 | def11 | def11 | varchar2(101) |
| 126 | def12 | def12 | def12 | varchar2(101) |
| 127 | def13 | def13 | def13 | varchar2(101) |
| 128 | def14 | def14 | def14 | varchar2(101) |
| 129 | def15 | def15 | def15 | varchar2(101) |
| 130 | def16 | def16 | def16 | varchar2(101) |
| 131 | def17 | def17 | def17 | varchar2(101) |
| 132 | def18 | def18 | def18 | varchar2(101) |
| 133 | def19 | def19 | def19 | varchar2(101) |
| 134 | def20 | def20 | def20 | varchar2(101) |
| 135 | def21 | def21 | def21 | varchar2(101) |
| 136 | def22 | def22 | def22 | varchar2(101) |
| 137 | def23 | def23 | def23 | varchar2(101) |
| 138 | def24 | def24 | def24 | varchar2(101) |
| 139 | def25 | def25 | def25 | varchar2(101) |
| 140 | def26 | def26 | def26 | varchar2(101) |
| 141 | def27 | def27 | def27 | varchar2(101) |
| 142 | def28 | def28 | def28 | varchar2(101) |
| 143 | def29 | def29 | def29 | varchar2(101) |
| 144 | def30 | def30 | def30 | varchar2(101) |
| 145 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 146 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |