# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12717.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patilockdt | pk_patilockdt | pk_patilockdt | char(20) | √ |
| 2 | date_lock | date_lock | date_lock | char(19) |
| 3 | dict | dict | dict | number(38, 0) |
| 4 | dt_locktype | dt_locktype | dt_locktype | varchar2(50) |
| 5 | name_psn | name_psn | name_psn | varchar2(50) |
| 6 | note_lock | note_lock | note_lock | varchar2(256) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_locktype | pk_locktype | pk_locktype | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 11 | pk_patilock | pk_patilock | pk_patilock | char(20) | √ |
| 12 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |