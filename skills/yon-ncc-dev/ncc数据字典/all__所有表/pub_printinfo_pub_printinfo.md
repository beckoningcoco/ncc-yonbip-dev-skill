# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10958.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_proposeinfo | pk_proposeinfo | pk_proposeinfo | char(20) | √ |
| 2 | alterednum | alterednum | alterednum | number(38, 0) |
| 3 | alternum | alternum | alternum | number(38, 0) |
| 4 | billdata | billdata | billdata | char(19) |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_printnum | pk_printnum | pk_printnum | varchar2(50) |
| 8 | pk_print_pf | pk_print_pf | pk_print_pf | char(20) | √ |
| 9 | printcount | printcount | printcount | number(38, 0) |
| 10 | prnbillno | prnbillno | prnbillno | varchar2(50) |
| 11 | proposer | proposer | proposer | varchar2(20) |  |  | '~' |
| 12 | remark | remark | remark | varchar2(1024) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |