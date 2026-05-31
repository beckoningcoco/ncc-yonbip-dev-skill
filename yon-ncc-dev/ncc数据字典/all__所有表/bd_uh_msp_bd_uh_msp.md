# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7174.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msp | pk_msp | pk_msp | char(20) | √ |
| 2 | code | code | code | varchar2(30) | √ |
| 3 | code_fa | code_fa | code_fa | varchar2(50) |
| 4 | dt_msptype | dt_msptype | dt_msptype | varchar2(50) |
| 5 | flag_stop | flag_stop | flag_stop | char(1) | √ |
| 6 | mnecode | mnecode | mnecode | varchar2(50) |
| 7 | name | name | name | varchar2(50) | √ |
| 8 | name2 | name2 | name2 | varchar2(50) |
| 9 | name3 | name3 | name3 | varchar2(50) |
| 10 | name4 | name4 | name4 | varchar2(50) |
| 11 | name5 | name5 | name5 | varchar2(50) |
| 12 | name6 | name6 | name6 | varchar2(50) |
| 13 | name_place | name_place | name_place | varchar2(50) |
| 14 | note | note | note | varchar2(200) |
| 15 | pk_dept | pk_dept | pk_dept | varchar2(20) | √ |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_msptype | pk_msptype | pk_msptype | varchar2(20) | √ |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 20 | pk_place | pk_place | pk_place | varchar2(20) |  |  | '~' |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |