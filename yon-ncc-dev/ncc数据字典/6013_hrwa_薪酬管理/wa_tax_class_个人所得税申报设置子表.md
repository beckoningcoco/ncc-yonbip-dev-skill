# |<<

**个人所得税申报设置子表 (wa_tax_class / nccloud.dto.hrwa.psntaxsetting.PsnTaxClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6356.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tax_class | 主键 | pk_tax_class | char(20) | √ | 主键 (UFID) |
| 2 | pk_tax_class | 主键 | pk_tax_class | char(20) | √ | 主键 (UFID) |
| 3 | pk_tax_setting | 主表主键 | pk_tax_setting | char(20) | √ | 主键 (UFID) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | code | 报税方案编码 | code | varchar(50) | √ | 字符串 (String) |
| 7 | name | 报税方案名称 | name | varchar(50) | √ | 字符串 (String) |
| 8 | account | 实名账号 | account | varchar(50) |  | 字符串 (String) |
| 9 | password | 实名密码 | password | varchar(50) |  | 字符串 (String) |
| 10 | deptcode | 部门编号 | deptcode | varchar(50) |  | 字符串 (String) |
| 11 | taxorgrankid | 主管税务机关等级序列号id | taxorgrankid | varchar(50) |  | 字符串 (String) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |