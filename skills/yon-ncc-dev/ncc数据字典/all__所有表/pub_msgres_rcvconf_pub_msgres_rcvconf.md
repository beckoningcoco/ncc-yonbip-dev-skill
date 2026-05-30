# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10939.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgres_rcvconf | pk_msgres_rcvconf | pk_msgres_rcvconf | char(20) | √ |
| 2 | msgres_code | msgres_code | msgres_code | varchar2(50) |
| 3 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 4 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |
| 7 | prilevel | prilevel | prilevel | number(38, 0) |  |  | 1 |
| 8 | receivingrule | receivingrule | receivingrule | blob |
| 9 | receivingrule_disp | receivingrule_disp | receivingrule_disp | blob |
| 10 | receivrulejson | receivrulejson | receivrulejson | blob |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |