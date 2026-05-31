# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10927.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_import | pk_import | pk_import | char(20) | √ |
| 2 | devlevel | devlevel | devlevel | varchar2(10) |
| 3 | docname | docname | docname | varchar2(40) | √ |
| 4 | docnameresid | docnameresid | docnameresid | varchar2(250) |
| 5 | funcode | funcode | funcode | varchar2(20) |
| 6 | modul | modul | modul | varchar2(40) |
| 7 | owner | owner | owner | varchar2(40) | √ |
| 8 | ownerresid | ownerresid | ownerresid | varchar2(250) |
| 9 | uiclassname | uiclassname | uiclassname | varchar2(100) | √ |
| 10 | uuid | uuid | uuid | char(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |