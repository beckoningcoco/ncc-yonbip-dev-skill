# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11813.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_roadtoll | pk_invoice_roadtoll | pk_invoice_roadtoll | char(20) | √ |
| 2 | entrance | entrance | entrance | varchar2(50) |
| 3 | exit | exit | exit | varchar2(50) |
| 4 | fpdm | fpdm | fpdm | varchar2(50) | √ |
| 5 | fphm | fphm | fphm | varchar2(50) | √ |
| 6 | jshj | jshj | jshj | number(28, 8) |
| 7 | kprq | kprq | kprq | char(19) | √ |
| 8 | pk_invoice | pk_invoice | pk_invoice | varchar2(20) | √ |  | '~' |
| 9 | def1 | def1 | def1 | varchar2(101) |
| 10 | def2 | def2 | def2 | varchar2(101) |
| 11 | def3 | def3 | def3 | varchar2(101) |
| 12 | def4 | def4 | def4 | varchar2(101) |
| 13 | def5 | def5 | def5 | varchar2(101) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |