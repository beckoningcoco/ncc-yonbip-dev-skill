# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6879.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disttokenctrl_b | pk_disttokenctrl_b | pk_disttokenctrl_b | char(20) | √ |
| 2 | datastatus | datastatus | datastatus | number(38, 0) |  |  | 0 |
| 3 | iseditable | iseditable | iseditable | char(1) |  |  | 'Y' |
| 4 | pk_disttokenctrl | pk_disttokenctrl | pk_disttokenctrl | char(20) | √ |
| 5 | receiptcode | receiptcode | receiptcode | varchar2(100) |
| 6 | receipttime | receipttime | receipttime | char(19) |
| 7 | releasetime | releasetime | releasetime | char(19) |
| 8 | tokenstatus | tokenstatus | tokenstatus | number(38, 0) |  |  | 0 |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 11 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |