# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11562.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register | pk_register | pk_register | varchar2(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | disporder | disporder | disporder | number(38, 0) |
| 4 | name | name | name | varchar2(100) | √ |
| 5 | parentpk | parentpk | parentpk | varchar2(20) |
| 6 | resourceid | resourceid | resourceid | varchar2(50) |
| 7 | resourcepath | resourcepath | resourcepath | varchar2(50) |
| 8 | uiclass | uiclass | uiclass | varchar2(200) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |