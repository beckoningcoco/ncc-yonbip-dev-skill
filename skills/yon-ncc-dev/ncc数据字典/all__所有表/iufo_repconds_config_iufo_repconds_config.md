# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9674.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conds_config | pk_conds_config | pk_conds_config | char(20) | √ |
| 2 | conditiondisplay | conditiondisplay | conditiondisplay | blob |
| 3 | id_subscribetask | id_subscribetask | id_subscribetask | varchar2(50) |
| 4 | pk_app | pk_app | pk_app | varchar2(50) |
| 5 | pk_apppage | pk_apppage | pk_apppage | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(50) |
| 7 | pk_org | pk_org | pk_org | varchar2(50) |
| 8 | pk_report | pk_report | pk_report | varchar2(50) |
| 9 | query_condition | query_condition | query_condition | blob |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(50) |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |