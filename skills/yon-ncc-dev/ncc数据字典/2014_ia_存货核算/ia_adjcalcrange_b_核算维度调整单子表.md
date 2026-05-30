# |<<

**核算维度调整单子表 (ia_adjcalcrange_b / nc.vo.ia.invalmethod.entity.calcrange.AdjCalcRangeItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2790.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 核算维度调整单子表 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 4 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 5 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cinventoryvid | 物料版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | bvendorcalflag | 供应商核算标志 | bvendorcalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | bprojectcalflag | 项目核算标志 | bprojectcalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | basscustcalflag | 客户核算标志 | basscustcalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | bproductorcalflag | 生产厂商核算标志 | bproductorcalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | batchcalflag | 批次号核算标志 | batchcalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | bfree1calflag | 自由辅助属性1核算标志 | bfree1calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | bfree2calflag | 自由辅助属性2核算标志 | bfree2calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | bfree3calflag | 自由辅助属性3核算标志 | bfree3calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | bfree4calflag | 自由辅助属性4核算标志 | bfree4calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | bfree5calflag | 自由辅助属性5核算标志 | bfree5calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | bfree6calflag | 自由辅助属性6核算标志 | bfree6calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | bfree7calflag | 自由辅助属性7核算标志 | bfree7calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | bfree8calflag | 自由辅助属性8核算标志 | bfree8calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | bfree9calflag | 自由辅助属性9核算标志 | bfree9calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | bfree10calflag | 自由辅助属性10核算标志 | bfree10calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | badjvendorcalflag | 调整后供应商核算标志 | badjvendorcalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | badjprojectcalflag | 调整后项目核算标志 | badjprojectcalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | badjasscustcalflag | 调整后客户核算标志 | badjasscustcalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | badjprodcalflag | 调整后生产厂商核算标志 | badjprodcalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | badjbatchcalflag | 调整后批次号核算标志 | badjbatchcalflag | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | badjfree1calflag | 调整后自由辅助属性1核算标志 | badjfree1calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | badjfree2calflag | 调整后自由辅助属性2核算标志 | badjfree2calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | badjfree3calflag | 调整后自由辅助属性3核算标志 | badjfree3calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | badjfree4calflag | 调整后自由辅助属性4核算标志 | badjfree4calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | badjfree5calflag | 调整后自由辅助属性5核算标志 | badjfree5calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | badjfree6calflag | 调整后自由辅助属性6核算标志 | badjfree6calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | badjfree7calflag | 调整后自由辅助属性7核算标志 | badjfree7calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | badjfree8calflag | 调整后自由辅助属性8核算标志 | badjfree8calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 36 | badjfree9calflag | 调整后自由辅助属性9核算标志 | badjfree9calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | badjfree10calflag | 调整后自由辅助属性10核算标志 | badjfree10calflag | char(1) |  | 布尔类型 (UFBoolean) |
| 38 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 39 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 40 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 41 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 42 | vbatchcode | 批次号初始值 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 43 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 44 | bcffileidflag | 特征码核算标志 | bcffileidflag | char(1) |  | 布尔类型 (UFBoolean) |
| 45 | badjcffileidflag | 调整后特征码核算标志 | badjcffileidflag | char(1) |  | 布尔类型 (UFBoolean) |
| 46 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 47 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 48 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 49 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 50 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 51 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 52 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 53 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 54 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 55 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 56 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |