# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6602.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recbill | pk_recbill | pk_recbill | char(20) | √ |
| 2 | accessorynum | accessorynum | accessorynum | number(38, 0) |  |  | 0 |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) | √ |  | -1 |
| 6 | billclass | billclass | billclass | varchar2(2) | √ |  | 'ys' |
| 7 | billdate | billdate | billdate | char(19) | √ |
| 8 | billmaker | billmaker | billmaker | char(20) | √ |
| 9 | billno | billno | billno | varchar2(40) |
| 10 | billperiod | billperiod | billperiod | char(2) |
| 11 | billstatus | billstatus | billstatus | number(38, 0) | √ |
| 12 | billyear | billyear | billyear | char(4) |
| 13 | confirmuser | confirmuser | confirmuser | varchar2(20) |  |  | '~' |
| 14 | coordflag | coordflag | coordflag | number(38, 0) |
| 15 | custdelegate | custdelegate | custdelegate | char(20) |
| 16 | effectdate | effectdate | effectdate | char(19) |
| 17 | effectstatus | effectstatus | effectstatus | number(38, 0) |
| 18 | effectuser | effectuser | effectuser | varchar2(20) |  |  | '~' |
| 19 | globallocal | globallocal | globallocal | number(28, 8) |  |  | 0 |
| 20 | grouplocal | grouplocal | grouplocal | number(28, 8) |  |  | 0 |
| 21 | inner_effect_date | inner_effect_date | inner_effect_date | char(19) |
| 22 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 23 | isflowbill | isflowbill | isflowbill | char(1) |
| 24 | isinit | isinit | isinit | char(1) | √ |
| 25 | isreded | isreded | isreded | char(1) |
| 26 | isrefund | isrefund | isrefund | char(1) |  |  | 'N' |
| 27 | lastadjustuser | lastadjustuser | lastadjustuser | varchar2(20) |  |  | '~' |
| 28 | lastapproveid | lastapproveid | lastapproveid | varchar2(20) |  |  | '~' |
| 29 | local_money | local_money | local_money | number(28, 8) |  |  | 0 |
| 30 | money | money | money | number(28, 8) |  |  | 0 |
| 31 | officialprintdate | officialprintdate | officialprintdate | char(19) |
| 32 | officialprintuser | officialprintuser | officialprintuser | varchar2(20) |  |  | '~' |
| 33 | outbusitype | outbusitype | outbusitype | varchar2(20) |  |  | '~' |
| 34 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |
| 35 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 36 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 37 | pk_corp | pk_corp | pk_corp | char(20) |
| 38 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 39 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 40 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 41 | pk_group | pk_group | pk_group | char(20) | √ |
| 42 | pk_org | pk_org | pk_org | char(20) | √ |
| 43 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 44 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 45 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 46 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) | √ |
| 47 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) | √ |
| 48 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 49 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 50 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 51 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 52 | scomment | scomment | scomment | varchar2(250) |  |  | '~' |
| 53 | sendcountryid | sendcountryid | sendcountryid | varchar2(20) |
| 54 | sett_org | sett_org | sett_org | varchar2(20) |  |  | '~' |
| 55 | sett_org_v | sett_org_v | sett_org_v | varchar2(20) |  |  | '~' |
| 56 | signdate | signdate | signdate | char(19) |
| 57 | signperiod | signperiod | signperiod | char(2) |
| 58 | signuser | signuser | signuser | varchar2(20) |  |  | '~' |
| 59 | signyear | signyear | signyear | char(4) |
| 60 | src_syscode | src_syscode | src_syscode | number(38, 0) |
| 61 | start_period | start_period | start_period | varchar2(20) |
| 62 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 63 | syscode | syscode | syscode | number(38, 0) | √ |
| 64 | taxcountryid | taxcountryid | taxcountryid | varchar2(20) |
| 65 | total_period | total_period | total_period | number(38, 0) |
| 66 | def1 | def1 | def1 | varchar2(101) |
| 67 | def2 | def2 | def2 | varchar2(101) |
| 68 | def3 | def3 | def3 | varchar2(101) |
| 69 | def4 | def4 | def4 | varchar2(101) |
| 70 | def5 | def5 | def5 | varchar2(101) |
| 71 | def6 | def6 | def6 | varchar2(101) |
| 72 | def7 | def7 | def7 | varchar2(101) |
| 73 | def8 | def8 | def8 | varchar2(101) |
| 74 | def9 | def9 | def9 | varchar2(101) |
| 75 | def10 | def10 | def10 | varchar2(101) |
| 76 | def11 | def11 | def11 | varchar2(101) |
| 77 | def12 | def12 | def12 | varchar2(101) |
| 78 | def13 | def13 | def13 | varchar2(101) |
| 79 | def14 | def14 | def14 | varchar2(101) |
| 80 | def15 | def15 | def15 | varchar2(101) |
| 81 | def16 | def16 | def16 | varchar2(101) |
| 82 | def17 | def17 | def17 | varchar2(101) |
| 83 | def18 | def18 | def18 | varchar2(101) |
| 84 | def19 | def19 | def19 | varchar2(101) |
| 85 | def20 | def20 | def20 | varchar2(101) |
| 86 | def21 | def21 | def21 | varchar2(101) |
| 87 | def22 | def22 | def22 | varchar2(101) |
| 88 | def23 | def23 | def23 | varchar2(101) |
| 89 | def24 | def24 | def24 | varchar2(101) |
| 90 | def25 | def25 | def25 | varchar2(101) |
| 91 | def26 | def26 | def26 | varchar2(101) |
| 92 | def27 | def27 | def27 | varchar2(101) |
| 93 | def28 | def28 | def28 | varchar2(101) |
| 94 | def29 | def29 | def29 | varchar2(101) |
| 95 | def30 | def30 | def30 | varchar2(101) |
| 96 | def31 | def31 | def31 | varchar2(101) |
| 97 | def32 | def32 | def32 | varchar2(101) |
| 98 | def33 | def33 | def33 | varchar2(101) |
| 99 | def34 | def34 | def34 | varchar2(101) |
| 100 | def35 | def35 | def35 | varchar2(101) |
| 101 | def36 | def36 | def36 | varchar2(101) |
| 102 | def37 | def37 | def37 | varchar2(101) |
| 103 | def38 | def38 | def38 | varchar2(101) |
| 104 | def39 | def39 | def39 | varchar2(101) |
| 105 | def40 | def40 | def40 | varchar2(101) |
| 106 | def41 | def41 | def41 | varchar2(101) |
| 107 | def42 | def42 | def42 | varchar2(101) |
| 108 | def43 | def43 | def43 | varchar2(101) |
| 109 | def44 | def44 | def44 | varchar2(101) |
| 110 | def45 | def45 | def45 | varchar2(101) |
| 111 | def46 | def46 | def46 | varchar2(101) |
| 112 | def47 | def47 | def47 | varchar2(101) |
| 113 | def48 | def48 | def48 | varchar2(101) |
| 114 | def49 | def49 | def49 | varchar2(101) |
| 115 | def50 | def50 | def50 | varchar2(101) |
| 116 | def51 | def51 | def51 | varchar2(101) |
| 117 | def52 | def52 | def52 | varchar2(101) |
| 118 | def53 | def53 | def53 | varchar2(101) |
| 119 | def54 | def54 | def54 | varchar2(101) |
| 120 | def55 | def55 | def55 | varchar2(101) |
| 121 | def56 | def56 | def56 | varchar2(101) |
| 122 | def57 | def57 | def57 | varchar2(101) |
| 123 | def58 | def58 | def58 | varchar2(101) |
| 124 | def59 | def59 | def59 | varchar2(101) |
| 125 | def60 | def60 | def60 | varchar2(101) |
| 126 | def61 | def61 | def61 | varchar2(101) |
| 127 | def62 | def62 | def62 | varchar2(101) |
| 128 | def63 | def63 | def63 | varchar2(101) |
| 129 | def64 | def64 | def64 | varchar2(101) |
| 130 | def65 | def65 | def65 | varchar2(101) |
| 131 | def66 | def66 | def66 | varchar2(101) |
| 132 | def67 | def67 | def67 | varchar2(101) |
| 133 | def68 | def68 | def68 | varchar2(101) |
| 134 | def69 | def69 | def69 | varchar2(101) |
| 135 | def70 | def70 | def70 | varchar2(101) |
| 136 | def71 | def71 | def71 | varchar2(101) |
| 137 | def72 | def72 | def72 | varchar2(101) |
| 138 | def73 | def73 | def73 | varchar2(101) |
| 139 | def74 | def74 | def74 | varchar2(101) |
| 140 | def75 | def75 | def75 | varchar2(101) |
| 141 | def76 | def76 | def76 | varchar2(101) |
| 142 | def77 | def77 | def77 | varchar2(101) |
| 143 | def78 | def78 | def78 | varchar2(101) |
| 144 | def79 | def79 | def79 | varchar2(101) |
| 145 | def80 | def80 | def80 | varchar2(101) |
| 146 | creationtime | creationtime | creationtime | char(19) | √ |
| 147 | creator | creator | creator | char(20) | √ |
| 148 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 149 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 150 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 151 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |