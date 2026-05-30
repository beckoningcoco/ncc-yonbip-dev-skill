# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11226.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancerec | pk_balancerec | pk_balancerec | char(20) | √ |
| 2 | adjustmoney_global | adjustmoney_global | adjustmoney_global | number(28, 8) |
| 3 | adjustmoney_group | adjustmoney_group | adjustmoney_group | number(28, 8) |
| 4 | adjustmoney_org | adjustmoney_org | adjustmoney_org | number(28, 8) |
| 5 | alreadymoney_global | alreadymoney_global | alreadymoney_global | number(28, 8) |
| 6 | alreadymoney_group | alreadymoney_group | alreadymoney_group | number(28, 8) |
| 7 | alreadymoney_org | alreadymoney_org | alreadymoney_org | number(28, 8) |
| 8 | arrmoney_global | arrmoney_global | arrmoney_global | number(28, 8) |
| 9 | arrmoney_group | arrmoney_group | arrmoney_group | number(28, 8) |
| 10 | arrmoney_org | arrmoney_org | arrmoney_org | number(28, 8) |
| 11 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 12 | audittime | audittime | audittime | char(19) |
| 13 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 14 | billmaketime | billmaketime | billmaketime | char(19) |
| 15 | bill_code | bill_code | bill_code | varchar2(40) |
| 16 | bill_code_rent | bill_code_rent | bill_code_rent | varchar2(40) |
| 17 | bill_status | bill_status | bill_status | number(38, 0) |
| 18 | bill_type | bill_type | bill_type | varchar2(4) |
| 19 | bill_type_src | bill_type_src | bill_type_src | varchar2(4) |
| 20 | business_date | business_date | business_date | char(19) |
| 21 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 22 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 23 | compmoney_global | compmoney_global | compmoney_global | number(28, 8) |
| 24 | compmoney_group | compmoney_group | compmoney_group | number(28, 8) |
| 25 | compmoney_org | compmoney_org | compmoney_org | number(28, 8) |
| 26 | confirm_flag | confirm_flag | confirm_flag | char(1) |
| 27 | confirm_opinion | confirm_opinion | confirm_opinion | varchar2(200) |
| 28 | confirm_time | confirm_time | confirm_time | char(19) |
| 29 | cooperatebill_flag | cooperatebill_flag | cooperatebill_flag | char(1) |
| 30 | cooperate_flag | cooperate_flag | cooperate_flag | char(1) |
| 31 | damagemoney_global | damagemoney_global | damagemoney_global | number(28, 8) |
| 32 | damagemoney_group | damagemoney_group | damagemoney_group | number(28, 8) |
| 33 | damagemoney_org | damagemoney_org | damagemoney_org | number(28, 8) |
| 34 | discardmoney_global | discardmoney_global | discardmoney_global | number(28, 8) |
| 35 | discardmoney_group | discardmoney_group | discardmoney_group | number(28, 8) |
| 36 | discardmoney_org | discardmoney_org | discardmoney_org | number(28, 8) |
| 37 | lease_type | lease_type | lease_type | number(38, 0) |
| 38 | loadmoney_global | loadmoney_global | loadmoney_global | number(28, 8) |
| 39 | loadmoney_group | loadmoney_group | loadmoney_group | number(28, 8) |
| 40 | loadmoney_org | loadmoney_org | loadmoney_org | number(28, 8) |
| 41 | lostpaymoney_global | lostpaymoney_global | lostpaymoney_global | number(28, 8) |
| 42 | lostpaymoney_group | lostpaymoney_group | lostpaymoney_group | number(28, 8) |
| 43 | lostpaymoney_org | lostpaymoney_org | lostpaymoney_org | number(28, 8) |
| 44 | maintainmoney_global | maintainmoney_global | maintainmoney_global | number(28, 8) |
| 45 | maintainmoney_group | maintainmoney_group | maintainmoney_group | number(28, 8) |
| 46 | maintainmoney_org | maintainmoney_org | maintainmoney_org | number(28, 8) |
| 47 | memo | memo | memo | varchar2(200) |
| 48 | othermoney_global | othermoney_global | othermoney_global | number(28, 8) |
| 49 | othermoney_group | othermoney_group | othermoney_group | number(28, 8) |
| 50 | othermoney_org | othermoney_org | othermoney_org | number(28, 8) |
| 51 | pk_confirmer | pk_confirmer | pk_confirmer | varchar2(20) |  |  | '~' |
| 52 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 53 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 54 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 55 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 56 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 57 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 58 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 59 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 60 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 61 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 62 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 63 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 64 | pk_raorg | pk_raorg | pk_raorg | varchar2(20) |  |  | '~' |
| 65 | pk_raorg_v | pk_raorg_v | pk_raorg_v | varchar2(20) |  |  | '~' |
| 66 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 67 | pk_rentreceive | pk_rentreceive | pk_rentreceive | varchar2(20) |
| 68 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 69 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 70 | receivable_flag | receivable_flag | receivable_flag | char(1) |
| 71 | rentmoney_global | rentmoney_global | rentmoney_global | number(28, 8) |
| 72 | rentmoney_group | rentmoney_group | rentmoney_group | number(28, 8) |
| 73 | rentmoney_org | rentmoney_org | rentmoney_org | number(28, 8) |
| 74 | returnmoney_global | returnmoney_global | returnmoney_global | number(28, 8) |
| 75 | returnmoney_group | returnmoney_group | returnmoney_group | number(28, 8) |
| 76 | returnmoney_org | returnmoney_org | returnmoney_org | number(28, 8) |
| 77 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 78 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 79 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 80 | saga_status | saga_status | saga_status | number(38, 0) |
| 81 | shouldmoney_global | shouldmoney_global | shouldmoney_global | number(28, 8) |
| 82 | shouldmoney_group | shouldmoney_group | shouldmoney_group | number(28, 8) |
| 83 | shouldmoney_org | shouldmoney_org | shouldmoney_org | number(28, 8) |
| 84 | stopmoney_global | stopmoney_global | stopmoney_global | number(28, 8) |
| 85 | stopmoney_group | stopmoney_group | stopmoney_group | number(28, 8) |
| 86 | stopmoney_org | stopmoney_org | stopmoney_org | number(28, 8) |
| 87 | transi_type | transi_type | transi_type | varchar2(30) |
| 88 | transi_type_src | transi_type_src | transi_type_src | varchar2(30) |
| 89 | transportmoney_global | transportmoney_global | transportmoney_global | number(28, 8) |
| 90 | transportmoney_group | transportmoney_group | transportmoney_group | number(28, 8) |
| 91 | transportmoney_org | transportmoney_org | transportmoney_org | number(28, 8) |
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
| 112 | creationtime | creationtime | creationtime | char(19) |
| 113 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 114 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 115 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 116 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 117 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |