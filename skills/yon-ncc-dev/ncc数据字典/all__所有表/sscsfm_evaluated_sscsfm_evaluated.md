# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11882.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_evaluated | pk_evaluated | pk_evaluated | char(20) | √ |
| 2 | auto_evaluated | auto_evaluated | auto_evaluated | char(1) |
| 3 | billdate | billdate | billdate | char(19) |
| 4 | billid | billid | billid | varchar2(20) |
| 5 | billno | billno | billno | varchar2(200) |
| 6 | endtime | endtime | endtime | char(19) |
| 7 | evaluate_content | evaluate_content | evaluate_content | varchar2(200) |
| 8 | pk_billmaker | pk_billmaker | pk_billmaker | varchar2(20) |  |  | '~' |
| 9 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_rule | pk_rule | pk_rule | varchar2(20) |
| 13 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) |  |  | '~' |
| 14 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 15 | result | result | result | char(1) |  |  | '~' |
| 16 | sendstate | sendstate | sendstate | number(38, 0) |
| 17 | starttime | starttime | starttime | char(19) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |