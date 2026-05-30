# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10207.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | idx | idx | idx | number(38, 0) |
| 2 | innercode | innercode | innercode | varchar2(200) |
| 3 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |
| 4 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |
| 5 | pk_fss | pk_fss | pk_fss | varchar2(20) |
| 6 | pk_fssmember | pk_fssmember | pk_fssmember | char(20) |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |
| 8 | virtualorg | virtualorg | virtualorg | char(1) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |