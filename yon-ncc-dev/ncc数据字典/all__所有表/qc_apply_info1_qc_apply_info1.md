# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11084.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply_info1 | pk_apply_info1 | pk_apply_info1 | char(20) | √ |
| 2 | breportaudit | breportaudit | breportaudit | char(1) |
| 3 | iauditbill | iauditbill | iauditbill | number(38, 0) |
| 4 | iauditsample | iauditsample | iauditsample | number(38, 0) |
| 5 | ichkedsample | ichkedsample | ichkedsample | number(38, 0) |
| 6 | icrtbill | icrtbill | icrtbill | number(38, 0) |
| 7 | icrtrebill | icrtrebill | icrtrebill | number(38, 0) |
| 8 | icrtresample | icrtresample | icrtresample | number(38, 0) |
| 9 | icrtsample | icrtsample | icrtsample | number(38, 0) |
| 10 | irptdownbill | irptdownbill | irptdownbill | number(38, 0) |
| 11 | nchecknum | nchecknum | nchecknum | number(28, 8) |
| 12 | pk_applybill | pk_applybill | pk_applybill | char(20) |
| 13 | pk_chkbatch | pk_chkbatch | pk_chkbatch | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pk_reportbill | pk_reportbill | pk_reportbill | varchar2(20) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |