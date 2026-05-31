# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8354.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_confirmtime | pk_confirmtime | pk_confirmtime | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | name | name | name | varchar2(300) | √ |
| 4 | name2 | name2 | name2 | varchar2(300) |
| 5 | name3 | name3 | name3 | varchar2(300) |
| 6 | name4 | name4 | name4 | varchar2(300) |
| 7 | name5 | name5 | name5 | varchar2(300) |
| 8 | name6 | name6 | name6 | varchar2(300) |
| 9 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |