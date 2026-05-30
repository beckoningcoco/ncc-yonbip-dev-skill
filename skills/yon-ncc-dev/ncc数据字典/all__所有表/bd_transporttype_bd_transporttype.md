# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transporttype | pk_transporttype | pk_transporttype | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | name | name | name | varchar2(300) | √ |
| 5 | name2 | name2 | name2 | varchar2(300) |
| 6 | name3 | name3 | name3 | varchar2(300) |
| 7 | name4 | name4 | name4 | varchar2(300) |
| 8 | name5 | name5 | name5 | varchar2(300) |
| 9 | name6 | name6 | name6 | varchar2(300) |
| 10 | pk_group | pk_group | pk_group | char(20) | √ |
| 11 | pk_org | pk_org | pk_org | char(20) | √ |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |