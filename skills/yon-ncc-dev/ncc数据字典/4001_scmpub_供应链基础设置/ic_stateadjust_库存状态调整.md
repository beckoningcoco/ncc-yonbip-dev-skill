# |<<

**库存状态调整 (ic_stateadjust / nc.vo.ic.m4460.entity.StateAdjustVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2978.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstateadjustid | 库存状态调整主键 | cstateadjustid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_onhanddim | 现存量维度 | pk_onhanddim | varchar(20) |  | 现存量维度 (OnhandDimVO) |
| 4 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | ngrossnum | 毛重 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | cadjuststateid | 调整状态 | cadjuststateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 8 | nadjustnum | 调整主数量 | nadjustnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nadjustassistnum | 调整数量 | nadjustassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nadjustgrossnum | 调整毛重 | nadjustgrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | billmaker | 调整人 | billmaker | varchar(20) |  | 用户 (user) |
| 12 | pk_onhanddim_adj | 状态调整后现存量维度 | pk_onhanddim_adj | varchar(20) |  | 现存量维度 (OnhandDimVO) |
| 13 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 14 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 15 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 16 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 17 | cadjustbilltype | 来源单据类型 | cadjustbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | cadjustbillcode | 来源单据号 | cadjustbillcode | varchar(50) |  | 字符串 (String) |
| 19 | cadjustrowno | 来源单据行号 | cadjustrowno | varchar(50) |  | 字符串 (String) |
| 20 | cadjustbillid | 来源单据主键 | cadjustbillid | char(20) |  | 主键 (UFID) |
| 21 | cadjustbillbid | 来源单据表体主键 | cadjustbillbid | char(20) |  | 主键 (UFID) |
| 22 | cadjusttranstype | 来源交易类型 | cadjusttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 23 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 24 | pk_serialcode | 序列号主键 | pk_serialcode | char(20) |  | 字符串 (String) |
| 25 | vsncode | 序列号 | vsncode | varchar(50) |  | 字符串 (String) |
| 26 | pk_onhand_sn | 单品存量主键 | pk_onhand_sn | char(20) |  | 字符串 (String) |
| 27 | creationtime | 调整时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |