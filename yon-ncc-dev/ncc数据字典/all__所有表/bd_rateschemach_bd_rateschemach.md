# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7048.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratech | pk_ratech | pk_ratech | char(20) | √ |
| 2 | cashrate | cashrate | cashrate | varchar2(100) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | pk_rateschema | pk_rateschema | pk_rateschema | char(20) | √ |
| 5 | rate | rate | rate | number(16, 4) | √ |
| 6 | rdata | rdata | rdata | number(38, 0) | √ |
| 7 | showorder | showorder | showorder | number(38, 0) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |