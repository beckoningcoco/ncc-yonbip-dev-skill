# |<<

**需求汇总平衡计算结果 (invp_balance_result / nc.vo.invp.result.entity.BalanceResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3132.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balance_result | 主键 | pk_balance_result | char(20) | √ | 主键 (UFID) |
| 2 | pk_parentid | 上级主键 | pk_parentid | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 本次平衡库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_org_v | 本次平衡库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | creqbillid | 来源单据 | creqbillid | varchar(20) |  | 字符串 (String) |
| 8 | vreqbillcode | 来源单据号 | vreqbillcode | varchar(20) |  | 字符串 (String) |
| 9 | vreqrowno | 来源单据行号 | vreqrowno | varchar(40) |  | 字符串 (String) |
| 10 | creqrowid | 来源单据行 | creqrowid | varchar(20) |  | 字符串 (String) |
| 11 | cdownbilltypecode | 下游单据类型 | cdownbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | vdownbillcode | 下游单据号 | vdownbillcode | varchar(50) |  | 字符串 (String) |
| 13 | cdownbillid | 下游单据ID | cdownbillid | varchar(50) |  | 字符串 (String) |
| 14 | vdownrowno | 下游单据行号 | vdownrowno | varchar(50) |  | 字符串 (String) |
| 15 | cdownrowid | 下游单据行ID | cdownrowid | varchar(50) |  | 字符串 (String) |
| 16 | ctransbilltypecode | 调拨单据类型 | ctransbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 17 | vtransbillcode | 调拨单据号 | vtransbillcode | varchar(50) |  | 字符串 (String) |
| 18 | ctransbillid | 调拨单据ID | ctransbillid | varchar(50) |  | 字符串 (String) |
| 19 | vtransrowno | 调拨单据行号 | vtransrowno | varchar(50) |  | 字符串 (String) |
| 20 | ctransrowid | 调拨单据行ID | ctransrowid | varchar(50) |  | 字符串 (String) |
| 21 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 22 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 23 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 24 | vbatchcode | 批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 25 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 26 | cprojecttask | 项目任务 | cprojecttask | varchar(20) |  | 项目任务 (WBS) |
| 27 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 28 | pk_productor | 生产厂商 | pk_productor | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 29 | dreqdate | 需求日期 | dreqdate | char(19) |  | 日期 (UFDate) |
| 30 | nnum | 需求数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | noutnum | 累计出库数量 | noutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | npraynum | 请购单 | npraynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | npurchasenum | 采购订单 | npurchasenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | ntransinnum | 调拨订单待调入量 | ntransinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nreqnum | 物资需求申请 | nreqnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nworknum | 工单 | nworknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nstockpreparenum | 备料计划 | nstockpreparenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | nsafestocknum | 安全库存 | nsafestocknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | ntransoutnum | 调拨订单待调出量 | ntransoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | nstocknum | 现存量 | nstocknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nsupplynum | 库存满足数量 | nsupplynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nlacknum | 缺口数量 | nlacknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | nsugpunum | 建议订购数量 | nsugpunum | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | bistransflag | 自动调拨 | bistransflag | char(1) |  | 布尔类型 (UFBoolean) |
| 45 | pk_org_originalreq | 原始需求库存组织 | pk_org_originalreq | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 46 | pk_org_originalreq_v | 原始需求库存组织版本 | pk_org_originalreq_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 47 | pk_org_req | 库存组织 | pk_org_req | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 48 | pk_org_req_v | 库存组织版本 | pk_org_req_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 49 | pk_org_maintain | 维修组织 | pk_org_maintain | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 50 | pk_org_maintain_v | 维修组织版本 | pk_org_maintain_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 51 | pk_org_stockin | 收货库存组织 | pk_org_stockin | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 52 | pk_org_stockin_v | 收货库存组织版本 | pk_org_stockin_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 53 | pk_org_next | 下次平衡库存组织 | pk_org_next | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 54 | pk_org_next_v | 下次平衡库存组织版本 | pk_org_next_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 55 | freqtype | 需求类型 | freqtype | int |  | 需求类型 (enum_reqtype) |  | 0=毛需求; |