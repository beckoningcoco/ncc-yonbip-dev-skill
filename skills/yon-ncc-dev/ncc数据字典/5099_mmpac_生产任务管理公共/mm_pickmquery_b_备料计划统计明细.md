# |<<

**备料计划统计明细 (mm_pickmquery_b / nc.vo.mmpac.pickm.pickms.entity.PickmQueryItems)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3725.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpickm_bid | 备料计划单明细 | cpickm_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | tdlyid | 替代来源ID | tdlyid | varchar(20) |  | 字符串 (String) |
| 6 | cdeliverorgid | 发料组织 | cdeliverorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | vrowno | 序号 | vrowno | varchar(40) |  | 字符串 (String) |
| 8 | cbmaterialid | 材料 | cbmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cbmaterialvid | 材料最新版本 | cbmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | cbunitid | 主单位 | cbunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | cbastunitid | 单位 | cbastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | vbchangerate | 换算率 | vbchangerate | varchar(60) |  | 字符串 (String) |
| 13 | drequiredate | 需要日期 | drequiredate | char(19) |  | 日期 (UFDate) |
| 14 | unitnum | 主单位定额 | unitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | unitastnum | 单位定额 | unitastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nquotnum | 主定额用量 | nquotnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nquotastnum | 定额用量 | nquotastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | vprocessno | 需用工序 | vprocessno | varchar(10) |  | 字符串 (String) |
| 19 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 20 | cfeedid | 投料点 | cfeedid | varchar(20) |  | 投料点维护 (bd_wk_feed) |
| 21 | fitemtype | 子项类型 | fitemtype | int |  | 备料计划子项类型 (FitemtypeEnum) |  | 0=普通; |