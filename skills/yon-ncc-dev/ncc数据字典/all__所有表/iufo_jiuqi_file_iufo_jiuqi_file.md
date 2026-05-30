# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9643.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_file_info | pk_file_info | pk_file_info | char(20) | √ |
| 2 | file_content | file_content | file_content | blob |
| 3 | file_name | file_name | file_name | varchar2(64) | √ |
| 4 | file_type | file_type | file_type | number(38, 0) |  |  | 0 |
| 5 | file_up_time | file_up_time | file_up_time | char(19) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |