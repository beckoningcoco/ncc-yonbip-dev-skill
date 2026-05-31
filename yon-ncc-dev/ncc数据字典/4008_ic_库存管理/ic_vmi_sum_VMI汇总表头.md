# |<<

**VMI汇总表头 (ic_vmi_sum / nc.vo.ic.m50.entity.VmiSumHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3007.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvmihid | VMI汇总表主键 | cvmihid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | ccalbodyid | 结算库存组织最新版本 | ccalbodyid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | ccalbodyvid | 结算库存组织 | ccalbodyvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | coutcalbodyid | 出库组织最新版 | coutcalbodyid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 8 | coutcalbodyvid | 出库组织 | coutcalbodyvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 9 | vtrantypecode | 消耗汇总类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 10 | cbiztype | 业务流程 | cbiztype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 11 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 12 | dsumdate | 汇总日期 | dsumdate | varchar(19) |  | 日期 (UFDate) |
| 13 | cwarehouseid | 结算仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 14 | coutwarehouseid | 出库仓库 | coutwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 15 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 16 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 17 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 18 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 19 | pk_batchcode | 批次 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 20 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 21 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 22 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 23 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 24 | vconsumebillcode | 消耗单据号 | vconsumebillcode | varchar(40) |  | 字符串 (String) |
| 25 | cconsumehid | 消耗单据表头 | cconsumehid | varchar(20) |  | 主键 (UFID) |
| 26 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 27 | nnumsum | 汇总主数量 | nnumsum | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 29 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 30 | nassistnumsum | 汇总数量 | nassistnumsum | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | csumid | 汇总主键 | csumid | varchar(50) |  | 字符串 (String) |
| 32 | ntotalinvoicenum | 已开票数量 | ntotalinvoicenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | binvoiceendflag | 开票完成 | binvoiceendflag | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | cfanaceorgoid | 结算财务组织 | cfanaceorgoid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 35 | cfanaceorgvid | 结算财务组织版本 | cfanaceorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 36 | ccostdomainid | 结算成本域 | ccostdomainid | varchar(20) |  | 组织_成本域 (costregion) |
| 37 | ccurrencyid | 本币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 38 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 39 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 40 | approver | 审核人 | approver | varchar(20) |  | 用户 (user) |
| 41 | taudittime | 审核日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 42 | fbillflag | 单据状态 | fbillflag | int |  | 消耗汇总单状态 (FstatusFlag) | 1 | 1=自由; |