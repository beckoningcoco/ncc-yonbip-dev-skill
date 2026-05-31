# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11817.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_train | pk_invoice_train | pk_invoice_train | char(20) | √ |
| 2 | destination | destination | destination | varchar2(50) |
| 3 | fphm | fphm | fphm | varchar2(50) | √ |
| 4 | hjje | hjje | hjje | number(28, 8) | √ |
| 5 | hjse | hjse | hjse | number(28, 8) | √ |
| 6 | jshj | jshj | jshj | number(28, 8) | √ |
| 7 | kprq | kprq | kprq | char(19) | √ |
| 8 | name | name | name | varchar2(30) |
| 9 | origin | origin | origin | varchar2(50) |
| 10 | pk_invoice | pk_invoice | pk_invoice | varchar2(20) | √ |
| 11 | seatno | seatno | seatno | varchar2(20) |
| 12 | trainlevel | trainlevel | trainlevel | varchar2(20) |
| 13 | trainnum | trainnum | trainnum | varchar2(50) |
| 14 | def1 | def1 | def1 | varchar2(101) |
| 15 | def2 | def2 | def2 | varchar2(101) |
| 16 | def3 | def3 | def3 | varchar2(101) |
| 17 | def4 | def4 | def4 | varchar2(101) |
| 18 | def5 | def5 | def5 | varchar2(101) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |