# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12371.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_registration | pk_registration | pk_registration | char(20) | √ |
| 2 | birthday | birthday | birthday | char(10) |
| 3 | dateslot | dateslot | dateslot | char(1) |
| 4 | gender | gender | gender | varchar2(3) |  |  | '~' |
| 5 | hpcode | hpcode | hpcode | varchar2(50) |
| 6 | hpname | hpname | hpname | varchar2(50) |
| 7 | idnumber | idnumber | idnumber | varchar2(50) |
| 8 | patiname | patiname | patiname | varchar2(50) |
| 9 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_pati | pk_pati | pk_pati | varchar2(50) |  |  | '~' |
| 13 | pk_psn_oper | pk_psn_oper | pk_psn_oper | varchar2(20) |  |  | '~' |
| 14 | pk_schres | pk_schres | pk_schres | varchar2(50) |  |  | '~' |
| 15 | pk_schsrv | pk_schsrv | pk_schsrv | varchar2(50) |  |  | '~' |
| 16 | pvdate | pvdate | pvdate | char(19) |
| 17 | retinfo | retinfo | retinfo | varchar2(100) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |