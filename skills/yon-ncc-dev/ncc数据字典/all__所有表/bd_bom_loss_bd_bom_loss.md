# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6778.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbom_lossid | cbom_lossid | cbom_lossid | char(20) | √ |
| 2 | cbom_bid | cbom_bid | cbom_bid | char(20) | √ |
| 3 | nldissipationnum | nldissipationnum | nldissipationnum | number(28, 8) |
| 4 | nlfromastnum | nlfromastnum | nlfromastnum | number(28, 8) |
| 5 | nlfromnum | nlfromnum | nlfromnum | number(28, 8) |
| 6 | nltoastnum | nltoastnum | nltoastnum | number(28, 8) |
| 7 | nltonum | nltonum | nltonum | number(28, 8) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | vlnote | vlnote | vlnote | varchar2(200) |
| 12 | vlrowno | vlrowno | vlrowno | varchar2(50) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |