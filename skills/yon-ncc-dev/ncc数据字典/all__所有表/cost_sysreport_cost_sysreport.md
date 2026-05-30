# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7706.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysreport | pk_sysreport | pk_sysreport | char(20) | √ |
| 2 | deprefee_edu | deprefee_edu | deprefee_edu | number(28, 8) |
| 3 | deprefee_finance | deprefee_finance | deprefee_finance | number(28, 8) |
| 4 | deprefee_self | deprefee_self | deprefee_self | number(28, 8) |
| 5 | materialfee | materialfee | materialfee | number(28, 8) |
| 6 | medicalfee | medicalfee | medicalfee | number(28, 8) |
| 7 | personnelfee | personnelfee | personnelfee | number(28, 8) |
| 8 | pk_calatt | pk_calatt | pk_calatt | varchar2(20) |  |  | '~' |
| 9 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 11 | pk_month | pk_month | pk_month | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | restfee | restfee | restfee | number(28, 8) |
| 14 | revoke_edu | revoke_edu | revoke_edu | number(28, 8) |
| 15 | revoke_finance | revoke_finance | revoke_finance | number(28, 8) |
| 16 | revoke_self | revoke_self | revoke_self | number(28, 8) |
| 17 | riskfundfee | riskfundfee | riskfundfee | number(28, 8) |
| 18 | udirectfee | udirectfee | udirectfee | char(1) |
| 19 | umanagefee | umanagefee | umanagefee | char(1) |
| 20 | yearmth | yearmth | yearmth | varchar2(20) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |