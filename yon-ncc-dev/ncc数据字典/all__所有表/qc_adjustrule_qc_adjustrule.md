# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11078.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustrule | pk_adjustrule | pk_adjustrule | char(20) | √ |
| 2 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 3 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 4 | vmemo | vmemo | vmemo | varchar2(181) |
| 5 | vrulecode | vrulecode | vrulecode | varchar2(50) |
| 6 | vrulename | vrulename | vrulename | varchar2(300) |
| 7 | vrulename2 | vrulename2 | vrulename2 | varchar2(300) |
| 8 | vrulename3 | vrulename3 | vrulename3 | varchar2(300) |
| 9 | vrulename4 | vrulename4 | vrulename4 | varchar2(300) |
| 10 | vrulename5 | vrulename5 | vrulename5 | varchar2(300) |
| 11 | vrulename6 | vrulename6 | vrulename6 | varchar2(300) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |