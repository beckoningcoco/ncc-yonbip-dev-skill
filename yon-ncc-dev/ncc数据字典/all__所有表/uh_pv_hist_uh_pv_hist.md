# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12743.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvhist | pk_pvhist | pk_pvhist | char(20) | √ |
| 2 | date_chg | date_chg | date_chg | char(19) |
| 3 | fldname | fldname | fldname | varchar2(50) |
| 4 | name_psn | name_psn | name_psn | varchar2(50) |
| 5 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 9 | pk_pv | pk_pv | pk_pv | varchar2(20) |
| 10 | val_new | val_new | val_new | varchar2(50) |
| 11 | val_old | val_old | val_old | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |