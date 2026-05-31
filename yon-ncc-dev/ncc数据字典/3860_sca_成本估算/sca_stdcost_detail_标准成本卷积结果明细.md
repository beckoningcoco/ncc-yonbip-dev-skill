# |<<

**标准成本卷积结果明细 (sca_stdcost_detail / nc.vo.sca.stdcostcalc.StdProdCostDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5070.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stdcost_detail | 标准成本卷积结果明细 | pk_stdcost_detail | char(20) | √ | 主键 (UFID) |
| 2 | cstdcostid | 标准产品成本表 | cstdcostid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 9 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 10 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 11 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | nnumber | 数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | thiscost | 本层成本 | thiscost | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | upcost | 上层成本 | upcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nmoney | 总成本 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 18 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 19 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 20 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 21 | materialhashkey | 物料hashkey | materialhashkey | int |  | 整数 (Integer) |
| 22 | materialinfo | 物料信息 | materialinfo | varchar(50) |  | 字符串 (String) |
| 23 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 24 | ccostcompstrucid | 成本组件结构 | ccostcompstrucid | varchar(20) |  | 成本组件结构 (bd_costcompstruc) |
| 25 | crcid | 标准工序 | crcid | varchar(20) |  | 标准工序 (pd_rc) |
| 26 | pricesource | 取价来源 | pricesource | int |  | 价格来源 (StdProdPriceSourceEnum) |  | 1=上层卷积; |