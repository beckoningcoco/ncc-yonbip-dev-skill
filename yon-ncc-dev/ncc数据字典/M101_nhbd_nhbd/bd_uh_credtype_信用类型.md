# |<<

**信用类型 (bd_uh_credtype / nc.vo.nhbd.pati.CreditTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1020.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cred | 信用主键 | pk_cred | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 类型编码 | code | varchar(30) | √ | 字符串 (String) |
| 5 | name | 类型名称 | name | varchar(50) | √ | 字符串 (String) |
| 6 | amt_cred | 信用额度 | amt_cred | decimal(14, 2) | √ | 数值 (UFDouble) |
| 7 | father_pk | 父主键 | father_pk | varchar(20) |  | 信用类型 (credittype) |
| 8 | innercode | innercode | innercode | varchar(50) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |