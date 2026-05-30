# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6454.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prop | pk_prop | pk_prop | char(20) | √ |
| 2 | bizflag | bizflag | bizflag | number(38, 0) |
| 3 | extfield | extfield | extfield | varchar2(2000) |
| 4 | formatstr | formatstr | formatstr | varchar2(50) |
| 5 | pk_level | pk_level | pk_level | char(20) | √ |
| 6 | propcolumn | propcolumn | propcolumn | varchar2(50) | √ |
| 7 | propid | propid | propid | varchar2(100) | √ |
| 8 | propname | propname | propname | varchar2(200) |
| 9 | valuetype | valuetype | valuetype | number(38, 0) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |