# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7146.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpmap | pk_hpmap | pk_hpmap | char(20) | √ |
| 2 | flag_active | flag_active | flag_active | char(1) |  |  | 'Y' |
| 3 | pk_dept | pk_dept | pk_dept | varchar2(20) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 5 | pk_hp | pk_hp | pk_hp | varchar2(20) | √ |
| 6 | pk_hp_reg | pk_hp_reg | pk_hp_reg | varchar2(20) |
| 7 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 8 | pk_org_show | pk_org_show | pk_org_show | varchar2(20) | √ |  | '~' |
| 9 | def1 | def1 | def1 | varchar2(50) |
| 10 | def2 | def2 | def2 | varchar2(50) |
| 11 | def3 | def3 | def3 | varchar2(50) |
| 12 | def4 | def4 | def4 | varchar2(50) |
| 13 | def5 | def5 | def5 | varchar2(50) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |