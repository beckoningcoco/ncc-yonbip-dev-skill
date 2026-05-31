# |<<

**证书类别 (hr_ctftype / nc.vo.hr.certificate.CtfTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2664.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctftype | 类别主键 | pk_ctftype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | ctftypecode | 证书类别编码 | ctftypecode | varchar(50) |  | 字符串 (String) |
| 5 | ctftypename | 证书类别名称 | ctftypename | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | country | 国家 | country | varchar(20) |  | 国家地区 (countryzone) |
| 7 | trade | 行业 | trade | varchar(50) |  | 字符串 (String) |
| 8 | enterprise | 企业 | enterprise | varchar(50) |  | 字符串 (String) |
| 9 | onlytrain | 仅通过培训授予 | onlytrain | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |