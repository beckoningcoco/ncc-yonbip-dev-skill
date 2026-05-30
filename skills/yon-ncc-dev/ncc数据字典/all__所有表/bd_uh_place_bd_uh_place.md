# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7201.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_place | pk_place | pk_place | char(20) | √ |
| 2 | code_place | code_place | code_place | varchar2(50) |
| 3 | desc_place | desc_place | desc_place | varchar2(200) |
| 4 | innercode | innercode | innercode | varchar2(200) |
| 5 | mnecode | mnecode | mnecode | varchar2(50) |
| 6 | name | name | name | varchar2(50) |
| 7 | name_place | name_place | name_place | varchar2(200) |
| 8 | name_place2 | name_place2 | name_place2 | varchar2(200) |
| 9 | name_place3 | name_place3 | name_place3 | varchar2(200) |
| 10 | name_place4 | name_place4 | name_place4 | varchar2(200) |
| 11 | name_place5 | name_place5 | name_place5 | varchar2(200) |
| 12 | name_place6 | name_place6 | name_place6 | varchar2(200) |
| 13 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |