# |<<

**采购订单在途状态 (po_order_bb / nc.vo.pu.m21.entity.StatusOnWayItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4605.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order_bb | 采购订单在途状态 | pk_order_bb | char(20) | √ | 主键 (UFID) |
| 2 | pk_order | 采购订单 | pk_order | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 采购组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | fonwaystatus | 在途状态 | fonwaystatus | int |  | 在途状态 (onwaystatus) |  | 0=审核; |