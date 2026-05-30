# |<<

**包含工作中心 (resa_ccworkcenter / nc.vo.resa.costcenter.CCWorkCenterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4888.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ccworkcenter | 对象标识 | pk_ccworkcenter | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_workcenter | 工作中心 | pk_workcenter | varchar(20) |  | 工作中心 (bd_wk) |
| 5 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |