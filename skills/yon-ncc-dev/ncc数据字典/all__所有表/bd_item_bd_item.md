# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6964.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | pk_item | pk_item | char(20) | √ |
| 2 | cost_time | cost_time | cost_time | number(38, 0) |
| 3 | dt_type_item | dt_type_item | dt_type_item | varchar2(20) |
| 4 | note | note | note | varchar2(400) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |
| 8 | pk_srv | pk_srv | pk_srv | varchar2(20) |
| 9 | pk_type_item | pk_type_item | pk_type_item | varchar2(20) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |