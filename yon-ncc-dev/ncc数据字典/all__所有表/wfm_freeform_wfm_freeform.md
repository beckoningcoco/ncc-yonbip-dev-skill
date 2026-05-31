# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13034.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freeform | pk_freeform | pk_freeform | varchar2(50) | √ |
| 2 | auditdate | auditdate | auditdate | varchar2(50) |
| 3 | audituser | audituser | audituser | varchar2(20) |  |  | '~' |
| 4 | frmstate | frmstate | frmstate | varchar2(50) |
| 5 | frmtitile | frmtitile | frmtitile | varchar2(50) |
| 6 | makedate | makedate | makedate | char(19) |
| 7 | makedept | makedept | makedept | varchar2(20) |  |  | '~' |
| 8 | makenum | makenum | makenum | varchar2(50) |
| 9 | makeuser | makeuser | makeuser | varchar2(20) |  |  | '~' |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |