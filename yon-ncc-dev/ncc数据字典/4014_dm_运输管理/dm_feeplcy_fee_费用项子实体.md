# |<<

**费用项子实体 (dm_feeplcy_fee / nc.vo.dm.policy.entity.FeePlcyFeeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1725.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feeplcy_fee | 费用项子实体 | pk_feeplcy_fee | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 4 | cfeeitemid | 费用项 | cfeeitemid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | vfeeformcode | 费用项公式编码 | vfeeformcode | varchar(1000) |  | 字符串 (String) |
| 6 | fallotsetflag | 分摊依据 | fallotsetflag | int |  | 分摊依据 (fallotsetflag) |  | 0=主数量; |