# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10109.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_joblevel | pk_joblevel | pk_joblevel | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | varchar2(50) |
| 4 | name | name | name | varchar2(300) | √ |
| 5 | name2 | name2 | name2 | varchar2(300) |
| 6 | name3 | name3 | name3 | varchar2(300) |
| 7 | name4 | name4 | name4 | varchar2(300) |
| 8 | name5 | name5 | name5 | varchar2(300) |
| 9 | name6 | name6 | name6 | varchar2(300) |
| 10 | pk_joblevelsys | pk_joblevelsys | pk_joblevelsys | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |