# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7097.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supvat | pk_supvat | pk_supvat | varchar2(50) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | isvat | isvat | isvat | char(1) |  |  | 'N' |
| 4 | pk_country | pk_country | pk_country | varchar2(20) |  |  | '~' |
| 5 | pk_supplier | pk_supplier | pk_supplier | char(20) | √ |
| 6 | vatcode | vatcode | vatcode | varchar2(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |