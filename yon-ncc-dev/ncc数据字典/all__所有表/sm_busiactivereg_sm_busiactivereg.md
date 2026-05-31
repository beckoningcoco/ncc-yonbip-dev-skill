# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11524.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiactive | pk_busiactive | pk_busiactive | char(20) | √ |
| 2 | busi_pk | busi_pk | busi_pk | varchar2(50) |
| 3 | code | code | code | varchar2(50) |
| 4 | description | description | description | varchar2(300) |
| 5 | name | name | name | varchar2(75) |
| 6 | ownertype | ownertype | ownertype | number(38, 0) |
| 7 | parent_id | parent_id | parent_id | char(20) |
| 8 | resid | resid | resid | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |