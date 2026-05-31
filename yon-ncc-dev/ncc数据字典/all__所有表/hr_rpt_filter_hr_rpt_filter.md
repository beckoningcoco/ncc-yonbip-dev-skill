# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8835.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rpt_filter | pk_rpt_filter | pk_rpt_filter | char(20) | √ |
| 2 | filtercode | filtercode | filtercode | varchar2(20) | √ |
| 3 | filtername | filtername | filtername | varchar2(50) | √ |
| 4 | filter_sql | filter_sql | filter_sql | varchar2(4000) |
| 5 | filter_str | filter_str | filter_str | varchar2(4000) | √ |
| 6 | meta_data_id | meta_data_id | meta_data_id | varchar2(128) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_infoset | pk_infoset | pk_infoset | varchar2(20) | √ |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_rpt_def | pk_rpt_def | pk_rpt_def | varchar2(20) |  |  | '~' |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |