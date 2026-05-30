# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6647.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barruleitem | pk_barruleitem | pk_barruleitem | char(20) | √ |
| 2 | accessstrategy | accessstrategy | accessstrategy | number(38, 0) |
| 3 | appobjattrvalue | appobjattrvalue | appobjattrvalue | varchar2(100) |
| 4 | formate | formate | formate | varchar2(50) |
| 5 | isparseretrieve | isparseretrieve | isparseretrieve | char(1) |
| 6 | length | length | length | number(38, 0) |
| 7 | memo | memo | memo | varchar2(200) |
| 8 | pk_appobjattr | pk_appobjattr | pk_appobjattr | varchar2(20) |  |  | '~' |
| 9 | pk_barcoderule | pk_barcoderule | pk_barcoderule | varchar2(20) |  |  | '~' |
| 10 | pk_bardict | pk_bardict | pk_bardict | varchar2(20) |  |  | '~' |
| 11 | startpos | startpos | startpos | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |