# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | pk_post_sub | pk_post_sub | char(20) | √ |
| 2 | changenum | changenum | changenum | char(20) |  |  | '~' |
| 3 | effectdate | effectdate | effectdate | char(10) |
| 4 | isreceived | isreceived | isreceived | char(1) |
| 5 | opertype | opertype | opertype | varchar2(50) |
| 6 | pk_deptdoc | pk_deptdoc | pk_deptdoc | varchar2(20) |  |  | '~' |
| 7 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 11 | pk_post | pk_post | pk_post | varchar2(20) |
| 12 | postcode | postcode | postcode | varchar2(50) |
| 13 | postname | postname | postname | varchar2(300) |
| 14 | postname2 | postname2 | postname2 | varchar2(300) |
| 15 | postname3 | postname3 | postname3 | varchar2(300) |
| 16 | postname4 | postname4 | postname4 | varchar2(300) |
| 17 | postname5 | postname5 | postname5 | varchar2(300) |
| 18 | postname6 | postname6 | postname6 | varchar2(300) |
| 19 | suporior | suporior | suporior | varchar2(20) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |