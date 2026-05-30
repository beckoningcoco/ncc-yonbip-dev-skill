# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11808.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_air | pk_invoice_air | pk_invoice_air | char(20) | √ |
| 2 | agentcode | agentcode | agentcode | varchar2(20) |
| 3 | caacdevelopfund | caacdevelopfund | caacdevelopfund | number(28, 8) |
| 4 | checkcode | checkcode | checkcode | varchar2(20) |
| 5 | fare | fare | fare | number(28, 8) |
| 6 | fphm | fphm | fphm | varchar2(50) | √ |
| 7 | fuelsurcharge | fuelsurcharge | fuelsurcharge | number(28, 8) |
| 8 | hjje | hjje | hjje | number(28, 8) | √ |
| 9 | hjse | hjse | hjse | number(28, 8) | √ |
| 10 | insurance | insurance | insurance | number(28, 8) |
| 11 | issueby | issueby | issueby | varchar2(80) |
| 12 | jshj | jshj | jshj | number(28, 8) | √ |
| 13 | kprq | kprq | kprq | char(19) | √ |
| 14 | pk_invoice | pk_invoice | pk_invoice | varchar2(20) |  |  | '~' |
| 15 | tax | tax | tax | number(28, 8) |
| 16 | useridcard | useridcard | useridcard | varchar2(50) |
| 17 | username | username | username | varchar2(30) |
| 18 | def1 | def1 | def1 | varchar2(101) |
| 19 | def2 | def2 | def2 | varchar2(101) |
| 20 | def3 | def3 | def3 | varchar2(101) |
| 21 | def4 | def4 | def4 | varchar2(101) |
| 22 | def5 | def5 | def5 | varchar2(101) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |