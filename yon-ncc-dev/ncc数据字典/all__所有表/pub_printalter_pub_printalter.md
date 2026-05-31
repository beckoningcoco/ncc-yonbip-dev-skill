# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10957.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printalter | pk_printalter | pk_printalter | char(20) | √ |
| 2 | alternum | alternum | alternum | number(38, 0) |
| 3 | pk_printinfo | pk_printinfo | pk_printinfo | varchar2(50) |
| 4 | pk_printnumber | pk_printnumber | pk_printnumber | varchar2(20) |  |  | '~' |
| 5 | pk_printpf | pk_printpf | pk_printpf | varchar2(50) |
| 6 | proposdata | proposdata | proposdata | char(19) |
| 7 | proposer | proposer | proposer | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |