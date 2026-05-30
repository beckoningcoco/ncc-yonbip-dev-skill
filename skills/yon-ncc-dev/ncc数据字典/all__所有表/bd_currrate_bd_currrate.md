# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6838.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currrate | pk_currrate | pk_currrate | char(20) | √ |
| 2 | buyrate | buyrate | buyrate | number(15, 8) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | pk_currinfo | pk_currinfo | pk_currinfo | char(20) | √ |
| 5 | rate | rate | rate | number(15, 8) |
| 6 | ratedate | ratedate | ratedate | char(10) |
| 7 | sellrate | sellrate | sellrate | number(15, 8) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |