# |<<

**组织其它_VAT注册码 (org_vat / nc.vo.org.OrgVatVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4184.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vat | VAT主键 | pk_vat | char(20) | √ | 主键 (UFID) |
| 2 | pk_country | 国家代码 | pk_country | varchar(20) |  | 国家地区 (countryzone) |
| 3 | vatcode | VAT注册码 | vatcode | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |