# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10017.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commontype | pk_commontype | pk_commontype | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | createtime | createtime | createtime | char(19) |
| 4 | modifytime | modifytime | modifytime | char(19) |
| 5 | name | name | name | varchar2(200) |
| 6 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 7 | remark | remark | remark | varchar2(200) |
| 8 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |