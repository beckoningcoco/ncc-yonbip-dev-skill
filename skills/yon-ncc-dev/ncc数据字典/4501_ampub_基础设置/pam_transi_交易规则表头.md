# |<<

**交易规则表头 (pam_transi / nc.vo.am.transi.TransiHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4338.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transi | 主键 | pk_transi | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | transi_code | 交易规则编码 | transi_code | varchar(30) |  | 字符串 (String) |
| 5 | transi_name | 交易规则名称 | transi_name | varchar(80) |  | 字符串 (String) |
| 6 | pk_billtype | 单据类型ID | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | bill_type | 单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 8 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 10 | pre_flag | 预置标志 | pre_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 12 | modulecode | 模块编码 | modulecode | varchar(20) |  | 模块信息 (module) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |