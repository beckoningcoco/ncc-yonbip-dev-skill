# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6590.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tally | pk_tally | pk_tally | varchar2(20) | √ |
| 2 | accperiod | accperiod | accperiod | char(7) |
| 3 | accyear | accyear | accyear | char(4) |
| 4 | approvedate | approvedate | approvedate | varchar2(19) |
| 5 | billclass | billclass | billclass | varchar2(10) |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billno | billno | billno | varchar2(40) |
| 8 | billstatus | billstatus | billstatus | number(38, 0) |
| 9 | brief | brief | brief | varchar2(300) |
| 10 | busidate | busidate | busidate | varchar2(19) |
| 11 | busitype | busitype | busitype | number(38, 0) |
| 12 | corbillclass | corbillclass | corbillclass | varchar2(10) |
| 13 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 14 | dealflag | dealflag | dealflag | number(38, 0) |
| 15 | deal_globallocal_money | deal_globallocal_money | deal_globallocal_money | number(28, 8) |
| 16 | deal_grouplocal_money | deal_grouplocal_money | deal_grouplocal_money | number(28, 8) |
| 17 | deal_local_money | deal_local_money | deal_local_money | number(28, 8) |
| 18 | deal_money | deal_money | deal_money | number(28, 8) |
| 19 | deal_quantity | deal_quantity | deal_quantity | number(28, 8) |
| 20 | effectdate | effectdate | effectdate | varchar2(19) |
| 21 | effectstatus | effectstatus | effectstatus | number(38, 0) |
| 22 | globallocal_money_cr | globallocal_money_cr | globallocal_money_cr | number(28, 8) |
| 23 | globallocal_money_de | globallocal_money_de | globallocal_money_de | number(28, 8) |
| 24 | globallocal_notax_cr | globallocal_notax_cr | globallocal_notax_cr | number(28, 8) |
| 25 | globallocal_notax_de | globallocal_notax_de | globallocal_notax_de | number(28, 8) |
| 26 | globallocal_tax_cr | globallocal_tax_cr | globallocal_tax_cr | number(28, 8) |
| 27 | globallocal_tax_de | globallocal_tax_de | globallocal_tax_de | number(28, 8) |
| 28 | grouplocal_money_cr | grouplocal_money_cr | grouplocal_money_cr | number(28, 8) |
| 29 | grouplocal_money_de | grouplocal_money_de | grouplocal_money_de | number(28, 8) |
| 30 | grouplocal_notax_cr | grouplocal_notax_cr | grouplocal_notax_cr | number(28, 8) |
| 31 | grouplocal_notax_de | grouplocal_notax_de | grouplocal_notax_de | number(28, 8) |
| 32 | grouplocal_tax_cr | grouplocal_tax_cr | grouplocal_tax_cr | number(28, 8) |
| 33 | grouplocal_tax_de | grouplocal_tax_de | grouplocal_tax_de | number(28, 8) |
| 34 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 35 | isrefund | isrefund | isrefund | char(1) |  |  | 'N' |
| 36 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |
| 37 | local_money_de | local_money_de | local_money_de | number(28, 8) |
| 38 | local_notax_cr | local_notax_cr | local_notax_cr | number(28, 8) |
| 39 | local_notax_de | local_notax_de | local_notax_de | number(28, 8) |
| 40 | local_tax_cr | local_tax_cr | local_tax_cr | number(28, 8) |
| 41 | local_tax_de | local_tax_de | local_tax_de | number(28, 8) |
| 42 | material | material | material | varchar2(20) |  |  | '~' |
| 43 | money_cr | money_cr | money_cr | number(28, 8) |
| 44 | money_de | money_de | money_de | number(28, 8) |
| 45 | notax_cr | notax_cr | notax_cr | number(28, 8) |
| 46 | notax_de | notax_de | notax_de | number(28, 8) |
| 47 | objtype | objtype | objtype | number(38, 0) |
| 48 | ordercubasdoc | ordercubasdoc | ordercubasdoc | varchar2(20) |
| 49 | pk_bill | pk_bill | pk_bill | char(20) |
| 50 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 51 | pk_busidata | pk_busidata | pk_busidata | varchar2(20) |
| 52 | pk_corbill | pk_corbill | pk_corbill | varchar2(20) |
| 53 | pk_coritem | pk_coritem | pk_coritem | varchar2(20) |
| 54 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 55 | pk_dealnum | pk_dealnum | pk_dealnum | varchar2(20) |
| 56 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 57 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 58 | pk_item | pk_item | pk_item | char(20) |
| 59 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 60 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 61 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 62 | pk_recpaytype | pk_recpaytype | pk_recpaytype | varchar2(20) |
| 63 | pk_subjcode | pk_subjcode | pk_subjcode | varchar2(20) |  |  | '~' |
| 64 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(50) |
| 65 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 66 | prepay | prepay | prepay | varchar2(1) |
| 67 | quantity_cr | quantity_cr | quantity_cr | number(28, 8) |
| 68 | quantity_de | quantity_de | quantity_de | number(28, 8) |
| 69 | subjcode | subjcode | subjcode | varchar2(20) |
| 70 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 71 | tallydate | tallydate | tallydate | char(19) |
| 72 | tax_cr | tax_cr | tax_cr | number(28, 8) |
| 73 | tax_de | tax_de | tax_de | number(28, 8) |
| 74 | transerial | transerial | transerial | varchar2(200) |
| 75 | verifyfinishdate | verifyfinishdate | verifyfinishdate | varchar2(19) |
| 76 | def1 | def1 | def1 | varchar2(101) |
| 77 | def2 | def2 | def2 | varchar2(101) |
| 78 | def3 | def3 | def3 | varchar2(101) |
| 79 | def4 | def4 | def4 | varchar2(101) |
| 80 | def5 | def5 | def5 | varchar2(101) |
| 81 | def6 | def6 | def6 | varchar2(101) |
| 82 | def7 | def7 | def7 | varchar2(101) |
| 83 | def8 | def8 | def8 | varchar2(101) |
| 84 | def9 | def9 | def9 | varchar2(101) |
| 85 | def10 | def10 | def10 | varchar2(101) |
| 86 | def11 | def11 | def11 | varchar2(101) |
| 87 | def12 | def12 | def12 | varchar2(101) |
| 88 | def13 | def13 | def13 | varchar2(101) |
| 89 | def14 | def14 | def14 | varchar2(101) |
| 90 | def15 | def15 | def15 | varchar2(101) |
| 91 | def16 | def16 | def16 | varchar2(101) |
| 92 | def17 | def17 | def17 | varchar2(101) |
| 93 | def18 | def18 | def18 | varchar2(101) |
| 94 | def19 | def19 | def19 | varchar2(101) |
| 95 | def20 | def20 | def20 | varchar2(101) |
| 96 | def21 | def21 | def21 | varchar2(101) |
| 97 | def22 | def22 | def22 | varchar2(101) |
| 98 | def23 | def23 | def23 | varchar2(101) |
| 99 | def24 | def24 | def24 | varchar2(101) |
| 100 | def25 | def25 | def25 | varchar2(101) |
| 101 | def26 | def26 | def26 | varchar2(101) |
| 102 | def27 | def27 | def27 | varchar2(101) |
| 103 | def28 | def28 | def28 | varchar2(101) |
| 104 | def29 | def29 | def29 | varchar2(101) |
| 105 | def30 | def30 | def30 | varchar2(101) |
| 106 | def31 | def31 | def31 | varchar2(101) |
| 107 | def32 | def32 | def32 | varchar2(101) |
| 108 | def33 | def33 | def33 | varchar2(101) |
| 109 | def34 | def34 | def34 | varchar2(101) |
| 110 | def35 | def35 | def35 | varchar2(101) |
| 111 | def36 | def36 | def36 | varchar2(101) |
| 112 | def37 | def37 | def37 | varchar2(101) |
| 113 | def38 | def38 | def38 | varchar2(101) |
| 114 | def39 | def39 | def39 | varchar2(101) |
| 115 | def40 | def40 | def40 | varchar2(101) |
| 116 | def41 | def41 | def41 | varchar2(101) |
| 117 | def42 | def42 | def42 | varchar2(101) |
| 118 | def43 | def43 | def43 | varchar2(101) |
| 119 | def44 | def44 | def44 | varchar2(101) |
| 120 | def45 | def45 | def45 | varchar2(101) |
| 121 | def46 | def46 | def46 | varchar2(101) |
| 122 | def47 | def47 | def47 | varchar2(101) |
| 123 | def48 | def48 | def48 | varchar2(101) |
| 124 | def49 | def49 | def49 | varchar2(101) |
| 125 | def50 | def50 | def50 | varchar2(101) |
| 126 | def51 | def51 | def51 | varchar2(101) |
| 127 | def52 | def52 | def52 | varchar2(101) |
| 128 | def53 | def53 | def53 | varchar2(101) |
| 129 | def54 | def54 | def54 | varchar2(101) |
| 130 | def55 | def55 | def55 | varchar2(101) |
| 131 | def56 | def56 | def56 | varchar2(101) |
| 132 | def57 | def57 | def57 | varchar2(101) |
| 133 | def58 | def58 | def58 | varchar2(101) |
| 134 | def59 | def59 | def59 | varchar2(101) |
| 135 | def60 | def60 | def60 | varchar2(101) |
| 136 | def61 | def61 | def61 | varchar2(101) |
| 137 | def62 | def62 | def62 | varchar2(101) |
| 138 | def63 | def63 | def63 | varchar2(101) |
| 139 | def64 | def64 | def64 | varchar2(101) |
| 140 | def65 | def65 | def65 | varchar2(101) |
| 141 | def66 | def66 | def66 | varchar2(101) |
| 142 | def67 | def67 | def67 | varchar2(101) |
| 143 | def68 | def68 | def68 | varchar2(101) |
| 144 | def69 | def69 | def69 | varchar2(101) |
| 145 | def70 | def70 | def70 | varchar2(101) |
| 146 | def71 | def71 | def71 | varchar2(101) |
| 147 | def72 | def72 | def72 | varchar2(101) |
| 148 | def73 | def73 | def73 | varchar2(101) |
| 149 | def74 | def74 | def74 | varchar2(101) |
| 150 | def75 | def75 | def75 | varchar2(101) |
| 151 | def76 | def76 | def76 | varchar2(101) |
| 152 | def77 | def77 | def77 | varchar2(101) |
| 153 | def78 | def78 | def78 | varchar2(101) |
| 154 | def79 | def79 | def79 | varchar2(101) |
| 155 | def80 | def80 | def80 | varchar2(101) |
| 156 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 157 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |