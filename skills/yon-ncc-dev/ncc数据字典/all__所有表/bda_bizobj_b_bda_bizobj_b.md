# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6701.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bizobj_b | pk_bizobj_b | pk_bizobj_b | char(20) | √ |
| 2 | pk_bizobj | pk_bizobj | pk_bizobj | char(20) | √ |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_subtable | pk_subtable | pk_subtable | varchar2(50) |
| 5 | refcolumn | refcolumn | refcolumn | varchar2(50) |
| 6 | reftable | reftable | reftable | varchar2(50) |
| 7 | rowno | rowno | rowno | varchar2(50) |
| 8 | subtable | subtable | subtable | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |