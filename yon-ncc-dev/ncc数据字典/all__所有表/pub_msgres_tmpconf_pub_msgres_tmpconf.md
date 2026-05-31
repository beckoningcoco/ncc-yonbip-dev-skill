# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10942.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgres_tempconf | pk_msgres_tempconf | pk_msgres_tempconf | char(20) | √ |
| 2 | enablestatus | enablestatus | enablestatus | number(38, 0) |
| 3 | ismsgtempglobal | ismsgtempglobal | ismsgtempglobal | varchar2(20) |
| 4 | msgres_code | msgres_code | msgres_code | varchar2(50) | √ |
| 5 | msgsendtype | msgsendtype | msgsendtype | varchar2(250) |
| 6 | msgtempcode | msgtempcode | msgtempcode | varchar2(50) |  |  | '~' |
| 7 | msgtempname | msgtempname | msgtempname | varchar2(300) |
| 8 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |  |  | '~' |
| 9 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |