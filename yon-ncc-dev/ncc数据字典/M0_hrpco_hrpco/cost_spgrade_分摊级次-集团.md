# |<<

**分摊级次-集团 (cost_spgrade / nc.vo.co.bd.bd0028.SpgradegpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1625.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spgrade | 主键 | pk_spgrade | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 分摊级次编码 | code | varchar(50) | √ | 字符串 (String) |
| 6 | name | 分摊级次名称 | name | varchar(50) | √ | 字符串 (String) |
| 7 | vmemo | 备注 | vmemo | varchar(200) |  | 备注 (Memo) |
| 8 | enablestate | 启用状态 | enablestate | char(1) | √ | 布尔类型 (UFBoolean) |
| 9 | splevel | 分摊级次等级 | splevel | int | √ | 分摊级次等级 (LevelEnum) |  | 1=一级; |