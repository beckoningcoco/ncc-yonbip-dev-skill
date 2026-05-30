# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6876.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributereglog | pk_distributereglog | pk_distributereglog | char(20) | √ |
| 2 | errorsummary | errorsummary | errorsummary | varchar2(512) |
| 3 | faillog | faillog | faillog | blob |
| 4 | ismanualproc | ismanualproc | ismanualproc | char(1) |  |  | 'N' |
| 5 | pk_distributeres | pk_distributeres | pk_distributeres | varchar2(20) |  |  | '~' |
| 6 | receiptcode | receiptcode | receiptcode | varchar2(100) |
| 7 | receiptstatus | receiptstatus | receiptstatus | number(38, 0) |  |  | 0 |
| 8 | receipttime | receipttime | receipttime | char(19) |
| 9 | resourceid | resourceid | resourceid | varchar2(100) |
| 10 | sendercode | sendercode | sendercode | varchar2(100) |
| 11 | tokencode | tokencode | tokencode | varchar2(50) |
| 12 | tokennum | tokennum | tokennum | varchar2(40) |
| 13 | typecode | typecode | typecode | varchar2(50) |
| 14 | uploadtime | uploadtime | uploadtime | char(19) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |