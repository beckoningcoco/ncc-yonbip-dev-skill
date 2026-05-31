# |<<

**生产报告统计条件 (mm_wrs_q / nc.vo.mmpac.wr.wrs.entity.WrsHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3803.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 2 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_orgnames | 工厂 | pk_orgnames | varchar(50) |  | 字符串 (String) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | sstyle | 统计方式 | sstyle | varchar(50) |  | 统计方式 (WrsStyleVO) |  | mobillno=生产订单号统计; |