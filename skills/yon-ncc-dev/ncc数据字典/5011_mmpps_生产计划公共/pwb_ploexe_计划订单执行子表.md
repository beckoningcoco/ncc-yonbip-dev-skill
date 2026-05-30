# |<<

**计划订单执行子表 (pwb_ploexe / nc.vo.mmpps.plo.sd.entity.PWBPloExeItems)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4816.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ploexe | 计划订单执行子表 | pk_ploexe | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 单据主组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 单据主组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | csupplyorgid | 供给库存组织最新版本 | csupplyorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | csupplyorgvid | 供给库存组织 | csupplyorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | fsdexebill | 单据来源 | fsdexebill | int |  | 单据来源 (SDExeBillEnum) |  | 1=流程生产订单; |