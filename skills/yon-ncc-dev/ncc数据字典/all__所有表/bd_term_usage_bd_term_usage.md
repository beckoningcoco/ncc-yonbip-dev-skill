# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7121.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usage | pk_usage | pk_usage | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | dt_excardtype | dt_excardtype | dt_excardtype | varchar2(50) |
| 4 | flag_active | flag_active | flag_active | char(1) |
| 5 | flag_pivas | flag_pivas | flag_pivas | char(1) |
| 6 | flag_st | flag_st | flag_st | char(1) |
| 7 | mnecode | mnecode | mnecode | varchar2(50) |
| 8 | name | name | name | varchar2(50) |
| 9 | note | note | note | varchar2(50) |
| 10 | pk_father | pk_father | pk_father | char(20) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |