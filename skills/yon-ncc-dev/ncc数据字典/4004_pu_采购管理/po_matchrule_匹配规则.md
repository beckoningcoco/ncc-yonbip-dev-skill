# |<<

**匹配规则 (po_matchrule / nccloud.vo.pu.taxinvoice.match.entity.TaxMatchRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4602.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matchrule | 匹配规则主键 | pk_matchrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cuserid | 用户 | cuserid | varchar(20) |  | 用户 (user) |
| 4 | matchdim | 匹配维度 | matchdim | varchar(20) |  | 字符串 (String) |
| 5 | enable | 启用 | enable | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | required | 必须维度 | required | char(1) |  | 布尔类型 (UFBoolean) |