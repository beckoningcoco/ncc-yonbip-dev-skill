# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11658.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cusexid | cusexid | cusexid | char(20) | √ |
| 2 | exreason | exreason | exreason | varchar2(100) |
| 3 | exstatuscode | exstatuscode | exstatuscode | varchar2(2) |
| 4 | extime | extime | extime | char(19) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |
| 6 | user_id | user_id | user_id | varchar2(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |