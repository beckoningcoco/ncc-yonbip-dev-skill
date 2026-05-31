# |<<

**客户资质子表 (scm_customquali_b / nc.vo.scmpub.customquali.CustomQualiBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5214.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_customquali_b | 主键 | pk_customquali_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_ctfctype | 证件类型 | pk_ctfctype | varchar(20) | √ | 证件类型定义 (CertificateVO) |
| 4 | ctfc_code | 证件编码 | ctfc_code | varchar(50) |  | 字符串 (String) |
| 5 | ctfc_number | 证件号码 | ctfc_number | varchar(50) |  | 字符串 (String) |
| 6 | ctfc_name | 证件名称 | ctfc_name | varchar(50) |  | 字符串 (String) |
| 7 | deffectdate | 生效日期 | deffectdate | char(19) |  | 日期 (UFDate) |
| 8 | duneffectdate | 失效日期 | duneffectdate | char(19) |  | 日期 (UFDate) |
| 9 | bisseal | 是否封存 | bisseal | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | heavyquantity | 业务单据控制 | heavyquantity | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | warncontrol | 预警控制 | warncontrol | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | enablestate | 启用状态 | enablestate | varchar(50) |  | 启用状态 (enablestate) |  | 1=未启用; |