# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11865.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | subid | subid | subid | char(20) | √ |
| 2 | autocheckrate | autocheckrate | autocheckrate | number(28, 8) |
| 3 | bill_type | bill_type | bill_type | varchar2(3000) |  |  | '~' |
| 4 | bill_type_code | bill_type_code | bill_type_code | varchar2(3000) |
| 5 | conditionid | conditionid | conditionid | varchar2(50) |
| 6 | end_amount | end_amount | end_amount | varchar2(50) |
| 7 | end_bill_date | end_bill_date | end_bill_date | char(19) |
| 8 | order_number | order_number | order_number | number(38, 0) |
| 9 | orgs | orgs | orgs | varchar2(3000) |  |  | '~' |
| 10 | orgs_name | orgs_name | orgs_name | varchar2(50) |
| 11 | start_amount | start_amount | start_amount | varchar2(50) |
| 12 | start_bill_date | start_bill_date | start_bill_date | char(19) |
| 13 | total_rate | total_rate | total_rate | varchar2(50) |
| 14 | trade_type | trade_type | trade_type | varchar2(3000) |  |  | '~' |
| 15 | trade_type_code | trade_type_code | trade_type_code | varchar2(3000) |
| 16 | workinggroup | workinggroup | workinggroup | varchar2(3000) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |