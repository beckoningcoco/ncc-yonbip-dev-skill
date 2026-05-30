# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6554.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payableitem | pk_payableitem | pk_payableitem | char(20) | √ |
| 2 | assetpactno | assetpactno | assetpactno | varchar2(80) |
| 3 | bankrollprojet | bankrollprojet | bankrollprojet | varchar2(20) |  |  | '~' |
| 4 | billclass | billclass | billclass | varchar2(2) | √ |  | 'yf' |
| 5 | billdate | billdate | billdate | char(19) | √ |
| 6 | billno | billno | billno | varchar2(40) |
| 7 | busidate | busidate | busidate | char(19) |
| 8 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 9 | caltaxmny | caltaxmny | caltaxmny | number(28, 8) |
| 10 | cashitem | cashitem | cashitem | varchar2(20) |  |  | '~' |
| 11 | cbs | cbs | cbs | varchar2(20) |
| 12 | checkelement | checkelement | checkelement | varchar2(20) |  |  | '~' |
| 13 | checktype | checktype | checktype | varchar2(20) |  |  | '~' |
| 14 | confernum | confernum | confernum | varchar2(60) |
| 15 | contractno | contractno | contractno | varchar2(40) |
| 16 | coordflag | coordflag | coordflag | number(38, 0) |
| 17 | costcenter | costcenter | costcenter | varchar2(20) |
| 18 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 19 | direction | direction | direction | number(38, 0) | √ |  | -1 |
| 20 | equipmentcode | equipmentcode | equipmentcode | varchar2(100) |
| 21 | facard | facard | facard | varchar2(50) |  |  | '~' |
| 22 | freecust | freecust | freecust | varchar2(20) |  |  | '~' |
| 23 | globalbalance | globalbalance | globalbalance | number(28, 8) |  |  | 0 |
| 24 | globalcrebit | globalcrebit | globalcrebit | number(28, 8) |  |  | 0 |
| 25 | globalnotax_cre | globalnotax_cre | globalnotax_cre | number(28, 8) |  |  | 0 |
| 26 | globalrate | globalrate | globalrate | number(15, 8) |  |  | 1 |
| 27 | globaltax_cre | globaltax_cre | globaltax_cre | number(28, 8) |  |  | 0 |
| 28 | groupbalance | groupbalance | groupbalance | number(28, 8) |  |  | 0 |
| 29 | groupcrebit | groupcrebit | groupcrebit | number(28, 8) |  |  | 0 |
| 30 | groupnotax_cre | groupnotax_cre | groupnotax_cre | number(28, 8) |  |  | 0 |
| 31 | grouprate | grouprate | grouprate | number(15, 8) |  |  | 1 |
| 32 | grouptax_cre | grouptax_cre | grouptax_cre | number(28, 8) |  |  | 0 |
| 33 | innerorderno | innerorderno | innerorderno | varchar2(40) |
| 34 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 35 | isurgent | isurgent | isurgent | char(1) |  |  | 'N' |
| 36 | local_money_bal | local_money_bal | local_money_bal | number(28, 8) |  |  | 0 |
| 37 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |  |  | 0 |
| 38 | local_notax_cr | local_notax_cr | local_notax_cr | number(28, 8) |  |  | 0 |
| 39 | local_price | local_price | local_price | number(28, 8) |  |  | 0 |
| 40 | local_taxprice | local_taxprice | local_taxprice | number(28, 8) |  |  | 0 |
| 41 | local_tax_cr | local_tax_cr | local_tax_cr | number(28, 8) |  |  | 0 |
| 42 | material | material | material | varchar2(20) |  |  | '~' |
| 43 | material_src | material_src | material_src | varchar2(20) |
| 44 | money_bal | money_bal | money_bal | number(28, 8) |  |  | 0 |
| 45 | money_cr | money_cr | money_cr | number(28, 8) |  |  | 0 |
| 46 | nosubtax | nosubtax | nosubtax | number(28, 8) |
| 47 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 48 | notax_cr | notax_cr | notax_cr | number(28, 8) |  |  | 0 |
| 49 | objtype | objtype | objtype | number(38, 0) |
| 50 | occupationmny | occupationmny | occupationmny | number(28, 8) |  |  | 0 |
| 51 | opptaxflag | opptaxflag | opptaxflag | char(1) |
| 52 | ordercubasdoc | ordercubasdoc | ordercubasdoc | varchar2(20) |  |  | '~' |
| 53 | outstoreno | outstoreno | outstoreno | varchar2(40) |
| 54 | pausetransact | pausetransact | pausetransact | char(1) |
| 55 | payaccount | payaccount | payaccount | varchar2(20) |  |  | '~' |
| 56 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |
| 57 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 58 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 59 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 60 | pk_deptid_v | pk_deptid_v | pk_deptid_v | varchar2(20) |  |  | '~' |
| 61 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 62 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 63 | pk_group | pk_group | pk_group | char(20) | √ |
| 64 | pk_org | pk_org | pk_org | char(20) | √ |
| 65 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 66 | pk_payablebill | pk_payablebill | pk_payablebill | char(20) |
| 67 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 68 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 69 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 70 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 71 | pk_ssitem | pk_ssitem | pk_ssitem | char(20) |
| 72 | pk_subjcode | pk_subjcode | pk_subjcode | varchar2(20) |  |  | '~' |
| 73 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) | √ |
| 74 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 75 | postprice | postprice | postprice | number(28, 8) |  |  | 0 |
| 76 | postpricenotax | postpricenotax | postpricenotax | number(28, 8) |  |  | 0 |
| 77 | postquantity | postquantity | postquantity | number(20, 8) |  |  | 0 |
| 78 | postunit | postunit | postunit | varchar2(40) |
| 79 | price | price | price | number(28, 8) |  |  | 0 |
| 80 | productline | productline | productline | varchar2(20) |  |  | '~' |
| 81 | project | project | project | varchar2(20) |
| 82 | project_task | project_task | project_task | varchar2(20) |
| 83 | purchaseorder | purchaseorder | purchaseorder | varchar2(40) |
| 84 | pu_deptid | pu_deptid | pu_deptid | varchar2(20) |  |  | '~' |
| 85 | pu_deptid_v | pu_deptid_v | pu_deptid_v | varchar2(20) |  |  | '~' |
| 86 | pu_org | pu_org | pu_org | varchar2(20) |  |  | '~' |
| 87 | pu_org_v | pu_org_v | pu_org_v | char(20) |
| 88 | pu_psndoc | pu_psndoc | pu_psndoc | char(20) |
| 89 | quantity_bal | quantity_bal | quantity_bal | number(20, 8) |  |  | 0 |
| 90 | quantity_cr | quantity_cr | quantity_cr | number(20, 8) |  |  | 0 |
| 91 | rate | rate | rate | number(15, 8) |  |  | 1 |
| 92 | recaccount | recaccount | recaccount | varchar2(20) |  |  | '~' |
| 93 | rowno | rowno | rowno | number(38, 0) |
| 94 | rowtype | rowtype | rowtype | number(38, 0) |
| 95 | scomment | scomment | scomment | varchar2(250) |  |  | '~' |
| 96 | sendcountryid | sendcountryid | sendcountryid | varchar2(20) |
| 97 | settlecurr | settlecurr | settlecurr | varchar2(20) |
| 98 | settlemoney | settlemoney | settlemoney | number(28, 8) |
| 99 | settleno | settleno | settleno | varchar2(20) |
| 100 | sett_org | sett_org | sett_org | varchar2(20) |  |  | '~' |
| 101 | sett_org_v | sett_org_v | sett_org_v | varchar2(20) |  |  | '~' |
| 102 | src_billid | src_billid | src_billid | char(20) |
| 103 | src_billtype | src_billtype | src_billtype | varchar2(20) |
| 104 | src_itemid | src_itemid | src_itemid | char(20) |
| 105 | src_tradetype | src_tradetype | src_tradetype | varchar2(20) |
| 106 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 107 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 108 | taxcodeid | taxcodeid | taxcodeid | varchar2(20) |
| 109 | taxnum | taxnum | taxnum | varchar2(30) |
| 110 | taxprice | taxprice | taxprice | number(28, 8) |  |  | 0 |
| 111 | taxrate | taxrate | taxrate | number(9, 6) |  |  | 0 |
| 112 | taxtype | taxtype | taxtype | number(38, 0) |
| 113 | top_billid | top_billid | top_billid | char(20) |
| 114 | top_billtype | top_billtype | top_billtype | varchar2(20) |
| 115 | top_itemid | top_itemid | top_itemid | char(20) |
| 116 | top_tradetype | top_tradetype | top_tradetype | varchar2(20) |
| 117 | vatcode | vatcode | vatcode | varchar2(50) |
| 118 | vendorvatcode | vendorvatcode | vendorvatcode | varchar2(50) |
| 119 | def1 | def1 | def1 | varchar2(101) |
| 120 | def2 | def2 | def2 | varchar2(101) |
| 121 | def3 | def3 | def3 | varchar2(101) |
| 122 | def4 | def4 | def4 | varchar2(101) |
| 123 | def5 | def5 | def5 | varchar2(101) |
| 124 | def6 | def6 | def6 | varchar2(101) |
| 125 | def7 | def7 | def7 | varchar2(101) |
| 126 | def8 | def8 | def8 | varchar2(101) |
| 127 | def9 | def9 | def9 | varchar2(101) |
| 128 | def10 | def10 | def10 | varchar2(101) |
| 129 | def11 | def11 | def11 | varchar2(101) |
| 130 | def12 | def12 | def12 | varchar2(101) |
| 131 | def13 | def13 | def13 | varchar2(101) |
| 132 | def14 | def14 | def14 | varchar2(101) |
| 133 | def15 | def15 | def15 | varchar2(101) |
| 134 | def16 | def16 | def16 | varchar2(101) |
| 135 | def17 | def17 | def17 | varchar2(101) |
| 136 | def18 | def18 | def18 | varchar2(101) |
| 137 | def19 | def19 | def19 | varchar2(101) |
| 138 | def20 | def20 | def20 | varchar2(101) |
| 139 | def21 | def21 | def21 | varchar2(101) |
| 140 | def22 | def22 | def22 | varchar2(101) |
| 141 | def23 | def23 | def23 | varchar2(101) |
| 142 | def24 | def24 | def24 | varchar2(101) |
| 143 | def25 | def25 | def25 | varchar2(101) |
| 144 | def26 | def26 | def26 | varchar2(101) |
| 145 | def27 | def27 | def27 | varchar2(101) |
| 146 | def28 | def28 | def28 | varchar2(101) |
| 147 | def29 | def29 | def29 | varchar2(101) |
| 148 | def30 | def30 | def30 | varchar2(101) |
| 149 | def31 | def31 | def31 | varchar2(101) |
| 150 | def32 | def32 | def32 | varchar2(101) |
| 151 | def33 | def33 | def33 | varchar2(101) |
| 152 | def34 | def34 | def34 | varchar2(101) |
| 153 | def35 | def35 | def35 | varchar2(101) |
| 154 | def36 | def36 | def36 | varchar2(101) |
| 155 | def37 | def37 | def37 | varchar2(101) |
| 156 | def38 | def38 | def38 | varchar2(101) |
| 157 | def39 | def39 | def39 | varchar2(101) |
| 158 | def40 | def40 | def40 | varchar2(101) |
| 159 | def41 | def41 | def41 | varchar2(101) |
| 160 | def42 | def42 | def42 | varchar2(101) |
| 161 | def43 | def43 | def43 | varchar2(101) |
| 162 | def44 | def44 | def44 | varchar2(101) |
| 163 | def45 | def45 | def45 | varchar2(101) |
| 164 | def46 | def46 | def46 | varchar2(101) |
| 165 | def47 | def47 | def47 | varchar2(101) |
| 166 | def48 | def48 | def48 | varchar2(101) |
| 167 | def49 | def49 | def49 | varchar2(101) |
| 168 | def50 | def50 | def50 | varchar2(101) |
| 169 | def51 | def51 | def51 | varchar2(101) |
| 170 | def52 | def52 | def52 | varchar2(101) |
| 171 | def53 | def53 | def53 | varchar2(101) |
| 172 | def54 | def54 | def54 | varchar2(101) |
| 173 | def55 | def55 | def55 | varchar2(101) |
| 174 | def56 | def56 | def56 | varchar2(101) |
| 175 | def57 | def57 | def57 | varchar2(101) |
| 176 | def58 | def58 | def58 | varchar2(101) |
| 177 | def59 | def59 | def59 | varchar2(101) |
| 178 | def60 | def60 | def60 | varchar2(101) |
| 179 | def61 | def61 | def61 | varchar2(101) |
| 180 | def62 | def62 | def62 | varchar2(101) |
| 181 | def63 | def63 | def63 | varchar2(101) |
| 182 | def64 | def64 | def64 | varchar2(101) |
| 183 | def65 | def65 | def65 | varchar2(101) |
| 184 | def66 | def66 | def66 | varchar2(101) |
| 185 | def67 | def67 | def67 | varchar2(101) |
| 186 | def68 | def68 | def68 | varchar2(101) |
| 187 | def69 | def69 | def69 | varchar2(101) |
| 188 | def70 | def70 | def70 | varchar2(101) |
| 189 | def71 | def71 | def71 | varchar2(101) |
| 190 | def72 | def72 | def72 | varchar2(101) |
| 191 | def73 | def73 | def73 | varchar2(101) |
| 192 | def74 | def74 | def74 | varchar2(101) |
| 193 | def75 | def75 | def75 | varchar2(101) |
| 194 | def76 | def76 | def76 | varchar2(101) |
| 195 | def77 | def77 | def77 | varchar2(101) |
| 196 | def78 | def78 | def78 | varchar2(101) |
| 197 | def79 | def79 | def79 | varchar2(101) |
| 198 | def80 | def80 | def80 | varchar2(101) |
| 199 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 200 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |