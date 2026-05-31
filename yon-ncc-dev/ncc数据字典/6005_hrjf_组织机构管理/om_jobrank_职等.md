# |<<

**职等 (om_jobrank / nc.vo.om.jobrank.JobRankVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3939.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobrank | 职等主键 | pk_jobrank | char(20) | √ | 主键 (UFID) |
| 2 | jobrankcode | 职等编码 | jobrankcode | varchar(28) | √ | 字符串 (String) |
| 3 | jobrankname | 职等名称 | jobrankname | varchar(1024) | √ | 多语文本 (MultiLangText) |
| 4 | jobrankdesc | 职等概要/描述 | jobrankdesc | varchar(1000) |  | 字符串 (String) |
| 5 | jobrankorder | 职等序号 | jobrankorder | int | √ | 整数 (Integer) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | int |  | 整数 (Integer) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |