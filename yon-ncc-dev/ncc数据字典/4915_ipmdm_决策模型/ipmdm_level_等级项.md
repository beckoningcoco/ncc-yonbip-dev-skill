# |<<

**等级项 (ipmdm_level / nc.vo.ipmdm.levelset.LevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3246.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_level | 等级项主键 | pk_level | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | name | 等级名称 | name | varchar(20) |  | 多语文本 (MultiLangText) |
| 6 | min_score | 最小分值 | min_score | int |  | 整数 (Integer) |
| 7 | max_score | 最大分值 | max_score | int |  | 整数 (Integer) |
| 8 | min_symbol | 最小分值关系符号 | min_symbol | int |  | 等级比较符号 (LevelCompareSymbol) |  | 0=<; |