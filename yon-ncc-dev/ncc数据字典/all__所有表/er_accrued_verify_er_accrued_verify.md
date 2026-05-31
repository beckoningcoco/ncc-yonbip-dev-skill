# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7939.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrued_verify | pk_accrued_verify | pk_accrued_verify | char(20) | √ |
| 2 | accrued_billno | accrued_billno | accrued_billno | varchar2(50) |
| 3 | bxd_billno | bxd_billno | bxd_billno | varchar2(50) |
| 4 | effectdate | effectdate | effectdate | char(19) |
| 5 | effectstatus | effectstatus | effectstatus | number(38, 0) |
| 6 | global_verify_amount | global_verify_amount | global_verify_amount | number(28, 8) |
| 7 | group_verify_amount | group_verify_amount | group_verify_amount | number(28, 8) |
| 8 | org_verify_amount | org_verify_amount | org_verify_amount | number(28, 8) |
| 9 | pk_accrued_bill | pk_accrued_bill | pk_accrued_bill | char(20) | √ |  | '~' |
| 10 | pk_accrued_detail | pk_accrued_detail | pk_accrued_detail | varchar2(20) | √ |  | '~' |
| 11 | pk_bxd | pk_bxd | pk_bxd | varchar2(20) | √ |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_iobsclass | pk_iobsclass | pk_iobsclass | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | src_ybz_id | src_ybz_id | src_ybz_id | varchar2(50) |  |  | '~' |
| 16 | verify_amount | verify_amount | verify_amount | number(28, 8) | √ |
| 17 | verify_date | verify_date | verify_date | char(19) | √ |
| 18 | verify_man | verify_man | verify_man | varchar2(50) | √ |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |