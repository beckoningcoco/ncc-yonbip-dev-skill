# |<<

**待清算记录表 (cfbm_reckon_detail / nc.vo.cfbm.reckondetail.ReckonDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1421.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reckon_detail | 主键 | pk_reckon_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 清算财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 清算财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_fundorg | 清算资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 5 | pk_fundorg_v | 清算资金组织版本 | pk_fundorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 6 | reckon_direction | 清算方向 | reckon_direction | int |  | 清算方向 (ReckonDirection) |  | 1=单位收款; |