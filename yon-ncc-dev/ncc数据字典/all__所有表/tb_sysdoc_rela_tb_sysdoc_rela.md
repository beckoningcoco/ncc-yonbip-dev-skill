# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12107.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docrela | pk_docrela | pk_docrela | char(20) | √ |
| 2 | description | description | description | varchar2(100) |
| 3 | dim_attrname | dim_attrname | dim_attrname | varchar2(100) |
| 4 | isonlymap | isonlymap | isonlymap | char(1) |
| 5 | matchrule | matchrule | matchrule | varchar2(50) |
| 6 | pk_dimlevel | pk_dimlevel | pk_dimlevel | varchar2(20) | √ |
| 7 | pk_sysdoc | pk_sysdoc | pk_sysdoc | varchar2(20) | √ |
| 8 | pk_sysreg | pk_sysreg | pk_sysreg | varchar2(20) | √ |
| 9 | ruletype | ruletype | ruletype | char(1) |
| 10 | sys_attrname | sys_attrname | sys_attrname | varchar2(100) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |