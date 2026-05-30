# |<<

**需求明细 (mm_sdbdemand / nc.vo.mmpps.lotreg.entity.SdbDemandVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3778.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sdb | 供需预定主键 | pk_sdb | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_demandorg | 需求库存组织最新版本 | pk_demandorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | pk_demandorg_v | 需求库存组织 | pk_demandorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | fbillstatus | 单据状态 | fbillstatus | int |  | 整数 (Integer) |
| 8 | fbillstatusname | 单据状态名 | fbillstatusname | varchar(50) |  | 字符串 (String) |
| 9 | vbilltype | 需求单据类型 | vbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | fbilltype | 单据类型 | fbilltype | int |  | 需求类型 (DemandType) |  | 0=销售订单; |