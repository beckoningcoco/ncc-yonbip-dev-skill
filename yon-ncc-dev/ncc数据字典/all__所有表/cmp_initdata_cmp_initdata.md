# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7553.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initdata | pk_initdata | pk_initdata | char(20) | √ |
| 2 | acctype | acctype | acctype | number(38, 0) |
| 3 | approvedate | approvedate | approvedate | char(10) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvetime | approvetime | approvetime | char(19) |
| 6 | current_local | current_local | current_local | number(28, 8) |
| 7 | current_primal | current_primal | current_primal | number(28, 8) |
| 8 | formcode | formcode | formcode | number(38, 0) |
| 9 | globalcurrent_local | globalcurrent_local | globalcurrent_local | number(28, 8) |
| 10 | globalinit_local | globalinit_local | globalinit_local | number(28, 8) |
| 11 | globalrealtime_local | globalrealtime_local | globalrealtime_local | number(28, 8) |
| 12 | groupcurrent_local | groupcurrent_local | groupcurrent_local | number(28, 8) |
| 13 | groupinit_local | groupinit_local | groupinit_local | number(28, 8) |
| 14 | grouprealtime_local | grouprealtime_local | grouprealtime_local | number(28, 8) |
| 15 | init_local | init_local | init_local | number(28, 8) |
| 16 | init_primal | init_primal | init_primal | number(28, 8) |
| 17 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 18 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_notetype | pk_notetype | pk_notetype | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 23 | realtime_local | realtime_local | realtime_local | number(28, 8) |
| 24 | realtime_primal | realtime_primal | realtime_primal | number(28, 8) |
| 25 | creationtime | creationtime | creationtime | char(19) |
| 26 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 29 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |