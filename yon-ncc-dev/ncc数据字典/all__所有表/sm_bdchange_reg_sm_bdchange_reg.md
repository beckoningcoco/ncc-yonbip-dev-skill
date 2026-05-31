# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11523.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdchange | pk_bdchange | pk_bdchange | char(20) | √ |
| 2 | changetime | changetime | changetime | char(19) |
| 3 | changetype | changetype | changetype | number(38, 0) |
| 4 | dataid | dataid | dataid | char(20) |
| 5 | isprocess | isprocess | isprocess | char(1) |
| 6 | mdid | mdid | mdid | varchar2(36) |  |  | '~' |
| 7 | processtime | processtime | processtime | char(19) |
| 8 | resourcecode | resourcecode | resourcecode | varchar2(50) |
| 9 | def1 | def1 | def1 | varchar2(50) |
| 10 | def2 | def2 | def2 | varchar2(50) |
| 11 | def3 | def3 | def3 | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |