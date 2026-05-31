# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6556.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payitem | pk_payitem | pk_payitem | char(20) | √ |
| 2 | agentreceivelocal | agentreceivelocal | agentreceivelocal | number(28, 8) |
| 3 | agentreceiveprimal | agentreceiveprimal | agentreceiveprimal | number(28, 8) |
| 4 | assetpactno | assetpactno | assetpactno | varchar2(80) |
| 5 | bankrelated_code | bankrelated_code | bankrelated_code | varchar2(100) |
| 6 | bankrollprojet | bankrollprojet | bankrollprojet | varchar2(20) |  |  | '~' |
| 7 | billclass | billclass | billclass | char(2) | √ |  | 'fk' |
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
| 20 | commpaytype | commpaytype | commpaytype | number(8, 0) |
| 21 | confernum | confernum | confernum | varchar2(60) |
| 22 | contractno | contractno | contractno | varchar2(40) |
| 23 | coordflag | coordflag | coordflag | number(38, 0) |
| 24 | costcenter | costcenter | costcenter | varchar2(20) |
| 25 | customer | customer | customer | varchar2(20) |
| 26 | direction | direction | direction | number(38, 0) | √ |
| 27 | direct_checkno | direct_checkno | direct_checkno | char(1) |
| 28 | equipmentcode | equipmentcode | equipmentcode | varchar2(100) |
| 29 | facard | facard | facard | varchar2(50) |
| 30 | forcemoney | forcemoney | forcemoney | number(28, 8) |  |  | 0 |
| 31 | freecust | freecust | freecust | varchar2(20) |  |  | '~' |
| 32 | globalagentreceivelocal | globalagentreceivelocal | globalagentreceivelocal | number(28, 8) |
| 33 | globalbalance | globalbalance | globalbalance | number(28, 8) |  |  | 0 |
| 34 | globaldebit | globaldebit | globaldebit | number(28, 8) |  |  | 0 |
| 35 | globalnotax_de | globalnotax_de | globalnotax_de | number(28, 8) |  |  | 0 |
| 36 | globalrate | globalrate | globalrate | number(15, 8) |  |  | 1 |
| 37 | globaltax_de | globaltax_de | globaltax_de | number(28, 8) |  |  | 0 |
| 38 | groupagentreceivelocal | groupagentreceivelocal | groupagentreceivelocal | number(28, 8) |
| 39 | groupbalance | groupbalance | groupbalance | number(28, 8) |  |  | 0 |
| 40 | groupdebit | groupdebit | groupdebit | number(28, 8) |  |  | 0 |
| 41 | groupnotax_de | groupnotax_de | groupnotax_de | number(28, 8) |  |  | 0 |
| 42 | grouprate | grouprate | grouprate | number(15, 8) |  |  | 1 |
| 43 | grouptax_de | grouptax_de | grouptax_de | number(28, 8) |  |  | 0 |
| 44 | innerorderno | innerorderno | innerorderno | varchar2(40) |
| 45 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 46 | isdiscount | isdiscount | isdiscount | char(1) |
| 47 | isforce | isforce | isforce | char(1) |
| 48 | isrefused | isrefused | isrefused | char(1) |
| 49 | isurgent | isurgent | isurgent | char(1) |  |  | 'N' |
| 50 | local_money_bal | local_money_bal | local_money_bal | number(28, 8) |  |  | 0 |
| 51 | local_money_de | local_money_de | local_money_de | number(28, 8) |  |  | 0 |
| 52 | local_notax_de | local_notax_de | local_notax_de | number(28, 8) |  |  | 0 |
| 53 | local_price | local_price | local_price | number(28, 8) |
| 54 | local_taxprice | local_taxprice | local_taxprice | number(28, 8) |
| 55 | local_tax_de | local_tax_de | local_tax_de | number(28, 8) |  |  | 0 |
| 56 | material | material | material | varchar2(20) |  |  | '~' |
| 57 | material_src | material_src | material_src | varchar2(20) |
| 58 | money_bal | money_bal | money_bal | number(28, 8) |  |  | 0 |
| 59 | money_de | money_de | money_de | number(28, 8) |  |  | 0 |
| 60 | nosubtax | nosubtax | nosubtax | number(28, 8) |
| 61 | nosubtaxrate | nosubtaxrate | nosubtaxrate | number(28, 8) |
| 62 | notax_de | notax_de | notax_de | number(28, 8) |  |  | 0 |
| 63 | objtype | objtype | objtype | number(38, 0) |
| 64 | occupationmny | occupationmny | occupationmny | number(28, 8) |  |  | 0 |
| 65 | ordercubasdoc | ordercubasdoc | ordercubasdoc | varchar2(20) |  |  | '~' |
| 66 | outstoreno | outstoreno | outstoreno | varchar2(40) |
| 67 | pausetransact | pausetransact | pausetransact | char(1) |
| 68 | payaccount | payaccount | payaccount | varchar2(20) |  |  | '~' |
| 69 | paydate | paydate | paydate | char(19) |
| 70 | payflag | payflag | payflag | number(38, 0) |
| 71 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 72 | payreason | payreason | payreason | varchar2(181) |
| 73 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 74 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 75 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 76 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 77 | pk_deptid_v | pk_deptid_v | pk_deptid_v | varchar2(20) |  |  | '~' |
| 78 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 79 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 80 | pk_group | pk_group | pk_group | char(20) | √ |
| 81 | pk_job | pk_job | pk_job | char(20) |
| 82 | pk_jobphase | pk_jobphase | pk_jobphase | char(20) |
| 83 | pk_org | pk_org | pk_org | char(20) | √ |
| 84 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 85 | pk_paybill | pk_paybill | pk_paybill | char(20) |
| 86 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 87 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 88 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 89 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 90 | pk_recpaytype | pk_recpaytype | pk_recpaytype | varchar2(20) |
| 91 | pk_ssitem | pk_ssitem | pk_ssitem | char(20) |
| 92 | pk_subjcode | pk_subjcode | pk_subjcode | varchar2(20) |  |  | '~' |
| 93 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) | √ |
| 94 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 95 | postprice | postprice | postprice | number(28, 8) |  |  | 0 |
| 96 | postpricenotax | postpricenotax | postpricenotax | number(28, 8) |  |  | 0 |
| 97 | postquantity | postquantity | postquantity | number(20, 8) |  |  | 0 |
| 98 | postunit | postunit | postunit | varchar2(40) |
| 99 | prepay | prepay | prepay | number(38, 0) |
| 100 | price | price | price | number(28, 8) |  |  | 0 |
| 101 | productline | productline | productline | char(20) |
| 102 | project | project | project | varchar2(20) |
| 103 | project_task | project_task | project_task | varchar2(20) |
| 104 | purchaseorder | purchaseorder | purchaseorder | varchar2(40) |
| 105 | pu_deptid | pu_deptid | pu_deptid | varchar2(20) |  |  | '~' |
| 106 | pu_deptid_v | pu_deptid_v | pu_deptid_v | varchar2(20) |  |  | '~' |
| 107 | pu_org | pu_org | pu_org | varchar2(20) |  |  | '~' |
| 108 | pu_org_v | pu_org_v | pu_org_v | char(20) |
| 109 | pu_psndoc | pu_psndoc | pu_psndoc | varchar2(20) |  |  | '~' |
| 110 | quantity_bal | quantity_bal | quantity_bal | number(20, 8) |  |  | 0 |
| 111 | quantity_cr | quantity_cr | quantity_cr | number(20, 8) |  |  | 0 |
| 112 | quantity_de | quantity_de | quantity_de | number(20, 8) |  |  | 0 |
| 113 | rate | rate | rate | number(15, 8) |  |  | 1 |
| 114 | recaccount | recaccount | recaccount | varchar2(20) |  |  | '~' |
| 115 | refuse_reason | refuse_reason | refuse_reason | varchar2(100) |
| 116 | rowno | rowno | rowno | number(38, 0) |
| 117 | rowtype | rowtype | rowtype | number(38, 0) |
| 118 | scomment | scomment | scomment | varchar2(250) |  |  | '~' |
| 119 | sendcountryid | sendcountryid | sendcountryid | varchar2(20) |
| 120 | settlecurr | settlecurr | settlecurr | varchar2(20) |
| 121 | settlemoney | settlemoney | settlemoney | number(28, 8) |
| 122 | sett_org | sett_org | sett_org | varchar2(20) |
| 123 | sett_org_v | sett_org_v | sett_org_v | varchar2(20) |  |  | '~' |
| 124 | src_billid | src_billid | src_billid | char(20) |
| 125 | src_billtype | src_billtype | src_billtype | varchar2(20) |
| 126 | src_itemid | src_itemid | src_itemid | char(20) |
| 127 | src_tradetype | src_tradetype | src_tradetype | varchar2(20) |
| 128 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 129 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 130 | taxcodeid | taxcodeid | taxcodeid | varchar2(20) |
| 131 | taxnum | taxnum | taxnum | varchar2(30) |
| 132 | taxprice | taxprice | taxprice | number(28, 8) |  |  | 0 |
| 133 | taxrate | taxrate | taxrate | number(9, 6) |  |  | 0 |
| 134 | taxtype | taxtype | taxtype | number(38, 0) |
| 135 | tax_de | tax_de | tax_de | number(28, 8) |  |  | 0 |
| 136 | top_billid | top_billid | top_billid | char(20) |
| 137 | top_billtype | top_billtype | top_billtype | varchar2(20) |
| 138 | top_itemid | top_itemid | top_itemid | char(20) |
| 139 | top_termch | top_termch | top_termch | varchar2(20) |
| 140 | top_tradetype | top_tradetype | top_tradetype | varchar2(20) |
| 141 | transerial | transerial | transerial | varchar2(200) |
| 142 | vatcode | vatcode | vatcode | varchar2(50) |
| 143 | vendorvatcode | vendorvatcode | vendorvatcode | varchar2(50) |
| 144 | def1 | def1 | def1 | varchar2(101) |
| 145 | def2 | def2 | def2 | varchar2(101) |
| 146 | def3 | def3 | def3 | varchar2(101) |
| 147 | def4 | def4 | def4 | varchar2(101) |
| 148 | def5 | def5 | def5 | varchar2(101) |
| 149 | def6 | def6 | def6 | varchar2(101) |
| 150 | def7 | def7 | def7 | varchar2(101) |
| 151 | def8 | def8 | def8 | varchar2(101) |
| 152 | def9 | def9 | def9 | varchar2(101) |
| 153 | def10 | def10 | def10 | varchar2(101) |
| 154 | def11 | def11 | def11 | varchar2(101) |
| 155 | def12 | def12 | def12 | varchar2(101) |
| 156 | def13 | def13 | def13 | varchar2(101) |
| 157 | def14 | def14 | def14 | varchar2(101) |
| 158 | def15 | def15 | def15 | varchar2(101) |
| 159 | def16 | def16 | def16 | varchar2(101) |
| 160 | def17 | def17 | def17 | varchar2(101) |
| 161 | def18 | def18 | def18 | varchar2(101) |
| 162 | def19 | def19 | def19 | varchar2(101) |
| 163 | def20 | def20 | def20 | varchar2(101) |
| 164 | def21 | def21 | def21 | varchar2(101) |
| 165 | def22 | def22 | def22 | varchar2(101) |
| 166 | def23 | def23 | def23 | varchar2(101) |
| 167 | def24 | def24 | def24 | varchar2(101) |
| 168 | def25 | def25 | def25 | varchar2(101) |
| 169 | def26 | def26 | def26 | varchar2(101) |
| 170 | def27 | def27 | def27 | varchar2(101) |
| 171 | def28 | def28 | def28 | varchar2(101) |
| 172 | def29 | def29 | def29 | varchar2(101) |
| 173 | def30 | def30 | def30 | varchar2(101) |
| 174 | def31 | def31 | def31 | varchar2(101) |
| 175 | def32 | def32 | def32 | varchar2(101) |
| 176 | def33 | def33 | def33 | varchar2(101) |
| 177 | def34 | def34 | def34 | varchar2(101) |
| 178 | def35 | def35 | def35 | varchar2(101) |
| 179 | def36 | def36 | def36 | varchar2(101) |
| 180 | def37 | def37 | def37 | varchar2(101) |
| 181 | def38 | def38 | def38 | varchar2(101) |
| 182 | def39 | def39 | def39 | varchar2(101) |
| 183 | def40 | def40 | def40 | varchar2(101) |
| 184 | def41 | def41 | def41 | varchar2(101) |
| 185 | def42 | def42 | def42 | varchar2(101) |
| 186 | def43 | def43 | def43 | varchar2(101) |
| 187 | def44 | def44 | def44 | varchar2(101) |
| 188 | def45 | def45 | def45 | varchar2(101) |
| 189 | def46 | def46 | def46 | varchar2(101) |
| 190 | def47 | def47 | def47 | varchar2(101) |
| 191 | def48 | def48 | def48 | varchar2(101) |
| 192 | def49 | def49 | def49 | varchar2(101) |
| 193 | def50 | def50 | def50 | varchar2(101) |
| 194 | def51 | def51 | def51 | varchar2(101) |
| 195 | def52 | def52 | def52 | varchar2(101) |
| 196 | def53 | def53 | def53 | varchar2(101) |
| 197 | def54 | def54 | def54 | varchar2(101) |
| 198 | def55 | def55 | def55 | varchar2(101) |
| 199 | def56 | def56 | def56 | varchar2(101) |
| 200 | def57 | def57 | def57 | varchar2(101) |
| 201 | def58 | def58 | def58 | varchar2(101) |
| 202 | def59 | def59 | def59 | varchar2(101) |
| 203 | def60 | def60 | def60 | varchar2(101) |
| 204 | def61 | def61 | def61 | varchar2(101) |
| 205 | def62 | def62 | def62 | varchar2(101) |
| 206 | def63 | def63 | def63 | varchar2(101) |
| 207 | def64 | def64 | def64 | varchar2(101) |
| 208 | def65 | def65 | def65 | varchar2(101) |
| 209 | def66 | def66 | def66 | varchar2(101) |
| 210 | def67 | def67 | def67 | varchar2(101) |
| 211 | def68 | def68 | def68 | varchar2(101) |
| 212 | def69 | def69 | def69 | varchar2(101) |
| 213 | def70 | def70 | def70 | varchar2(101) |
| 214 | def71 | def71 | def71 | varchar2(101) |
| 215 | def72 | def72 | def72 | varchar2(101) |
| 216 | def73 | def73 | def73 | varchar2(101) |
| 217 | def74 | def74 | def74 | varchar2(101) |
| 218 | def75 | def75 | def75 | varchar2(101) |
| 219 | def76 | def76 | def76 | varchar2(101) |
| 220 | def77 | def77 | def77 | varchar2(101) |
| 221 | def78 | def78 | def78 | varchar2(101) |
| 222 | def79 | def79 | def79 | varchar2(101) |
| 223 | def80 | def80 | def80 | varchar2(101) |
| 224 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 225 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |