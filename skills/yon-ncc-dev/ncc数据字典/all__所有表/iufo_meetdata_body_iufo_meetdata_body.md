# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9665.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | char(20) | √ |
| 2 | adjust_amount | adjust_amount | adjust_amount | number(28, 8) |
| 3 | aloneid | aloneid | aloneid | varchar2(32) |
| 4 | bself | bself | bself | char(1) |
| 5 | details | details | details | char(20) | √ |
| 6 | direction | direction | direction | number(38, 0) |
| 7 | measurecode | measurecode | measurecode | varchar2(32) |
| 8 | meetnote | meetnote | meetnote | varchar2(40) |
| 9 | meet_amount | meet_amount | meet_amount | number(28, 8) |
| 10 | pk_measure | pk_measure | pk_measure | varchar2(20) |  |  | '~' |
| 11 | pk_meetresult | pk_meetresult | pk_meetresult | varchar2(20) |  |  | '~' |
| 12 | pk_opporg | pk_opporg | pk_opporg | varchar2(20) |
| 13 | pk_selforg | pk_selforg | pk_selforg | varchar2(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |