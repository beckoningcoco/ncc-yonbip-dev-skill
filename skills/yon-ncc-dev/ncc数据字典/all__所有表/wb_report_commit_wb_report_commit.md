# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12995.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | ana_model_id | ana_model_id | ana_model_id | varchar2(36) |
| 3 | commit_time | commit_time | commit_time | timestamp(6) |  |  | null |
| 4 | commit_user | commit_user | commit_user | varchar2(36) |
| 5 | data_id | data_id | data_id | varchar2(36) |
| 6 | input_time | input_time | input_time | timestamp(6) |  |  | null |
| 7 | input_user | input_user | input_user | varchar2(36) |
| 8 | last_opr | last_opr | last_opr | varchar2(10) |
| 9 | last_opr_time | last_opr_time | last_opr_time | timestamp(6) |  |  | null |
| 10 | last_opr_user | last_opr_user | last_opr_user | varchar2(36) |
| 11 | sheet_id | sheet_id | sheet_id | varchar2(36) |
| 12 | state | state | state | varchar2(10) |
| 13 | ver | ver | ver | varchar2(36) |
| 14 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |