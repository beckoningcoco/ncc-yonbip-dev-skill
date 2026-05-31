# |<<

**价格审批单 (purp_priceaudit / nc.vo.pp.m28.entity.PriceAuditHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4808.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priceaudit | 价格审批单 | pk_priceaudit | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | ctrantypeid | 价格审批类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | vtrantypecode | 价格审批类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 7 | vbillcode | 价格审批单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 8 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 9 | pk_dept | 采购部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_dept_v | 采购部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | pk_bizpsn | 采购员 | pk_bizpsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | fbillstatus | 单据状态 | fbillstatus | int |  | 单据状态 (priceauditbillstatus) |  | 0=自由; |