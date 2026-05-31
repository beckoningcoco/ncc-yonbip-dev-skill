# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9144.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstoreadminid | cstoreadminid | cstoreadminid | char(20) | √ |
| 2 | bincludesub | bincludesub | bincludesub | char(1) |
| 3 | cdptid | cdptid | cdptid | varchar2(20) |
| 4 | cinventoryclassid | cinventoryclassid | cinventoryclassid | varchar2(20) |
| 5 | cinventoryid | cinventoryid | cinventoryid | varchar2(20) |
| 6 | cwarehouseid | cwarehouseid | cwarehouseid | varchar2(20) | √ |
| 7 | cwhsmanagerid | cwhsmanagerid | cwhsmanagerid | varchar2(20) | √ |
| 8 | pk_group | pk_group | pk_group | char(20) | √ |
| 9 | pk_org | pk_org | pk_org | char(20) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |