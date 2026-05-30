# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8361.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_revconfirm | pk_revconfirm | pk_revconfirm | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billcode | billcode | billcode | varchar2(50) | √ |
| 7 | billdate | billdate | billdate | char(19) | √ |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billperiod | billperiod | billperiod | varchar2(50) |  |  | '~' |
| 10 | billstate | billstate | billstate | number(38, 0) |
| 11 | billtype | billtype | billtype | varchar2(50) |
| 12 | billyear | billyear | billyear | varchar2(50) |
| 13 | busitype | busitype | busitype | varchar2(20) |  |  | '~' |
| 14 | confirmtype | confirmtype | confirmtype | number(38, 0) |
| 15 | filenum | filenum | filenum | number(38, 0) |
| 16 | isdeferral | isdeferral | isdeferral | char(1) |
| 17 | isinit | isinit | isinit | char(1) |
| 18 | ismadebill | ismadebill | ismadebill | char(1) |
| 19 | isreded | isreded | isreded | char(1) |
| 20 | isstages | isstages | isstages | char(1) |
| 21 | isworkflow | isworkflow | isworkflow | char(1) |
| 22 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 23 | nglobalexchrate | nglobalexchrate | nglobalexchrate | number(28, 8) |
| 24 | nglobalmny | nglobalmny | nglobalmny | number(28, 8) |
| 25 | nglobaltax | nglobaltax | nglobaltax | number(28, 8) |
| 26 | nglobaltaxmny | nglobaltaxmny | nglobaltaxmny | number(28, 8) |
| 27 | ngouptax | ngouptax | ngouptax | number(28, 8) |
| 28 | ngroupexchrate | ngroupexchrate | ngroupexchrate | number(28, 8) |
| 29 | ngroupmny | ngroupmny | ngroupmny | number(28, 8) |
| 30 | ngrouptaxmny | ngrouptaxmny | ngrouptaxmny | number(28, 8) |
| 31 | nmny | nmny | nmny | number(28, 8) |
| 32 | norigmny | norigmny | norigmny | number(28, 8) |
| 33 | norigtax | norigtax | norigtax | number(28, 8) |
| 34 | norigtaxmny | norigtaxmny | norigtaxmny | number(28, 8) |
| 35 | notaxmny | notaxmny | notaxmny | number(28, 8) |
| 36 | ntax | ntax | ntax | number(28, 8) |
| 37 | pk_cemployee | pk_cemployee | pk_cemployee | varchar2(20) |  |  | '~' |
| 38 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 39 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 40 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 41 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 42 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 43 | pk_freecustomer | pk_freecustomer | pk_freecustomer | varchar2(20) |  |  | '~' |
| 44 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 45 | pk_module | pk_module | pk_module | varchar2(20) |  |  | '~' |
| 46 | pk_ordcustomer | pk_ordcustomer | pk_ordcustomer | varchar2(20) |  |  | '~' |
| 47 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 48 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 49 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 50 | pk_profitcenter_v | pk_profitcenter_v | pk_profitcenter_v | varchar2(20) |  |  | '~' |
| 51 | pk_redsource | pk_redsource | pk_redsource | varchar2(50) |
| 52 | redflag | redflag | redflag | char(1) |
| 53 | revenuetype | revenuetype | revenuetype | number(38, 0) |
| 54 | saga_btxid | saga_btxid | saga_btxid | varchar2(50) |
| 55 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 56 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(50) |
| 57 | saga_status | saga_status | saga_status | number(38, 0) |
| 58 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 59 | srcbilltype | srcbilltype | srcbilltype | varchar2(20) |  |  | '~' |
| 60 | src_syscode | src_syscode | src_syscode | varchar2(20) |  |  | '~' |
| 61 | top_src_billid | top_src_billid | top_src_billid | varchar2(50) |
| 62 | transtype | transtype | transtype | varchar2(50) |
| 63 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 64 | def1 | def1 | def1 | varchar2(101) |
| 65 | def2 | def2 | def2 | varchar2(101) |
| 66 | def3 | def3 | def3 | varchar2(101) |
| 67 | def4 | def4 | def4 | varchar2(101) |
| 68 | def5 | def5 | def5 | varchar2(101) |
| 69 | def6 | def6 | def6 | varchar2(101) |
| 70 | def7 | def7 | def7 | varchar2(101) |
| 71 | def8 | def8 | def8 | varchar2(101) |
| 72 | def9 | def9 | def9 | varchar2(101) |
| 73 | def10 | def10 | def10 | varchar2(101) |
| 74 | def11 | def11 | def11 | varchar2(101) |
| 75 | def12 | def12 | def12 | varchar2(101) |
| 76 | def13 | def13 | def13 | varchar2(101) |
| 77 | def14 | def14 | def14 | varchar2(101) |
| 78 | def15 | def15 | def15 | varchar2(101) |
| 79 | def16 | def16 | def16 | varchar2(101) |
| 80 | def17 | def17 | def17 | varchar2(101) |
| 81 | def18 | def18 | def18 | varchar2(101) |
| 82 | def19 | def19 | def19 | varchar2(101) |
| 83 | def20 | def20 | def20 | varchar2(101) |
| 84 | def21 | def21 | def21 | varchar2(101) |
| 85 | def22 | def22 | def22 | varchar2(101) |
| 86 | def23 | def23 | def23 | varchar2(101) |
| 87 | def24 | def24 | def24 | varchar2(101) |
| 88 | def25 | def25 | def25 | varchar2(101) |
| 89 | def26 | def26 | def26 | varchar2(101) |
| 90 | def27 | def27 | def27 | varchar2(101) |
| 91 | def28 | def28 | def28 | varchar2(101) |
| 92 | def29 | def29 | def29 | varchar2(101) |
| 93 | def30 | def30 | def30 | varchar2(101) |
| 94 | def31 | def31 | def31 | varchar2(101) |
| 95 | def32 | def32 | def32 | varchar2(101) |
| 96 | def33 | def33 | def33 | varchar2(101) |
| 97 | def34 | def34 | def34 | varchar2(101) |
| 98 | def35 | def35 | def35 | varchar2(101) |
| 99 | def36 | def36 | def36 | varchar2(101) |
| 100 | def37 | def37 | def37 | varchar2(101) |
| 101 | def38 | def38 | def38 | varchar2(101) |
| 102 | def39 | def39 | def39 | varchar2(101) |
| 103 | def40 | def40 | def40 | varchar2(101) |
| 104 | def41 | def41 | def41 | varchar2(101) |
| 105 | def42 | def42 | def42 | varchar2(101) |
| 106 | def43 | def43 | def43 | varchar2(101) |
| 107 | def44 | def44 | def44 | varchar2(101) |
| 108 | def45 | def45 | def45 | varchar2(101) |
| 109 | def46 | def46 | def46 | varchar2(101) |
| 110 | def47 | def47 | def47 | varchar2(101) |
| 111 | def48 | def48 | def48 | varchar2(101) |
| 112 | def49 | def49 | def49 | varchar2(101) |
| 113 | def50 | def50 | def50 | varchar2(101) |
| 114 | def51 | def51 | def51 | varchar2(101) |
| 115 | def52 | def52 | def52 | varchar2(101) |
| 116 | def53 | def53 | def53 | varchar2(101) |
| 117 | def54 | def54 | def54 | varchar2(101) |
| 118 | def55 | def55 | def55 | varchar2(101) |
| 119 | def56 | def56 | def56 | varchar2(101) |
| 120 | def57 | def57 | def57 | varchar2(101) |
| 121 | def58 | def58 | def58 | varchar2(101) |
| 122 | def59 | def59 | def59 | varchar2(101) |
| 123 | def60 | def60 | def60 | varchar2(101) |
| 124 | def61 | def61 | def61 | varchar2(101) |
| 125 | def62 | def62 | def62 | varchar2(101) |
| 126 | def63 | def63 | def63 | varchar2(101) |
| 127 | def64 | def64 | def64 | varchar2(101) |
| 128 | def65 | def65 | def65 | varchar2(101) |
| 129 | def66 | def66 | def66 | varchar2(101) |
| 130 | def67 | def67 | def67 | varchar2(101) |
| 131 | def68 | def68 | def68 | varchar2(101) |
| 132 | def69 | def69 | def69 | varchar2(101) |
| 133 | def70 | def70 | def70 | varchar2(101) |
| 134 | def71 | def71 | def71 | varchar2(101) |
| 135 | def72 | def72 | def72 | varchar2(101) |
| 136 | def73 | def73 | def73 | varchar2(101) |
| 137 | def74 | def74 | def74 | varchar2(101) |
| 138 | def75 | def75 | def75 | varchar2(101) |
| 139 | def76 | def76 | def76 | varchar2(101) |
| 140 | def77 | def77 | def77 | varchar2(101) |
| 141 | def78 | def78 | def78 | varchar2(101) |
| 142 | def79 | def79 | def79 | varchar2(101) |
| 143 | def80 | def80 | def80 | varchar2(101) |
| 144 | creationtime | creationtime | creationtime | char(19) |
| 145 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 146 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 147 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 148 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 149 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |