# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12927.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | cache_use | cache_use | cache_use | number(38, 0) | √ |  | 1 |
| 3 | code | code | code | varchar2(36) |
| 4 | created_by | created_by | created_by | varchar2(255) |
| 5 | created_date | created_date | created_date | timestamp(6) |
| 6 | first_level_cache_enable | first_level_cache_enable | first_level_cache_enable | number(38, 0) |  |  | '1' |
| 7 | global_cache_enable | global_cache_enable | global_cache_enable | number(38, 0) | √ |  | '1' |
| 8 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 9 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 10 | second_level_cache_enable | second_level_cache_enable | second_level_cache_enable | number(38, 0) |  |  | '1' |
| 11 | statistics_enable | statistics_enable | statistics_enable | number(38, 0) | √ |  | '1' |
| 12 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |