# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10715.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transi | pk_transi | pk_transi | char(20) | √ |
| 2 | bill_type | bill_type | bill_type | varchar2(4) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |
| 7 | pk_state_after | pk_state_after | pk_state_after | varchar2(20) |  |  | '~' |
| 8 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 9 | pre_flag | pre_flag | pre_flag | char(1) |
| 10 | transi_type | transi_type | transi_type | varchar2(30) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |