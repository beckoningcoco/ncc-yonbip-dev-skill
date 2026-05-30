# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12634.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_signrecord | pk_signrecord | pk_signrecord | char(20) | √ |
| 2 | cycle_num | cycle_num | cycle_num | varchar2(50) |
| 3 | date_signin | date_signin | date_signin | char(19) |
| 4 | date_signout | date_signout | date_signout | char(19) |
| 5 | flag_signout | flag_signout | flag_signout | char(1) |
| 6 | hpcode | hpcode | hpcode | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |
| 8 | pk_hp | pk_hp | pk_hp | varchar2(20) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |
| 10 | pk_signin_person | pk_signin_person | pk_signin_person | varchar2(20) |
| 11 | pk_signout_person | pk_signout_person | pk_signout_person | varchar2(20) |
| 12 | signin_person_name | signin_person_name | signin_person_name | varchar2(50) |
| 13 | signout_person_name | signout_person_name | signout_person_name | varchar2(50) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |