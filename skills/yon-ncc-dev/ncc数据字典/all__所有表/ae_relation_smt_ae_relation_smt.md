# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6463.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_association | pk_association | pk_association | char(20) | √ |
| 2 | associationtype | associationtype | associationtype | number(38, 0) |
| 3 | modifytime | modifytime | modifytime | char(19) |
| 4 | note | note | note | varchar2(300) |
| 5 | src_attributeid | src_attributeid | src_attributeid | varchar2(300) |
| 6 | src_businessid | src_businessid | src_businessid | varchar2(100) |
| 7 | src_metatype | src_metatype | src_metatype | varchar2(50) |
| 8 | tar_attributeid | tar_attributeid | tar_attributeid | varchar2(300) |
| 9 | tar_businessid | tar_businessid | tar_businessid | varchar2(100) |
| 10 | tar_metatype | tar_metatype | tar_metatype | varchar2(50) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |