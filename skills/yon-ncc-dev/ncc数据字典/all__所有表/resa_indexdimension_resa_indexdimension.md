# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11170.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indexdim | pk_indexdim | pk_indexdim | char(20) | √ |
| 2 | isallowmiddle | isallowmiddle | isallowmiddle | char(1) |
| 3 | isnullable | isnullable | isnullable | char(1) |
| 4 | linenum | linenum | linenum | number(38, 0) |
| 5 | pk_bizindex | pk_bizindex | pk_bizindex | char(20) | √ |
| 6 | pk_dimension | pk_dimension | pk_dimension | varchar2(20) |  |  | '~' |
| 7 | pk_extattrcfg | pk_extattrcfg | pk_extattrcfg | varchar2(20) |  |  | '~' |
| 8 | free1 | free1 | free1 | varchar2(101) |
| 9 | free2 | free2 | free2 | varchar2(101) |
| 10 | free3 | free3 | free3 | varchar2(101) |
| 11 | free4 | free4 | free4 | varchar2(101) |
| 12 | free5 | free5 | free5 | varchar2(101) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |