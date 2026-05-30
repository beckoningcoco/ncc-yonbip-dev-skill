# |<<

**投标结果记录 (pm_tenderresult / nc.vo.ptm.tenderresult.TenderResultHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4545.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tenderresult | 投标结果记录主键 | pk_tenderresult | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | bill_code | 单据编码 | bill_code | varchar(50) |  | 字符串 (String) |
| 6 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |