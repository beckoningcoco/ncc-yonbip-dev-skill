# |<<

**期初暂估单 (po_initialest / nc.vo.pu.m4t.entity.InitialEstHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4595.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initialest | 期初暂估单 | pk_initialest | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_costregion | 成本域 | pk_costregion | varchar(20) |  | 组织_成本域 (costregion) |
| 6 | vtrantypecode | 期初暂估类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 7 | vbillcode | 期初暂估单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 8 | pk_stockorg | 库存组织最新版本 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | pk_stockorg_v | 库存组织 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 12 | nexchangerate | 折本汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 14 | pk_stordoc | 仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 15 | pk_bizpsn | 采购员 | pk_bizpsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | pk_managepsn | 保管员 | pk_managepsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | pk_purchaseorg_v | 采购组织 | pk_purchaseorg_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 18 | pk_purchaseorg | 采购组织最新版本 | pk_purchaseorg | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 19 | pk_dept | 采购部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 20 | pk_dept_v | 采购部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 21 | dbilldate | 入库日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 22 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 23 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 24 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 25 | taudittime | 审批日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 26 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 27 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 28 | fbillstatus | 单据状态 | fbillstatus | int |  | 期初暂估单状态 (InitialEstStatus) | 0 | 0=自由; |