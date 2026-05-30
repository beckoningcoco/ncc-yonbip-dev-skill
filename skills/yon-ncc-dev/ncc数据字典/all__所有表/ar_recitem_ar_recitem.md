# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6603.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recitem | pk_recitem | pk_recitem | char(20) | √ |
| 2 | assetpactno | assetpactno | assetpactno | varchar2(80) |
| 3 | bankrollprojet | bankrollprojet | bankrollprojet | varchar2(20) |  |  | '~' |
| 4 | batchcode | batchcode | batchcode | varchar2(50) |
| 5 | billclass | billclass | billclass | varchar2(2) | √ |  | 'ys' |
| 6 | billdate | billdate | billdate | char(19) | √ |
| 7 | billno | billno | billno | varchar2(40) |
| 8 | busidate | busidate | busidate | char(19) |
| 9 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 10 | caltaxmny | caltaxmny | caltaxmny | number(28, 8) |
| 11 | cashitem | cashitem | cashitem | varchar2(20) |  |  | '~' |
| 12 | checkelement | checkelement | checkelement | varchar2(20) |  |  | '~' |
| 13 | confernum | confernum | confernum | varchar2(60) |
| 14 | contractno | contractno | contractno | varchar2(40) |
| 15 | coordflag | coordflag | coordflag | number(38, 0) |
| 16 | costcenter | costcenter | costcenter | varchar2(20) |
| 17 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 18 | custvatcode | custvatcode | custvatcode | varchar2(50) |
| 19 | direction | direction | direction | number(38, 0) | √ |
| 20 | equipmentcode | equipmentcode | equipmentcode | varchar2(100) |
| 21 | freecust | freecust | freecust | varchar2(20) |  |  | '~' |
| 22 | globalbalance | globalbalance | globalbalance | number(28, 8) |  |  | 0 |
| 23 | globaldebit | globaldebit | globaldebit | number(28, 8) |  |  | 0 |
| 24 | globalnotax_de | globalnotax_de | globalnotax_de | number(28, 8) |  |  | 0 |
| 25 | globalrate | globalrate | globalrate | number(15, 8) |  |  | 1 |
| 26 | globaltax_de | globaltax_de | globaltax_de | number(28, 8) |  |  | 0 |
| 27 | groupbalance | groupbalance | groupbalance | number(28, 8) |  |  | 0 |
| 28 | groupdebit | groupdebit | groupdebit | number(28, 8) |  |  | 0 |
| 29 | groupnotax_de | groupnotax_de | groupnotax_de | number(28, 8) |  |  | 0 |
| 30 | grouprate | grouprate | grouprate | number(15, 8) |  |  | 1 |
| 31 | grouptax_de | grouptax_de | grouptax_de | number(28, 8) |  |  | 0 |
| 32 | innerorderno | innerorderno | innerorderno | varchar2(40) |
| 33 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 34 | local_money_bal | local_money_bal | local_money_bal | number(28, 8) |  |  | 0 |
| 35 | local_money_de | local_money_de | local_money_de | number(28, 8) |  |  | 0 |
| 36 | local_notax_de | local_notax_de | local_notax_de | number(28, 8) |  |  | 0 |
| 37 | local_price | local_price | local_price | number(28, 8) |  |  | 0 |
| 38 | local_taxprice | local_taxprice | local_taxprice | number(28, 8) |  |  | 0 |
| 39 | local_tax_de | local_tax_de | local_tax_de | number(28, 8) |  |  | 0 |
| 40 | matcustcode | matcustcode | matcustcode | varchar2(20) |
| 41 | material | material | material | varchar2(20) |  |  | '~' |
| 42 | material_src | material_src | material_src | varchar2(20) |
| 43 | money_bal | money_bal | money_bal | number(28, 8) |  |  | 0 |
| 44 | money_de | money_de | money_de | number(28, 8) |  |  | 0 |
| 45 | notax_de | notax_de | notax_de | number(28, 8) |  |  | 0 |
| 46 | objtype | objtype | objtype | number(38, 0) |
| 47 | occupationmny | occupationmny | occupationmny | number(28, 8) |  |  | 0 |
| 48 | ordercubasdoc | ordercubasdoc | ordercubasdoc | varchar2(20) |  |  | '~' |
| 49 | outstoreno | outstoreno | outstoreno | varchar2(40) |
| 50 | pausetransact | pausetransact | pausetransact | char(1) |
| 51 | payaccount | payaccount | payaccount | varchar2(20) |  |  | '~' |
| 52 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |
| 53 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |
| 54 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 55 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 56 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 57 | pk_deptid_v | pk_deptid_v | pk_deptid_v | varchar2(20) |  |  | '~' |
| 58 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 59 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 60 | pk_group | pk_group | pk_group | char(20) | √ |
| 61 | pk_org | pk_org | pk_org | char(20) | √ |
| 62 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 63 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 64 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 65 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 66 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 67 | pk_recbill | pk_recbill | pk_recbill | char(20) |
| 68 | pk_ssitem | pk_ssitem | pk_ssitem | char(20) |
| 69 | pk_subjcode | pk_subjcode | pk_subjcode | varchar2(20) |  |  | '~' |
| 70 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) | √ |
| 71 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) | √ |
| 72 | postprice | postprice | postprice | number(28, 8) |  |  | 0 |
| 73 | postpricenotax | postpricenotax | postpricenotax | number(28, 8) |  |  | 0 |
| 74 | postquantity | postquantity | postquantity | number(20, 8) |  |  | 0 |
| 75 | postunit | postunit | postunit | varchar2(40) |
| 76 | price | price | price | number(28, 8) |  |  | 0 |
| 77 | productline | productline | productline | varchar2(20) |  |  | '~' |
| 78 | project | project | project | varchar2(20) |
| 79 | project_task | project_task | project_task | varchar2(20) |
| 80 | purchaseorder | purchaseorder | purchaseorder | varchar2(40) |
| 81 | quantity_bal | quantity_bal | quantity_bal | number(20, 8) |  |  | 0 |
| 82 | quantity_de | quantity_de | quantity_de | number(20, 8) |  |  | 0 |
| 83 | rate | rate | rate | number(15, 8) |  |  | 1 |
| 84 | recaccount | recaccount | recaccount | varchar2(20) |  |  | '~' |
| 85 | rececountryid | rececountryid | rececountryid | varchar2(20) |
| 86 | rowno | rowno | rowno | number(38, 0) |
| 87 | rowtype | rowtype | rowtype | number(38, 0) |
| 88 | scomment | scomment | scomment | varchar2(250) |  |  | '~' |
| 89 | settlecurr | settlecurr | settlecurr | varchar2(20) |
| 90 | settlemoney | settlemoney | settlemoney | number(28, 8) |
| 91 | settleno | settleno | settleno | varchar2(20) |
| 92 | sett_org | sett_org | sett_org | varchar2(20) |  |  | '~' |
| 93 | sett_org_v | sett_org_v | sett_org_v | varchar2(20) |  |  | '~' |
| 94 | so_deptid | so_deptid | so_deptid | varchar2(20) |  |  | '~' |
| 95 | so_deptid_v | so_deptid_v | so_deptid_v | varchar2(20) |  |  | '~' |
| 96 | so_ordertype | so_ordertype | so_ordertype | varchar2(20) |  |  | '~' |
| 97 | so_org | so_org | so_org | varchar2(20) |  |  | '~' |
| 98 | so_org_v | so_org_v | so_org_v | varchar2(20) |  |  | '~' |
| 99 | so_psndoc | so_psndoc | so_psndoc | varchar2(20) |  |  | '~' |
| 100 | so_transtype | so_transtype | so_transtype | varchar2(20) |
| 101 | src_billid | src_billid | src_billid | char(20) |
| 102 | src_billtype | src_billtype | src_billtype | varchar2(20) |
| 103 | src_itemid | src_itemid | src_itemid | char(20) |
| 104 | src_tradetype | src_tradetype | src_tradetype | varchar2(20) |
| 105 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 106 | supplier | supplier | supplier | varchar2(20) |
| 107 | taxcodeid | taxcodeid | taxcodeid | varchar2(20) |
| 108 | taxnum | taxnum | taxnum | varchar2(30) |
| 109 | taxprice | taxprice | taxprice | number(28, 8) |  |  | 0 |
| 110 | taxrate | taxrate | taxrate | number(9, 6) |  |  | 0 |
| 111 | taxtype | taxtype | taxtype | number(38, 0) |
| 112 | top_billid | top_billid | top_billid | char(20) |
| 113 | top_billtype | top_billtype | top_billtype | varchar2(20) |
| 114 | top_itemid | top_itemid | top_itemid | char(20) |
| 115 | top_tradetype | top_tradetype | top_tradetype | varchar2(20) |
| 116 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 117 | vatcode | vatcode | vatcode | varchar2(50) |
| 118 | def1 | def1 | def1 | varchar2(101) |
| 119 | def2 | def2 | def2 | varchar2(101) |
| 120 | def3 | def3 | def3 | varchar2(101) |
| 121 | def4 | def4 | def4 | varchar2(101) |
| 122 | def5 | def5 | def5 | varchar2(101) |
| 123 | def6 | def6 | def6 | varchar2(101) |
| 124 | def7 | def7 | def7 | varchar2(101) |
| 125 | def8 | def8 | def8 | varchar2(101) |
| 126 | def9 | def9 | def9 | varchar2(101) |
| 127 | def10 | def10 | def10 | varchar2(101) |
| 128 | def11 | def11 | def11 | varchar2(101) |
| 129 | def12 | def12 | def12 | varchar2(101) |
| 130 | def13 | def13 | def13 | varchar2(101) |
| 131 | def14 | def14 | def14 | varchar2(101) |
| 132 | def15 | def15 | def15 | varchar2(101) |
| 133 | def16 | def16 | def16 | varchar2(101) |
| 134 | def17 | def17 | def17 | varchar2(101) |
| 135 | def18 | def18 | def18 | varchar2(101) |
| 136 | def19 | def19 | def19 | varchar2(101) |
| 137 | def20 | def20 | def20 | varchar2(101) |
| 138 | def21 | def21 | def21 | varchar2(101) |
| 139 | def22 | def22 | def22 | varchar2(101) |
| 140 | def23 | def23 | def23 | varchar2(101) |
| 141 | def24 | def24 | def24 | varchar2(101) |
| 142 | def25 | def25 | def25 | varchar2(101) |
| 143 | def26 | def26 | def26 | varchar2(101) |
| 144 | def27 | def27 | def27 | varchar2(101) |
| 145 | def28 | def28 | def28 | varchar2(101) |
| 146 | def29 | def29 | def29 | varchar2(101) |
| 147 | def30 | def30 | def30 | varchar2(101) |
| 148 | def31 | def31 | def31 | varchar2(101) |
| 149 | def32 | def32 | def32 | varchar2(101) |
| 150 | def33 | def33 | def33 | varchar2(101) |
| 151 | def34 | def34 | def34 | varchar2(101) |
| 152 | def35 | def35 | def35 | varchar2(101) |
| 153 | def36 | def36 | def36 | varchar2(101) |
| 154 | def37 | def37 | def37 | varchar2(101) |
| 155 | def38 | def38 | def38 | varchar2(101) |
| 156 | def39 | def39 | def39 | varchar2(101) |
| 157 | def40 | def40 | def40 | varchar2(101) |
| 158 | def41 | def41 | def41 | varchar2(101) |
| 159 | def42 | def42 | def42 | varchar2(101) |
| 160 | def43 | def43 | def43 | varchar2(101) |
| 161 | def44 | def44 | def44 | varchar2(101) |
| 162 | def45 | def45 | def45 | varchar2(101) |
| 163 | def46 | def46 | def46 | varchar2(101) |
| 164 | def47 | def47 | def47 | varchar2(101) |
| 165 | def48 | def48 | def48 | varchar2(101) |
| 166 | def49 | def49 | def49 | varchar2(101) |
| 167 | def50 | def50 | def50 | varchar2(101) |
| 168 | def51 | def51 | def51 | varchar2(101) |
| 169 | def52 | def52 | def52 | varchar2(101) |
| 170 | def53 | def53 | def53 | varchar2(101) |
| 171 | def54 | def54 | def54 | varchar2(101) |
| 172 | def55 | def55 | def55 | varchar2(101) |
| 173 | def56 | def56 | def56 | varchar2(101) |
| 174 | def57 | def57 | def57 | varchar2(101) |
| 175 | def58 | def58 | def58 | varchar2(101) |
| 176 | def59 | def59 | def59 | varchar2(101) |
| 177 | def60 | def60 | def60 | varchar2(101) |
| 178 | def61 | def61 | def61 | varchar2(101) |
| 179 | def62 | def62 | def62 | varchar2(101) |
| 180 | def63 | def63 | def63 | varchar2(101) |
| 181 | def64 | def64 | def64 | varchar2(101) |
| 182 | def65 | def65 | def65 | varchar2(101) |
| 183 | def66 | def66 | def66 | varchar2(101) |
| 184 | def67 | def67 | def67 | varchar2(101) |
| 185 | def68 | def68 | def68 | varchar2(101) |
| 186 | def69 | def69 | def69 | varchar2(101) |
| 187 | def70 | def70 | def70 | varchar2(101) |
| 188 | def71 | def71 | def71 | varchar2(101) |
| 189 | def72 | def72 | def72 | varchar2(101) |
| 190 | def73 | def73 | def73 | varchar2(101) |
| 191 | def74 | def74 | def74 | varchar2(101) |
| 192 | def75 | def75 | def75 | varchar2(101) |
| 193 | def76 | def76 | def76 | varchar2(101) |
| 194 | def77 | def77 | def77 | varchar2(101) |
| 195 | def78 | def78 | def78 | varchar2(101) |
| 196 | def79 | def79 | def79 | varchar2(101) |
| 197 | def80 | def80 | def80 | varchar2(101) |
| 198 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 199 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |