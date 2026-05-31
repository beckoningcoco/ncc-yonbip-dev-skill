# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9239.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | activated | activated | activated | number(38, 0) | √ |
| 3 | activation_key | activation_key | activation_key | varchar2(20) |
| 4 | created_by | created_by | created_by | varchar2(50) | √ |
| 5 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 6 | desktop | desktop | desktop | number(38, 0) |
| 7 | email | email | email | varchar2(254) |
| 8 | first_name | first_name | first_name | varchar2(50) |
| 9 | image_url | image_url | image_url | varchar2(256) |
| 10 | lang_key | lang_key | lang_key | varchar2(6) |
| 11 | last_modified_by | last_modified_by | last_modified_by | varchar2(50) |
| 12 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 13 | last_name | last_name | last_name | varchar2(50) |
| 14 | login | login | login | varchar2(50) | √ |
| 15 | mobile | mobile | mobile | varchar2(20) |
| 16 | password_hash | password_hash | password_hash | varchar2(60) |
| 17 | reset_date | reset_date | reset_date | timestamp(6) |
| 18 | reset_key | reset_key | reset_key | varchar2(20) |
| 19 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(36) | √ |
| 20 | tenant_id | tenant_id | tenant_id | varchar2(36) | √ |
| 21 | user_code | user_code | user_code | varchar2(255) |
| 22 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |