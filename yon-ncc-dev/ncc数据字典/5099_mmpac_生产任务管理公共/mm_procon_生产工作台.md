# |<<

**生产工作台 (mm_procon / nc.vo.mmpac.proconsole.entity.ProConVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3744.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_proconsole | 生产工作台 | pk_proconsole | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_planorg | 计划组织最新 | pk_planorg | varchar(20) |  | 组织 (org) |
| 6 | pk_planorg_v | 计划组织 | pk_planorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | cmoid | 生产订单 | cmoid | varchar(20) |  | 字符串 (String) |
| 8 | vbillcode | 生产订单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 9 | cmobid | 生产订单明细 | cmobid | varchar(20) |  | 字符串 (String) |
| 10 | vmorowno | 生产订单行号 | vmorowno | varchar(20) |  | 字符串 (String) |
| 11 | fpbillstatus | 流程生产订单状态 | fpbillstatus | int |  | 流程生产订单状态 (PMOFBillStatusEnum) |  | 0=自由; |