# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7978.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_bill | pk_mtapp_bill | pk_mtapp_bill | char(20) | √ |
| 2 | actualpedestrian | actualpedestrian | actualpedestrian | varchar2(420) |  |  | '~' |
| 3 | apply_dept | apply_dept | apply_dept | varchar2(20) |  |  | '~' |
| 4 | apply_org | apply_org | apply_org | varchar2(20) |  |  | '~' |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvetime | approvetime | approvetime | char(19) |
| 7 | apprstatus | apprstatus | apprstatus | number(38, 0) |
| 8 | assume_dept | assume_dept | assume_dept | varchar2(20) |  |  | '~' |
| 9 | attach_amount | attach_amount | attach_amount | number(38, 0) |
| 10 | auditman | auditman | auditman | varchar2(20) |  |  | '~' |
| 11 | autoclosedate | autoclosedate | autoclosedate | char(19) |
| 12 | billdate | billdate | billdate | char(19) |
| 13 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 14 | billno | billno | billno | varchar2(50) |
| 15 | billstatus | billstatus | billstatus | number(38, 0) |
| 16 | center_dept | center_dept | center_dept | varchar2(20) |  |  | '~' |
| 17 | closedate | closedate | closedate | char(19) |
| 18 | closeman | closeman | closeman | varchar2(20) |  |  | '~' |
| 19 | close_status | close_status | close_status | number(38, 0) |
| 20 | djdl | djdl | djdl | varchar2(50) |  |  | 'ma' |
| 21 | effectstatus | effectstatus | effectstatus | number(38, 0) |
| 22 | exe_amount | exe_amount | exe_amount | number(28, 8) |
| 23 | global_amount | global_amount | global_amount | number(28, 8) |
| 24 | global_currinfo | global_currinfo | global_currinfo | number(15, 8) |
| 25 | global_exe_amount | global_exe_amount | global_exe_amount | number(28, 8) |
| 26 | global_pre_amount | global_pre_amount | global_pre_amount | number(28, 8) |
| 27 | global_rest_amount | global_rest_amount | global_rest_amount | number(28, 8) |
| 28 | group_amount | group_amount | group_amount | number(28, 8) |
| 29 | group_currinfo | group_currinfo | group_currinfo | number(15, 8) |
| 30 | group_exe_amount | group_exe_amount | group_exe_amount | number(28, 8) |
| 31 | group_pre_amount | group_pre_amount | group_pre_amount | number(28, 8) |
| 32 | group_rest_amount | group_rest_amount | group_rest_amount | number(28, 8) |
| 33 | imag_status | imag_status | imag_status | varchar2(2) |
| 34 | iscostshare | iscostshare | iscostshare | char(1) |
| 35 | isexpedited | isexpedited | isexpedited | char(1) |
| 36 | isneedimag | isneedimag | isneedimag | char(1) |
| 37 | is_adjust | is_adjust | is_adjust | char(1) | √ |  | 'Y' |
| 38 | jobid | jobid | jobid | varchar2(20) |  |  | '~' |
| 39 | max_amount | max_amount | max_amount | number(28, 8) |
| 40 | org_amount | org_amount | org_amount | number(28, 8) |
| 41 | org_currinfo | org_currinfo | org_currinfo | number(15, 8) |
| 42 | org_exe_amount | org_exe_amount | org_exe_amount | number(28, 8) |
| 43 | org_pre_amount | org_pre_amount | org_pre_amount | number(28, 8) |
| 44 | org_rest_amount | org_rest_amount | org_rest_amount | number(28, 8) |
| 45 | orig_amount | orig_amount | orig_amount | number(28, 8) |
| 46 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 47 | pk_campaign | pk_campaign | pk_campaign | varchar2(20) |  |  | '~' |
| 48 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 49 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 50 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 51 | pk_iobsclass | pk_iobsclass | pk_iobsclass | varchar2(20) |
| 52 | pk_matters | pk_matters | pk_matters | varchar2(20) |  |  | '~' |
| 53 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 54 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 55 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 56 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(50) |  |  | '~' |
| 57 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |
| 58 | pre_amount | pre_amount | pre_amount | number(28, 8) |
| 59 | printdate | printdate | printdate | char(19) |
| 60 | printer | printer | printer | varchar2(20) |  |  | '~' |
| 61 | reason | reason | reason | varchar2(500) |  |  | '~' |
| 62 | rest_amount | rest_amount | rest_amount | number(28, 8) |
| 63 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 64 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 65 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 66 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 67 | src_ybz_id | src_ybz_id | src_ybz_id | varchar2(50) |  |  | '~' |
| 68 | defitem1 | defitem1 | defitem1 | varchar2(101) |
| 69 | defitem2 | defitem2 | defitem2 | varchar2(101) |
| 70 | defitem3 | defitem3 | defitem3 | varchar2(101) |
| 71 | defitem4 | defitem4 | defitem4 | varchar2(101) |
| 72 | defitem5 | defitem5 | defitem5 | varchar2(101) |
| 73 | defitem6 | defitem6 | defitem6 | varchar2(101) |
| 74 | defitem7 | defitem7 | defitem7 | varchar2(101) |
| 75 | defitem8 | defitem8 | defitem8 | varchar2(101) |
| 76 | defitem9 | defitem9 | defitem9 | varchar2(101) |
| 77 | defitem10 | defitem10 | defitem10 | varchar2(101) |
| 78 | defitem11 | defitem11 | defitem11 | varchar2(101) |
| 79 | defitem12 | defitem12 | defitem12 | varchar2(101) |
| 80 | defitem13 | defitem13 | defitem13 | varchar2(101) |
| 81 | defitem14 | defitem14 | defitem14 | varchar2(101) |
| 82 | defitem15 | defitem15 | defitem15 | varchar2(101) |
| 83 | defitem16 | defitem16 | defitem16 | varchar2(101) |
| 84 | defitem17 | defitem17 | defitem17 | varchar2(101) |
| 85 | defitem18 | defitem18 | defitem18 | varchar2(101) |
| 86 | defitem19 | defitem19 | defitem19 | varchar2(101) |
| 87 | defitem20 | defitem20 | defitem20 | varchar2(101) |
| 88 | defitem21 | defitem21 | defitem21 | varchar2(101) |
| 89 | defitem22 | defitem22 | defitem22 | varchar2(101) |
| 90 | defitem23 | defitem23 | defitem23 | varchar2(101) |
| 91 | defitem24 | defitem24 | defitem24 | varchar2(101) |
| 92 | defitem25 | defitem25 | defitem25 | varchar2(101) |
| 93 | defitem26 | defitem26 | defitem26 | varchar2(101) |
| 94 | defitem27 | defitem27 | defitem27 | varchar2(101) |
| 95 | defitem28 | defitem28 | defitem28 | varchar2(101) |
| 96 | defitem29 | defitem29 | defitem29 | varchar2(101) |
| 97 | defitem30 | defitem30 | defitem30 | varchar2(101) |
| 98 | defitem31 | defitem31 | defitem31 | varchar2(101) |
| 99 | defitem32 | defitem32 | defitem32 | varchar2(101) |
| 100 | defitem33 | defitem33 | defitem33 | varchar2(101) |
| 101 | defitem34 | defitem34 | defitem34 | varchar2(101) |
| 102 | defitem35 | defitem35 | defitem35 | varchar2(101) |
| 103 | defitem36 | defitem36 | defitem36 | varchar2(101) |
| 104 | defitem37 | defitem37 | defitem37 | varchar2(101) |
| 105 | defitem38 | defitem38 | defitem38 | varchar2(101) |
| 106 | defitem39 | defitem39 | defitem39 | varchar2(101) |
| 107 | defitem40 | defitem40 | defitem40 | varchar2(101) |
| 108 | defitem41 | defitem41 | defitem41 | varchar2(101) |
| 109 | defitem42 | defitem42 | defitem42 | varchar2(101) |
| 110 | defitem43 | defitem43 | defitem43 | varchar2(101) |
| 111 | defitem44 | defitem44 | defitem44 | varchar2(101) |
| 112 | defitem45 | defitem45 | defitem45 | varchar2(101) |
| 113 | defitem46 | defitem46 | defitem46 | varchar2(101) |
| 114 | defitem47 | defitem47 | defitem47 | varchar2(101) |
| 115 | defitem48 | defitem48 | defitem48 | varchar2(101) |
| 116 | defitem49 | defitem49 | defitem49 | varchar2(101) |
| 117 | defitem50 | defitem50 | defitem50 | varchar2(101) |
| 118 | defitem51 | defitem51 | defitem51 | varchar2(101) |
| 119 | defitem52 | defitem52 | defitem52 | varchar2(101) |
| 120 | defitem53 | defitem53 | defitem53 | varchar2(101) |
| 121 | defitem54 | defitem54 | defitem54 | varchar2(101) |
| 122 | defitem55 | defitem55 | defitem55 | varchar2(101) |
| 123 | defitem56 | defitem56 | defitem56 | varchar2(101) |
| 124 | defitem57 | defitem57 | defitem57 | varchar2(101) |
| 125 | defitem58 | defitem58 | defitem58 | varchar2(101) |
| 126 | defitem59 | defitem59 | defitem59 | varchar2(101) |
| 127 | defitem60 | defitem60 | defitem60 | varchar2(101) |
| 128 | defitem61 | defitem61 | defitem61 | varchar2(101) |
| 129 | defitem62 | defitem62 | defitem62 | varchar2(101) |
| 130 | defitem63 | defitem63 | defitem63 | varchar2(101) |
| 131 | defitem64 | defitem64 | defitem64 | varchar2(101) |
| 132 | defitem65 | defitem65 | defitem65 | varchar2(101) |
| 133 | defitem66 | defitem66 | defitem66 | varchar2(101) |
| 134 | defitem67 | defitem67 | defitem67 | varchar2(101) |
| 135 | defitem68 | defitem68 | defitem68 | varchar2(101) |
| 136 | defitem69 | defitem69 | defitem69 | varchar2(101) |
| 137 | defitem70 | defitem70 | defitem70 | varchar2(101) |
| 138 | defitem71 | defitem71 | defitem71 | varchar2(101) |
| 139 | defitem72 | defitem72 | defitem72 | varchar2(101) |
| 140 | defitem73 | defitem73 | defitem73 | varchar2(101) |
| 141 | defitem74 | defitem74 | defitem74 | varchar2(101) |
| 142 | defitem75 | defitem75 | defitem75 | varchar2(101) |
| 143 | defitem76 | defitem76 | defitem76 | varchar2(101) |
| 144 | defitem77 | defitem77 | defitem77 | varchar2(101) |
| 145 | defitem78 | defitem78 | defitem78 | varchar2(101) |
| 146 | defitem79 | defitem79 | defitem79 | varchar2(101) |
| 147 | defitem80 | defitem80 | defitem80 | varchar2(101) |
| 148 | creationtime | creationtime | creationtime | char(19) |
| 149 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 150 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 151 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 152 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 153 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |