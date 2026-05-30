# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10461.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transi | pk_transi | pk_transi | char(20) | √ |
| 2 | bill_type | bill_type | bill_type | varchar2(50) |  |  | '~' |
| 3 | memo | memo | memo | varchar2(50) |
| 4 | modulecode | modulecode | modulecode | varchar2(20) |  |  | '~' |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 9 | pre_flag | pre_flag | pre_flag | char(1) |
| 10 | transi_code | transi_code | transi_code | varchar2(30) |
| 11 | transi_name | transi_name | transi_name | varchar2(80) |
| 12 | transi_type | transi_type | transi_type | varchar2(30) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |