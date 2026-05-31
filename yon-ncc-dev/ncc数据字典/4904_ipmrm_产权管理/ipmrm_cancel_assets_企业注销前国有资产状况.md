# |<<

**企业注销前国有资产状况 (ipmrm_cancel_assets / nc.vo.ipmrm.cancelequity.CancelAssetsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3360.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cancel_assets | 企业注销前国有资产状况主键 | pk_cancel_assets | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 项目单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 项目单位版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | paid_capital_composite | 实收资本构成 | paid_capital_composite | varchar(20) |  | 企业实收资本构成设置 (EnterPriseVO) |
| 6 | noriglastreviewmny | 最近一次登记数 | noriglastreviewmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nbaselastreviewmny | 最近一次登记数组织本币 | nbaselastreviewmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ngplastreviewmny | 最近一次登记数集团本币 | ngplastreviewmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nalllastreviewmny | 最近一次登记数全局本币 | nalllastreviewmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | norigassessmentmny | 清理结果或评估确认数 | norigassessmentmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nbaseassessmentmny | 清理结果或评估确认数组织本币 | nbaseassessmentmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ngpassessmentmny | 清理结果或评估确认数集团本币 | ngpassessmentmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nallassessmentmny | 清理结果或评估确认数全局本币 | nallassessmentmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | norigdeclaremny | 企业申报数 | norigdeclaremny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nbasedeclaremny | 企业申报数组织本币 | nbasedeclaremny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ngpdeclaremny | 企业申报数集团本币 | ngpdeclaremny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nalldeclaremny | 企业申报数全局本币 | nalldeclaremny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | norigreviewmny | 产权登记机关审定数 | norigreviewmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nbasereviewmny | 产权登记机关审定数组织本币 | nbasereviewmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ngpreviewmny | 产权登记机关审定数集团本币 | ngpreviewmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nallreviewmny | 产权登记机关审定数全局本币 | nallreviewmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | ratio | 比例 | ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | supportsum | 是否支持合计 | supportsum | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | bissum | 是否合计数 | bissum | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 26 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 27 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 28 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 29 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 30 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 31 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 32 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 33 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 34 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 35 | cfirstbid | 源头单据表体主键 | cfirstbid | char(20) |  | 主键 (UFID) |
| 36 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 37 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 38 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 39 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 40 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 41 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 42 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 43 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 44 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 45 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 46 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 47 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 48 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |