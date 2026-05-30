# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6791.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_caprt | pk_caprt | pk_caprt | char(20) | √ |
| 2 | beginday | beginday | beginday | number(38, 0) |
| 3 | begintime | begintime | begintime | char(8) |
| 4 | capresttime | capresttime | capresttime | number(16, 4) |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 6 | endday | endday | endday | number(38, 0) |
| 7 | endtime | endtime | endtime | char(8) |
| 8 | pk_group | pk_group | pk_group | char(20) | √ |
| 9 | pk_org | pk_org | pk_org | char(20) | √ |
| 10 | pk_shift | pk_shift | pk_shift | char(20) | √ |
| 11 | timeid | timeid | timeid | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |