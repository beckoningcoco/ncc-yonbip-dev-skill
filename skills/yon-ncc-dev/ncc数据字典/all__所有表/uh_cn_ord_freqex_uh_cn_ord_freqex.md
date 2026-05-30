# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12510.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordfreqex | pk_ordfreqex | pk_ordfreqex | char(20) | √ |
| 2 | desc_freqex | desc_freqex | desc_freqex | varchar2(256) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | sortno | sortno | sortno | number(38, 0) |
| 7 | time_freqex | time_freqex | time_freqex | char(8) |
| 8 | wdno | wdno | wdno | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |