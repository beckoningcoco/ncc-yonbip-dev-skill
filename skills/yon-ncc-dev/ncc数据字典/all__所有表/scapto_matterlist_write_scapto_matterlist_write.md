# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11340.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_listreportwrite | pk_listreportwrite | pk_listreportwrite | char(20) | √ |
| 2 | company_id | company_id | company_id | varchar2(50) | √ |
| 3 | company_name | company_name | company_name | varchar2(50) | √ |
| 4 | effective_date | effective_date | effective_date | char(19) |
| 5 | invalid_date | invalid_date | invalid_date | char(19) |
| 6 | list_id | list_id | list_id | varchar2(50) | √ |
| 7 | list_name | list_name | list_name | varchar2(50) |
| 8 | list_version | list_version | list_version | varchar2(50) |
| 9 | nc_ts | nc_ts | nc_ts | char(19) |
| 10 | oper_type | oper_type | oper_type | varchar2(50) |
| 11 | org_type | org_type | org_type | varchar2(50) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_matterlistreport | pk_matterlistreport | pk_matterlistreport | varchar2(20) |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | remark | remark | remark | varchar2(50) |
| 17 | return_code | return_code | return_code | varchar2(50) |
| 18 | return_msg | return_msg | return_msg | varchar2(50) |
| 19 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 20 | upload_time | upload_time | upload_time | char(19) |
| 21 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 22 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 23 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 24 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 25 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 26 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 27 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 28 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 29 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 30 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 31 | creationtime | creationtime | creationtime | char(19) |
| 32 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 35 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |