# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8348.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_txbill | pk_txbill | pk_txbill | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | amount_credit | amount_credit | amount_credit | number(28, 8) |
| 4 | amount_debit | amount_debit | amount_debit | number(28, 8) |
| 5 | billexplain | billexplain | billexplain | varchar2(200) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billmoney | billmoney | billmoney | number(28, 8) |
| 8 | billno | billno | billno | varchar2(20) |
| 9 | busidate | busidate | busidate | char(19) |
| 10 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 11 | globallocal | globallocal | globallocal | number(28, 8) |
| 12 | globallocal_credit | globallocal_credit | globallocal_credit | number(28, 8) |
| 13 | globallocal_debit | globallocal_debit | globallocal_debit | number(28, 8) |
| 14 | globalrate | globalrate | globalrate | number(28, 8) |
| 15 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 16 | grouplocal_credit | grouplocal_credit | grouplocal_credit | number(28, 8) |
| 17 | grouplocal_debit | grouplocal_debit | grouplocal_debit | number(28, 8) |
| 18 | grouprate | grouprate | grouprate | number(28, 8) |
| 19 | local_amount | local_amount | local_amount | number(28, 8) |
| 20 | local_amount_credit | local_amount_credit | local_amount_credit | number(28, 8) |
| 21 | local_amount_debit | local_amount_debit | local_amount_debit | number(28, 8) |
| 22 | originbillid | originbillid | originbillid | varchar2(50) |
| 23 | originbillno | originbillno | originbillno | varchar2(50) |
| 24 | period | period | period | char(50) |
| 25 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 26 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 27 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 28 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 29 | pk_deptid_v | pk_deptid_v | pk_deptid_v | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_operator | pk_operator | pk_operator | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 34 | pk_originbilltypeid | pk_originbilltypeid | pk_originbilltypeid | varchar2(20) |  |  | '~' |
| 35 | pk_originradetypeid | pk_originradetypeid | pk_originradetypeid | varchar2(20) |  |  | '~' |
| 36 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 37 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 38 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(20) |  |  | '~' |
| 39 | pk_srctradetypeid | pk_srctradetypeid | pk_srctradetypeid | varchar2(20) |  |  | '~' |
| 40 | pk_subjcode | pk_subjcode | pk_subjcode | varchar2(20) |  |  | '~' |
| 41 | pk_system | pk_system | pk_system | varchar2(50) |
| 42 | rate | rate | rate | number(28, 8) |
| 43 | relationid | relationid | relationid | varchar2(50) |
| 44 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 45 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 46 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 47 | unpaidamt | unpaidamt | unpaidamt | number(28, 8) |
| 48 | year | year | year | char(4) |
| 49 | def1 | def1 | def1 | varchar2(101) |
| 50 | def2 | def2 | def2 | varchar2(101) |
| 51 | def3 | def3 | def3 | varchar2(101) |
| 52 | def4 | def4 | def4 | varchar2(101) |
| 53 | def5 | def5 | def5 | varchar2(101) |
| 54 | def6 | def6 | def6 | varchar2(101) |
| 55 | def7 | def7 | def7 | varchar2(101) |
| 56 | def8 | def8 | def8 | varchar2(101) |
| 57 | def9 | def9 | def9 | varchar2(101) |
| 58 | def10 | def10 | def10 | varchar2(101) |
| 59 | def11 | def11 | def11 | varchar2(101) |
| 60 | def12 | def12 | def12 | varchar2(101) |
| 61 | def13 | def13 | def13 | varchar2(101) |
| 62 | def14 | def14 | def14 | varchar2(101) |
| 63 | def15 | def15 | def15 | varchar2(101) |
| 64 | def16 | def16 | def16 | varchar2(101) |
| 65 | def17 | def17 | def17 | varchar2(101) |
| 66 | def18 | def18 | def18 | varchar2(101) |
| 67 | def19 | def19 | def19 | varchar2(101) |
| 68 | def20 | def20 | def20 | varchar2(101) |
| 69 | def21 | def21 | def21 | varchar2(101) |
| 70 | def22 | def22 | def22 | varchar2(101) |
| 71 | def23 | def23 | def23 | varchar2(101) |
| 72 | def24 | def24 | def24 | varchar2(101) |
| 73 | def25 | def25 | def25 | varchar2(101) |
| 74 | def26 | def26 | def26 | varchar2(101) |
| 75 | def27 | def27 | def27 | varchar2(101) |
| 76 | def28 | def28 | def28 | varchar2(101) |
| 77 | def29 | def29 | def29 | varchar2(101) |
| 78 | def30 | def30 | def30 | varchar2(101) |
| 79 | def31 | def31 | def31 | varchar2(101) |
| 80 | def32 | def32 | def32 | varchar2(101) |
| 81 | def33 | def33 | def33 | varchar2(101) |
| 82 | def34 | def34 | def34 | varchar2(101) |
| 83 | def35 | def35 | def35 | varchar2(101) |
| 84 | def36 | def36 | def36 | varchar2(101) |
| 85 | def37 | def37 | def37 | varchar2(101) |
| 86 | def38 | def38 | def38 | varchar2(101) |
| 87 | def39 | def39 | def39 | varchar2(101) |
| 88 | def40 | def40 | def40 | varchar2(101) |
| 89 | def41 | def41 | def41 | varchar2(101) |
| 90 | def42 | def42 | def42 | varchar2(101) |
| 91 | def43 | def43 | def43 | varchar2(101) |
| 92 | def44 | def44 | def44 | varchar2(101) |
| 93 | def45 | def45 | def45 | varchar2(101) |
| 94 | def46 | def46 | def46 | varchar2(101) |
| 95 | def47 | def47 | def47 | varchar2(101) |
| 96 | def48 | def48 | def48 | varchar2(101) |
| 97 | def49 | def49 | def49 | varchar2(101) |
| 98 | def50 | def50 | def50 | varchar2(101) |
| 99 | def51 | def51 | def51 | varchar2(101) |
| 100 | def52 | def52 | def52 | varchar2(101) |
| 101 | def53 | def53 | def53 | varchar2(101) |
| 102 | def54 | def54 | def54 | varchar2(101) |
| 103 | def55 | def55 | def55 | varchar2(101) |
| 104 | def56 | def56 | def56 | varchar2(101) |
| 105 | def57 | def57 | def57 | varchar2(101) |
| 106 | def58 | def58 | def58 | varchar2(101) |
| 107 | def59 | def59 | def59 | varchar2(101) |
| 108 | def60 | def60 | def60 | varchar2(101) |
| 109 | def61 | def61 | def61 | varchar2(101) |
| 110 | def62 | def62 | def62 | varchar2(101) |
| 111 | def63 | def63 | def63 | varchar2(101) |
| 112 | def64 | def64 | def64 | varchar2(101) |
| 113 | def65 | def65 | def65 | varchar2(101) |
| 114 | def66 | def66 | def66 | varchar2(101) |
| 115 | def67 | def67 | def67 | varchar2(101) |
| 116 | def68 | def68 | def68 | varchar2(101) |
| 117 | def69 | def69 | def69 | varchar2(101) |
| 118 | def70 | def70 | def70 | varchar2(101) |
| 119 | def71 | def71 | def71 | varchar2(101) |
| 120 | def72 | def72 | def72 | varchar2(101) |
| 121 | def73 | def73 | def73 | varchar2(101) |
| 122 | def74 | def74 | def74 | varchar2(101) |
| 123 | def75 | def75 | def75 | varchar2(101) |
| 124 | def76 | def76 | def76 | varchar2(101) |
| 125 | def77 | def77 | def77 | varchar2(101) |
| 126 | def78 | def78 | def78 | varchar2(101) |
| 127 | def79 | def79 | def79 | varchar2(101) |
| 128 | def80 | def80 | def80 | varchar2(101) |
| 129 | def81 | def81 | def81 | varchar2(101) |
| 130 | def82 | def82 | def82 | varchar2(101) |
| 131 | def83 | def83 | def83 | varchar2(101) |
| 132 | def84 | def84 | def84 | varchar2(101) |
| 133 | def85 | def85 | def85 | varchar2(101) |
| 134 | def86 | def86 | def86 | varchar2(101) |
| 135 | def87 | def87 | def87 | varchar2(101) |
| 136 | def88 | def88 | def88 | varchar2(101) |
| 137 | def89 | def89 | def89 | varchar2(101) |
| 138 | def90 | def90 | def90 | varchar2(101) |
| 139 | def91 | def91 | def91 | varchar2(101) |
| 140 | def92 | def92 | def92 | varchar2(101) |
| 141 | def93 | def93 | def93 | varchar2(101) |
| 142 | def94 | def94 | def94 | varchar2(101) |
| 143 | def95 | def95 | def95 | varchar2(101) |
| 144 | def96 | def96 | def96 | varchar2(101) |
| 145 | def97 | def97 | def97 | varchar2(101) |
| 146 | def98 | def98 | def98 | varchar2(101) |
| 147 | def99 | def99 | def99 | varchar2(101) |
| 148 | def100 | def100 | def100 | varchar2(101) |
| 149 | creationtime | creationtime | creationtime | char(19) |
| 150 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 151 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 152 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 153 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 154 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |