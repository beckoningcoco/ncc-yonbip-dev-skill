# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8342.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_txitem | pk_txitem | pk_txitem | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | amount_credit | amount_credit | amount_credit | number(28, 8) |
| 4 | amount_debit | amount_debit | amount_debit | number(28, 8) |
| 5 | amout_notax | amout_notax | amout_notax | number(28, 8) |
| 6 | breworkflag | breworkflag | breworkflag | char(1) |
| 7 | capitalamt | capitalamt | capitalamt | number(28, 8) |
| 8 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 9 | checkno | checkno | checkno | varchar2(50) |
| 10 | checktype | checktype | checktype | varchar2(20) |  |  | '~' |
| 11 | cinventorystate | cinventorystate | cinventorystate | varchar2(50) |
| 12 | cmarcostclassid | cmarcostclassid | cmarcostclassid | varchar2(20) |  |  | '~' |
| 13 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 14 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 15 | contractno | contractno | contractno | varchar2(50) |
| 16 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 17 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 18 | crcid | crcid | crcid | varchar2(50) |  |  | '~' |
| 19 | ctype | ctype | ctype | number(38, 0) |
| 20 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 21 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 22 | days | days | days | number(38, 0) |
| 23 | demo | demo | demo | varchar2(200) |
| 24 | fcalcthreadbizflag | fcalcthreadbizflag | fcalcthreadbizflag | number(38, 0) |
| 25 | fdatagetflag | fdatagetflag | fdatagetflag | number(38, 0) |
| 26 | globallocal | globallocal | globallocal | number(28, 8) |
| 27 | globallocal_credit | globallocal_credit | globallocal_credit | number(28, 8) |
| 28 | globallocal_debit | globallocal_debit | globallocal_debit | number(28, 8) |
| 29 | globallocal_notax | globallocal_notax | globallocal_notax | number(28, 8) |
| 30 | globalrate | globalrate | globalrate | number(28, 8) |
| 31 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 32 | grouplocal_credit | grouplocal_credit | grouplocal_credit | number(28, 8) |
| 33 | grouplocal_debit | grouplocal_debit | grouplocal_debit | number(28, 8) |
| 34 | grouplocal_notax | grouplocal_notax | grouplocal_notax | number(28, 8) |
| 35 | grouprate | grouprate | grouprate | number(28, 8) |
| 36 | interestamt | interestamt | interestamt | number(28, 8) |
| 37 | interestbegindate | interestbegindate | interestbegindate | char(19) |
| 38 | interestenddate | interestenddate | interestenddate | char(19) |
| 39 | localrate | localrate | localrate | number(28, 8) |
| 40 | local_amount | local_amount | local_amount | number(28, 8) |
| 41 | local_amount_credit | local_amount_credit | local_amount_credit | number(28, 8) |
| 42 | local_amount_debit | local_amount_debit | local_amount_debit | number(28, 8) |
| 43 | local_amount_notax | local_amount_notax | local_amount_notax | number(28, 8) |
| 44 | maincustomer | maincustomer | maincustomer | varchar2(20) |  |  | '~' |
| 45 | maininventorystate | maininventorystate | maininventorystate | varchar2(50) |
| 46 | mainproduct | mainproduct | mainproduct | varchar2(20) |  |  | '~' |
| 47 | mainproductorid | mainproductorid | mainproductorid | varchar2(20) |  |  | '~' |
| 48 | mainprojectid | mainprojectid | mainprojectid | varchar2(20) |  |  | '~' |
| 49 | mainsupplier | mainsupplier | mainsupplier | varchar2(20) |  |  | '~' |
| 50 | material | material | material | varchar2(20) |  |  | '~' |
| 51 | materialid | materialid | materialid | varchar2(20) |  |  | '~' |
| 52 | material_src | material_src | material_src | varchar2(20) |  |  | '~' |
| 53 | mcfree1 | mcfree1 | mcfree1 | varchar2(101) |
| 54 | mcfree2 | mcfree2 | mcfree2 | varchar2(101) |
| 55 | mcfree3 | mcfree3 | mcfree3 | varchar2(101) |
| 56 | mcfree4 | mcfree4 | mcfree4 | varchar2(101) |
| 57 | mcfree5 | mcfree5 | mcfree5 | varchar2(101) |
| 58 | mcfree6 | mcfree6 | mcfree6 | varchar2(101) |
| 59 | mcfree7 | mcfree7 | mcfree7 | varchar2(101) |
| 60 | mcfree8 | mcfree8 | mcfree8 | varchar2(101) |
| 61 | mcfree9 | mcfree9 | mcfree9 | varchar2(101) |
| 62 | mcfree10 | mcfree10 | mcfree10 | varchar2(101) |
| 63 | mcustomer | mcustomer | mcustomer | varchar2(20) |  |  | '~' |
| 64 | mfree1 | mfree1 | mfree1 | varchar2(101) |
| 65 | mfree2 | mfree2 | mfree2 | varchar2(101) |
| 66 | mfree3 | mfree3 | mfree3 | varchar2(101) |
| 67 | mfree4 | mfree4 | mfree4 | varchar2(101) |
| 68 | mfree5 | mfree5 | mfree5 | varchar2(101) |
| 69 | mfree6 | mfree6 | mfree6 | varchar2(101) |
| 70 | mfree7 | mfree7 | mfree7 | varchar2(101) |
| 71 | mfree8 | mfree8 | mfree8 | varchar2(101) |
| 72 | mfree9 | mfree9 | mfree9 | varchar2(101) |
| 73 | mfree10 | mfree10 | mfree10 | varchar2(101) |
| 74 | minventorystate | minventorystate | minventorystate | varchar2(50) |
| 75 | mproductorid | mproductorid | mproductorid | varchar2(20) |  |  | '~' |
| 76 | mprojectid | mprojectid | mprojectid | varchar2(20) |  |  | '~' |
| 77 | msupplier | msupplier | msupplier | varchar2(20) |  |  | '~' |
| 78 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 79 | originbillid | originbillid | originbillid | varchar2(50) |
| 80 | originitemid | originitemid | originitemid | varchar2(50) |
| 81 | payproperty | payproperty | payproperty | varchar2(50) |
| 82 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 83 | pk_cost | pk_cost | pk_cost | varchar2(20) |  |  | '~' |
| 84 | pk_costcomponent | pk_costcomponent | pk_costcomponent | varchar2(20) |  |  | '~' |
| 85 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 86 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 87 | pk_deptid_v | pk_deptid_v | pk_deptid_v | varchar2(20) |  |  | '~' |
| 88 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 89 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 90 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 91 | pk_originbilltypeid | pk_originbilltypeid | pk_originbilltypeid | varchar2(50) |
| 92 | pk_paytype | pk_paytype | pk_paytype | varchar2(20) |  |  | '~' |
| 93 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 94 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 95 | pk_rectype | pk_rectype | pk_rectype | varchar2(20) |  |  | '~' |
| 96 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 97 | pk_subjcode | pk_subjcode | pk_subjcode | varchar2(20) |  |  | '~' |
| 98 | pk_txbill | pk_txbill | pk_txbill | char(20) | √ |
| 99 | price | price | price | number(28, 8) |
| 100 | price_notax | price_notax | price_notax | number(28, 8) |
| 101 | quantity | quantity | quantity | number(28, 8) |
| 102 | rate | rate | rate | number(28, 8) |
| 103 | recproperty | recproperty | recproperty | varchar2(50) |
| 104 | rowno | rowno | rowno | number(38, 0) |
| 105 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 106 | srcitemid | srcitemid | srcitemid | varchar2(50) |
| 107 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 108 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 109 | tax | tax | tax | number(28, 8) |
| 110 | taxcodeid | taxcodeid | taxcodeid | varchar2(20) |  |  | '~' |
| 111 | taxrate | taxrate | taxrate | number(28, 8) |
| 112 | uniqueid | uniqueid | uniqueid | varchar2(50) |
| 113 | vmocode | vmocode | vmocode | varchar2(50) |
| 114 | vmotype | vmotype | vmotype | number(38, 0) |
| 115 | year | year | year | char(4) |
| 116 | def1 | def1 | def1 | varchar2(101) |
| 117 | def2 | def2 | def2 | varchar2(101) |
| 118 | def3 | def3 | def3 | varchar2(101) |
| 119 | def4 | def4 | def4 | varchar2(101) |
| 120 | def5 | def5 | def5 | varchar2(101) |
| 121 | def6 | def6 | def6 | varchar2(101) |
| 122 | def7 | def7 | def7 | varchar2(101) |
| 123 | def8 | def8 | def8 | varchar2(101) |
| 124 | def9 | def9 | def9 | varchar2(101) |
| 125 | def10 | def10 | def10 | varchar2(101) |
| 126 | def11 | def11 | def11 | varchar2(101) |
| 127 | def12 | def12 | def12 | varchar2(101) |
| 128 | def13 | def13 | def13 | varchar2(101) |
| 129 | def14 | def14 | def14 | varchar2(101) |
| 130 | def15 | def15 | def15 | varchar2(101) |
| 131 | def16 | def16 | def16 | varchar2(101) |
| 132 | def17 | def17 | def17 | varchar2(101) |
| 133 | def18 | def18 | def18 | varchar2(101) |
| 134 | def19 | def19 | def19 | varchar2(101) |
| 135 | def20 | def20 | def20 | varchar2(101) |
| 136 | def21 | def21 | def21 | varchar2(101) |
| 137 | def22 | def22 | def22 | varchar2(101) |
| 138 | def23 | def23 | def23 | varchar2(101) |
| 139 | def24 | def24 | def24 | varchar2(101) |
| 140 | def25 | def25 | def25 | varchar2(101) |
| 141 | def26 | def26 | def26 | varchar2(101) |
| 142 | def27 | def27 | def27 | varchar2(101) |
| 143 | def28 | def28 | def28 | varchar2(101) |
| 144 | def29 | def29 | def29 | varchar2(101) |
| 145 | def30 | def30 | def30 | varchar2(101) |
| 146 | def31 | def31 | def31 | varchar2(101) |
| 147 | def32 | def32 | def32 | varchar2(101) |
| 148 | def33 | def33 | def33 | varchar2(101) |
| 149 | def34 | def34 | def34 | varchar2(101) |
| 150 | def35 | def35 | def35 | varchar2(101) |
| 151 | def36 | def36 | def36 | varchar2(101) |
| 152 | def37 | def37 | def37 | varchar2(101) |
| 153 | def38 | def38 | def38 | varchar2(101) |
| 154 | def39 | def39 | def39 | varchar2(101) |
| 155 | def40 | def40 | def40 | varchar2(101) |
| 156 | def41 | def41 | def41 | varchar2(101) |
| 157 | def42 | def42 | def42 | varchar2(101) |
| 158 | def43 | def43 | def43 | varchar2(101) |
| 159 | def44 | def44 | def44 | varchar2(101) |
| 160 | def45 | def45 | def45 | varchar2(101) |
| 161 | def46 | def46 | def46 | varchar2(101) |
| 162 | def47 | def47 | def47 | varchar2(101) |
| 163 | def48 | def48 | def48 | varchar2(101) |
| 164 | def49 | def49 | def49 | varchar2(101) |
| 165 | def50 | def50 | def50 | varchar2(101) |
| 166 | def51 | def51 | def51 | varchar2(101) |
| 167 | def52 | def52 | def52 | varchar2(101) |
| 168 | def53 | def53 | def53 | varchar2(101) |
| 169 | def54 | def54 | def54 | varchar2(101) |
| 170 | def55 | def55 | def55 | varchar2(101) |
| 171 | def56 | def56 | def56 | varchar2(101) |
| 172 | def57 | def57 | def57 | varchar2(101) |
| 173 | def58 | def58 | def58 | varchar2(101) |
| 174 | def59 | def59 | def59 | varchar2(101) |
| 175 | def60 | def60 | def60 | varchar2(101) |
| 176 | def61 | def61 | def61 | varchar2(101) |
| 177 | def62 | def62 | def62 | varchar2(101) |
| 178 | def63 | def63 | def63 | varchar2(101) |
| 179 | def64 | def64 | def64 | varchar2(101) |
| 180 | def65 | def65 | def65 | varchar2(101) |
| 181 | def66 | def66 | def66 | varchar2(101) |
| 182 | def67 | def67 | def67 | varchar2(101) |
| 183 | def68 | def68 | def68 | varchar2(101) |
| 184 | def69 | def69 | def69 | varchar2(101) |
| 185 | def70 | def70 | def70 | varchar2(101) |
| 186 | def71 | def71 | def71 | varchar2(101) |
| 187 | def72 | def72 | def72 | varchar2(101) |
| 188 | def73 | def73 | def73 | varchar2(101) |
| 189 | def74 | def74 | def74 | varchar2(101) |
| 190 | def75 | def75 | def75 | varchar2(101) |
| 191 | def76 | def76 | def76 | varchar2(101) |
| 192 | def77 | def77 | def77 | varchar2(101) |
| 193 | def78 | def78 | def78 | varchar2(101) |
| 194 | def79 | def79 | def79 | varchar2(101) |
| 195 | def80 | def80 | def80 | varchar2(101) |
| 196 | def81 | def81 | def81 | varchar2(101) |
| 197 | def82 | def82 | def82 | varchar2(101) |
| 198 | def83 | def83 | def83 | varchar2(101) |
| 199 | def84 | def84 | def84 | varchar2(101) |
| 200 | def85 | def85 | def85 | varchar2(101) |
| 201 | def86 | def86 | def86 | varchar2(101) |
| 202 | def87 | def87 | def87 | varchar2(101) |
| 203 | def88 | def88 | def88 | varchar2(101) |
| 204 | def89 | def89 | def89 | varchar2(101) |
| 205 | def90 | def90 | def90 | varchar2(101) |
| 206 | def91 | def91 | def91 | varchar2(101) |
| 207 | def92 | def92 | def92 | varchar2(101) |
| 208 | def93 | def93 | def93 | varchar2(101) |
| 209 | def94 | def94 | def94 | varchar2(101) |
| 210 | def95 | def95 | def95 | varchar2(101) |
| 211 | def96 | def96 | def96 | varchar2(101) |
| 212 | def97 | def97 | def97 | varchar2(101) |
| 213 | def98 | def98 | def98 | varchar2(101) |
| 214 | def99 | def99 | def99 | varchar2(101) |
| 215 | def100 | def100 | def100 | varchar2(101) |
| 216 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 217 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 218 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 219 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 220 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 221 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 222 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 223 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 224 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 225 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 226 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 227 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |