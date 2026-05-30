# |<<

**库存计划计算日志明细 (invp_log_b / nc.vo.invp.plan.entity.LogBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3139.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log_b | 主键 | pk_log_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_plan | 库存计划 | pk_plan | varchar(20) |  | 主键 (UFID) |
| 6 | cmaterialoid | 物料OID | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | bflag | 状态 | bflag | varchar(1) |  | 计算状态 (CalcStatusEnum) |  | Y=成功; |