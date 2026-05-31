# |<<

**减值 (fa_logdevalueview / nc.vo.fa.asset.LogdevalueViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2043.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_devalue | 主键 | pk_devalue | char(20) | √ | 主键 (UFID) |
| 2 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | bill_code | 减值单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 4 | devalue_date | 减值日期 | devalue_date | char(19) |  | 日期 (UFDate) |
| 5 | locavalue | 原值 | locavalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | accdept | 累计折旧 | accdept | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | returnvalue | 可回收金额 | returnvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | devaluevalue | 减值准备 | devaluevalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | devaluereason | 减值原因 | devaluereason | varchar(20) |  | 原因 (reason) |
| 10 | recorder | 经办人 | recorder | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | edit_flag | 手工录入 | edit_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_bill | 单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 13 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 14 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |