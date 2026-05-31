# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12358.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ruleinvestrela | pk_ruleinvestrela | pk_ruleinvestrela | char(20) | √ |
| 2 | investee | investee | investee | varchar2(20) |  |  | '~' |
| 3 | investor | investor | investor | varchar2(20) |  |  | '~' |
| 4 | pk_adjvouchrule | pk_adjvouchrule | pk_adjvouchrule | char(20) | √ |
| 5 | repdataversion | repdataversion | repdataversion | varchar2(50) |
| 6 | totalrate | totalrate | totalrate | number(28, 8) |
| 7 | def1 | def1 | def1 | varchar2(101) |
| 8 | def2 | def2 | def2 | varchar2(101) |
| 9 | def3 | def3 | def3 | varchar2(101) |
| 10 | def4 | def4 | def4 | varchar2(101) |
| 11 | def5 | def5 | def5 | varchar2(101) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |