# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7960.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expensebal | pk_expensebal | pk_expensebal | char(20) | √ |
| 2 | accmonth | accmonth | accmonth | char(2) |
| 3 | accyear | accyear | accyear | varchar2(20) |  |  | '~' |
| 4 | assume_amount | assume_amount | assume_amount | number(28, 8) |
| 5 | assume_dept | assume_dept | assume_dept | varchar2(20) |  |  | '~' |
| 6 | assume_org | assume_org | assume_org | varchar2(20) |  |  | '~' |
| 7 | billdate | billdate | billdate | char(19) | √ |
| 8 | billstatus | billstatus | billstatus | number(38, 0) | √ |
| 9 | bx_cashitem | bx_cashitem | bx_cashitem | varchar2(20) |  |  | '~' |
| 10 | bx_cashproj | bx_cashproj | bx_cashproj | varchar2(20) |  |  | '~' |
| 11 | bx_deptid | bx_deptid | bx_deptid | varchar2(20) |  |  | '~' |
| 12 | bx_dwbm | bx_dwbm | bx_dwbm | varchar2(20) |  |  | '~' |
| 13 | bx_fiorg | bx_fiorg | bx_fiorg | varchar2(20) |  |  | '~' |
| 14 | bx_group | bx_group | bx_group | varchar2(20) |  |  | '~' |
| 15 | bx_jkbxr | bx_jkbxr | bx_jkbxr | varchar2(20) |  |  | '~' |
| 16 | bx_jsfs | bx_jsfs | bx_jsfs | varchar2(20) |  |  | '~' |
| 17 | bx_org | bx_org | bx_org | varchar2(20) |  |  | '~' |
| 18 | bx_tradetype | bx_tradetype | bx_tradetype | varchar2(50) |  |  | '~' |
| 19 | global_amount | global_amount | global_amount | number(28, 8) |
| 20 | global_currinfo | global_currinfo | global_currinfo | number(15, 8) |
| 21 | group_amount | group_amount | group_amount | number(28, 8) |
| 22 | group_currinfo | group_currinfo | group_currinfo | number(15, 8) |
| 23 | iswriteoff | iswriteoff | iswriteoff | char(1) | √ |  | 'N' |
| 24 | md5 | md5 | md5 | varchar2(256) | √ |
| 25 | org_amount | org_amount | org_amount | number(28, 8) |
| 26 | org_currinfo | org_currinfo | org_currinfo | number(15, 8) |
| 27 | paydate | paydate | paydate | char(19) |
| 28 | payflag | payflag | payflag | number(38, 0) |
| 29 | payman | payman | payman | varchar2(20) |  |  | '~' |
| 30 | pk_brand | pk_brand | pk_brand | varchar2(20) |  |  | '~' |
| 31 | pk_checkele | pk_checkele | pk_checkele | varchar2(20) |  |  | '~' |
| 32 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 33 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_iobsclass | pk_iobsclass | pk_iobsclass | varchar2(20) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 37 | pk_payorg | pk_payorg | pk_payorg | varchar2(20) |  |  | '~' |
| 38 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 39 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 40 | pk_proline | pk_proline | pk_proline | varchar2(20) |  |  | '~' |
| 41 | pk_resacostcenter | pk_resacostcenter | pk_resacostcenter | varchar2(20) |  |  | '~' |
| 42 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 43 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 44 | src_billtype | src_billtype | src_billtype | varchar2(50) |  |  | '~' |
| 45 | src_tradetype | src_tradetype | src_tradetype | varchar2(50) |  |  | '~' |
| 46 | defitem1 | defitem1 | defitem1 | varchar2(101) |
| 47 | defitem2 | defitem2 | defitem2 | varchar2(101) |
| 48 | defitem3 | defitem3 | defitem3 | varchar2(101) |
| 49 | defitem4 | defitem4 | defitem4 | varchar2(101) |
| 50 | defitem5 | defitem5 | defitem5 | varchar2(101) |
| 51 | defitem6 | defitem6 | defitem6 | varchar2(101) |
| 52 | defitem7 | defitem7 | defitem7 | varchar2(101) |
| 53 | defitem8 | defitem8 | defitem8 | varchar2(101) |
| 54 | defitem9 | defitem9 | defitem9 | varchar2(101) |
| 55 | defitem10 | defitem10 | defitem10 | varchar2(101) |
| 56 | defitem11 | defitem11 | defitem11 | varchar2(101) |
| 57 | defitem12 | defitem12 | defitem12 | varchar2(101) |
| 58 | defitem13 | defitem13 | defitem13 | varchar2(101) |
| 59 | defitem14 | defitem14 | defitem14 | varchar2(101) |
| 60 | defitem15 | defitem15 | defitem15 | varchar2(101) |
| 61 | defitem16 | defitem16 | defitem16 | varchar2(101) |
| 62 | defitem17 | defitem17 | defitem17 | varchar2(101) |
| 63 | defitem18 | defitem18 | defitem18 | varchar2(101) |
| 64 | defitem19 | defitem19 | defitem19 | varchar2(101) |
| 65 | defitem20 | defitem20 | defitem20 | varchar2(101) |
| 66 | defitem21 | defitem21 | defitem21 | varchar2(101) |
| 67 | defitem22 | defitem22 | defitem22 | varchar2(101) |
| 68 | defitem23 | defitem23 | defitem23 | varchar2(101) |
| 69 | defitem24 | defitem24 | defitem24 | varchar2(101) |
| 70 | defitem25 | defitem25 | defitem25 | varchar2(101) |
| 71 | defitem26 | defitem26 | defitem26 | varchar2(101) |
| 72 | defitem27 | defitem27 | defitem27 | varchar2(101) |
| 73 | defitem28 | defitem28 | defitem28 | varchar2(101) |
| 74 | defitem29 | defitem29 | defitem29 | varchar2(101) |
| 75 | defitem30 | defitem30 | defitem30 | varchar2(101) |
| 76 | creationtime | creationtime | creationtime | char(19) |
| 77 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 78 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 79 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 80 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 81 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |