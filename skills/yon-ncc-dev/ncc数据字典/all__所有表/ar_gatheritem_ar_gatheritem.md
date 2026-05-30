# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6601.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatheritem | pk_gatheritem | pk_gatheritem | char(20) | √ |
| 2 | agentreceivelocal | agentreceivelocal | agentreceivelocal | number(28, 8) |
| 3 | agentreceiveprimal | agentreceiveprimal | agentreceiveprimal | number(28, 8) |
| 4 | assetpactno | assetpactno | assetpactno | varchar2(80) |
| 5 | bankrelated_code | bankrelated_code | bankrelated_code | varchar2(100) |
| 6 | bankrollprojet | bankrollprojet | bankrollprojet | varchar2(20) |  |  | '~' |
| 7 | billclass | billclass | billclass | varchar2(20) | √ |  | 'sk' |
| 8 | billdate | billdate | billdate | char(19) | √ |
| 9 | billno | billno | billno | varchar2(40) |
| 10 | busidate | busidate | busidate | char(19) |
| 11 | buysellflag | buysellflag | buysellflag | number(38, 0) |
| 12 | cashaccount | cashaccount | cashaccount | varchar2(20) |
| 13 | cashitem | cashitem | cashitem | varchar2(20) |  |  | '~' |
| 14 | checkdirection | checkdirection | checkdirection | varchar2(50) |
| 15 | checkelement | checkelement | checkelement | varchar2(20) |  |  | '~' |
| 16 | checkno | checkno | checkno | varchar2(36) |  |  | '~' |
| 17 | checktype | checktype | checktype | varchar2(20) |  |  | '~' |
| 18 | commpayer | commpayer | commpayer | varchar2(20) |
| 19 | commpaystatus | commpaystatus | commpaystatus | number(8, 0) |
| 20 | commpaytype | commpaytype | commpaytype | number(38, 0) |
| 21 | confernum | confernum | confernum | varchar2(60) |
| 22 | contractno | contractno | contractno | varchar2(40) |
| 23 | coordflag | coordflag | coordflag | number(38, 0) |
| 24 | costcenter | costcenter | costcenter | varchar2(20) |
| 25 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 26 | custvatcode | custvatcode | custvatcode | varchar2(50) |
| 27 | direction | direction | direction | number(38, 0) | √ |
| 28 | equipmentcode | equipmentcode | equipmentcode | varchar2(100) |
| 29 | facard | facard | facard | varchar2(50) |
| 30 | freecust | freecust | freecust | varchar2(20) |  |  | '~' |
| 31 | globalagentreceivelocal | globalagentreceivelocal | globalagentreceivelocal | number(28, 8) |
| 32 | globalbalance | globalbalance | globalbalance | number(28, 8) |  |  | 0 |
| 33 | globalcrebit | globalcrebit | globalcrebit | number(28, 8) |  |  | 0 |
| 34 | globalnotax_cre | globalnotax_cre | globalnotax_cre | number(28, 8) |  |  | 0 |
| 35 | globalrate | globalrate | globalrate | number(15, 8) |  |  | 1 |
| 36 | globaltax_cre | globaltax_cre | globaltax_cre | number(28, 8) |  |  | 0 |
| 37 | groupagentreceivelocal | groupagentreceivelocal | groupagentreceivelocal | number(28, 8) |
| 38 | groupbalance | groupbalance | groupbalance | number(28, 8) |  |  | 0 |
| 39 | groupcrebit | groupcrebit | groupcrebit | number(28, 8) |  |  | 0 |
| 40 | groupnotax_cre | groupnotax_cre | groupnotax_cre | number(28, 8) |  |  | 0 |
| 41 | grouprate | grouprate | grouprate | number(15, 8) |  |  | 1 |
| 42 | grouptax_cre | grouptax_cre | grouptax_cre | number(28, 8) |  |  | 0 |
| 43 | innerorderno | innerorderno | innerorderno | varchar2(40) |
| 44 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 45 | isdiscount | isdiscount | isdiscount | char(1) |
| 46 | isrefused | isrefused | isrefused | char(1) |
| 47 | local_money_bal | local_money_bal | local_money_bal | number(28, 8) |  |  | 0 |
| 48 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |  |  | 0 |
| 49 | local_notax_cr | local_notax_cr | local_notax_cr | number(28, 8) |  |  | 0 |
| 50 | local_price | local_price | local_price | number(28, 8) |
| 51 | local_taxprice | local_taxprice | local_taxprice | number(28, 8) |
| 52 | local_tax_cr | local_tax_cr | local_tax_cr | number(28, 8) |  |  | 0 |
| 53 | matcustcode | matcustcode | matcustcode | varchar2(20) |
| 54 | material | material | material | varchar2(20) |  |  | '~' |
| 55 | material_src | material_src | material_src | varchar2(20) |
| 56 | money_bal | money_bal | money_bal | number(28, 8) |  |  | 0 |
| 57 | money_cr | money_cr | money_cr | number(28, 8) |  |  | 0 |
| 58 | notax_cr | notax_cr | notax_cr | number(28, 8) |  |  | 0 |
| 59 | objtype | objtype | objtype | number(38, 0) |
| 60 | occupationmny | occupationmny | occupationmny | number(28, 8) |  |  | 0 |
| 61 | ordercubasdoc | ordercubasdoc | ordercubasdoc | varchar2(20) |  |  | '~' |
| 62 | outstoreno | outstoreno | outstoreno | varchar2(40) |
| 63 | pausetransact | pausetransact | pausetransact | char(1) |
| 64 | payaccount | payaccount | payaccount | varchar2(20) |  |  | '~' |
| 65 | paydate | paydate | paydate | char(19) |
| 66 | payflag | payflag | payflag | number(38, 0) |
| 67 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 68 | payreason | payreason | payreason | varchar2(181) |
| 69 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 70 | pk_billtype | pk_billtype | pk_billtype | varchar2(36) | √ |
| 71 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 72 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 73 | pk_deptid_v | pk_deptid_v | pk_deptid_v | varchar2(20) |  |  | '~' |
| 74 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 75 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 76 | pk_gatherbill | pk_gatherbill | pk_gatherbill | char(20) |
| 77 | pk_group | pk_group | pk_group | char(20) | √ |
| 78 | pk_org | pk_org | pk_org | char(20) | √ |
| 79 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 80 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 81 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 82 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 83 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 84 | pk_recpaytype | pk_recpaytype | pk_recpaytype | varchar2(20) |
| 85 | pk_ssitem | pk_ssitem | pk_ssitem | char(20) |
| 86 | pk_subjcode | pk_subjcode | pk_subjcode | varchar2(20) |  |  | '~' |
| 87 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) | √ |
| 88 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 89 | postprice | postprice | postprice | number(28, 8) |
| 90 | postpricenotax | postpricenotax | postpricenotax | number(28, 8) |
| 91 | postquantity | postquantity | postquantity | number(20, 8) |
| 92 | postunit | postunit | postunit | varchar2(40) |
| 93 | prepay | prepay | prepay | number(38, 0) |
| 94 | price | price | price | number(28, 8) |  |  | 0 |
| 95 | productline | productline | productline | varchar2(20) |  |  | '~' |
| 96 | project | project | project | varchar2(20) |
| 97 | project_task | project_task | project_task | varchar2(20) |
| 98 | purchaseorder | purchaseorder | purchaseorder | varchar2(40) |
| 99 | quantity_bal | quantity_bal | quantity_bal | number(20, 8) |  |  | 0 |
| 100 | quantity_cr | quantity_cr | quantity_cr | number(20, 8) |  |  | 0 |
| 101 | rate | rate | rate | number(15, 8) |  |  | 1 |
| 102 | recaccount | recaccount | recaccount | varchar2(20) |  |  | '~' |
| 103 | rececountryid | rececountryid | rececountryid | varchar2(20) |
| 104 | refuse_reason | refuse_reason | refuse_reason | varchar2(100) |
| 105 | rowno | rowno | rowno | number(38, 0) |
| 106 | rowtype | rowtype | rowtype | number(38, 0) |
| 107 | scomment | scomment | scomment | varchar2(250) |  |  | '~' |
| 108 | settlecurr | settlecurr | settlecurr | varchar2(20) |
| 109 | settlemoney | settlemoney | settlemoney | number(28, 8) |
| 110 | sett_org | sett_org | sett_org | varchar2(20) |  |  | '~' |
| 111 | sett_org_v | sett_org_v | sett_org_v | varchar2(20) |  |  | '~' |
| 112 | so_deptid | so_deptid | so_deptid | varchar2(20) |  |  | '~' |
| 113 | so_deptid_v | so_deptid_v | so_deptid_v | varchar2(20) |  |  | '~' |
| 114 | so_ordertype | so_ordertype | so_ordertype | varchar2(20) |  |  | '~' |
| 115 | so_org | so_org | so_org | varchar2(20) |  |  | '~' |
| 116 | so_org_v | so_org_v | so_org_v | varchar2(20) |  |  | '~' |
| 117 | so_psndoc | so_psndoc | so_psndoc | varchar2(20) |  |  | '~' |
| 118 | so_transtype | so_transtype | so_transtype | varchar2(20) |
| 119 | src_billid | src_billid | src_billid | char(20) |
| 120 | src_billtype | src_billtype | src_billtype | varchar2(20) |
| 121 | src_itemid | src_itemid | src_itemid | char(20) |
| 122 | src_tradetype | src_tradetype | src_tradetype | varchar2(20) |
| 123 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 124 | supplier | supplier | supplier | varchar2(20) |
| 125 | taxcodeid | taxcodeid | taxcodeid | varchar2(20) |
| 126 | taxnum | taxnum | taxnum | varchar2(30) |
| 127 | taxprice | taxprice | taxprice | number(28, 8) |
| 128 | taxrate | taxrate | taxrate | number(9, 6) |  |  | 0 |
| 129 | taxtype | taxtype | taxtype | number(38, 0) |
| 130 | tax_cr | tax_cr | tax_cr | number(28, 8) |  |  | 0 |
| 131 | top_billid | top_billid | top_billid | char(20) |
| 132 | top_billtype | top_billtype | top_billtype | varchar2(20) |
| 133 | top_itemid | top_itemid | top_itemid | char(20) |
| 134 | top_tradetype | top_tradetype | top_tradetype | varchar2(20) |
| 135 | transerial | transerial | transerial | varchar2(200) |
| 136 | triatradeflag | triatradeflag | triatradeflag | char(1) |
| 137 | vatcode | vatcode | vatcode | varchar2(50) |
| 138 | def1 | def1 | def1 | varchar2(101) |
| 139 | def2 | def2 | def2 | varchar2(101) |
| 140 | def3 | def3 | def3 | varchar2(101) |
| 141 | def4 | def4 | def4 | varchar2(101) |
| 142 | def5 | def5 | def5 | varchar2(101) |
| 143 | def6 | def6 | def6 | varchar2(101) |
| 144 | def7 | def7 | def7 | varchar2(101) |
| 145 | def8 | def8 | def8 | varchar2(101) |
| 146 | def9 | def9 | def9 | varchar2(101) |
| 147 | def10 | def10 | def10 | varchar2(101) |
| 148 | def11 | def11 | def11 | varchar2(101) |
| 149 | def12 | def12 | def12 | varchar2(101) |
| 150 | def13 | def13 | def13 | varchar2(101) |
| 151 | def14 | def14 | def14 | varchar2(101) |
| 152 | def15 | def15 | def15 | varchar2(101) |
| 153 | def16 | def16 | def16 | varchar2(101) |
| 154 | def17 | def17 | def17 | varchar2(101) |
| 155 | def18 | def18 | def18 | varchar2(101) |
| 156 | def19 | def19 | def19 | varchar2(101) |
| 157 | def20 | def20 | def20 | varchar2(101) |
| 158 | def21 | def21 | def21 | varchar2(101) |
| 159 | def22 | def22 | def22 | varchar2(101) |
| 160 | def23 | def23 | def23 | varchar2(101) |
| 161 | def24 | def24 | def24 | varchar2(101) |
| 162 | def25 | def25 | def25 | varchar2(101) |
| 163 | def26 | def26 | def26 | varchar2(101) |
| 164 | def27 | def27 | def27 | varchar2(101) |
| 165 | def28 | def28 | def28 | varchar2(101) |
| 166 | def29 | def29 | def29 | varchar2(101) |
| 167 | def30 | def30 | def30 | varchar2(101) |
| 168 | def31 | def31 | def31 | varchar2(101) |
| 169 | def32 | def32 | def32 | varchar2(101) |
| 170 | def33 | def33 | def33 | varchar2(101) |
| 171 | def34 | def34 | def34 | varchar2(101) |
| 172 | def35 | def35 | def35 | varchar2(101) |
| 173 | def36 | def36 | def36 | varchar2(101) |
| 174 | def37 | def37 | def37 | varchar2(101) |
| 175 | def38 | def38 | def38 | varchar2(101) |
| 176 | def39 | def39 | def39 | varchar2(101) |
| 177 | def40 | def40 | def40 | varchar2(101) |
| 178 | def41 | def41 | def41 | varchar2(101) |
| 179 | def42 | def42 | def42 | varchar2(101) |
| 180 | def43 | def43 | def43 | varchar2(101) |
| 181 | def44 | def44 | def44 | varchar2(101) |
| 182 | def45 | def45 | def45 | varchar2(101) |
| 183 | def46 | def46 | def46 | varchar2(101) |
| 184 | def47 | def47 | def47 | varchar2(101) |
| 185 | def48 | def48 | def48 | varchar2(101) |
| 186 | def49 | def49 | def49 | varchar2(101) |
| 187 | def50 | def50 | def50 | varchar2(101) |
| 188 | def51 | def51 | def51 | varchar2(101) |
| 189 | def52 | def52 | def52 | varchar2(101) |
| 190 | def53 | def53 | def53 | varchar2(101) |
| 191 | def54 | def54 | def54 | varchar2(101) |
| 192 | def55 | def55 | def55 | varchar2(101) |
| 193 | def56 | def56 | def56 | varchar2(101) |
| 194 | def57 | def57 | def57 | varchar2(101) |
| 195 | def58 | def58 | def58 | varchar2(101) |
| 196 | def59 | def59 | def59 | varchar2(101) |
| 197 | def60 | def60 | def60 | varchar2(101) |
| 198 | def61 | def61 | def61 | varchar2(101) |
| 199 | def62 | def62 | def62 | varchar2(101) |
| 200 | def63 | def63 | def63 | varchar2(101) |
| 201 | def64 | def64 | def64 | varchar2(101) |
| 202 | def65 | def65 | def65 | varchar2(101) |
| 203 | def66 | def66 | def66 | varchar2(101) |
| 204 | def67 | def67 | def67 | varchar2(101) |
| 205 | def68 | def68 | def68 | varchar2(101) |
| 206 | def69 | def69 | def69 | varchar2(101) |
| 207 | def70 | def70 | def70 | varchar2(101) |
| 208 | def71 | def71 | def71 | varchar2(101) |
| 209 | def72 | def72 | def72 | varchar2(101) |
| 210 | def73 | def73 | def73 | varchar2(101) |
| 211 | def74 | def74 | def74 | varchar2(101) |
| 212 | def75 | def75 | def75 | varchar2(101) |
| 213 | def76 | def76 | def76 | varchar2(101) |
| 214 | def77 | def77 | def77 | varchar2(101) |
| 215 | def78 | def78 | def78 | varchar2(101) |
| 216 | def79 | def79 | def79 | varchar2(101) |
| 217 | def80 | def80 | def80 | varchar2(101) |
| 218 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 219 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |