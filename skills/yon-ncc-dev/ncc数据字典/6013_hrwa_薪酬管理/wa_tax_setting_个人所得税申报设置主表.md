# |<<

**个人所得税申报设置主表 (wa_tax_setting / nccloud.dto.hrwa.psntaxsetting.PsnTaxSettingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6358.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tax_setting | 主键 | pk_tax_setting | char(20) | √ | 主键 (UFID) |
| 2 | pk_tax_org | 纳税申报组织主键 | pk_tax_org | varchar(20) | √ | 主键 (UFID) |
| 3 | taxpayercode | 纳税人识别号 | taxpayercode | varchar(50) | √ | 字符串 (String) |
| 4 | password | 申报密码 | password | varchar(50) | √ | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | creator | 创建人 | creator | char(20) | √ | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) | √ | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | char(20) | √ | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) | √ | 日期时间 (UFDateTime) |