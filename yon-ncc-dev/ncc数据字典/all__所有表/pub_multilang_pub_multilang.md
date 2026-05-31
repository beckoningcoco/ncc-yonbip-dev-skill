# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10948.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_multilang | pk_multilang | pk_multilang | varchar2(50) | √ |
| 2 | charsetname | charsetname | charsetname | varchar2(50) |
| 3 | dislpayname | dislpayname | dislpayname | varchar2(75) |
| 4 | langcode | langcode | langcode | varchar2(50) |
| 5 | langdirpath | langdirpath | langdirpath | varchar2(50) |
| 6 | langseq | langseq | langseq | number(38, 0) |
| 7 | localcountry | localcountry | localcountry | varchar2(50) |
| 8 | locallang | locallang | locallang | varchar2(50) |
| 9 | transclassname | transclassname | transclassname | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |