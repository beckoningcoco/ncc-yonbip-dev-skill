# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6820.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costmode | pk_costmode | pk_costmode | char(20) | √ |
| 2 | ansyid | ansyid | ansyid | varchar2(20) |
| 3 | batchcost | batchcost | batchcost | char(1) |  |  | 'N' |
| 4 | costmode | costmode | costmode | number(38, 0) |  |  | 3 |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 6 | pk_cost | pk_cost | pk_cost | varchar2(20) |  |  | '~' |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 11 | planedprice | planedprice | planedprice | number(20, 8) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |