# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11363.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_memberwrite | pk_memberwrite | pk_memberwrite | char(20) | √ |
| 2 | company_pk | company_pk | company_pk | varchar2(50) | √ |
| 3 | end_date | end_date | end_date | char(19) |
| 4 | group_type | group_type | group_type | varchar2(50) |
| 5 | member_id | member_id | member_id | varchar2(50) | √ |
| 6 | name | name | name | varchar2(50) |
| 7 | oper_type | oper_type | oper_type | varchar2(50) |
| 8 | pk_enterpriseleadership | pk_enterpriseleadership | pk_enterpriseleadership | varchar2(20) |
| 9 | pk_enterprise_write | pk_enterprise_write | pk_enterprise_write | char(20) | √ |
| 10 | position | position | position | varchar2(50) |
| 11 | remark | remark | remark | varchar2(1024) |
| 12 | return_code | return_code | return_code | varchar2(50) |
| 13 | return_msg | return_msg | return_msg | varchar2(50) |
| 14 | start_date | start_date | start_date | char(19) |
| 15 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 16 | upload_time | upload_time | upload_time | char(19) |
| 17 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 18 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 19 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 20 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 21 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |