# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7008.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mobile_message | pk_mobile_message | pk_mobile_message | char(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(100) |
| 3 | content | content | content | varchar2(4000) |
| 4 | isdelete | isdelete | isdelete | char(1) |
| 5 | isread | isread | isread | char(1) |
| 6 | murl | murl | murl | varchar2(300) |
| 7 | pk_business | pk_business | pk_business | varchar2(100) |
| 8 | pk_group | pk_group | pk_group | varchar2(50) |
| 9 | resendable | resendable | resendable | char(1) |
| 10 | tenant_id | tenant_id | tenant_id | varchar2(100) |
| 11 | title | title | title | varchar2(300) |
| 12 | type_name | type_name | type_name | varchar2(100) |
| 13 | urlparams | urlparams | urlparams | varchar2(3000) |
| 14 | yy_userid | yy_userid | yy_userid | varchar2(100) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |