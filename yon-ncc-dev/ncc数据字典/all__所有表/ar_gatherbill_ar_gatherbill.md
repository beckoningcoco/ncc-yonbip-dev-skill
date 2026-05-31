# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6600.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatherbill | pk_gatherbill | pk_gatherbill | char(20) | √ |
| 2 | accessorynum | accessorynum | accessorynum | number(38, 0) |  |  | 0 |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) | √ |  | -1 |
| 6 | billclass | billclass | billclass | varchar2(2) | √ |  | 'sk' |
| 7 | billdate | billdate | billdate | char(19) | √ |
| 8 | billmaker | billmaker | billmaker | char(20) | √ |
| 9 | billno | billno | billno | varchar2(40) |
| 10 | billperiod | billperiod | billperiod | varchar2(2) |
| 11 | billstatus | billstatus | billstatus | number(38, 0) | √ |
| 12 | billyear | billyear | billyear | varchar2(4) |
| 13 | commpaybegindate | commpaybegindate | commpaybegindate | char(19) |
| 14 | commpayenddate | commpayenddate | commpayenddate | char(19) |
| 15 | confirmuser | confirmuser | confirmuser | varchar2(20) |  |  | '~' |
| 16 | consignagreement | consignagreement | consignagreement | varchar2(20) |  |  | '~' |
| 17 | coordflag | coordflag | coordflag | number(38, 0) |
| 18 | creditorreference | creditorreference | creditorreference | varchar2(50) |
| 19 | creditrefstd | creditrefstd | creditrefstd | varchar2(20) |
| 20 | custdelegate | custdelegate | custdelegate | char(20) |
| 21 | effectdate | effectdate | effectdate | char(19) |
| 22 | effectstatus | effectstatus | effectstatus | number(38, 0) |
| 23 | effectuser | effectuser | effectuser | varchar2(20) |  |  | '~' |
| 24 | expectdealdate | expectdealdate | expectdealdate | char(19) |
| 25 | failurereason | failurereason | failurereason | varchar2(181) |
| 26 | globallocal | globallocal | globallocal | number(28, 8) |  |  | 0 |
| 27 | grouplocal | grouplocal | grouplocal | number(28, 8) |  |  | 0 |
| 28 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 29 | isflowbill | isflowbill | isflowbill | char(1) |
| 30 | isforce | isforce | isforce | char(1) |
| 31 | isfromindependent | isfromindependent | isfromindependent | char(1) |
| 32 | isinit | isinit | isinit | char(1) |
| 33 | ismandatepay | ismandatepay | ismandatepay | char(1) |
| 34 | isnetpayready | isnetpayready | isnetpayready | char(1) |
| 35 | isonlinepay | isonlinepay | isonlinepay | char(1) |
| 36 | isreded | isreded | isreded | char(1) |
| 37 | isrefund | isrefund | isrefund | char(1) |  |  | 'N' |
| 38 | lastadjustuser | lastadjustuser | lastadjustuser | varchar2(20) |  |  | '~' |
| 39 | lastapproveid | lastapproveid | lastapproveid | varchar2(20) |  |  | '~' |
| 40 | local_money | local_money | local_money | number(28, 8) |  |  | 0 |
| 41 | money | money | money | number(28, 8) |  |  | 0 |
| 42 | officialprintdate | officialprintdate | officialprintdate | char(19) |
| 43 | officialprintuser | officialprintuser | officialprintuser | varchar2(20) |  |  | '~' |
| 44 | outbusitype | outbusitype | outbusitype | varchar2(20) |  |  | '~' |
| 45 | paydate | paydate | paydate | char(19) |
| 46 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 47 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 48 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 49 | pk_corp | pk_corp | pk_corp | char(20) |
| 50 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 51 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 52 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 53 | pk_group | pk_group | pk_group | char(20) | √ |
| 54 | pk_org | pk_org | pk_org | char(20) | √ |
| 55 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 56 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 57 | pk_pcorg_v | pk_pcorg_v | pk_pcorg_v | varchar2(20) |  |  | '~' |
| 58 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) | √ |
| 59 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) | √ |
| 60 | reversalreason | reversalreason | reversalreason | varchar2(50) |
| 61 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 62 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 63 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 64 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 65 | scomment | scomment | scomment | varchar2(250) |  |  | '~' |
| 66 | sddreversaldate | sddreversaldate | sddreversaldate | char(19) |
| 67 | sddreversaler | sddreversaler | sddreversaler | varchar2(20) |  |  | '~' |
| 68 | sddreversalflag | sddreversalflag | sddreversalflag | char(1) |
| 69 | sendcountryid | sendcountryid | sendcountryid | varchar2(20) |
| 70 | settleflag | settleflag | settleflag | number(38, 0) |
| 71 | settlenum | settlenum | settlenum | varchar2(30) |
| 72 | settletype | settletype | settletype | number(38, 0) |
| 73 | sett_org | sett_org | sett_org | varchar2(20) |  |  | '~' |
| 74 | sett_org_v | sett_org_v | sett_org_v | varchar2(20) |  |  | '~' |
| 75 | signdate | signdate | signdate | char(19) |
| 76 | signperiod | signperiod | signperiod | varchar2(2) |
| 77 | signuser | signuser | signuser | varchar2(20) |  |  | '~' |
| 78 | signyear | signyear | signyear | varchar2(4) |
| 79 | src_syscode | src_syscode | src_syscode | number(38, 0) |
| 80 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 81 | syscode | syscode | syscode | number(38, 0) | √ |
| 82 | taxcountryid | taxcountryid | taxcountryid | varchar2(20) |
| 83 | def1 | def1 | def1 | varchar2(101) |
| 84 | def2 | def2 | def2 | varchar2(101) |
| 85 | def3 | def3 | def3 | varchar2(101) |
| 86 | def4 | def4 | def4 | varchar2(101) |
| 87 | def5 | def5 | def5 | varchar2(101) |
| 88 | def6 | def6 | def6 | varchar2(101) |
| 89 | def7 | def7 | def7 | varchar2(101) |
| 90 | def8 | def8 | def8 | varchar2(101) |
| 91 | def9 | def9 | def9 | varchar2(101) |
| 92 | def10 | def10 | def10 | varchar2(101) |
| 93 | def11 | def11 | def11 | varchar2(101) |
| 94 | def12 | def12 | def12 | varchar2(101) |
| 95 | def13 | def13 | def13 | varchar2(101) |
| 96 | def14 | def14 | def14 | varchar2(101) |
| 97 | def15 | def15 | def15 | varchar2(101) |
| 98 | def16 | def16 | def16 | varchar2(101) |
| 99 | def17 | def17 | def17 | varchar2(101) |
| 100 | def18 | def18 | def18 | varchar2(101) |
| 101 | def19 | def19 | def19 | varchar2(101) |
| 102 | def20 | def20 | def20 | varchar2(101) |
| 103 | def21 | def21 | def21 | varchar2(101) |
| 104 | def22 | def22 | def22 | varchar2(101) |
| 105 | def23 | def23 | def23 | varchar2(101) |
| 106 | def24 | def24 | def24 | varchar2(101) |
| 107 | def25 | def25 | def25 | varchar2(101) |
| 108 | def26 | def26 | def26 | varchar2(101) |
| 109 | def27 | def27 | def27 | varchar2(101) |
| 110 | def28 | def28 | def28 | varchar2(101) |
| 111 | def29 | def29 | def29 | varchar2(101) |
| 112 | def30 | def30 | def30 | varchar2(101) |
| 113 | def31 | def31 | def31 | varchar2(101) |
| 114 | def32 | def32 | def32 | varchar2(101) |
| 115 | def33 | def33 | def33 | varchar2(101) |
| 116 | def34 | def34 | def34 | varchar2(101) |
| 117 | def35 | def35 | def35 | varchar2(101) |
| 118 | def36 | def36 | def36 | varchar2(101) |
| 119 | def37 | def37 | def37 | varchar2(101) |
| 120 | def38 | def38 | def38 | varchar2(101) |
| 121 | def39 | def39 | def39 | varchar2(101) |
| 122 | def40 | def40 | def40 | varchar2(101) |
| 123 | def41 | def41 | def41 | varchar2(101) |
| 124 | def42 | def42 | def42 | varchar2(101) |
| 125 | def43 | def43 | def43 | varchar2(101) |
| 126 | def44 | def44 | def44 | varchar2(101) |
| 127 | def45 | def45 | def45 | varchar2(101) |
| 128 | def46 | def46 | def46 | varchar2(101) |
| 129 | def47 | def47 | def47 | varchar2(101) |
| 130 | def48 | def48 | def48 | varchar2(101) |
| 131 | def49 | def49 | def49 | varchar2(101) |
| 132 | def50 | def50 | def50 | varchar2(101) |
| 133 | def51 | def51 | def51 | varchar2(101) |
| 134 | def52 | def52 | def52 | varchar2(101) |
| 135 | def53 | def53 | def53 | varchar2(101) |
| 136 | def54 | def54 | def54 | varchar2(101) |
| 137 | def55 | def55 | def55 | varchar2(101) |
| 138 | def56 | def56 | def56 | varchar2(101) |
| 139 | def57 | def57 | def57 | varchar2(101) |
| 140 | def58 | def58 | def58 | varchar2(101) |
| 141 | def59 | def59 | def59 | varchar2(101) |
| 142 | def60 | def60 | def60 | varchar2(101) |
| 143 | def61 | def61 | def61 | varchar2(101) |
| 144 | def62 | def62 | def62 | varchar2(101) |
| 145 | def63 | def63 | def63 | varchar2(101) |
| 146 | def64 | def64 | def64 | varchar2(101) |
| 147 | def65 | def65 | def65 | varchar2(101) |
| 148 | def66 | def66 | def66 | varchar2(101) |
| 149 | def67 | def67 | def67 | varchar2(101) |
| 150 | def68 | def68 | def68 | varchar2(101) |
| 151 | def69 | def69 | def69 | varchar2(101) |
| 152 | def70 | def70 | def70 | varchar2(101) |
| 153 | def71 | def71 | def71 | varchar2(101) |
| 154 | def72 | def72 | def72 | varchar2(101) |
| 155 | def73 | def73 | def73 | varchar2(101) |
| 156 | def74 | def74 | def74 | varchar2(101) |
| 157 | def75 | def75 | def75 | varchar2(101) |
| 158 | def76 | def76 | def76 | varchar2(101) |
| 159 | def77 | def77 | def77 | varchar2(101) |
| 160 | def78 | def78 | def78 | varchar2(101) |
| 161 | def79 | def79 | def79 | varchar2(101) |
| 162 | def80 | def80 | def80 | varchar2(101) |
| 163 | creationtime | creationtime | creationtime | char(19) | √ |
| 164 | creator | creator | creator | char(20) | √ |
| 165 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 166 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 167 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 168 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |