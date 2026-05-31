# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6578.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busidata | pk_busidata | pk_busidata | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billclass | billclass | billclass | varchar2(50) |
| 4 | billdate | billdate | billdate | char(19) |
| 5 | billno | billno | billno | varchar2(40) |
| 6 | billstatus | billstatus | billstatus | number(38, 0) |
| 7 | cashaccount | cashaccount | cashaccount | varchar2(20) |
| 8 | contractno | contractno | contractno | varchar2(40) |
| 9 | costcenter | costcenter | costcenter | varchar2(20) |
| 10 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 11 | direction | direction | direction | number(38, 0) |
| 12 | estflag | estflag | estflag | number(38, 0) |
| 13 | expiredate | expiredate | expiredate | char(19) |
| 14 | globalrate | globalrate | globalrate | number(15, 8) |
| 15 | global_money_bal | global_money_bal | global_money_bal | number(28, 8) |
| 16 | global_money_cr | global_money_cr | global_money_cr | number(28, 8) |
| 17 | global_money_de | global_money_de | global_money_de | number(28, 8) |
| 18 | grouprate | grouprate | grouprate | number(15, 8) |
| 19 | group_money_bal | group_money_bal | group_money_bal | number(28, 8) |
| 20 | group_money_cr | group_money_cr | group_money_cr | number(28, 8) |
| 21 | group_money_de | group_money_de | group_money_de | number(28, 8) |
| 22 | headsubjcode | headsubjcode | headsubjcode | varchar2(20) |  |  | '~' |
| 23 | innerctldeferdays | innerctldeferdays | innerctldeferdays | char(19) |
| 24 | insurance | insurance | insurance | char(1) |
| 25 | invoiceno | invoiceno | invoiceno | varchar2(140) |
| 26 | isinit | isinit | isinit | char(1) |
| 27 | isrefund | isrefund | isrefund | char(1) |  |  | 'N' |
| 28 | istransin | istransin | istransin | char(1) |  |  | 'N' |
| 29 | local_money_bal | local_money_bal | local_money_bal | number(28, 8) |
| 30 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |
| 31 | local_money_de | local_money_de | local_money_de | number(28, 8) |
| 32 | material | material | material | varchar2(20) |  |  | '~' |
| 33 | money_bal | money_bal | money_bal | number(28, 8) |
| 34 | money_cr | money_cr | money_cr | number(28, 8) |
| 35 | money_de | money_de | money_de | number(28, 8) |
| 36 | objtype | objtype | objtype | number(38, 0) |
| 37 | occupationmny | occupationmny | occupationmny | number(28, 8) |
| 38 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 39 | ordercubasdoc | ordercubasdoc | ordercubasdoc | varchar2(20) |  |  | '~' |
| 40 | outbusitype | outbusitype | outbusitype | char(20) |
| 41 | pausetransact | pausetransact | pausetransact | char(1) |
| 42 | pk_areacl | pk_areacl | pk_areacl | varchar2(20) |  |  | '~' |
| 43 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 44 | pk_bill | pk_bill | pk_bill | char(20) |
| 45 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 46 | pk_busitype | pk_busitype | pk_busitype | char(20) |
| 47 | pk_costsubj | pk_costsubj | pk_costsubj | varchar2(20) |  |  | '~' |
| 48 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 49 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 50 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 51 | pk_item | pk_item | pk_item | char(20) |
| 52 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 53 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 54 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 55 | pk_termitem | pk_termitem | pk_termitem | char(20) |
| 56 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(50) |  |  | '~' |
| 57 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 58 | prepay | prepay | prepay | number(38, 0) |
| 59 | price | price | price | number(28, 8) |
| 60 | productline | productline | productline | varchar2(20) |  |  | '~' |
| 61 | project | project | project | varchar2(20) |
| 62 | project_task | project_task | project_task | varchar2(20) |
| 63 | purchaseorder | purchaseorder | purchaseorder | varchar2(40) |
| 64 | pu_deptid | pu_deptid | pu_deptid | varchar2(20) |  |  | '~' |
| 65 | pu_org | pu_org | pu_org | varchar2(20) |  |  | '~' |
| 66 | pu_psndoc | pu_psndoc | pu_psndoc | varchar2(20) |  |  | '~' |
| 67 | quantity_bal | quantity_bal | quantity_bal | number(20, 8) |
| 68 | quantity_cr | quantity_cr | quantity_cr | number(20, 8) |
| 69 | quantity_de | quantity_de | quantity_de | number(20, 8) |
| 70 | rate | rate | rate | number(15, 8) |
| 71 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 72 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 73 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 74 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 75 | sett_org | sett_org | sett_org | varchar2(20) |  |  | '~' |
| 76 | so_deptid | so_deptid | so_deptid | varchar2(20) |  |  | '~' |
| 77 | so_ordertype | so_ordertype | so_ordertype | char(20) |
| 78 | so_org | so_org | so_org | varchar2(20) |  |  | '~' |
| 79 | so_psndoc | so_psndoc | so_psndoc | varchar2(20) |  |  | '~' |
| 80 | so_transtype | so_transtype | so_transtype | char(20) |
| 81 | src_billid | src_billid | src_billid | char(20) |
| 82 | src_itemid | src_itemid | src_itemid | char(20) |
| 83 | src_syscode | src_syscode | src_syscode | number(38, 0) |
| 84 | subjcode | subjcode | subjcode | varchar2(20) |  |  | '~' |
| 85 | sum_headmoney | sum_headmoney | sum_headmoney | number(28, 8) |
| 86 | sum_itemmoney | sum_itemmoney | sum_itemmoney | number(28, 8) |
| 87 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 88 | syscode | syscode | syscode | number(38, 0) |
| 89 | top_billid | top_billid | top_billid | char(20) |
| 90 | top_billtype | top_billtype | top_billtype | char(20) |
| 91 | top_itemid | top_itemid | top_itemid | char(20) |
| 92 | def1 | def1 | def1 | varchar2(101) |
| 93 | def2 | def2 | def2 | varchar2(101) |
| 94 | def3 | def3 | def3 | varchar2(101) |
| 95 | def4 | def4 | def4 | varchar2(101) |
| 96 | def5 | def5 | def5 | varchar2(101) |
| 97 | def6 | def6 | def6 | varchar2(101) |
| 98 | def7 | def7 | def7 | varchar2(101) |
| 99 | def8 | def8 | def8 | varchar2(101) |
| 100 | def9 | def9 | def9 | varchar2(101) |
| 101 | def10 | def10 | def10 | varchar2(101) |
| 102 | def11 | def11 | def11 | varchar2(101) |
| 103 | def12 | def12 | def12 | varchar2(101) |
| 104 | def13 | def13 | def13 | varchar2(101) |
| 105 | def14 | def14 | def14 | varchar2(101) |
| 106 | def15 | def15 | def15 | varchar2(101) |
| 107 | def16 | def16 | def16 | varchar2(101) |
| 108 | def17 | def17 | def17 | varchar2(101) |
| 109 | def18 | def18 | def18 | varchar2(101) |
| 110 | def19 | def19 | def19 | varchar2(101) |
| 111 | def20 | def20 | def20 | varchar2(101) |
| 112 | def21 | def21 | def21 | varchar2(101) |
| 113 | def22 | def22 | def22 | varchar2(101) |
| 114 | def23 | def23 | def23 | varchar2(101) |
| 115 | def24 | def24 | def24 | varchar2(101) |
| 116 | def25 | def25 | def25 | varchar2(101) |
| 117 | def26 | def26 | def26 | varchar2(101) |
| 118 | def27 | def27 | def27 | varchar2(101) |
| 119 | def28 | def28 | def28 | varchar2(101) |
| 120 | def29 | def29 | def29 | varchar2(101) |
| 121 | def30 | def30 | def30 | varchar2(101) |
| 122 | def31 | def31 | def31 | varchar2(101) |
| 123 | def32 | def32 | def32 | varchar2(101) |
| 124 | def33 | def33 | def33 | varchar2(101) |
| 125 | def34 | def34 | def34 | varchar2(101) |
| 126 | def35 | def35 | def35 | varchar2(101) |
| 127 | def36 | def36 | def36 | varchar2(101) |
| 128 | def37 | def37 | def37 | varchar2(101) |
| 129 | def38 | def38 | def38 | varchar2(101) |
| 130 | def39 | def39 | def39 | varchar2(101) |
| 131 | def40 | def40 | def40 | varchar2(101) |
| 132 | def41 | def41 | def41 | varchar2(101) |
| 133 | def42 | def42 | def42 | varchar2(101) |
| 134 | def43 | def43 | def43 | varchar2(101) |
| 135 | def44 | def44 | def44 | varchar2(101) |
| 136 | def45 | def45 | def45 | varchar2(101) |
| 137 | def46 | def46 | def46 | varchar2(101) |
| 138 | def47 | def47 | def47 | varchar2(101) |
| 139 | def48 | def48 | def48 | varchar2(101) |
| 140 | def49 | def49 | def49 | varchar2(101) |
| 141 | def50 | def50 | def50 | varchar2(101) |
| 142 | def51 | def51 | def51 | varchar2(101) |
| 143 | def52 | def52 | def52 | varchar2(101) |
| 144 | def53 | def53 | def53 | varchar2(101) |
| 145 | def54 | def54 | def54 | varchar2(101) |
| 146 | def55 | def55 | def55 | varchar2(101) |
| 147 | def56 | def56 | def56 | varchar2(101) |
| 148 | def57 | def57 | def57 | varchar2(101) |
| 149 | def58 | def58 | def58 | varchar2(101) |
| 150 | def59 | def59 | def59 | varchar2(101) |
| 151 | def60 | def60 | def60 | varchar2(101) |
| 152 | def61 | def61 | def61 | varchar2(101) |
| 153 | def62 | def62 | def62 | varchar2(101) |
| 154 | def63 | def63 | def63 | varchar2(101) |
| 155 | def64 | def64 | def64 | varchar2(101) |
| 156 | def65 | def65 | def65 | varchar2(101) |
| 157 | def66 | def66 | def66 | varchar2(101) |
| 158 | def67 | def67 | def67 | varchar2(101) |
| 159 | def68 | def68 | def68 | varchar2(101) |
| 160 | def69 | def69 | def69 | varchar2(101) |
| 161 | def70 | def70 | def70 | varchar2(101) |
| 162 | def71 | def71 | def71 | varchar2(101) |
| 163 | def72 | def72 | def72 | varchar2(101) |
| 164 | def73 | def73 | def73 | varchar2(101) |
| 165 | def74 | def74 | def74 | varchar2(101) |
| 166 | def75 | def75 | def75 | varchar2(101) |
| 167 | def76 | def76 | def76 | varchar2(101) |
| 168 | def77 | def77 | def77 | varchar2(101) |
| 169 | def78 | def78 | def78 | varchar2(101) |
| 170 | def79 | def79 | def79 | varchar2(101) |
| 171 | def80 | def80 | def80 | varchar2(101) |
| 172 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 173 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |