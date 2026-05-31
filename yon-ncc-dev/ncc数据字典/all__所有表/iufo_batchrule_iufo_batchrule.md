# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9495.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchrule | pk_batchrule | pk_batchrule | char(20) | √ |
| 2 | name | name | name | varchar2(300) | √ |
| 3 | name2 | name2 | name2 | varchar2(300) |
| 4 | name3 | name3 | name3 | varchar2(300) |
| 5 | name4 | name4 | name4 | varchar2(300) |
| 6 | name5 | name5 | name5 | varchar2(300) |
| 7 | name6 | name6 | name6 | varchar2(300) |
| 8 | note | note | note | varchar2(128) |
| 9 | pk_accscheme | pk_accscheme | pk_accscheme | varchar2(20) |
| 10 | pk_batchrulesort | pk_batchrulesort | pk_batchrulesort | char(20) | √ |
| 11 | pk_datasource | pk_datasource | pk_datasource | char(20) |
| 12 | pk_group | pk_group | pk_group | char(20) | √ |
| 13 | pk_keygroup | pk_keygroup | pk_keygroup | char(20) | √ |
| 14 | pk_org | pk_org | pk_org | char(20) | √ |
| 15 | rulecontent | rulecontent | rulecontent | blob | √ |
| 16 | creationtime | creationtime | creationtime | varchar2(19) |
| 17 | creator | creator | creator | char(20) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 20 | modifier | modifier | modifier | char(20) |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |