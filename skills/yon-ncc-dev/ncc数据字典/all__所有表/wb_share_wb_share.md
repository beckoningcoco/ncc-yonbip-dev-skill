# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13009.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | ana_id | ana_id | ana_id | varchar2(255) |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |
| 5 | create_time | create_time | create_time | timestamp(6) |  |  | null |
| 6 | expire_state | expire_state | expire_state | varchar2(255) |
| 7 | intelliv_expire | intelliv_expire | intelliv_expire | timestamp(6) |  |  | null |
| 8 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 9 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 10 | share_state | share_state | share_state | varchar2(255) |
| 11 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 12 | token | token | token | varchar2(255) |
| 13 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |