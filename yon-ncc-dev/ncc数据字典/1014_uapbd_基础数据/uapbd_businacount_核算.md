# |<<

**核算 (uapbd_businacount / nc.vo.uapbd.bussinesaccount.Businacount)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5852.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ | 主键 (UFID) |
| 2 | code | code | code | varchar(50) |  | 字符串 (String) |
| 3 | name | name | name | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | innercode | 内敛码 | innercode | varchar(50) |  | 字符串 (String) |
| 6 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 8 | father_pk | 上级 | father_pk | varchar(20) |  | 医疗资金来源 (FundSourceVO) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |