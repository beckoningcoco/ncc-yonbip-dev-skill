# |<<

**代垫运费发票子表 (dm_prepaidinvoice_b / nc.vo.scmf.dm.m4816.entity.PrePaidInvoiceBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1738.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cinvoice_bid | 代垫运输发票子表主键 | cinvoice_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 运费财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 5 | cfeeinvid | 费用项 | cfeeinvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | cfeeinid | 费用项版本信息 | cfeeinid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cinexitemid | 收支项目 | cinexitemid | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 8 | ntaxmny | 本币价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nmny | 本币无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 11 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |