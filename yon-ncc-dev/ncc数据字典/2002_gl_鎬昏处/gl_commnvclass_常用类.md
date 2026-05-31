# |<<

**常用类 (gl_commnvclass / nc.vo.gl.commonvoucher.commonclass)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2367.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commnvclass | 凭证类型标识 | pk_commnvclass | char(20) | √ | 主键 (UFID) |
| 2 | property | 属性 | property | varchar(20) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(40) | √ | 字符串 (String) |
| 4 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) | √ | 主键 (UFID) |
| 5 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 6 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |