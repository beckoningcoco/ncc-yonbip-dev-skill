# |<<

**成本项目-成本组织 (cost_costpro_h / nc.vo.hrpco.costproorg.CostProOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1609.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costpro | 主键 | pk_costpro | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 成本项目编号 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 成本项目名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | parentid | 上级项目编码 | parentid | varchar(20) |  | 成本项目-成本组织 (CostProOrgVO) |
| 8 | parentname | 上级项目名称 | parentname | varchar(20) |  | 成本项目-成本组织 (CostProOrgVO) |
| 9 | pk_costclass | 所属成本分类 | pk_costclass | varchar(20) |  | 成本分类-成本组织 (CostingclassVO) |
| 10 | enablestate | 启用状态 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 12 | grade | 级次 | grade | int |  | 整数 (Integer) |
| 13 | inforesourse | 信息来源 | inforesourse | varchar(50) |  | 字符串 (String) |
| 14 | uprodisease | 是否参与项目病种下载 | uprodisease | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 16 | costvalue | 成本习性 | costvalue | int |  | 成本习性 (CostValuEnum) |  | 1=固定成本; |