# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8634.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgprofile | pk_orgprofile | pk_orgprofile | varchar2(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | logo | logo | logo | blob |
| 4 | logodata | logodata | logodata | blob |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |
| 7 | profile | profile | profile | varchar2(256) |
| 8 | proname | proname | proname | varchar2(256) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |