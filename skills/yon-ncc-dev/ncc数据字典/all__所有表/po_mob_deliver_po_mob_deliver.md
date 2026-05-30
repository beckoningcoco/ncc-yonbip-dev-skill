# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10762.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | dbilldate | dbilldate | dbilldate | varchar2(19) |  |  | '~' |
| 3 | if_arrive | if_arrive | if_arrive | char(1) |  |  | '~' |
| 4 | if_stockin | if_stockin | if_stockin | char(1) |  |  | '~' |
| 5 | org_name | org_name | org_name | varchar2(200) |  |  | '~' |
| 6 | pk_order | pk_order | pk_order | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 9 | supplier_name | supplier_name | supplier_name | varchar2(200) |  |  | '~' |
| 10 | userid | userid | userid | varchar2(20) |  |  | '~' |
| 11 | vbillcode | vbillcode | vbillcode | varchar2(40) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |