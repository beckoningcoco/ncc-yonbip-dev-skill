# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7400.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costvoucher | pk_costvoucher | pk_costvoucher | char(20) | √ |
| 2 | accounting_date | accounting_date | accounting_date | char(19) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(50) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | attach_bills | attach_bills | attach_bills | number(38, 0) |
| 7 | billdate | billdate | billdate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | business_date | business_date | business_date | char(19) |
| 10 | c001value | c001value | c001value | char(1) |
| 11 | committime | committime | committime | char(19) |
| 12 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 13 | credit_books_sum | credit_books_sum | credit_books_sum | number(28, 8) |
| 14 | credit_global_sum | credit_global_sum | credit_global_sum | number(28, 8) |
| 15 | credit_group_sum | credit_group_sum | credit_group_sum | number(28, 8) |
| 16 | debit_books_sum | debit_books_sum | debit_books_sum | number(28, 8) |
| 17 | debit_global_sum | debit_global_sum | debit_global_sum | number(28, 8) |
| 18 | debit_group_sum | debit_group_sum | debit_group_sum | number(28, 8) |
| 19 | isourcetype | isourcetype | isourcetype | number(38, 0) |
| 20 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 21 | pk_accperiod | pk_accperiod | pk_accperiod | varchar2(20) |  |  | '~' |
| 22 | pk_billtype | pk_billtype | pk_billtype | char(20) |
| 23 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 28 | pk_src_bill | pk_src_bill | pk_src_bill | varchar2(20) |  |  | '~' |
| 29 | pk_src_sys | pk_src_sys | pk_src_sys | varchar2(20) |  |  | '~' |
| 30 | remark | remark | remark | varchar2(200) |
| 31 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 32 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 33 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 34 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 35 | vbillno | vbillno | vbillno | varchar2(50) |
| 36 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 37 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 38 | vsrctype | vsrctype | vsrctype | varchar2(20) |  |  | '~' |
| 39 | def1 | def1 | def1 | varchar2(101) |
| 40 | def2 | def2 | def2 | varchar2(101) |
| 41 | def3 | def3 | def3 | varchar2(101) |
| 42 | def4 | def4 | def4 | varchar2(101) |
| 43 | def5 | def5 | def5 | varchar2(101) |
| 44 | def6 | def6 | def6 | varchar2(101) |
| 45 | def7 | def7 | def7 | varchar2(101) |
| 46 | def8 | def8 | def8 | varchar2(101) |
| 47 | def9 | def9 | def9 | varchar2(101) |
| 48 | def10 | def10 | def10 | varchar2(101) |
| 49 | def11 | def11 | def11 | varchar2(101) |
| 50 | def12 | def12 | def12 | varchar2(101) |
| 51 | def13 | def13 | def13 | varchar2(101) |
| 52 | def14 | def14 | def14 | varchar2(101) |
| 53 | def15 | def15 | def15 | varchar2(101) |
| 54 | def16 | def16 | def16 | varchar2(101) |
| 55 | def17 | def17 | def17 | varchar2(101) |
| 56 | def18 | def18 | def18 | varchar2(101) |
| 57 | def19 | def19 | def19 | varchar2(101) |
| 58 | def20 | def20 | def20 | varchar2(101) |
| 59 | def21 | def21 | def21 | varchar2(101) |
| 60 | def22 | def22 | def22 | varchar2(101) |
| 61 | def23 | def23 | def23 | varchar2(101) |
| 62 | def24 | def24 | def24 | varchar2(101) |
| 63 | def25 | def25 | def25 | varchar2(101) |
| 64 | def26 | def26 | def26 | varchar2(101) |
| 65 | def27 | def27 | def27 | varchar2(101) |
| 66 | def28 | def28 | def28 | varchar2(101) |
| 67 | def29 | def29 | def29 | varchar2(101) |
| 68 | def30 | def30 | def30 | varchar2(101) |
| 69 | def31 | def31 | def31 | varchar2(101) |
| 70 | def32 | def32 | def32 | varchar2(101) |
| 71 | def33 | def33 | def33 | varchar2(101) |
| 72 | def34 | def34 | def34 | varchar2(101) |
| 73 | def35 | def35 | def35 | varchar2(101) |
| 74 | def36 | def36 | def36 | varchar2(101) |
| 75 | def37 | def37 | def37 | varchar2(101) |
| 76 | def38 | def38 | def38 | varchar2(101) |
| 77 | def39 | def39 | def39 | varchar2(101) |
| 78 | def40 | def40 | def40 | varchar2(101) |
| 79 | def41 | def41 | def41 | varchar2(101) |
| 80 | def42 | def42 | def42 | varchar2(101) |
| 81 | def43 | def43 | def43 | varchar2(101) |
| 82 | def44 | def44 | def44 | varchar2(101) |
| 83 | def45 | def45 | def45 | varchar2(101) |
| 84 | def46 | def46 | def46 | varchar2(101) |
| 85 | def47 | def47 | def47 | varchar2(101) |
| 86 | def48 | def48 | def48 | varchar2(101) |
| 87 | def49 | def49 | def49 | varchar2(101) |
| 88 | def50 | def50 | def50 | varchar2(101) |
| 89 | creationtime | creationtime | creationtime | char(19) |
| 90 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 91 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 92 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 93 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 94 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |