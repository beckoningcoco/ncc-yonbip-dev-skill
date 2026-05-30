# |<<

**可用量 (ic_atp / nc.vo.ic.atp.entity.AtpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2878.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | catpid | 可用量实体 | catpid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 5 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | pk_batchcode | 批次 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 7 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 8 | vhashcode | 散列码 | vhashcode | varchar(32) |  | 字符串 (String) |
| 9 | dplandate | 计划日期 | dplandate | varchar(19) |  | 日期 (UFDate) |
| 10 | nmonum | 流程生产订单数量 | nmonum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | ndmonum | 离散生产订单数量 | ndmonum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nrmonum | 生产线计划数量 | nrmonum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nonponum | 采购订单数量 | nonponum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nonwwnum | 委外订单数量 | nonwwnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nonreceivenum | 到货待检数量 | nonreceivenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nmponum | 计划订单数量 | nmponum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nonsonum | 销售订单数量 | nonsonum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nonreceiptnum | 发货数量 | nonreceiptnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | npickmnum | 备料计划数量 | npickmnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nonrequirenum | 请购单数量 | nonrequirenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nontranspraynum | 调拨申请 | nontranspraynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nonamnum | 工单数量 | nonamnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nsapplynum | 出库申请数量 | nsapplynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nexpsapplynum | 费用申请数量 | nexpsapplynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ntraninnum | 调拨订单预计入 | ntraninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | ntranoutnum | 调拨订单预计出 | ntranoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | tupdatetime | 上次更新时间 | tupdatetime | varchar(19) |  | 日期时间 (UFDateTime) |
| 28 | nimpcontractnum | 进口合同数量 | nimpcontractnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nimpdetailnum | 进口明细单数量 | nimpdetailnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nexpcontractnum | 出口合同数量 | nexpcontractnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nexpdetailnum | 出口明细单数量 | nexpdetailnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nentcontractnum | 转口合同数量 | nentcontractnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nentdetailnum | 转口明细单数量 | nentdetailnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 35 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 36 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 37 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 38 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 39 | nprenum | 预订单数量 | nprenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | vfree1 | 物料自由属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree2 | 物料自由属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree3 | 物料自由属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree4 | 物料自由属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree5 | 物料自由属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 45 | vfree6 | 物料自由属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 46 | vfree7 | 物料自由属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 47 | vfree8 | 物料自由属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 48 | vfree9 | 物料自由属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 49 | vfree10 | 物料自由属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |