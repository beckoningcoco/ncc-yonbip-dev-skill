# |<<

**单据交易类型配置表体明细 (mm_mpoqs_b / nc.vo.pd.mpobjqryscheme.entity.MpoqsBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3701.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mpoqs_b | 主键 | pk_mpoqs_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | fdemandsupply | 供需类型 | fdemandsupply | int |  | 需求供给 (MPDSEnum) |  | 0=需求; |