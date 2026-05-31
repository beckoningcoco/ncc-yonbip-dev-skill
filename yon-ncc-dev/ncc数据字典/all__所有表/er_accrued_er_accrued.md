# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7937.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrued_bill | pk_accrued_bill | pk_accrued_bill | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvetime | approvetime | approvetime | char(19) |
| 5 | apprstatus | apprstatus | apprstatus | number(38, 0) |
| 6 | attach_amount | attach_amount | attach_amount | number(38, 0) |
| 7 | auditman | auditman | auditman | varchar2(20) |  |  | '~' |
| 8 | billdate | billdate | billdate | char(19) |
| 9 | billno | billno | billno | varchar2(50) |
| 10 | billstatus | billstatus | billstatus | number(38, 0) |
| 11 | effectstatus | effectstatus | effectstatus | number(38, 0) |
| 12 | global_amount | global_amount | global_amount | number(28, 8) |
| 13 | global_currinfo | global_currinfo | global_currinfo | number(28, 8) |
| 14 | global_rest_amount | global_rest_amount | global_rest_amount | number(28, 8) |
| 15 | global_verify_amount | global_verify_amount | global_verify_amount | number(28, 8) |
| 16 | group_amount | group_amount | group_amount | number(28, 8) |
| 17 | group_currinfo | group_currinfo | group_currinfo | number(28, 8) |
| 18 | group_rest_amount | group_rest_amount | group_rest_amount | number(28, 8) |
| 19 | group_verify_amount | group_verify_amount | group_verify_amount | number(28, 8) |
| 20 | imag_status | imag_status | imag_status | varchar2(2) |
| 21 | isexpedited | isexpedited | isexpedited | char(1) |
| 22 | isneedimag | isneedimag | isneedimag | char(1) |
| 23 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 24 | operator_dept | operator_dept | operator_dept | varchar2(20) |  |  | '~' |
| 25 | operator_org | operator_org | operator_org | varchar2(20) |  |  | '~' |
| 26 | org_amount | org_amount | org_amount | number(28, 8) |
| 27 | org_currinfo | org_currinfo | org_currinfo | number(28, 8) |
| 28 | org_rest_amount | org_rest_amount | org_rest_amount | number(28, 8) |
| 29 | org_verify_amount | org_verify_amount | org_verify_amount | number(28, 8) |
| 30 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 31 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 33 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 34 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(50) |  |  | '~' |
| 35 | pk_tradetypeid | pk_tradetypeid | pk_tradetypeid | varchar2(20) |  |  | '~' |
| 36 | predict_rest_amount | predict_rest_amount | predict_rest_amount | number(28, 8) |
| 37 | printdate | printdate | printdate | char(19) |
| 38 | printer | printer | printer | varchar2(20) |  |  | '~' |
| 39 | reason | reason | reason | varchar2(500) |  |  | '~' |
| 40 | redflag | redflag | redflag | number(38, 0) |
| 41 | red_amount | red_amount | red_amount | number(28, 8) |
| 42 | rest_amount | rest_amount | rest_amount | number(28, 8) |
| 43 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 44 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 45 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 46 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 47 | srcsystem | srcsystem | srcsystem | varchar2(100) |
| 48 | src_ybz_id | src_ybz_id | src_ybz_id | varchar2(50) |  |  | '~' |
| 49 | verify_amount | verify_amount | verify_amount | number(28, 8) |
| 50 | defitem1 | defitem1 | defitem1 | varchar2(101) |
| 51 | defitem2 | defitem2 | defitem2 | varchar2(101) |
| 52 | defitem3 | defitem3 | defitem3 | varchar2(101) |
| 53 | defitem4 | defitem4 | defitem4 | varchar2(101) |
| 54 | defitem5 | defitem5 | defitem5 | varchar2(101) |
| 55 | defitem6 | defitem6 | defitem6 | varchar2(101) |
| 56 | defitem7 | defitem7 | defitem7 | varchar2(101) |
| 57 | defitem8 | defitem8 | defitem8 | varchar2(101) |
| 58 | defitem9 | defitem9 | defitem9 | varchar2(101) |
| 59 | defitem10 | defitem10 | defitem10 | varchar2(101) |
| 60 | defitem11 | defitem11 | defitem11 | varchar2(101) |
| 61 | defitem12 | defitem12 | defitem12 | varchar2(101) |
| 62 | defitem13 | defitem13 | defitem13 | varchar2(101) |
| 63 | defitem14 | defitem14 | defitem14 | varchar2(101) |
| 64 | defitem15 | defitem15 | defitem15 | varchar2(101) |
| 65 | defitem16 | defitem16 | defitem16 | varchar2(101) |
| 66 | defitem17 | defitem17 | defitem17 | varchar2(101) |
| 67 | defitem18 | defitem18 | defitem18 | varchar2(101) |
| 68 | defitem19 | defitem19 | defitem19 | varchar2(101) |
| 69 | defitem20 | defitem20 | defitem20 | varchar2(101) |
| 70 | defitem21 | defitem21 | defitem21 | varchar2(101) |
| 71 | defitem22 | defitem22 | defitem22 | varchar2(101) |
| 72 | defitem23 | defitem23 | defitem23 | varchar2(101) |
| 73 | defitem24 | defitem24 | defitem24 | varchar2(101) |
| 74 | defitem25 | defitem25 | defitem25 | varchar2(101) |
| 75 | defitem26 | defitem26 | defitem26 | varchar2(101) |
| 76 | defitem27 | defitem27 | defitem27 | varchar2(101) |
| 77 | defitem28 | defitem28 | defitem28 | varchar2(101) |
| 78 | defitem29 | defitem29 | defitem29 | varchar2(101) |
| 79 | defitem30 | defitem30 | defitem30 | varchar2(101) |
| 80 | defitem31 | defitem31 | defitem31 | varchar2(101) |
| 81 | defitem32 | defitem32 | defitem32 | varchar2(101) |
| 82 | defitem33 | defitem33 | defitem33 | varchar2(101) |
| 83 | defitem34 | defitem34 | defitem34 | varchar2(101) |
| 84 | defitem35 | defitem35 | defitem35 | varchar2(101) |
| 85 | defitem36 | defitem36 | defitem36 | varchar2(101) |
| 86 | defitem37 | defitem37 | defitem37 | varchar2(101) |
| 87 | defitem38 | defitem38 | defitem38 | varchar2(101) |
| 88 | defitem39 | defitem39 | defitem39 | varchar2(101) |
| 89 | defitem40 | defitem40 | defitem40 | varchar2(101) |
| 90 | defitem41 | defitem41 | defitem41 | varchar2(101) |
| 91 | defitem42 | defitem42 | defitem42 | varchar2(101) |
| 92 | defitem43 | defitem43 | defitem43 | varchar2(101) |
| 93 | defitem44 | defitem44 | defitem44 | varchar2(101) |
| 94 | defitem45 | defitem45 | defitem45 | varchar2(101) |
| 95 | defitem46 | defitem46 | defitem46 | varchar2(101) |
| 96 | defitem47 | defitem47 | defitem47 | varchar2(101) |
| 97 | defitem48 | defitem48 | defitem48 | varchar2(101) |
| 98 | defitem49 | defitem49 | defitem49 | varchar2(101) |
| 99 | defitem50 | defitem50 | defitem50 | varchar2(101) |
| 100 | defitem51 | defitem51 | defitem51 | varchar2(101) |
| 101 | defitem52 | defitem52 | defitem52 | varchar2(101) |
| 102 | defitem53 | defitem53 | defitem53 | varchar2(101) |
| 103 | defitem54 | defitem54 | defitem54 | varchar2(101) |
| 104 | defitem55 | defitem55 | defitem55 | varchar2(101) |
| 105 | defitem56 | defitem56 | defitem56 | varchar2(101) |
| 106 | defitem57 | defitem57 | defitem57 | varchar2(101) |
| 107 | defitem58 | defitem58 | defitem58 | varchar2(101) |
| 108 | defitem59 | defitem59 | defitem59 | varchar2(101) |
| 109 | defitem60 | defitem60 | defitem60 | varchar2(101) |
| 110 | defitem61 | defitem61 | defitem61 | varchar2(101) |
| 111 | defitem62 | defitem62 | defitem62 | varchar2(101) |
| 112 | defitem63 | defitem63 | defitem63 | varchar2(101) |
| 113 | defitem64 | defitem64 | defitem64 | varchar2(101) |
| 114 | defitem65 | defitem65 | defitem65 | varchar2(101) |
| 115 | defitem66 | defitem66 | defitem66 | varchar2(101) |
| 116 | defitem67 | defitem67 | defitem67 | varchar2(101) |
| 117 | defitem68 | defitem68 | defitem68 | varchar2(101) |
| 118 | defitem69 | defitem69 | defitem69 | varchar2(101) |
| 119 | defitem70 | defitem70 | defitem70 | varchar2(101) |
| 120 | defitem71 | defitem71 | defitem71 | varchar2(101) |
| 121 | defitem72 | defitem72 | defitem72 | varchar2(101) |
| 122 | defitem73 | defitem73 | defitem73 | varchar2(101) |
| 123 | defitem74 | defitem74 | defitem74 | varchar2(101) |
| 124 | defitem75 | defitem75 | defitem75 | varchar2(101) |
| 125 | defitem76 | defitem76 | defitem76 | varchar2(101) |
| 126 | defitem77 | defitem77 | defitem77 | varchar2(101) |
| 127 | defitem78 | defitem78 | defitem78 | varchar2(101) |
| 128 | defitem79 | defitem79 | defitem79 | varchar2(101) |
| 129 | defitem80 | defitem80 | defitem80 | varchar2(101) |
| 130 | creationtime | creationtime | creationtime | char(19) |
| 131 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 132 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 133 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 134 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 135 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |