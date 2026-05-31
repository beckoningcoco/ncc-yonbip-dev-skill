# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12104.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysdoc | pk_sysdoc | pk_sysdoc | char(20) | √ |
| 2 | codeattrname | codeattrname | codeattrname | varchar2(50) |
| 3 | coderule | coderule | coderule | varchar2(10) |
| 4 | doccode | doccode | doccode | varchar2(20) | √ |
| 5 | docname | docname | docname | varchar2(50) |
| 6 | isdsdif | isdsdif | isdsdif | char(1) |
| 7 | nameattrname | nameattrname | nameattrname | varchar2(50) |
| 8 | parentkeyattrname | parentkeyattrname | parentkeyattrname | varchar2(50) |
| 9 | pkattrname | pkattrname | pkattrname | varchar2(50) |
| 10 | pk_sysreg | pk_sysreg | pk_sysreg | varchar2(20) | √ |
| 11 | treekeyattrname | treekeyattrname | treekeyattrname | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |