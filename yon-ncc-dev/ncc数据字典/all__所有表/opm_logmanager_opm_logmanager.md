# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logmanager | pk_logmanager | pk_logmanager | char(20) | √ |
| 2 | access_address | access_address | access_address | varchar2(100) |
| 3 | access_status | access_status | access_status | number(38, 0) |
| 4 | access_time | access_time | access_time | char(19) |
| 5 | api_url | api_url | api_url | varchar2(100) |
| 6 | pk_thirdapp | pk_thirdapp | pk_thirdapp | varchar2(20) |
| 7 | thirdapp_code | thirdapp_code | thirdapp_code | varchar2(100) |
| 8 | thirdapp_name | thirdapp_name | thirdapp_name | varchar2(200) |
| 9 | user_code | user_code | user_code | varchar2(100) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |