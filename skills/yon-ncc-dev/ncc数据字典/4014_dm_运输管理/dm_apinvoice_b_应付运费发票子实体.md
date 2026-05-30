# |<<

**应付运费发票子实体 (dm_apinvoice_b / nc.vo.dm.m4812.entity.ApInvoiceBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1707.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cinvoice_bid | 运费发票子表 | cinvoice_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 运费财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 5 | cfeeinvid | 费用项 | cfeeinvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | cfeeinid | 费用项版本信息 | cfeeinid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cinexitemid | 收支项目 | cinexitemid | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 8 | ntaxmny | 价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nmny | 无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ncaltaxmny | 计税金额 | ncaltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 12 | ntax | 税额 | ntax | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nnosubtaxrate | 不可抵扣税率 | nnosubtaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nnosubtax | 不可抵扣税额 | nnosubtax | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nverifymny | 累计核销金额 | nverifymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 18 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |