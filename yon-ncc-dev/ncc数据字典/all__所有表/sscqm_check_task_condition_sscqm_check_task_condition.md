# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11864.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | conditionid | conditionid | conditionid | char(20) | √ |
| 2 | autocheckrate | autocheckrate | autocheckrate | number(28, 8) |
| 3 | bill_type | bill_type | bill_type | varchar2(3000) |  |  | '~' |
| 4 | bill_type_code | bill_type_code | bill_type_code | varchar2(3000) |
| 5 | end_amount | end_amount | end_amount | varchar2(50) |
| 6 | end_bill_date | end_bill_date | end_bill_date | char(19) |
| 7 | orgs | orgs | orgs | varchar2(3000) |  |  | '~' |
| 8 | orgs_name | orgs_name | orgs_name | varchar2(50) |
| 9 | sample_rate | sample_rate | sample_rate | varchar2(50) |
| 10 | start_amount | start_amount | start_amount | varchar2(50) |
| 11 | start_bill_date | start_bill_date | start_bill_date | char(19) |
| 12 | taskid | taskid | taskid | varchar2(50) |
| 13 | tasktype | tasktype | tasktype | varchar2(20) |  |  | '~' |
| 14 | total | total | total | number(38, 0) |
| 15 | trade_type | trade_type | trade_type | varchar2(3000) |  |  | '~' |
| 16 | trade_type_code | trade_type_code | trade_type_code | varchar2(3000) |
| 17 | workinggroup | workinggroup | workinggroup | varchar2(3000) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |