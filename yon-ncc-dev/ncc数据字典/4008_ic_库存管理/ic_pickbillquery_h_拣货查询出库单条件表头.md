# |<<

**拣货查询出库单条件表头 (ic_pickbillquery_h / nc.vo.ic.m4v.entity.PickBillQueryCondHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2955.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 拣货查询出库单条件表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 库存组织 | pk_org_v | varchar(0) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 6 | vbilltypecode | 单据类型 | vbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 8 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |