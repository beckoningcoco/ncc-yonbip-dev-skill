# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8791.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_attachment | pk_attachment | pk_attachment | char(20) | √ |
| 2 | attachment | attachment | attachment | blob |
| 3 | attachment_name | attachment_name | attachment_name | varchar2(150) |
| 4 | attachment_remark | attachment_remark | attachment_remark | varchar2(150) |
| 5 | attachment_size | attachment_size | attachment_size | number(38, 0) |
| 6 | object_type | object_type | object_type | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_object | pk_object | pk_object | varchar2(20) | √ |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 11 | upload_date | upload_date | upload_date | char(19) |
| 12 | view_times | view_times | view_times | number(38, 0) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |