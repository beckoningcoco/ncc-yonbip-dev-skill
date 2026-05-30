# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11887.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_unevaluate | pk_unevaluate | pk_unevaluate | char(20) | √ |
| 2 | billdate | billdate | billdate | char(19) |
| 3 | billid | billid | billid | varchar2(20) |
| 4 | billno | billno | billno | varchar2(200) |
| 5 | endtime | endtime | endtime | char(19) |
| 6 | pk_billmaker | pk_billmaker | pk_billmaker | varchar2(20) |  |  | '~' |
| 7 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_rule | pk_rule | pk_rule | varchar2(20) |
| 11 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) |  |  | '~' |
| 12 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 13 | sendstate | sendstate | sendstate | number(38, 0) |
| 14 | starttime | starttime | starttime | char(19) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |