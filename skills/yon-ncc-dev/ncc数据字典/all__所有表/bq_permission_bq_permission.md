# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7392.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | describe | describe | describe | varchar2(200) |
| 4 | permissionmodel | permissionmodel | permissionmodel | blob |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |
| 7 | pk_role | pk_role | pk_role | varchar2(20) |
| 8 | resourceid | resourceid | resourceid | varchar2(50) |
| 9 | resourcetypeid | resourcetypeid | resourcetypeid | varchar2(50) |
| 10 | ruletypeid | ruletypeid | ruletypeid | varchar2(50) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |