# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7222.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_udcatecont | pk_udcatecont | pk_udcatecont | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | itemdes | itemdes | itemdes | varchar2(200) |
| 4 | itemid | itemid | itemid | varchar2(30) | √ |
| 5 | itemname | itemname | itemname | varchar2(200) | √ |
| 6 | itemno | itemno | itemno | number(38, 0) |
| 7 | pk_father | pk_father | pk_father | varchar2(20) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_udcate | pk_udcate | pk_udcate | varchar2(50) |  |  | '~' |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |