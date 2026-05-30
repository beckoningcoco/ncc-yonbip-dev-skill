# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11994.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | ctlmode | ctlmode | ctlmode | varchar2(30) |
| 3 | ctrlname | ctrlname | ctrlname | varchar2(100) |
| 4 | ctrlpercent | ctrlpercent | ctrlpercent | number(30, 8) |
| 5 | ctrlsign | ctrlsign | ctrlsign | varchar2(10) |
| 6 | expressformula | expressformula | expressformula | varchar2(512) |
| 7 | isstarted | isstarted | isstarted | char(1) |
| 8 | pk_cube | pk_cube | pk_cube | varchar2(20) |
| 9 | pk_dimvector | pk_dimvector | pk_dimvector | varchar2(2000) |
| 10 | pk_entity_use | pk_entity_use | pk_entity_use | varchar2(20) |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |
| 12 | pk_parent | pk_parent | pk_parent | varchar2(20) |
| 13 | pk_plan | pk_plan | pk_plan | varchar2(20) |
| 14 | planlist | planlist | planlist | varchar2(512) |
| 15 | planvalue | planvalue | planvalue | number(30, 8) |
| 16 | schemetype | schemetype | schemetype | varchar2(20) |
| 17 | sheetname | sheetname | sheetname | varchar2(100) |
| 18 | specialusage | specialusage | specialusage | char(1) |
| 19 | sysids | sysids | sysids | varchar2(50) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |