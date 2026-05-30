# |<<

**证件类型定义 (scm_certificate / nc.vo.scmpub.certificate.CertificateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5210.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_certificate | 主键 | pk_certificate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 证件编码 | code | varchar(100) |  | 字符串 (String) |
| 6 | name | 证件名称 | name | varchar(300) |  | 字符串 (String) |
| 7 | bisseal | 是否封存 | bisseal | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | sealerid | 封存人 | sealerid | varchar(20) |  | 用户 (user) |
| 9 | sealdate | 封存日期 | sealdate | char(19) |  | 日期 (UFDate) |
| 10 | heavyquantity | 业务单据控制 | heavyquantity | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | bperiodrepeat | 有效期间是否允许重复 | bperiodrepeat | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | enablestate | 启用状态 | enablestate | varchar(50) |  | 启用状态 (enablestate) |  | 1=未启用; |