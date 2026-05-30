# |<<

**成本动因 (cm_driver / nc.vo.mapub.driver.entity.DriverVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1468.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdriverid | 成本动因 | cdriverid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vcode | 编码 | vcode | varchar(50) |  | 字符串 (String) |
| 6 | vname | 名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | vformulavalue | 公式 | vformulavalue | varchar(1500) |  | 字符串 (String) |
| 8 | vjavapath | 自定义JAVA类 | vjavapath | varchar(50) |  | 字符串 (String) |
| 9 | vformulacode | 公式code | vformulacode | varchar(1500) |  | 字符串 (String) |
| 10 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 11 | vformulavalue2 | 公式2 | vformulavalue2 | varchar(500) |  | 字符串 (String) |
| 12 | vformulavalue3 | 公式3 | vformulavalue3 | varchar(500) |  | 字符串 (String) |
| 13 | vformulavalue4 | 公式4 | vformulavalue4 | varchar(500) |  | 字符串 (String) |
| 14 | vformulavalue5 | 公式5 | vformulavalue5 | varchar(500) |  | 字符串 (String) |
| 15 | vformulavalue6 | 公式6 | vformulavalue6 | varchar(500) |  | 字符串 (String) |
| 16 | mdtype | 模块类型 | mdtype | decimal(50, 0) |  | 模块类型 (MdTypeEnum) |  | 1=成本中心会计; |