# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11342.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mattertotal | pk_mattertotal | pk_mattertotal | char(20) | √ |
| 2 | company_code | company_code | company_code | varchar2(50) |
| 3 | company_name | company_name | company_name | varchar2(50) |
| 4 | matter_appoint | matter_appoint | matter_appoint | number(38, 0) |
| 5 | matter_decide | matter_decide | matter_decide | number(38, 0) |
| 6 | matter_fund | matter_fund | matter_fund | number(38, 0) |
| 7 | matter_project | matter_project | matter_project | number(38, 0) |
| 8 | matter_total | matter_total | matter_total | number(38, 0) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |