# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7197.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phdmcate | pk_phdmcate | pk_phdmcate | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | innercode | innercode | innercode | varchar2(30) |
| 4 | mnecode | mnecode | mnecode | varchar2(30) |
| 5 | name | name | name | varchar2(50) |
| 6 | name2 | name2 | name2 | varchar2(50) |
| 7 | name3 | name3 | name3 | varchar2(50) |
| 8 | name4 | name4 | name4 | varchar2(50) |
| 9 | name5 | name5 | name5 | varchar2(50) |
| 10 | name6 | name6 | name6 | varchar2(50) |
| 11 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |