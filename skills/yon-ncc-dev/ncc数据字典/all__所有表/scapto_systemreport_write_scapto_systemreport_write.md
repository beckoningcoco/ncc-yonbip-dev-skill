# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11371.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_systemreport_write | pk_systemreport_write | pk_systemreport_write | char(20) | √ |
| 2 | approval_date | approval_date | approval_date | char(19) |
| 3 | audit_flag | audit_flag | audit_flag | varchar2(50) |
| 4 | company_id | company_id | company_id | varchar2(50) |
| 5 | company_name | company_name | company_name | varchar2(50) |
| 6 | effective_date | effective_date | effective_date | char(19) |
| 7 | invalid_date | invalid_date | invalid_date | char(19) |
| 8 | meeting_type_code | meeting_type_code | meeting_type_code | varchar2(50) |
| 9 | nc_ts | nc_ts | nc_ts | char(19) |
| 10 | oper_type | oper_type | oper_type | varchar2(50) |
| 11 | org_type | org_type | org_type | varchar2(50) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_systemreport | pk_systemreport | pk_systemreport | varchar2(20) |
| 16 | regulation_id | regulation_id | regulation_id | varchar2(50) | √ |
| 17 | regulation_name | regulation_name | regulation_name | varchar2(1024) |
| 18 | regulation_type_name | regulation_type_name | regulation_type_name | varchar2(50) |
| 19 | remark | remark | remark | varchar2(2000) |
| 20 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 21 | upload_time | upload_time | upload_time | char(19) |
| 22 | vmemo | vmemo | vmemo | varchar2(2000) |
| 23 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 24 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 25 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 26 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 27 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 28 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 29 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 30 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 31 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 32 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 33 | creationtime | creationtime | creationtime | char(19) |
| 34 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |