# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8622.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depthandover | pk_depthandover | pk_depthandover | char(20) | √ |
| 2 | checkdate | checkdate | checkdate | char(10) |
| 3 | checker | checker | checker | varchar2(20) |  |  | '~' |
| 4 | handoverdate | handoverdate | handoverdate | char(10) |
| 5 | handoverman | handoverman | handoverman | varchar2(200) |  |  | '~' |
| 6 | item | item | item | varchar2(200) |
| 7 | pk_bill | pk_bill | pk_bill | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | char(20) |
| 9 | pk_org | pk_org | pk_org | char(20) |
| 10 | remark | remark | remark | varchar2(200) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |