# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10140.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_thirdapp | pk_thirdapp | pk_thirdapp | char(20) | √ |
| 2 | app_id | app_id | app_id | varchar2(100) |
| 3 | app_secret | app_secret | app_secret | varchar2(200) |
| 4 | code | code | code | varchar2(100) |
| 5 | datasourcename | datasourcename | datasourcename | varchar2(100) |
| 6 | name | name | name | varchar2(200) |
| 7 | private_key | private_key | private_key | varchar2(4000) |
| 8 | public_key | public_key | public_key | varchar2(500) |
| 9 | security_level | security_level | security_level | varchar2(5) |
| 10 | tentant_id | tentant_id | tentant_id | varchar2(100) |
| 11 | third_userid | third_userid | third_userid | varchar2(100) |
| 12 | user_code | user_code | user_code | varchar2(100) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |