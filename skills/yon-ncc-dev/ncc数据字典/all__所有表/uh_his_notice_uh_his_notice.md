# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12622.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_notice | pk_notice | pk_notice | char(20) | √ |
| 2 | date_create | date_create | date_create | char(19) |
| 3 | editorhtml | editorhtml | editorhtml | blob |
| 4 | flag | flag | flag | char(1) |
| 5 | name_create | name_create | name_create | varchar2(20) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_name_create | pk_name_create | pk_name_create | varchar2(20) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | title | title | title | varchar2(100) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |