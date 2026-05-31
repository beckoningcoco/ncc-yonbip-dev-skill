# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10766.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | delivered_date | delivered_date | delivered_date | varchar2(19) |
| 3 | delivery_code | delivery_code | delivery_code | varchar2(40) |
| 4 | if_arrive | if_arrive | if_arrive | char(1) |
| 5 | if_stockin | if_stockin | if_stockin | char(1) |
| 6 | ntotalastnum | ntotalastnum | ntotalastnum | number(28, 8) |
| 7 | org_name | org_name | org_name | varchar2(200) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |
| 9 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |
| 10 | supplier_name | supplier_name | supplier_name | varchar2(200) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |